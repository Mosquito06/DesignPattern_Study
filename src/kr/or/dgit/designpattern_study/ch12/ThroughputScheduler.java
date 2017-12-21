package kr.or.dgit.designpattern_study.ch12;

public class ThroughputScheduler implements ElevatorScheduler{
	private static final ThroughputScheduler INSTANCE = new ThroughputScheduler();

	public static ThroughputScheduler getInstance() {
		return INSTANCE;
	}

	private ThroughputScheduler() {
		System.out.println(getClass().getSimpleName() + "(" + Integer.toString(hashCode()) + ")");
	}

	@Override
	public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
		return (int) (Math.random()*3); // 0, 1, 2
	}
}
