package solidprinciples;

interface BankAccountTypesInfo{
	void getAccountInfo();
}

class SavingsAccount implements BankAccountTypesInfo{
	public void getAccountInfo() {
		System.out.println("No minimum balance required");
	}
}
class CurrentAccount implements BankAccountTypesInfo{
	public void getAccountInfo() {
		System.out.println("minimum balance required = Rs 10000");
	}
}
class SalaryAccount implements BankAccountTypesInfo{
	public void getAccountInfo() {
		System.out.println("minimum balance required = Rs 5000");
	}
}

public class OpenClosedPrinciple {
	public static void main(String[] args) {
		
	}
}
