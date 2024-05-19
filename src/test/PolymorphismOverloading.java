package test;

class Run
{
	public int add(int a, int b)
	{
		return a+b;
	}
}
class Play
{
	public double add(double c,double e)
	{
		return c+e;
	}
}

public class PolymorphismOverloading {
	public static void main (String args[])
	{

	Run R = new Run ();
	Play P = new Play();
	int result1 =R.add(10,5);
	double result2 = P.add(5.6, 2.5);
	System.out.println("Print Result of Run : " +result1);
	System.out.println("Print Result of Play : " +result2);
}
}