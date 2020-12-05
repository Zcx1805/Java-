package p2;
public class ThreadDemo {
	public void main(String[] args) {
		for(int i=0;i<10;i++) {
			Mythread thread=new Mythread();
			thread.start();		
		}
	}
}
class Mythread extends Thread{
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(Thread.currentThread().getName()+"ÕýÔÚÖ´ÐÐ");
		}
		
	}
	
}