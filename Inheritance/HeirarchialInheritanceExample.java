package Inheritance;

import java.util.*;
public class HeirarchialInheritanceExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER 1. FOR CREDITCARD, 2. FOR NETBANKING");
		int ch = s.nextInt();
		switch(ch)
		{
		case 1:
			CreditCardService s1 = new CreditCardService();
			s1.PayWithCreditCard(987654, 12345);
		break;
		
		case 2:
			NetBankingService s2 = new NetBankingService();
			s2.PayWithNetBanking(987654, 12345);
		break;
		
		default:
			System.out.println("ERROR");
		}
	}

}
