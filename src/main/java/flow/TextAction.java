package flow;

import flow.IAction;

public class TextAction implements IAction<String> {
	private String value;

	public TextAction(String value) {
		this.value = value;
	}

	public String execute() {
		System.out.println("Sending a message... Value: " + value);
		return value;
	}

	public String getType() {
		return "EMAIL";
	}
}
