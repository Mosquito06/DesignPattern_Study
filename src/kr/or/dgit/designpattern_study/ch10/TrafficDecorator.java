package kr.or.dgit.designpattern_study.ch10;

public class TrafficDecorator extends DisplayDecorator {

	public TrafficDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
	}
	
	@Override
	public void draw() {
		super.draw();
		drawTraffic();
	}
	
	public void drawTraffic() {
		System.out.println("\t교통량 표시");
	}
}
