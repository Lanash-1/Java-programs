package sp;
import java.util.Scanner;

// Single responsibility principle is used in bookcab class.
class BookCab{
	Vehicles vehicle;
	BookCab(Vehicles vehicle){
		this.vehicle = vehicle;
	}
	
	public void bookRide(String pickup, String destination) {
		System.out.println("Pickup: "+pickup+"\nDrop: "+destination+"\nNo of persons: "+vehicle.noOfSeats()+"\nprice per km: "+vehicle.pricePerKm());
		System.out.println("Booked");
	}
}

// open closed principle is used in RideOtp. in future if we need to send otp in other ways 
// we can just extend this method.
interface RideOtp{
	void sendotp();
}

class SmsOtp implements RideOtp{
	public void sendotp() {
		System.out.println("SMS OTP: 1234");
	}
}

class EmailOtp implements RideOtp{
	public void sendotp() {
		System.out.println("Email OTP: 1234");
	}
}

// LiskovSubstitution is used so that all the method work in sub classes.



// open closed is also used.
interface Vehicles{
	int pricePerKm();
	int noOfSeats();
}

class Bike implements Vehicles{
	public int pricePerKm() {
		return 5;
	}
	
	public int noOfSeats() {
		return 1;
	}
}

class Auto implements Vehicles{
	public int pricePerKm() {
		return 10;
	}
	
	public int noOfSeats() {
		return 3;
	}
}

class Car implements Vehicles{
	public int pricePerKm() {
		return 20;
	}
	
	public int noOfSeats() {
		return 4;
	}
}
class Xuv implements Vehicles{
	public int pricePerKm() {
		return 25;
	}
	
	public int noOfSeats() {
		return 6;
	}
}

// interface segregation principle is used below
interface ShareRideByChat{
	void shareByChat();
}
interface ShareRideByPost{
	void shareByPost();
}

class Whatsapp implements ShareRideByChat{
	public void shareByChat() {
		System.out.println("ETA: 15mins\nlive location: road");
	}
}

class Facebook implements ShareRideByPost, ShareRideByChat{
	public void shareByChat() {
		System.out.println("ETA: 15mins\nlive location: road");
	}
	
	public void shareByPost() {
		System.out.println("ETA: 15mins\nlive location: road");
	}
}

public class TaxiApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter pickUp location: ");
		String pickup = sc.nextLine();
		System.out.print("Enter destination: ");
		String destination = sc.nextLine();
	}
}
