package package1;

public class FinallyDemo {
	

	public static void main(String[] args) {
		try {
			String str="123456";
			String str1=null;
			System.out.println(str.charAt(5));
		}catch(NullPointerException e) {
			System.out.println("�׳��쳣������");
		}finally {
			System.out.println("finally0,ִ������");
		}

	}

}
