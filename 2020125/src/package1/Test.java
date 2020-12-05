package package1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		String str = "你好！Java"; //定义写入文件的字符串
		File file = new File("file.txt");
		 file.createNewFile(); //创建新文件
		FileWriter fout = new FileWriter(file); //创建文件输出流对象
		 fout.write(str); //写操作
		 System.out.println("write to file ：" + file.getName());
		// FileReader fin = new FileReader(file); //创建文件输入流对象
		 //System.out.println("read from file ：" + file.getName());
		// char[] chars = new char[10];
		 //while (fin.read(chars) != -1) { //读操作
		 //System.out.println(chars);
		 //}
		 //fin.close(); fout.close();

	}

}
