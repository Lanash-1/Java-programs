package setone;
import java.util.Scanner;

public class ThirdProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] array = sc.nextLine().split(" ");
		int arr[] = new int[array.length];
		int k = sc.nextInt();
		for(int i=0; i<array.length; i++) {
			arr[i] = Integer.parseInt(array[i]);
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				int temp = 0;
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[k-1]);
		System.out.println(arr[arr.length - k]);
	}
}