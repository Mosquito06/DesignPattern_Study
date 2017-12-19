package kr.or.dgit.designpattern_study.ch10;

public class CrossingDecorator extends DisplayDecorator {

	public CrossingDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
		
	}
	
	@Override
	public void draw() {
		super.draw();
		drawCrossing();
	}
	
	public void drawCrossing() {
		System.out.println("\t교차로 표시");
	}

}
