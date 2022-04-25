package FileSystem;

import java.io.File;
import java.io.FileWriter;

public class FileDemo1 {
	public static void main(String[] args) throws Exception {
		File file = new File("demo1.txt");
		FileWriter writer = new FileWriter(file);
//		if(file.createNewFile()) {
			writer.write("new file\n");
			System.out.println("New file");
//		}else {
			writer.write("Existing file");
			System.out.println("Existing file");
//		}
		writer.close();
		file.delete();
	}
}