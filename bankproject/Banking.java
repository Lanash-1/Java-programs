package bankproject;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class AccountDetails{
	private int cardNumber;
	private double accountBalance;
	
	void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	int getCardNumber() {
		return cardNumber;
	}
	
	void setBalance(double newBalance) {
		accountBalance = newBalance;
	}
	
	double getBalance() {
		return accountBalance;
	}
}

interface Deposit{
	double deposit(int amount, double balance);
}

interface Withdraw{
	double withdraw(int amount, double balance);
}

interface SwipeShopping{
	double swipeShopping(int amount, double balance);
}

class Transaction implements Deposit, Withdraw, SwipeShopping{
	public double deposit(int amount, double balance) {
		return balance + amount;
	}
	
	public double withdraw(int amount, double balance) {
		double charges;
		if(amount > 100) {
			charges = (4.0/100.0)*amount;
		}else {
			charges = (2.0/100.0)*amount;
		}
		if(amount+charges < balance) {
			System.out.println("Charges: USD " + charges);
			return balance - (amount + charges);
		}else {
			System.out.println("Insufficient funds");
		}
		return balance;
	}

	public double swipeShopping(int amount, double balance) {
		double cashback = (1.0/100.0)*amount;
		if(amount < balance) {
			System.out.println("CashBack: USD " + cashback);
			return balance - amount + cashback;
		}else {
			System.out.println("Insufficient funds");
		}
		
		return balance;
	}	
}

public class Banking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Double> accountData = new HashMap<Integer, Double>();
		accountData.put(12345678, 70.00);
		accountData.put(11111111, 500.00);
		accountData.put(88888888, 120.00);
		accountData.put(87654321, 200.00);
		boolean exit = false;
		int cardNumber;
		int choice;
		double balance;
		int amount;
		AccountDetails accountDetails = new AccountDetails();
		Transaction transaction = new Transaction();
		while(!exit) {
			System.out.print("Enter Card Number: ");
			cardNumber = sc.nextInt();
			if(!accountData.containsKey(cardNumber)) {
				System.out.println("Account does not exist.");
				continue;
			}
			accountDetails.setCardNumber(cardNumber);
			balance = accountData.get(cardNumber);
			accountDetails.setBalance(balance);
			System.out.println("0. Exit\n1. ShowBalance\n2. Deposit\n3. Withdraw\n4. Swipe");
			choice = sc.nextInt();
			switch(choice) {
			case 0:
				exit = true;
				break;
			case 1:
				balance = accountDetails.getBalance();
				System.out.println("Balance: USD " + balance );
				if(balance < 100) {
					System.out.println("Please maintain minimum balance");
				}
				break;
			case 2:
				System.out.print("Enter the amount: ");
				amount = sc.nextInt();
				balance = transaction.deposit(amount, accountDetails.getBalance());
				accountDetails.setBalance(balance);
				accountData.put(cardNumber, balance);
				System.out.println("Balance: USD " + balance );
				break;
			case 3:
				System.out.print("Enter the amount: ");
				amount = sc.nextInt();
				if(amount%5 != 0) {
					System.out.println("Please correct the amount of value. It should be multiple of USD 5");
					break;
				}
				balance = transaction.withdraw(amount, accountDetails.getBalance());
				accountData.put(cardNumber, balance);
				System.out.println("Balance: USD " + balance );
				break;
			case 4:
				System.out.print("Enter the amount: ");
				amount = sc.nextInt();
				balance = transaction.swipeShopping(amount, accountDetails.getBalance());
				accountData.put(cardNumber, balance);
				System.out.println("Balance: USD " + balance );
				break;
			default:
				System.out.println("Select only available options");
			}
		}
		System.out.println("Thank you");
	}
}