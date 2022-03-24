package examples;

class Example{
	static int staticNumber = 0;
	int normalNumber = 0;
	void add() {
		staticNumber++;
		normalNumber++;
		System.out.println("normal number = " + normalNumber);
		System.out.println("static number = " + staticNumber);
	}
}

public class StaticExample {
	
	static
	{
		System.out.println("Static block executes before main block");
	}
	
	public static void main(String[] args) {
		Example example1 = new Example();
		Example example2 = new Example();
		Example example3 = new Example();
		example1.add();
		example2.add();
		example3.add();

	}
}
