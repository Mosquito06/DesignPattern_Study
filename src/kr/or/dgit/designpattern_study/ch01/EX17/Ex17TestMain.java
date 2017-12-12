package kr.or.dgit.designpattern_study.ch01.EX17;

public class Ex17TestMain {

	public static void main(String[] args) {
		Customer customer = new Customer("아이유");
		Product product1 = new Product("짜장면", 3000);
		Product product2 = new Product("짬뽕", 3500);
		Product product3 = new Product("탕수육", 8000);
		
		
		Order order = new Order(customer, product1, 1, new CreditCard());
		Order order1 = new Order(customer, product2, 1, new CreditCard());
		Order order2 = new Order(customer, product3, 1, new CreditCard());
		
		customer.Order(order);
		customer.Order(order1);
		customer.Order(order2);
		
		customer.showOrder();
		customer.orderTotal();
	}

}
