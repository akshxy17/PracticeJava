package File;

import java.io.BufferedWriter;
import java.io.File;


public class writeUsingBufferWriter {
	
	public static void main(String[] args) {
		
		File f = new File("D:\\AA\\New.txt");
		
		System.out.println(f.exists());
		
		BufferedWriter bf = new BufferedWriter(f);
		
	}
	
}
