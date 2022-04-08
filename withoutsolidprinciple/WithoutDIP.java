package withoutsolidprinciple;

class DebitCard{
	public void transaction() {
		System.out.println("Transaction done with debit card");
	}
}
class CreditCard{
	public void transaction() {
		System.out.println("Transaction done with credit card");
	}
}

class Transaction{
	DebitCard debit;
	public Transaction(DebitCard debit) {
		this.debit = debit;
	}
	public void makeTransaction() {
		debit.transaction();
	}
}


public class WithoutDIP {
	public static void main(String[] args) {
		DebitCard debit = new DebitCard();
		Transaction t = new Transaction(debit);
		t.makeTransaction();
	}
}
