package kr.or.dgit.designpattern_study.ch05.after;

public class MissileStrategy implements AttackStrategy {

	@Override
	public void attack() {
		System.out.println("I have Missile and can attack with it.");

	}

}
