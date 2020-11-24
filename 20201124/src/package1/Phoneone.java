package package1;
//一个类不能直接用,需要根据类创建一个对象使用
//1. 导包(在一个包下的class不同罢了)
//import 包名称.类名称
//import package1.Phone;
public class Phoneone {
	public static void main(String[] args) {
	Phone phone1=new Phone();//2.创建
	System.out.println(phone1.brand);
	System.out.println(phone1.color);
	System.out.println(phone1.pirce);
	phone1.brand="苹果";
	phone1.color="白色";//3.使用(变量)
	System.out.println(phone1.brand);
	System.out.println(phone1.color);
	System.out.println(phone1.pirce);
	phone1.call("乔布斯");//3.使用(方法)
	phone1.sendmessage();
	}
}
