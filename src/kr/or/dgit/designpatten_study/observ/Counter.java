package kr.or.dgit.designpatten_study.observ;

import java.util.ArrayList;

public class Counter {
	int cnt;
	
	public static interface OnChanger{
		void prn(int data);
	}
	
	ArrayList<OnChanger> list = new ArrayList<>();
	
	public void setOnChanger(OnChanger listener) {
		list.add(listener);
	}
	
	public void addCnt() {
		cnt++;
		for(OnChanger listener : list) {
			listener.prn(cnt);
		}
	}
	
}
