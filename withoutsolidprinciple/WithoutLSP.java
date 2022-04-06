package withoutsolidprinciple;

class Transactions{
	public void cardTransaction() {
		System.out.println("Payment using card");
	}
	public void upi() {
		System.out.println("UPI");
	}
}

class PaytmPaymentsBank extends Transactions{
	public void cardTransaction() {
		System.out.println("Available");
	}
	public void upi() {
		System.out.println("Available");
	}
}

class HDFC extends Transactions{
	public void cardTransaction() {
		System.out.println("Available");
	}
	public void upi() {
		System.out.println("Not Available");
	}
}

class GooglePay extends Transactions{
	public void cardTransaction() {
		System.out.println("Not available");
	}
	public void upi() {
		System.out.println("Available");
	}
}

public class WithoutLSP {
	public static void main(String[] args) {
		
	}
}
