package kr.or.dgit.designpattern_study.ch05.after;

public class RunningStrategy implements MovingStrategy {

	@Override
	public void move() {
		System.out.println("앞으로 미친듯이 뛰어 나간다.");

	}

}
