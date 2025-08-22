package String;
// demo for == operator ,it will compare reference varaible
public class EqualOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Sachin";//both s1 and s2 will refer to same 
		String s2="Sachin";
		String s3=new String("Sachin");//when we create string using new keyword it will create seperate memory for each string
		String s4=new String("Sachin");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		

	}

}
