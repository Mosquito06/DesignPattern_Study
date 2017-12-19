package kr.or.dgit.designpattern_study.ch10;

public class Test {

	public static void main(String[] args) {
		Display roadwidthLaneAndTraffic = new TrafficDecorator(new LaneDecorator(new RoadDisplay()));
		roadwidthLaneAndTraffic.draw();

	}

}
