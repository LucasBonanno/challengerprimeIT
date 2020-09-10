package challenges;

import flow.ActionException;
import flow.AdapterException;
import flow.IAction;
import flow.IAdapter;
import flow.IEvent;
import flow.TextEvent;

/**
 * Class responsible for being able to communicate the message to the email
 * server (adapter).
 * 
 * @author lucas
 *
 */
public class EmailAdapter implements IAdapter<IAction> {

	public IEvent adapt(IAction action) throws AdapterException, ActionException {
		String value = (String) action.execute();
		System.out.println("Communication with email server... ");
		return new TextEvent(value);
	}

}
