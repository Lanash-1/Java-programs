package setfour;
import java.util.Scanner;

public class Fasting {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] array = sc.nextLine().split(" ");
		int arr[] = new int[array.length];
		for(int i=0; i<array.length; i++) {
			arr[i] = Integer.parseInt(array[i]);
		}
		int size = arr.length;
		int index = 1;
		boolean flag = true;
		while(index < size) {
			if(index%2 == 1) {
				if(arr[index] - arr[index-1] <= 3 || arr[index] - arr[index-1] > 8) {
					flag = false;
					break;
				}
			}else {
				if(arr[index] - arr[index-1] <= 16) {
					flag = false;
					break;
				}
			}
			index++;
		}
		if(flag) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
