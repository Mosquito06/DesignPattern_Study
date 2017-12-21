package kr.or.dgit.designpattern_study.ch12;

public class ResponceTimeScheduler implements ElevatorScheduler{
	private static final ResponceTimeScheduler INSTANCE = new ResponceTimeScheduler();

	public static ResponceTimeScheduler getInstance() {
		return INSTANCE;
	}

	private ResponceTimeScheduler() {
		System.out.println(getClass().getSimpleName() + "(" + Integer.toString(hashCode()) + ")");
	}

	@Override
	public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
		return 1;
	}
}
