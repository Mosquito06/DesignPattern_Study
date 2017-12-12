package kr.or.dgit.designpattern_study.ch01.EX17;

public class CreditCard implements Payment {

	@Override
	public String pay() {
		return "신용카드";
		
	}

}
