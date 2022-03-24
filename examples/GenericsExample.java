package examples;

class GenericClass<T, U>{
	T employeeName;
	U employeeNumber;
	GenericClass(T employeeName, U employeeNumber){
		this.employeeName = employeeName;
		this.employeeNumber = employeeNumber;
	}
	void getDetails() {
		System.out.println("Name: " + this.employeeName);
		System.out.println("Number: " + this.employeeNumber);
	}
}
public class GenericsExample {

	public static void main(String[] args) {
		GenericClass<String, Integer> obj = new GenericClass<String, Integer>("lanash", 1001);
		obj.getDetails();
	}
}
