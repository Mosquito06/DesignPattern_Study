package kr.or.dgit.designpattern_study.ch03;

public class Mp3Test {

	public static void main(String[] args) {
		TimeProvider currentTime = new FakeTimeProvider();
		TimeProvider setTenTime = new FakeTimeProvider(23);
		
		TimeReminder currentTest = new TimeReminder();
		currentTest.setTimeProvider(currentTime);
		
		TimeReminder TenTest = new TimeReminder();
		TenTest.setTimeProvider(setTenTime);
		
		currentTest.reminder();
		TenTest.reminder();
	}

}
