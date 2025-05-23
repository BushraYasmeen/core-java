package com.Atria.pkg10.FinalDemo;
final class FinalDemo//if the class is final inheritance is not possible
{
	void show() {
		System.out.println("Final class cannot be inheritated");//outer class cannot be static 
	}

class Final3 extends FinalDemo
{
	
}
}
