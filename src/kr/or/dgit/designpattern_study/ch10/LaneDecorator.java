package kr.or.dgit.designpattern_study.ch10;

public class LaneDecorator extends DisplayDecorator {

	public LaneDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
	}

	@Override
	public void draw() {
		super.draw();
		drawLane();
	}
	
	public void drawLane() {
		System.out.println("\t차선 표시");
	}
	
	
}
