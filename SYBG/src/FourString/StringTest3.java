package FourString;

public class StringTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("����ѧϰJava���ԣ���");
				System.out.println("ԭ�ַ����ǣ�+sb");
				System.out.println("ԭ�ַ��������ǣ�"+sb.length());
				System.out.println("��Ӻ���ַ����ǣ�"+sb.append("ѧʱ��"));
				System.out.println("�������ַ����ǣ�"+sb.insert(8,"�������"));
				System.out.println("�������ֺ���ַ����ǣ�"+sb.insert(16,60));
				System.out.println("�滻����ַ����ǣ�"+sb.replace(0,1,"��ѧ��"));
				System.out.println("ɾ������ַ����ǣ�"+sb.deleteCharAt(16));
				System.out.println("�����������ַ����ǣ�"+sb.reverse());
				System.out.println("������ַ����ǣ�"+sb);
				

	}

}
