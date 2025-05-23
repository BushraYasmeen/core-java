package com.Atria.pkg10.FinalDemo;

public class FinalVariable {
	final int x=100;
	final static int y;//declartion blank ,and not initialized
	final static int z=10;

	
	void change() {//cannot change bcoz of the final keyword even after declaration
		x=30;
		y=100;
	}


	@Override
	public String toString() {
		return "FinalVariable [x=" + x + "]";
	}
	static {
		y=20;
		z=100;//once initialized cant be reassigned bcoz of the static keyword
		System.out.println("Value of y:"+y);
	}
	
}

