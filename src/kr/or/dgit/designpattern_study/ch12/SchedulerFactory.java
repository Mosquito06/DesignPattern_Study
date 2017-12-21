package kr.or.dgit.designpattern_study.ch12;

public class SchedulerFactory {
	public static ElevatorScheduler getScheduler(SchedulingStrategyID strategyID) {
		ElevatorScheduler scheduler = null;
		switch(strategyID) {
			case RESPONSE_TIME :
				scheduler = ResponceTimeScheduler.getInstance();
				break;
			case THROUGHPUT :
				scheduler = ThroughputScheduler.getInstance();
				break;
			case EMERGENCY :
				scheduler = EmergencyScheduler.getInstance();
				break;	
			case DYNAMIC :
				int hour = (int) (Math.random()*24); 
				System.out.println("현재시간 : " + hour);
				if(hour < 12) {
					scheduler = ResponceTimeScheduler.getInstance();
				}else {
					scheduler = ThroughputScheduler.getInstance();
				}
				break;
			default :
				scheduler = ResponceTimeScheduler.getInstance();
				break;
		}
		
		return scheduler;
	}
}
