package kr.or.dgit.designpattern_study.ch09;

import java.util.List;

public class StatisticsView implements Observer{
	private ScoreRecord scoreRecord;

	public StatisticsView(ScoreRecord scoreRecord) {
		super();
		this.scoreRecord = scoreRecord;
	}

	@Override
	public void update() {
		List<Integer> record = scoreRecord.getScores();	
		displayStatistics(record);
	}
	
	public void displayStatistics(List<Integer> record) {
		int sum = 0;
		for(int score: record) {
			sum += score;
		}
		float average = (float) sum/record.size();
		System.out.println("Sum: " + sum + " Average: " + average);
		
	}
	

}
