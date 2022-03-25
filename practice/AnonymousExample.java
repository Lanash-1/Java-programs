package practice;
import java.util.Scanner;

interface Printable {
	void print(int price);
}

interface Calculate{
	int result(int cost);
}

public class AnonymousExample {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Base price: ");
		int base = sc.nextInt();
		Printable p=new Printable(){

			public void print(int price) {
				System.out.println("base price: "+ price);
			}
		};
		p.print(base);
		Calculate p1=new Calculate(){

			public int result(int cost) {
				return cost + 100;
			}
		};
		System.out.println("Total price: "+ p1.result(base));
	}
}
