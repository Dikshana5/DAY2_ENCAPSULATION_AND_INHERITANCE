package Inheritance;
class A{
	int num1;
	int add(int a,int b)
	{
		return a+b;
	}
}

class B extends A{
	int num2;
	int mul(int a, int b)
	{
		return a*b;
	}
}

class C extends B{
	void calc() {
		super.num1 = 10;
		super.num2 = 20;
		System.out.println("Addition: "+super.add(num2, num1));
		System.out.println("Multiplication: "+super.mul(num2, num1));
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		C obj = new C();
		obj.calc();
		B obj1 = new B();
		obj1.mul(5,10);

	}

}
