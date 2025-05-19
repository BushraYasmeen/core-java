package corejava;

public class Ex2 {
	int a;
	int b;
	
	public void show()
	{
		int sum=a+b;
		System.out.println("sum"+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex2 e=new Ex2();
		e.a=5;
		e.b=10;
		e.show();

	}

}
