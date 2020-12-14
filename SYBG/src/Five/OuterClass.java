package Five;

public class OuterClass {
	private String name;
	private int serno;
	public class InnerClass{
		public  InnerClass() {
			name="innerClass";
			serno=1;
		}
		public void showInfo() {
			System.out.println("name="+name+";serno="+serno);
		}
	}
	public OuterClass() {
		name="outerClass";
		serno=0;
	}
	public void disaplay() {
		System.out.println("name="+name+";serno="+serno);
	}
}
