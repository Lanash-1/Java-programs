package examples;
import java.util.Scanner;

interface Printable {
	void print(int price);
}

interface Calculate{
	int result(int cost);
}

class Final implements Printable, Calculate{
	public void print(int price) {
		System.out.println("Total price: "+ price);
	}
	public int result(int cost) {
		return cost + 100;
	}
}

public class InterfaceExample {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Base price: ");
		int base = sc.nextInt();
		Final finish = new Final();
		int total = finish.result(base);
		finish.print(total);
	}
}
