package test;

import java.util.Scanner;
public class GivenOddEven {

	public static void main(String[] args) {
		
Scanner s = new Scanner(System.in);
System.out.println("Enter your number : ");
int n = s.nextInt();
 if(n%2==0)
 {
	 System.out.print("The number is Even : " +n);
 }
	 else 
	 {
		 System.out.println("The number is Odd : " +n);
	 }
}
	}


