package kr.or.dgit.designpattern_study.ch01.association;

public class DishWasher extends HomeAppliancies {

	public DishWasher(int serialNo, String manufacturer, int year) {
		super(serialNo, manufacturer, year);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void turnOn() {
		System.out.println("식기세척기가 켜졌습니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("식기세척기가 꺼졌습니다.");

	}

	@Override
	public String toString() {
		return String.format(
				"[%s, %s]", this.getClass().getSimpleName(), super.toString());
	}
	
	

	
}
