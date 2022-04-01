package setone;
import java.util.Scanner;

public class FirstProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int result = 0;
		while(number > 0) {
			result *= 10;
			result += (number%10);
			number /= 10;
		}
		System.out.println(result);
	}
}
