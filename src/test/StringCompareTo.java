package test;

public class StringCompareTo {

	public static void main(String[] args) {
		String s1= "Earth is 4th largest planet";
		String s3 = "Earth is 4th largest planet";
				
int result1 =  s1.compareTo(s3);

System.out.println("Result is : " +result1);


if (result1>=0 )
	System.out.println("The Result is Positive");

else 
{
	System.out.println("The result is Negative");
}
	}
}



