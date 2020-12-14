package FourString;

import java.util.Scanner;

public class StringTest4 {

		public static void game(){
	        int ranNumber=(int)(Math.random()*100+1);//100可以任意改成需要的范围
	        Scanner scan=new Scanner(System.in);
	        while(true) {
	            System.out.println("请输入您猜的数字：");
	            int num=scan.nextInt();

	            if (num < ranNumber) {
	                System.out.println("猜小了");
	            } else if (num > ranNumber) {
	                System.out.println("猜大了");
	            } else {
	                System.out.println("恭喜您猜对了");
	                System.out.println("游戏结束");
	                break;
	            }
	        }
	    }
	    public static void main(String[] args) {
	        System.out.println("******************");
	        System.out.println("****1.play********");
	        System.out.println("****0.exit********");
	        System.out.println("******************");
	        Scanner scan=new Scanner(System.in);
	        System.out.println("请输入您的操作：");
	        int i=scan.nextInt();
	        if(i==1) {
	            game();
	        }else if(i==0){
	            System.out.println("bye");
	        }else{
	            System.out.println("请重新输入：");
	        }
	}

}
