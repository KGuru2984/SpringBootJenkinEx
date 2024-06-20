package com.edubridge.model;

public class Products 
{
	private Integer productid;
	private String title;
	private Integer price;
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Products(Integer productid, String title, Integer price) {
		super();
		this.productid = productid;
		this.title = title;
		this.price = price;
	}
	public Products() {
		super();
	}
	@Override
	public String toString() {
		return "Products [productid=" + productid + ", title=" + title + ", price=" + price + "]";
	}
	
	
}
