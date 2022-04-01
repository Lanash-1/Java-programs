package setthree;
import java.util.Scanner;
public class ThirdProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] words = sc.nextLine().split(" ");
		int totalLength = 0;
		for(String w : words) {
			totalLength += w.length();
		}
		int l = sc.nextInt();
		int minRows = totalLength%l;
		String start = words[0];
		int currentLength = start.length();
		int wordGap = 0;
		for(int i=1; i<words.length; i++) {
			if(currentLength < l) {
				if(currentLength + words[i].length() < l) {
					wordGap++;
					if(currentLength + words[i].length() + wordGap < l) {
						start += " " + words[i];
					}else {
						wordGap--;
						System.out.println(start);
						start = words[i];
					}
				}else {
					System.out.println(start);
					start = words[i];
				}
			}
		}
	}
}