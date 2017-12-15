package kr.or.dgit.designpattern_study.ch05.after;

public class Robot {
	private String name;
	private MovingStrategy movingStrategy;
	private AttackStrategy attackStrategy;

	public Robot(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setMovingStrategy(MovingStrategy movingStrategy) {
		this.movingStrategy = movingStrategy;
	}

	public void setAttackStrategy(AttackStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}

	public void attack() {
		attackStrategy.attack();
	};

	public void move() {
		movingStrategy.move();
	};
}
