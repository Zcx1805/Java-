package package1;
//构建了一个手机 类(属性 行为)
public class Phone {
	String brand;//定义属性(java中的成员变量)
	int pirce;
	String color;
	
	public void call(String who) {//定义行为
		//(java中的方法)
		System.out.println("给"+who+"打电话");
	}
	public void sendmessage() {
		System.out.println("群发短信");
	}
}

