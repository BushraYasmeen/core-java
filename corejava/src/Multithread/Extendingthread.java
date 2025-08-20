package Multithread;

public class Extendingthread extends Thread {
	
	public void run() //running state
	{
		System.out.println("Hello World");
	}
	
public static void main(String[] args) {
	Extendingthread e=new Extendingthread();//new state
	e.start(); //1st stage runnable state
	
}
	
}

