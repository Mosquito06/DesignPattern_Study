package kr.or.dgit.designpattern_study.ch02;

import java.util.ArrayList;

public class MyStack2{
	private ArrayList<String> arrayList = new ArrayList<>();
	
	public boolean isStackEmpty() {
		return arrayList.isEmpty();
	}
	
	public int stackSize() {
		return arrayList.size();
	}
	
	public void push(String item) {
		arrayList.add(item);
	}
	
	public String pop() {
		return arrayList.remove(arrayList.size()-1);
	}
	
	public static void main(String[] args) {
		MyStack2 st = new MyStack2();
		st.push("A");
		st.push("C");
		System.out.println(st.pop());
		System.out.println(st.pop());
	}
}
