package solidprinciples;

interface Card{
	void transaction();
}

class Debitcard implements Card{
	public void transaction() {
		System.out.println("Transaction done with debit card");
	}
}
class CreditCard implements Card{
	public void transaction() {
		System.out.println("Transaction done with credit card");
	}
}

class Transaction{
	Card card;
	public Transaction(Card card) {
		this.card = card;
	}
	public void makeTransaction() {
		card.transaction();
	}
}

public class DependencyInversionPrinciple {
	public static void main(String[] args) {
		Card card = new CreditCard();
		Transaction t = new Transaction(card);
		t.makeTransaction();
	}
}
