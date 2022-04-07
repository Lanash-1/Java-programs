package sp;
import java.util.Scanner;

interface AccountType{
	void accountDetails();
}

class SavingsAccount implements AccountType{
	public void accountDetails() {
		System.out.println("1. Rs.0 minimum balance\n2. 3% interest\n3. Standard Debit Card");
	}
}
class CurrentAccount implements AccountType{
	public void accountDetails() {
		System.out.println("1. Rs 10000 minimum balance\n2. No interest\n3. Business Debit card");
	}
}

class ShowAccountInfo{
	public void showInfo(AccountType type) {
		type.accountDetails();
	}
}

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountType type = new SavingsAccount();
		ShowAccountInfo show = new ShowAccountInfo();
		show.showInfo(type);
	}
}
