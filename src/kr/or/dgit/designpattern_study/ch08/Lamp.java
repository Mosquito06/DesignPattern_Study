package kr.or.dgit.designpattern_study.ch08;

public class Lamp extends KindOfLamp {
	private static final Lamp INSTANCE = new Lamp();

	public static Lamp getInstance() {
		return INSTANCE;
	}

	private Lamp() {
		super();
	}

	@Override
	protected void turnOn() {
		System.out.println("램프를 켭니다.");

	}

}
