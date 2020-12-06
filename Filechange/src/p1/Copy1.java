package p1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy1 {

	public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("D:\\777.txt");
	FileOutputStream fos=new FileOutputStream("F:\\123.txt");
    byte[] a=new byte[1024];
    int num=0;
    while((num=fis.read(a))!=-1) {
    	fos.write(a);
    }
    fos.flush();
    fos.close();
    fis.close();
	}

}
