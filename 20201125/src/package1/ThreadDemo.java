package package1;

public class ThreadDemo extends Thread{//�̳�Thread��
		public void run() {//ʵ��run����
			for(int i=0;i<3;i++) {
				System.out.println(Thread.currentThread().getName()+"-����ִ��");
			}
			
		}
		
	}
	

