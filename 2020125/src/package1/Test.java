package package1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		String str = "��ã�Java"; //����д���ļ����ַ���
		File file = new File("file.txt");
		 file.createNewFile(); //�������ļ�
		FileWriter fout = new FileWriter(file); //�����ļ����������
		 fout.write(str); //д����
		 System.out.println("write to file ��" + file.getName());
		// FileReader fin = new FileReader(file); //�����ļ�����������
		 //System.out.println("read from file ��" + file.getName());
		// char[] chars = new char[10];
		 //while (fin.read(chars) != -1) { //������
		 //System.out.println(chars);
		 //}
		 //fin.close(); fout.close();

	}

}
