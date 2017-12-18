package kr.or.dgit.designpattern_study.ch08;

public class TestButton {

	public static void main(String[] args) {
		KindOfAlarm generalAlarm = KindOfAlarm.getKindOfLamp(TypeOfAlarm.GENELAR);
		KindOfAlarm emergenceAlarm = KindOfAlarm.getKindOfLamp(TypeOfAlarm.EMERGENCE);
		
		Command asc = new AlarmStartCommand(generalAlarm);
		Button button = new Button(asc);
		button.pressed();
		
		button.setCommand(new AlarmStartCommand(emergenceAlarm));
		button.pressed();
		
		KindOfLamp Lamp = KindOfLamp.getKindOfLamp(TypeOfLamp.LAMP);
		KindOfLamp SleepLamp = KindOfLamp.getKindOfLamp(TypeOfLamp.SLEEPLAMP);
		
		button.setCommand(new LampOnCommand(Lamp));
		button.pressed();
		
		button.setCommand(new LampOnCommand(SleepLamp));
		button.pressed();
		

	}

}
