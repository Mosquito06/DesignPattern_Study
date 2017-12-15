package kr.or.dgit.designpattern_study.ch05.after;

public class FlyingStrategy implements MovingStrategy {

	@Override
	public void move() {
		System.out.println("I can fly.");

	}

}
