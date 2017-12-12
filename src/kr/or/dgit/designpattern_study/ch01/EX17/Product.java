package kr.or.dgit.designpattern_study.ch01.EX17;

public class Product {
	private String productName;
	private int price;

	public String getProductName() {
		return productName;
	}

	public int getPrice() {
		return price;
	}

	public Product(String productName, int price) {
		super();
		this.productName = productName;
		this.price = price;
	}

}
