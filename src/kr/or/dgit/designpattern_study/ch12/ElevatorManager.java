package kr.or.dgit.designpattern_study.ch12;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
	private List<ElevatorController> controllers;
	private SchedulingStrategyID strategyID;
	
	
	public ElevatorManager(int controllersCount, SchedulingStrategyID strategyID) {
		super();
		this.controllers = new ArrayList<ElevatorController>(controllersCount);
		for(int i = 0; i < controllersCount; i++) {
			ElevatorController controller = new ElevatorController(i);
			controllers.add(controller);
		}
		
		this.strategyID = strategyID;
	}
	
	public void setStrategyID(SchedulingStrategyID strategyID) {
		this.strategyID = strategyID;
	}
	
	public void requestElevator(int destination, Direction direction) {
		ElevatorScheduler scheduler = SchedulerFactory.getScheduler(strategyID);
				
		int selectElevator = scheduler.selectElevator(this, destination, direction);
		controllers.get(selectElevator).gotoFloor(destination);
	}
	
	
}
