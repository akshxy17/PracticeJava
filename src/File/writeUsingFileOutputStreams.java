package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class writeUsingFileOutputStreams {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\AA\\Resume.txt");
		
		FileOutputStream w = new FileOutputStream(f);
		
		w.write(72);
		w.write(52);
		w.write(62);
		w.write(42);
		
		String s = "Hello Lawde";
		
		for (char ch : s.toCharArray()) {
            w.write(ch); // Correctly writing each character
        }
		w.close();
		
	}

}
