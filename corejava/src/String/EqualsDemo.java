package String;

public class EqualsDemo {//it will check the value stored inside the string

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="sachin";
		String s2="sachin";
		String s3=new String("sachin");
		String s4="sachin";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s3));

	}

}
