import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileCopyDemo2 {
	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new FileReader("F:\\123.txt"));
			BufferedWriter bw=new BufferedWriter(new FileWriter("F:\\789.txt"));
		    String line=null;
			do {
				line=br.readLine();
				if(null!=line)
				bw.write(line);
			}
			while(line!=null);
			br.close();bw.close();
			System.out.println("The file was copyed!");
		} catch (IOException e) {		
			e.printStackTrace();		
		}
	}

}
