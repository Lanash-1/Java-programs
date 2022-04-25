package FileSystem;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileDemo {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		File f = new File("demo.txt");
		try {
		f.createNewFile();
		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("First line\n");
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);
		String str = dis.readUTF();
		System.out.println(str);
		dos.writeUTF("Second line");
		str = dis.readUTF();
		System.out.println(str);
//		f.delete();
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
