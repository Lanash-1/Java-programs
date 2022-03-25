package projects;
import java.util.Scanner;

class Details{
	private int accountNumber = 123456789;
	private int balance = 5000;
	int getAccNumber() {
		return accountNumber;
	}
	void setBalance(int amount, int type) {
		if(type == 1) {
			balance = balance + amount;
			System.out.println("Balance: "+ balance);
		}else {
			if(amount > balance) {
				System.out.println("Cannot process. Requested amount is more than your balance");
				System.out.println("Balance: "+ balance);
			}else {
				balance = balance - amount;
				System.out.println("balance: "+balance);
			}
		}
	}
	
	int getBalance() {
		return balance;
	}
}

interface Validation{
	boolean login(String username, String password);
}

class Validate implements Validation{
	public boolean login(String username, String password) {
		if(username.equals("admin") && password.equals("1234")) {
			System.out.println("Welcome back!");
			return true;
		}
		System.out.println("Invalid login credentials! Try Again.");
		return false;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter UserName: ");
		String username = sc.nextLine();
		System.out.print("Enter password: ");   
		String password = sc.nextLine();
		boolean isAuthenticated =false;
		Validate signin = new Validate();
		isAuthenticated = signin.login(username, password);
		int action;
		Details data = new Details();
		while(isAuthenticated) {			
			System.out.println("1. View Balance\n2. Deposit amount\n3. Withdraw amount\n4. logout and exit");
			action = sc.nextInt();
			switch(action) {
			case(1):
				System.out.println("Available balance: " + data.getBalance());
				break;
			case(2):
				System.out.print("Enter the amount to deposit: ");
				int amountToAdd = sc.nextInt();
				data.setBalance(amountToAdd, 1);
				break;
			case(3):
				System.out.print("Enter amount to withdraw: ");
				int amountToGet = sc.nextInt();
				data.setBalance(amountToGet, -1);
				break;
			case(4):
				isAuthenticated = false;
				System.out.println("Thank you for visiting.");
				System.out.println("Signed out");
				break;
			default:
				System.out.println("Enter only the available options!");
			}
		}
	}
}