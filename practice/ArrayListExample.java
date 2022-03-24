package practice;
import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {		
		ArrayList<String> EmployeeNames = new ArrayList<String>();
		int arr[]=new int[5];
		for(int i=0; i<5; i++){
			arr[i] = i+1;
			EmployeeNames.add("Emp "+arr[i]);
		}
		for(String name: EmployeeNames) {
			System.out.println(name);
		}
	}
}