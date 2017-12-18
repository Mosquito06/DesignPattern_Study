package kr.or.dgit.designpattern_study.ch08;

public class LampOnCommand implements Command {
	private KindOfLamp kindOfLamp;

	public LampOnCommand(KindOfLamp kindOfLamp) {
		super();
		setKindOfLamp(kindOfLamp);
	}

	public void setKindOfLamp(KindOfLamp kindOfLamp) {
		this.kindOfLamp = kindOfLamp;
	}

	@Override
	public void execute() {
		kindOfLamp.turnOn();
	}

}
