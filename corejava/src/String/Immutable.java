package String;

public class Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="sachin";
		String str2=str1;
		String str3=str2;
		
		System.out.println("Before modification");
		System.out.println("str1"+str2);
		
		str1="Tendulkar";
		
		System.out.println("After modification");
		System.out.println("str1"+str1);
		System.out.println("str2"+str2);

	}

}
