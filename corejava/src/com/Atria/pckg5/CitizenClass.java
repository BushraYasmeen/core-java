package com.Atria.pckg5;

public class CitizenClass {
	private String address;
	private String name;
	private String adharNo;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	public int getPhNo() {
		return phNo;
	}
	public void setPhNo(int phNo) {
		this.phNo = phNo;
	}
	private int phNo;
	@Override
	public String toString() {
		return "CitizenClass [address=" + address + ", name=" + name + ", adharNo=" + adharNo + ", phNo=" + phNo + "]";
	}
	public CitizenClass(String address, String name, String adharNo, int phNo) {
		super();
		this.address = address;
		this.name = name;
		this.adharNo = adharNo;
		this.phNo = phNo;
	}
	
	
	
	

}
