package FourString;

import java.util.Scanner;

public class StringTest4 {

		public static void game(){
	        int ranNumber=(int)(Math.random()*100+1);//100��������ĳ���Ҫ�ķ�Χ
	        Scanner scan=new Scanner(System.in);
	        while(true) {
	            System.out.println("���������µ����֣�");
	            int num=scan.nextInt();

	            if (num < ranNumber) {
	                System.out.println("��С��");
	            } else if (num > ranNumber) {
	                System.out.println("�´���");
	            } else {
	                System.out.println("��ϲ���¶���");
	                System.out.println("��Ϸ����");
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
	        System.out.println("���������Ĳ�����");
	        int i=scan.nextInt();
	        if(i==1) {
	            game();
	        }else if(i==0){
	            System.out.println("bye");
	        }else{
	            System.out.println("���������룺");
	        }
	}

}
