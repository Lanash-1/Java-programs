package practice;
import java.io.Console;
import java.util.Scanner;
public class ConsoleExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Console c=System.console();
		System.out.print("Enter password: ");
		char[] ch=c.readPassword();    
		String pass=String.valueOf(ch);   
		System.out.println("Password is: " + pass);
		System.out.print("Enter email: ");
		String email = sc.nextLine();
		System.out.println("Email: " + email);
		
	}
}