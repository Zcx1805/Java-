package package2;

public class Test {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			RunableDemo runnable=new RunableDemo();
			Thread t=new Thread(runnable);
			t.setName("runnable"+i);
			t.start();
			}

	}

}
