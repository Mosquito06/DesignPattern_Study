package kr.or.dgit.designpattern_study.ch05.before;

public class RobotTest {

	public static void main(String[] args) {
		Robot taekwonV = new TaekwonV("TaekwonV");
		Robot atom = new Atom("Atom");
		
		System.out.println("My name is " + taekwonV.getName());
		taekwonV.attack();
		taekwonV.move();
	
		System.out.println("My name is " + atom.getName());
		atom.attack();
		atom.move();
	}

}
