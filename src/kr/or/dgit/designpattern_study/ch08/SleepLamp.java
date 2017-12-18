package kr.or.dgit.designpattern_study.ch08;

public class SleepLamp extends KindOfLamp {
	private static final SleepLamp INSTANCE = new SleepLamp();

	public static SleepLamp getInstance() {
		return INSTANCE;
	}

	private SleepLamp() {
		super();

	}

	@Override
	protected void turnOn() {
		System.out.println("취침등을 켭니다.");

	}

}
