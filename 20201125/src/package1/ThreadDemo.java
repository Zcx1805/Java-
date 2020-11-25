package package1;

public class ThreadDemo extends Thread{//继承Thread类
		public void run() {//实现run方法
			for(int i=0;i<3;i++) {
				System.out.println(Thread.currentThread().getName()+"-正在执行");
			}
			
		}
		
	}
	

