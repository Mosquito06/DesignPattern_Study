package kr.or.dgit.designpattern_study.ch12;

public class Test {
	public static void main(String[] args) {
		ElevatorManager em = new ElevatorManager(3, SchedulingStrategyID.THROUGHPUT);
		em.requestElevator(10, Direction.UP);
		
		em.setStrategyID(SchedulingStrategyID.RESPONSE_TIME);
		em.requestElevator(15, Direction.UP);
		
		em.setStrategyID(SchedulingStrategyID.DYNAMIC);
		em.requestElevator(5, Direction.DOWN);
		
		em.setStrategyID(SchedulingStrategyID.EMERGENCY);
		em.requestElevator(7, Direction.DOWN);
	}
}
