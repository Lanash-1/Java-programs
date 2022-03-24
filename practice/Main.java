package practice;

// extends vs implements

interface One {
 void methodOne();
}

interface Two {
 void methodTwo();
}

interface Three extends One, Two {
	void methodThree();
}

class Result implements Three{
	public void methodOne() {
		System.out.println("One");
	}
	public void methodTwo() {
		System.out.println("Two");
	}
	public void methodThree() {
		System.out.println("Three");
	}
}

class Display extends Result{
	Display() {
		System.out.println("Result");
	}
}

public class Main {
	public static void main(String[] args) {
		Display d = new Display();
		d.methodOne();
		d.methodTwo();
		d.methodThree();
	}
}