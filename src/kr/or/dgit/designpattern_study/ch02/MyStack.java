package kr.or.dgit.designpattern_study.ch02;

import java.util.ArrayList;

public class MyStack extends ArrayList<String>{
	public boolean isStackEmpty() {
		return isEmpty();
	}
	
	public int stackSize() {
		return size();
	}
	
	public void push(String item) {
		add(item);
	}
	
	public String pop() {
		return remove(size()-1);
	}
	
	public static void main(String[] args) {
		MyStack st = new MyStack();
		st.push("A");
		st.push("C");
		System.out.println(st.pop());
		System.out.println(st.pop());
	}
}
