package kr.or.dgit.designpattern_study.ch11;

public class HyundaiMotor extends Motor{
	

	public HyundaiMotor(Door door) {
		super(door);
	}

	@Override
	protected void moveMotor(Direction direction) {
		String direc = direction == Direction.UP? "위로" : "아래";
		System.out.println("Hyundai Motor" + direc + "방향으로 이동");
	}

}
