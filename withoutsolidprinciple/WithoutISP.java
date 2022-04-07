package withoutsolidprinciple;

interface Category{
	void food();
	void groceries();
}

class Swiggy implements Category{
	public void food() {
		System.out.println("Food delivery available");
	}
	public void groceries() {
		System.out.println("Groceries delivered");
	}
}

class Zepto implements Category{
	public void food() {
		System.out.println("Food delivery not available");
	}
	public void groceries() {
		System.out.println("Groceries delivered");
	}
}

public class WithoutISP {
	public static void main(String[] args) {
		
	}
}
