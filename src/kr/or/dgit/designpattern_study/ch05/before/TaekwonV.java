package kr.or.dgit.designpattern_study.ch05.before;

public class TaekwonV extends Robot {

	public TaekwonV(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("I have Missile and can attack with it.");
	}

	@Override
	public void move() {
		System.out.println("I can only walk");
	}

}
