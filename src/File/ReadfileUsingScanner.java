package File;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Readfile{
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\AA\\Resume.txt");
		
		Scanner s = new Scanner(f);
		 while(s.hasNext()) {
			 System.out.println(s.next());
		 }
	}
}