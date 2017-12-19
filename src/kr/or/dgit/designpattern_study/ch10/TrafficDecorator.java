package kr.or.dgit.designpattern_study.ch10;

public class TrafficDecorator extends DisplayDecorator {

	public TrafficDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
	}
	
	@Override
	public void draw() {
		super.draw();
		drawLane();
	}
	
	public void drawLane() {
		System.out.println("\t교통량 표시");
	}
}
