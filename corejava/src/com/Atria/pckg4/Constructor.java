package com.Atria.pckg4;

public class Constructor {
	private String customerName;
	private int cid;
	private String city;
	
	
/*	public Constructor(String customerName, int cid, String city) {
		super();
		this.customerName = customerName;
		this.cid = cid;
		this.city = city;*/
	public Constructor()
	{
		System.out.println("i am default contructor");
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Constructor [customerName=" + customerName + ", cid=" + cid + ", city=" + city + "]";
	}
	
	
	

}
