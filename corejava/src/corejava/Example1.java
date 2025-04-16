package corejava;

public class Example1 {
	int serialnumber;
	String name;
	int age;
	public void show()
	{
	
		System.out.println("serialnumber "+serialnumber +" \nname " +name +"\nage " +age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 e=new Example1();
		e.serialnumber=7;
		e.name="bushra";
		e.age=20;
		e.show();

	}

}
