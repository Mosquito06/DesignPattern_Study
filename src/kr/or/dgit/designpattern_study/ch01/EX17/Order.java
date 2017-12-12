package kr.or.dgit.designpattern_study.ch01.EX17;

public class Order {
	private Customer customer;
	private Product product;
	private Payment payment;
	private int total;

	public Product getProduct() {
		return product;
	}

	public int getTotal() {
		return total;
	}

	public Order(Customer setCustomer, Product addProduct, int pTotal, Payment howPay) {
		super();
		this.customer = setCustomer;
		this.product = addProduct;
		this.total = pTotal;
		this.payment = howPay;
	}

	public void TotalPay() {
		System.out.printf("%s 님 주문내역 :\n 제품명: %s, 제품 수량: %s개, 결제 방법 : %s, 총 가격 : %s", customer.getName(),
				product.getProductName(), total, payment.pay(), total * product.getPrice());
	}

}
