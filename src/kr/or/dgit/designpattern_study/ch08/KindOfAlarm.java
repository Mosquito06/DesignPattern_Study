package kr.or.dgit.designpattern_study.ch08;

public abstract class KindOfAlarm {
	public static KindOfAlarm getKindOfLamp(TypeOfAlarm typeOfAlarm) {
		KindOfAlarm kindOfAlarm = null;
		switch(typeOfAlarm) {
		case GENELAR:
			kindOfAlarm = General.getInstance();
			break;
		case EMERGENCE:
			kindOfAlarm = Emergence.getInstance();
			break;
		}
		
		return kindOfAlarm;
	}
	
	protected abstract void start(); 
}
