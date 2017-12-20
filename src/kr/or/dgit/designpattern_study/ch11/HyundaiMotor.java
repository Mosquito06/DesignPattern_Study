package kr.or.dgit.designpattern_study.ch11;

public class HyundaiMotor {
	private Door door;
	private MotorStatus motorStatus;

	public HyundaiMotor(Door door) {
		super();
		this.door = door;
		this.motorStatus = MotorStatus.STOPPED;
	}

	public MotorStatus getMotorStatus() {
		return motorStatus;
	}

	public void setMotorStatus(MotorStatus motorStatus) {
		this.motorStatus = motorStatus;
	}

	public void move(Direction direction) {
		MotorStatus motorStatus = getMotorStatus();
		if(motorStatus == MotorStatus.MOVING) {
			return;
		}
		
		DoorStatus doorStatus = door.getDoorStatus();
		if(doorStatus == DoorStatus.OPENED) {
			door.close();
		}
		
		moveHyudaiMotor(direction);
		setMotorStatus(MotorStatus.MOVING);
	}

	private void moveHyudaiMotor(Direction direction) {
		String direc = direction == Direction.UP? "위로" : "아래";
		
		System.out.println(direc + "방향으로 이동");
		
	}

}
