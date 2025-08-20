package Multithread;

public class Implementingrunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("HEllo World");
		
	}
	public static void main(String[] args) {
		 
		Implementingrunnable t=new Implementingrunnable();//creating object
		Thread t1=new Thread(t);//bcoz in this we implemented runnable interface so we need to create thread class
		t1.start();
		
	}

}
