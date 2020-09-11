package challenges;

import java.util.LinkedList;
import java.util.Queue;

import flow.ActionException;
import flow.EventException;
import flow.IApp;
import flow.IEvent;
import flow.ProtocolException;

/**
 * Class represents an email server (application).
 * 
 * @author lucas
 *
 */
public class EmailApp implements IApp<String> {

	private Queue<String> messages;

	public EmailApp() {
		this.messages = new LinkedList<String>();
	}

	public String in(IEvent event) throws EventException, ProtocolException, ActionException {
		String message = (String) event.trigger();
		if (!message.startsWith("Request:")) {
			throw new ProtocolException();
		}

		messages.add(message.replace("Request:", ""));
		System.out.println("Request made to server...");
		return message;
	}

	public String popMessage() {
		String message = messages.element();
		return message;
	}

}
