package kr.or.dgit.designpattern_study.ch08;

public abstract class KindOfLamp {
	public static KindOfLamp getKindOfLamp(TypeOfLamp typeOfLamp) {
		KindOfLamp kindOfLamp = null;
		switch(typeOfLamp) {
		case LAMP:
			kindOfLamp = Lamp.getInstance();
			break;
		case SLEEPLAMP:
			kindOfLamp = SleepLamp.getInstance();
			break;
		}
		
		return kindOfLamp;
	}
	
	protected abstract void turnOn(); 
}
