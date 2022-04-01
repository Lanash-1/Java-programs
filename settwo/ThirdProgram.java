package settwo;
import java.util.Scanner;

public class ThirdProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split(" ");
		int redCount=0, greenCount=0, blueCount=0;
		int order[] = {0,0,0};
		int ord = 0;
		char[] colors = new char[3];
		for(int i=0; i<arr.length; i++) {
			if(arr[i].charAt(0) == 'R') {
				redCount++;
				if(order[0] == 0) {
					ord++;
					order[0] = ord;
					colors[ord-1] = 'R';
				}
			}else if(arr[i].charAt(0) == 'G') {
				greenCount++;
				if(order[1] == 0) {
					ord++;
					order[1] = ord;
					colors[ord-1] = 'G';
				}
			}else if(arr[i].charAt(0) == 'B') {
				blueCount++;
				if(order[2] == 0) {
					ord++;
					order[2] = ord;
					colors[ord-1] = 'B';
				}
			}
		}
		
		
		int index = 0;
		char[] result = new char[arr.length];
		
		for(char c : colors) {
			if(c == 'R') {
				for(int count = 0; count < redCount; count++) {
					result[index] = c;
					index++;
				}
			}else if(c == 'G') {
				for(int count = 0; count < greenCount; count++) {
					result[index] = c;
					index++;
				}
			}else if(c == 'B') {
				for(int count = 0; count < blueCount; count++) {
					result[index] = c;
					index++;
				}
			}
		}
		for(char r : result) {
			System.out.print(r + " ");
		}
		
	}
}