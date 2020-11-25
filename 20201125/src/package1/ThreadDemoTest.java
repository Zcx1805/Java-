package package1;

//import package1.ThreadDemo.MyThread;

public class ThreadDemoTest {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			ThreadDemo thread= new ThreadDemo();
			thread.start();
		}
	}
}
/*class MyThread extends Thread{
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(Thread.currentThread().getName()+"-ÕýÔÚÖ´ÐÐ");
		}
		
}
}*/
