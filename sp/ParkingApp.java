package sp;
import java.util.Scanner;

// open closed principle is used below;
interface Parking{
	boolean isAvailable();
	int feesPerHour();
}

class Car implements Parking{
	static int carSlots = 50;
	public boolean isAvailable() {
		if(carSlots > 0) {
			System.out.println("Available Parking");
			carSlots--;
			return true;
		}else {
			System.out.println("Not Available");
			return false;
		}
	}
	public int feesPerHour() {
		return 45;
	}
}

class Bike implements Parking{
	static int bikeSlots = 150;
	public boolean isAvailable() {
		if(bikeSlots > 0) {
			System.out.println("Available Parking");
			bikeSlots--;
			return true;
		}else {
			System.out.println("Not Available");
			return false;
		}
	}
	public int feesPerHour() {
		return 20;
	}
}

// dependency inversion principle is used.
class CalculateTotalFees{
	Parking vehicle;
	
	public CalculateTotalFees(Parking vehicle) {
		this.vehicle = vehicle;
	}
	
	public int calculate(int entry, int exit) {
		return vehicle.feesPerHour() * (exit-entry);
	}
}

// interface segregation is used below;
interface Payment{
	void pay(int amount);
}

interface ScanQr{
	void scanQr();
}

interface Swipe{
	void swipe();
	void enterPin();
}

class Cash implements Payment{
	public void pay(int amount) {
		System.out.println("Paid " + amount);
	}
}

class UPI implements Payment, ScanQr{
	public void scanQr() {
		System.out.println("Qr scanned");
	}
	
	public void pay(int amount) {
		System.out.println("Paid " + amount);
	}
}

class Card implements Payment, Swipe{
	public void pay(int amount) {
		System.out.println("paid " + amount);
	}
	
	public void swipe() {
		System.out.println("Swiped...");
	}
	
	public void enterPin() {
		System.out.println("Enter pin");
	}
}

public class ParkingApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Parking vehicle = new Car();
		if(vehicle.isAvailable()) {
			System.out.println("Parking fees per hour: " + vehicle.feesPerHour());
			CalculateTotalFees calculateFees = new CalculateTotalFees(vehicle);
			int amount = calculateFees.calculate(20, 16);
			System.out.println("1. Cash\n2. Upi\n3. Card");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				Cash cash = new Cash();
				cash.pay(amount);
				break;
			case 2:
				UPI upi = new UPI();
				upi.scanQr();
				upi.pay(amount);
				break;
			case 3:
				Card card = new Card();
				card.swipe();
				card.enterPin();
				int pin = sc.nextInt();
				card.pay(amount);
				break;
			default:
				System.out.println("Option not available");
			}	
		}
	}
}
