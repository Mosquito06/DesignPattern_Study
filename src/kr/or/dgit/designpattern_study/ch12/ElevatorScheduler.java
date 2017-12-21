package kr.or.dgit.designpattern_study.ch12;

public interface ElevatorScheduler {
	int selectElevator(ElevatorManager manager, int destination, Direction direction);
}
