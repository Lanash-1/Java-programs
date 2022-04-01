package setthree;
import java.util.Scanner;

public class FirstProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String result = "";
		for(int i=word.length()-1; i>=0; i--) {
			result += word.charAt(i);
		}
		System.out.println(result);
	}
}