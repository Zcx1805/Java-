package p1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copy2 {

	public static void main(String[] args) throws IOException {
	FileReader fr=new FileReader("D:\\777.txt");
	FileWriter  fw=new FileWriter("F:\\456.txt");
	char[] a=new char[1024];
	int num=0;
	while((num=fr.read(a))!=-1) {
		fw.write(a);
	}
	fw.flush();
	fw.close();
	fr.close();

	}

}
