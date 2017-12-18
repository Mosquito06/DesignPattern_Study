package kr.or.dgit.designpattern_study.ch08;

public class Emergence extends KindOfAlarm {
	private static final Emergence INSTANCE = new Emergence();

	public static Emergence getInstance() {
		return INSTANCE;
	}

	private Emergence() {
		super();
	}

	@Override
	protected void start() {
		System.out.println("긴급 알람을 울려라~");


	}

}
