package kr.or.dgit.designpattern_study.ch11;

public class SamsungMotor extends Motor {

	public SamsungMotor(Door door) {
		super(door);
	}

	@Override
	protected void moveMotor(Direction direction) {
		String direc = direction == Direction.UP? "위로" : "아래";
		System.out.println("Samsung Motor" + direc + "방향으로 이동");
	}

}
