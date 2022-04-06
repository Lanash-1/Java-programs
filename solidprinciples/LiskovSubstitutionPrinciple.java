package solidprinciples;


interface UpiPayments{
	void upi();
}

interface CardTransaction{
	void cardPayment();
}

class PaytmPaymentsbank implements UpiPayments, CardTransaction{
	public void upi() {
		System.out.println("Available");
	}
	
	public void cardPayment() {
		System.out.println("Available");
	}
}
class HDFC implements CardTransaction{
	public void cardPayment() {
		System.out.println("Available");
	}
}
class GooglePay implements UpiPayments{
	public void upi() {
		System.out.println("Available");
	}
}


public class LiskovSubstitutionPrinciple {
	public static void main(String[] args) {
		
	}
}
