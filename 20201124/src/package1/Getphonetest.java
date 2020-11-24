package package1;
//使用对象类型作为方法的返回值
public class Getphonetest {
	public static void main(String[] args) {
		Phone b=getphone();
		System.out.println(b.brand);
		System.out.println(b.color);
		System.out.println(b.pirce);
	}
	
	public static Phone getphone() {
		Phone a=new Phone();
		a.brand="小米";
		a.color="蓝色";
		return a;
	}
	
}
