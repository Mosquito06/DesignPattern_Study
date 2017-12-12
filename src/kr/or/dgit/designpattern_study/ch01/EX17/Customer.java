package kr.or.dgit.designpattern_study.ch01.EX17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {
	private String name;
	private List<Order> order;

	public String getName() {
		return name;
	}

	public List<Order> getOrder() {
		return order;
	}

	public Customer(String name) {
		super();
		this.name = name;
		this.order = new ArrayList<>();
	}

	public void Order(Order addOrder) {
		order.add(addOrder);
	}

	public void Cancel(Order cancelOrder) {
		order.remove(cancelOrder);
	}

	public void showOrder() {
		Iterator<Order> list = order.iterator();
		
		while(list.hasNext()) {
			list.next().TotalPay();
			System.out.println();
		}
	}
	
	public void orderTotal() {
		int Total = 0;
		for(Order o : order) {
			Total += o.getTotal() * o.getProduct().getPrice();
		}
		
		System.out.printf("%s 님의 총 주문가격은 %s 입니다.", name, Total);
	}

}
