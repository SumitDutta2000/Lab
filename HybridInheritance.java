package abstractiondemo;

class A
{
	public void show()
	{
		System.out.println("hello from show of A class");
	}
}
class B extends A
{
	public void display()
	{
		System.out.println("hello from display of B class");
	}
}
class C extends A
{
	public void output()
	{
		System.out.println("hello from output of C class");
	}
}
class D extends C
{
	public void print()
	{
		System.out.println("hello from print of D class");
	}
}

public class HybridInheritance {

	public static void main(String[] args) {
		D objd=new D();
		objd.show();
		objd.output();
		objd.print();
		B objb=new B();
		objb.show();
		objb.display();
		
	}

}
