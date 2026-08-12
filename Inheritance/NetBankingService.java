package Inheritance;

public class NetBankingService extends PaymentService{
	void PayWithNetBanking(int custId,long mobile)
	{
		super.sendOTP(mobile);
		System.out.println("Purchased with Netbanking "+custId);
		
	}
}
