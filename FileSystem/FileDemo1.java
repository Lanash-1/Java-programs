package FileSystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileDemo1 {
	public static void main(String[] args) throws Exception {
//		FileWriter writer = new FileWriter(file);
		String filepath = "demo1.txt";
		String tempFile = "temp.txt";
		File oldFile = new File(filepath);
		File newFile = new File(tempFile);
		String ID = ""; String name = ""; String cost = "";
		FileWriter fw = new FileWriter(tempFile,true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		Scanner x = new Scanner(new File(filepath));
		x.useDelimiter("[-\n]");
		while(x.hasNext()) {
			ID = x.next();
			name = x.next();
			cost = x.next();
			if(ID.equals("1"))
			{
				pw.println("1-rice-150");
			}
			else
			{
				pw.println(ID + "-" + name + "-" + cost);
			}
		}
		x.close();
		pw.flush();
		pw.close();
		oldFile.delete();
		File f = new File(filepath);
		newFile.renameTo(f);
	}
}