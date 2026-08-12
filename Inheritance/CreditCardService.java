package Inheritance;

public class CreditCardService extends PaymentService{
	void PayWithCreditCard(long mobile, long cardNo)
	{
		super.sendOTP(mobile);
		System.out.println("Purchased with Credit Card "+cardNo);
	}
}
