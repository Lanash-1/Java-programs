package solidprinciples;

class ShowBalance{
	public void showBalance() {
		System.out.println("Balance = Rs.5000");
	}
}
class Deposit{
	public double deposit(int amount, double balance) {
		return balance + amount;
	}
}
class Withdraw{
	public double withdraw(int amount, double balance) {
		double charges;
		if(amount > 100) {
			charges = (4.0/100.0)*amount;
		}else {
			charges = (2.0/100.0)*amount;
		}
		if(amount+charges < balance) {
			return balance - (amount + charges);
		}
		return balance;
	}
}
class openAccount{
	public void openNewBankAccount(String details, String accountType) {
		if(accountType == "savings") {
			System.out.println("Successfully created savings account");
		}else if(accountType == "current") {
			System.out.println("Successfully created current account");
		}
	}
}

public class SingleResponsibilityPrinciple {
	public static void main(String[] args) {
		
	}
}
