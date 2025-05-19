package com.package2.Atria;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=10,b=20,c=5;
		if(a<b) {
			System.out.println("b is greatest");
			if(b<c) 
				System.out.println("c is greayest");
				}
			else
				System.out.println("a is greatest");
			}

	}*/
		int age=25;
		if(age>18)
		{
			System.out.println("you are an adult");
			if(age<18)
				System.out.println("you are a kid");
		}
		else
			System.out.println("you are a senior citizen");
	}
}

