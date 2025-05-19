package com.Atria.pckg9;

public class Square extends Shape{

	private float side;
	public Square()
	{
		this.side=2.0f;
	}
	@Override
	void calArea() {
		// TODO Auto-generated method stub
		area=side*side;
		
	}

}
