package com.Atria.pckg9;

public abstract class Shape {
	protected float area;
	abstract void calArea();
	void show()
	{
		System.out.println("the area is:"+area);
	}

}
