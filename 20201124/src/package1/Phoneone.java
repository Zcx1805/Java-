package package1;
//һ���಻��ֱ����,��Ҫ�����ഴ��һ������ʹ��
//1. ����(��һ�����µ�class��ͬ����)
//import ������.������
//import package1.Phone;
public class Phoneone {
	public static void main(String[] args) {
	Phone phone1=new Phone();//2.����
	System.out.println(phone1.brand);
	System.out.println(phone1.color);
	System.out.println(phone1.pirce);
	phone1.brand="ƻ��";
	phone1.color="��ɫ";//3.ʹ��(����)
	System.out.println(phone1.brand);
	System.out.println(phone1.color);
	System.out.println(phone1.pirce);
	phone1.call("�ǲ�˹");//3.ʹ��(����)
	phone1.sendmessage();
	}
}
