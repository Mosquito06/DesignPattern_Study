package kr.or.dgit.designpattern_study.ch11;

public class Door {
	private DoorStatus doorStatus;

	public Door() {
		this.doorStatus = DoorStatus.CLOSED;
	}

	public DoorStatus getDoorStatus() {
		return doorStatus;
	}
	
	public void close() {
		doorStatus = DoorStatus.CLOSED;
		System.out.println("문이 닫힘");
	}
	
	public void open() {
		doorStatus = DoorStatus.OPENED;
		System.out.println("문이 열림");
	}
	
}
