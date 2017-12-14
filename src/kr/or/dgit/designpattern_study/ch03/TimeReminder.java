package kr.or.dgit.designpattern_study.ch03;

public class TimeReminder {
	private TimeProvider tProv;
	private MP3 mp3 = new MP3();
	
	public void setTimeProvider(TimeProvider tprov) {
		this.tProv = tprov;
	}
	
	public void reminder() {
		int hours = tProv.getTime();
		if(hours >= 22) {
			mp3.play();
		}else {
			System.out.println("오후 10시 전입니다.");
		}
	}
}
