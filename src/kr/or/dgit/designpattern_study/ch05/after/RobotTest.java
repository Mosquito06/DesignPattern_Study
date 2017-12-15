package kr.or.dgit.designpattern_study.ch05.after;

public class RobotTest {

	public static void main(String[] args) {
		Robot taekwonV = new TaekwonV("TaekwonV");
		Robot atom = new Atom("Atom");
		Robot evangelion = new Evangelion("evangelion");
		
		taekwonV.setAttackStrategy(new MissileStrategy());
		taekwonV.setMovingStrategy(new WalkingStrategy());
		
		atom.setAttackStrategy(new PunchStrategy());
		atom.setMovingStrategy(new FlyingStrategy());
		
		evangelion.setAttackStrategy(new Nife());
		evangelion.setMovingStrategy(new RunningStrategy());
		
		System.out.println("My name is " + taekwonV.getName());
		taekwonV.attack();
		taekwonV.move();
	
		System.out.println();
		
		System.out.println("My name is " + atom.getName());
		atom.attack();
		atom.move();
		
		System.out.println();
		
		System.out.println("My name is " + evangelion.getName());
		evangelion.attack();
		evangelion.move();
		
	}

}
