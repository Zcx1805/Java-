package p2;

public class RunableDemo implements Runnable{
	public void run() {
		for(int i=0;i<8;i++) {
			System.out.println(Thread.currentThread().getName()+"ÕýÔÚÖ´ÐÐ");
		}
	}
	public void main(String[] args) {
		for(int i=0;i<10;i++) {
		//Myrunable runable=new Myrunable();
		//Thread t=new Thread(runable);
		//
		}
	}
}

