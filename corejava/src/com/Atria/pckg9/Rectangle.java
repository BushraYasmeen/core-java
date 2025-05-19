package com.Atria.pckg9;

public class Rectangle extends Shape {
	
	private float width;
	private float height;
	
	public Rectangle()
	{
		this.width=2.0f;
		this.height=5.0f;
				}

	@Override
	void calArea() {
		// TODO Auto-generated method stub
		area=width*height;
		
	}
	
	

}
