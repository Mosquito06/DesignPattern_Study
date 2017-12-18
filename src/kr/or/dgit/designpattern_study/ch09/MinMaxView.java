package kr.or.dgit.designpattern_study.ch09;

import java.util.Collections;
import java.util.List;

public class MinMaxView implements Observer {
	private ScoreRecord scoreRecord;

	public MinMaxView(ScoreRecord scoreRecord) {
		super();
		this.scoreRecord = scoreRecord;
	}

	@Override
	public void update() {
		List<Integer> record = scoreRecord.getScores();
		displayMinMax(record);
	}

	private void displayMinMax(List<Integer> record) {
		int min = Collections.min(record, null);
		int max = Collections.max(record, null);
		System.out.println("Min: " + min + " Max: " + max);
		
	}

}
