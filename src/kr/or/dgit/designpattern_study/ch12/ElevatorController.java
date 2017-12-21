package kr.or.dgit.designpattern_study.ch12;

public class ElevatorController {
	private int id;
	private int curFloor;
	
	public ElevatorController(int id) {
		super();
		this.id = id;
	}
	
	public void gotoFloor(int destination) {
		System.out.println("Elevator [" + id + "] Floor: " + curFloor);
		curFloor = destination;
		System.out.println(" ==> " + curFloor);
	}
	
}
