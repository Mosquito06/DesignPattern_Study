package kr.or.dgit.designpattern_study.ch08;

public class Button {
	private Command theCommand;

	public Button(Command theCommand) {
		super();
		setCommand(theCommand);
	}
	
	public void setCommand(Command newCommand) {
		this.theCommand = newCommand;
	}
	
	public void pressed() {
		theCommand.execute();
	}
	
}
