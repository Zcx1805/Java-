package FourString;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="This is a demo of JAVA";
		System.out.println("�ַ������ȣ�"+s.length());
		System.out.println("�ַ������8��λ�õ��ַ��ǣ�"+s.charAt(8));
		System.out.println("��8���ַ���������ַ����ǣ�"+s.substring(8));
		System.out.println("8��15֮������ַ����ǣ�"+s.substring(8, 15));
		System.out.println("�����ַ����Ƿ���He��ͷ��"+s.startsWith("He"));
		System.out.println("���ַ���ȫ��ת��ΪСд�ַ���"+s.toLowerCase());
		System.out.println("h��һ�γ��ֵ�λ���ǣ�"+s.indexOf("h"));
		System.out.println("h���һ�γ��ֵ�λ���ǣ�"+s.indexOf("h"));

	}

}
