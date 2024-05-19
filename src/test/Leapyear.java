package test;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int year = 2024;
if (year%4==0 && year%100!=0 || year%400==0)
{
	System.out.println("This year is Leap Year");
}
else
{
	System.out.println("This year is not Leap Year");	
}
}
	


}

