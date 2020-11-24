package package1;
//使用对象类型作为方法的参数
public class Phonetest {
	public static void main(String[] args) {
		//main方法
		Phone two=new Phone();
		two.brand="三星";
		two.color="黑色";
		methd(two);
	}
	public static void methd(Phone a) {
		//定义一个方法
		System.out.println(a.brand);
		System.out.println(a.color);
		System.out.println(a.pirce);
		
	}
}
