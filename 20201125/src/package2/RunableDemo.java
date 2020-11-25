package package2;

public class RunableDemo implements Runnable{
	public void run() {
		for(int i=0;i<8;i++) {
			System.out.println(Thread.currentThread().getName()+"-正在运行");
		}
	}
}
