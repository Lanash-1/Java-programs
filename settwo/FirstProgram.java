package settwo;
import java.util.Scanner;

public class FirstProgram {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] array = sc.nextLine().split(" ");
		int arr[] = new int[array.length];
		for(int i=0; i<array.length; i++) {
			arr[i] = Integer.parseInt(array[i]);
		}
		int max = 0;
		int start = 0;
		int end = 0;
		for(int i=0; i<arr.length; i++) {
			int one = 0;
			int zero = 0;
			for(int j=i; j<arr.length; j++) {
				if(arr[j] == 0) {
					zero += 1;
				}else {
					one += 1;
				}
				if(one == zero) {
					if(max < j-i+1) {
						max = j-1+1;
						start = i;
						end = j;
					}
				}
			}
		}
		if(start == 0 && end == 0) {
			System.out.println("No sub array found");
		}else {			
			System.out.println("Start: " + start);
			System.out.println("End: " + end);
		}
		
	}
}
