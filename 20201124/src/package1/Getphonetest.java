package package1;
//ʹ�ö���������Ϊ�����ķ���ֵ
public class Getphonetest {
	public static void main(String[] args) {
		Phone b=getphone();
		System.out.println(b.brand);
		System.out.println(b.color);
		System.out.println(b.pirce);
	}
	
	public static Phone getphone() {
		Phone a=new Phone();
		a.brand="С��";
		a.color="��ɫ";
		return a;
	}
	
}
