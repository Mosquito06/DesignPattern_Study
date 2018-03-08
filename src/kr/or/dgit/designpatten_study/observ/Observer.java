package kr.or.dgit.designpatten_study.observ;

public class Observer implements Counter.OnChanger{

	@Override
	public void prn(int data) {
		System.out.println("Observer" + data);
	}

}
