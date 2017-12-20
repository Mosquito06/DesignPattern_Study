package kr.or.dgit.designpattern_study.ch14;

public class Test {
	public static void main(String[] args) {
		Body body = new Body(100, 70);
		Keyboard keyboard = new Keyboard(5, 2);
		Monitor monitor = new Monitor(20, 30);
		Speaker speaker = new Speaker(5, 4);
		
		Computer computer = new Computer();
		computer.addComponent(body);
		computer.addComponent(keyboard);
		computer.addComponent(monitor);
		computer.addComponent(speaker);

		System.out.println("컴퓨터의 파워는 " + computer.getPower() + " W 입니다.");
		System.out.println("컴퓨터의 가격은 " + computer.getPrice() + " 만원 입니다.");
	}
}
