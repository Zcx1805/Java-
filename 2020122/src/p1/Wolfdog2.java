package p1;

public class Wolfdog2 {
	String name;
	int age;
	String color;
	
	public void Wolfback() {	
		System.out.println("Wolfdog bark!");
	}
	public String barkReturn(String name) {
		System.out.println("Wolfdog bark!"+name);
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wolfdog2 wolf=new Wolfdog2();
		//wolf.Wolfback();
		String s1="teddy";
		//String s2="betty";
		String s3=wolf.barkReturn(s1);
		//wolf.barkReturn(s1);
		//wolf.barkReturn(s2);
		//System.out.println(wolf.barkReturn(s1));
		//System.out.println(s3);
	}

}
