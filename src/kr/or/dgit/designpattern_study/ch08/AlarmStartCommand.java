package kr.or.dgit.designpattern_study.ch08;

public class AlarmStartCommand implements Command {
	private KindOfAlarm kindOfAlarm;

	public AlarmStartCommand(KindOfAlarm kindOfAlarm) {
		super();
		setKindOfAlarm(kindOfAlarm);
	}

	public void setKindOfAlarm(KindOfAlarm kindOfAlarm) {
		this.kindOfAlarm = kindOfAlarm;
	}

	@Override
	public void execute() {
		kindOfAlarm.start();
	}

}
