package package1;
//ʹ�ö���������Ϊ�����Ĳ���
public class Phonetest {
	public static void main(String[] args) {
		//main����
		Phone two=new Phone();
		two.brand="����";
		two.color="��ɫ";
		methd(two);
	}
	public static void methd(Phone a) {
		//����һ������
		System.out.println(a.brand);
		System.out.println(a.color);
		System.out.println(a.pirce);
		
	}
}
