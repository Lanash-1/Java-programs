package solidprinciples;

interface FoodItems{
	void food();
}
interface Groceries{
	void groceries();
}
class Swiggy implements FoodItems, Groceries{
	public void food() {
		System.out.println("Food delivered");
	}
	public void groceries() {
		System.out.println("Groceries delivered");
	}
}

class Zepto implements Groceries{
	public void groceries() {
		System.out.println("Groceries delivered");
	}
}

public class InterfaceSegregationPrinciple {
	public static void main(String[] args) {
		
	}
}
