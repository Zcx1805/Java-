package Five;

public class InnerClassDemo {

	public static void main(String[] args) {
		OuterClass oClass=new OuterClass();
		oClass.disaplay();
		OuterClass.InnerClass iClass=oClass.new InnerClass();
		iClass.showInfo();

	}

}
