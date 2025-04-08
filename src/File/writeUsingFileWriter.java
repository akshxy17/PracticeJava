package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeUsingFileWriter {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\AA\\New.txt");
		
		System.out.println(f.exists());
		
		FileWriter fw = new FileWriter(f);
		
		String s ="Hey bro, watsup";
		
		fw.write(s);
		
		fw.close();
		
	}

}
