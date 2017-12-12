package kr.or.dgit.designpattern_study.ch01.association;

public class ApplianciesTest {

	public static void main(String[] args) {
		HomeAppliancies[] hpArray = {new TV(20171111, "삼성", 2017), new Washer(20172222, "현대", 2017), new DishWasher(20173333, "LG", 2017)};
		for(HomeAppliancies ha: hpArray) {
			System.out.println(ha.toString());
			ha.turnOn();
			ha.turnOff();
						
		}
	}

}
