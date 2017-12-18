package kr.or.dgit.designpattern_study.ch08;

public class General extends KindOfAlarm {
	private static final General INSTANCE = new General();

	public static General getInstance() {
		return INSTANCE;
	}

	private General() {
		super();
		
	}

	@Override
	protected void start() {
		System.out.println("일반 알람을 울려라~");

	}

}
