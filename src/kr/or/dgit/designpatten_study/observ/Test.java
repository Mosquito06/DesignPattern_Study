package kr.or.dgit.designpatten_study.observ;

public class Test {
	
	public static void main(String[] args) {
		Observer o1 = new Observer();
		Observer o2 = new Observer();
		Observer o3 = new Observer();
		
		Counter c = new Counter();
		c.setOnChanger(o1);
		c.setOnChanger(o2);
		c.setOnChanger(o3);
		
		c.addCnt();
		c.addCnt();
	}
	
	
}
