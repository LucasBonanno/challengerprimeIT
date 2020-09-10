package challenges;

import java.util.LinkedList;
import java.util.List;

import flow.AgentException;
import flow.IAction;
import flow.IAgent;
import flow.TextAction;

/**
 * Class that represents a person (agent) who wants to send an email message
 * 
 * @author lucas
 *
 */
public class UserAgent implements IAgent {

	private String[] values;

	public UserAgent(String... values) {
		this.values = values;
	}

	public List<IAction> act() throws AgentException {

		List<IAction> flow = new LinkedList<IAction>();

		for (String value : values) {
			flow.add(new TextAction(value));
			if (value.isEmpty()) {
				System.out.println("ERROR 404: Message not found");
				throw new AgentException();
			}
		}
		return flow;
	}

}
