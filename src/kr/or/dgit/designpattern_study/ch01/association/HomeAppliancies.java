package kr.or.dgit.designpattern_study.ch01.association;

public abstract class HomeAppliancies {
	private int serialNo;
	private String manufacturer;
	private int year;

	public HomeAppliancies(int serialNo, String manufacturer, int year) {
		super();
		this.serialNo = serialNo;
		this.manufacturer = manufacturer;
		this.year = year;
	}

	public abstract void turnOn();

	public abstract void turnOff();

	@Override
	public String toString() {
		return String.format("[serialNo=%s, manufacturer=%s, year=%s]", serialNo, manufacturer, year);
	}
	
	

}
