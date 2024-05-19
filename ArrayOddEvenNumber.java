package test;

public class ArrayOddEvenNumber {

	public static void main(String[] args) {
		int a[] = { 5,2,9,7,3,6,2,4};
		int Odd=1;
		int Even =1;
		
		for(int i=0; i<a.length; i++)
			if (a[i]%2==0)
			{
				System.out.println("Even Number :"+a[i]);
				
			}
			else
				System.out.println("Odd Number :"+a[i]);

	}

}
