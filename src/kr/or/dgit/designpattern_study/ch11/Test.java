package kr.or.dgit.designpattern_study.ch11;

public class Test {

	public static void main(String[] args) {
		Door door = new Door();
		Motor HyundaiMotor = new HyundaiMotor(door);
		Motor LGMotor = new LGMotor(door);
		Motor SamsungMotor = new SamsungMotor(door);
		
		HyundaiMotor.move(Direction.UP);
		LGMotor.move(Direction.UP);
		SamsungMotor.move(Direction.UP);
		
		HyundaiMotor.setMotorStatus(MotorStatus.STOPPED);
		LGMotor.setMotorStatus(MotorStatus.STOPPED);
		SamsungMotor.setMotorStatus(MotorStatus.STOPPED);
		
		door.open();
		HyundaiMotor.move(Direction.DOWN);
		LGMotor.move(Direction.DOWN);
		SamsungMotor.move(Direction.DOWN);

	}

}
