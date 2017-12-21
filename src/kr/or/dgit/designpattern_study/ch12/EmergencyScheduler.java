package kr.or.dgit.designpattern_study.ch12;

public class EmergencyScheduler implements ElevatorScheduler {
	private static final EmergencyScheduler INSTANCE = new EmergencyScheduler();

	public static EmergencyScheduler getInstance() {
		return INSTANCE;
	}

	private EmergencyScheduler() {
		System.out.println(getClass().getSimpleName() + "(" + Integer.toString(hashCode()) + ")");
	}

	@Override
	public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
		return 0;
	}
}
