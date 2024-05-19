package test;

class A {
	public void add()
	{
		System.out.println("This is grandparent class");
	}

}

class B extends A
{
	public void substration()
	{
		System.out.println("This is parent class");
	}
}

class C extends B
{
	public void division()
	{
		System.out.println("This is kid class");
	}
}

public class MultilevelInheritance
{
	public static void main (String args[])
	{
		C c1 = new C();
		c1.add();
		c1.substration();
		c1.division();
				
	}
}