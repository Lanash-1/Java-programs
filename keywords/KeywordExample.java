package keywords;

class A{
	int number1;
	int number2;
	A(){
		System.out.println("A default constructor");
	}
	A(int number1, int number2){
		System.out.println("A constructor overloaded");
	}
}

class B extends A{
	int number1;
	int number2;
	B(int number1, int number2){
		super(number1, number2);
		this.number1 = number1;
		this.number2 = number2;
		super.number1 = 4;
		super.number2 = 4;
		System.out.println(this.number1+this.number2);
		System.out.println(super.number1+super.number2);
	}
}

public class KeywordExample {
	public static void main(String[] args) {
		B b = new B(5,5);
	}
}
