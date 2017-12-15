package kr.or.dgit.designpattern_study.ch05.before;

public abstract class Robot {
	private String name;

	public Robot(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public abstract void attack();
	public abstract void move();
}
