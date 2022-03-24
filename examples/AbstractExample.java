package examples;
import java.util.Scanner;
abstract class TicketPrice{
	abstract void price(); 
}
class AC extends TicketPrice{
	void price() {
		System.out.println("Rs 250");
	}
}
class NONAC extends TicketPrice{
	void price() {
		System.out.println("Rs 100");
	}
}
public class AbstractExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for AC");
		System.out.println("Press 2 for Non-Ac");
		int type = sc.nextInt();
		if(type == 1) {
			TicketPrice first = new AC();
			first.price();
		}else if(type == 2) {
			TicketPrice first = new NONAC();
			first.price();
		}else {
			System.out.println("Not Available");
		}
	}
}
