package settwo;
import java.util.Scanner;

public class SecondProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] temparray = sc.nextLine().split(" ");
		int arr[] = new int[temparray.length];
		for(int i=0; i<temparray.length; i++) {
			arr[i] = Integer.parseInt(temparray[i]);
		}
		for(int i=0; i<arr.length; i++) {
			int greater = 0;
			int number = arr[i];
			int diff = 0;
			for(int j=i+1; j<arr.length; j++) {
				if(number < 0 && arr[j] > number) {
					if(number - arr[j] > diff || diff == 0) {
						greater = arr[j];
						diff = number-arr[j];
					}
				}else {
					if(arr[j]>number && (arr[j]-number<diff || diff == 0)) {
						greater = arr[j];
						diff = arr[j] - number;
					}
				}
			}
			if(diff == 0) {
				System.out.print(-1+" ");
			}else {
				System.out.print(greater+" ");
			}
		}
	}
}