package withoutsolidprinciple;

class BankAccountTypesInfo{
	public void getAccountInfo(String type) {
		if(type.equals("savings")) {
			System.out.println("No minimum balance required");
		}else if(type.equals("current")) {
			System.out.println("minimum balance required = Rs 10000");
		}else if(type.equals("salary")) {
			System.out.println("minimum balance required = Rs 5000");
		}
	}
}

public class WithoutOCP {
	public static void main(String[] args) {
		BankAccountTypesInfo info = new BankAccountTypesInfo();
	}
}
