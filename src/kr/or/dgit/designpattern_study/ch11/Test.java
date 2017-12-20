package kr.or.dgit.designpattern_study.ch11;

public class Test {

	public static void main(String[] args) {
		Door door = new Door();
		HyundaiMotor hyundaiMotor = new HyundaiMotor(door);
		
		hyundaiMotor.move(Direction.UP);
		
		hyundaiMotor.setMotorStatus(MotorStatus.STOPPED);
		door.open();
		hyundaiMotor.move(Direction.DOWN);
		

	}

}
