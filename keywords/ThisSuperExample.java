package keywords;

class Vehicle{
	String brand = "Tata";
}

class Car extends Vehicle{
	String brand;
	Car(){
		System.out.println(super.brand + " makes Car");
	}
	Car(String brand){
		this();
		this.brand = brand;
		System.out.println(brand + " makes car");
	}
}

class Bike extends Car{
	Bike(){
		super("Honda");
		System.out.println(super.brand + " also makes bike");
	}
}

public class ThisSuperExample {
	public static void main(String[] args) {
		Bike b = new Bike();
	}
}