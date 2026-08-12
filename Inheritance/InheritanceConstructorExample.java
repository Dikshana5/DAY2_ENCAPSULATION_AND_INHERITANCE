package Inheritance;

//class Y
//{
//	Y()
//	{
//		System.out.println("Y constructor...");
//	}
//}
//
//class Z extends Y
//{
//	Z()
//	{
//		System.out.println("Z constructor...");
//	}
//}
//public class InheritanceConstructorExample {
//
//	public static void main(String[] args) {
//		// default - it calls super(); thats why O/P parent constructor executes first
//		Z obj = new Z();
//
//	}
//
//}

class Y
{
	Y(int num)
	{
		System.out.println("Y constructor..."+num);
	}
}

class Z extends Y
{
	Z(int num)
	{
		super(num);
		//here explicitly call super() whenever there is a parameter
		//Z HAS NO PARAMETERS, WE ARE PASSING ITS PARENT'S PARAMETER(compulsory)
		System.out.println("Z constructor...");
	}
}
public class InheritanceConstructorExample {

	public static void main(String[] args) {
		
		Z obj = new Z(6);

	}

}