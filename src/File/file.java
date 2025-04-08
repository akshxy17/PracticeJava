package File;

import java.io.File;
import java.io.IOException;

public class file {

	public static void main(String[] args) throws IOException {
		File f = new File("D:/123/");
		f.createNewFile();
		f.delete();
		f.canRead();
		f.canWrite();
		

	}

}
