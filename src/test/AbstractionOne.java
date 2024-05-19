package test;
import java.util.*;


//Constructor
class Add
{
	int a,b;
	intc=0 ;
	Add(int x, int y)
	{
		a=x;
		b=y;
	}
}
class Output
{
	int c = a+b;

	public void Output() {
		{
			System.out.println("The Result is : "  +c);
		}
		
	}
}	
	
public class AbstractionOne {
public static void main (String args [])
{
	int m, n;
	Scanner ss = new Scanner(System.in);
	System.out.println("Enter M value : ");
	m= ss.nextInt();
	System.out.println("Enter N value : ");
	n=ss.nextInt();
	Add aa = new Add(m,n);
	Output oo = new Output ();
	oo.Output();
	
}
}
