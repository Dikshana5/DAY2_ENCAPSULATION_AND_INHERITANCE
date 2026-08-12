package Inheritance;

class parent
{
	int a,b;
	void display()
	{
		System.out.println("Hello from parent class");
	}
}

class child extends parent
{
	void calc()
	{
		super.a = 10;
		super.b = 20;
		int c = super.a+super.b;
		System.out.println("Addition "+c);
		super.display();
	}
}
public class InheritanceExample {

	public static void main(String[] args) {
		child obj = new child();
		obj.calc();

	}

}
