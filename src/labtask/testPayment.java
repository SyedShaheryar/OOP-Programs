package labtask;

public class testPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CashPayment c1 = new CashPayment (15000);
		CreditCardPayment c2 = new CreditCardPayment ("ali ", "12/2/2014 " , 41304211, 14000);
		c1.paymentDetails();
		c2.paymentDetails();
	}

}
