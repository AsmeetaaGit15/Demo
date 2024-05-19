package test;

public class ArrayCopy {

	public static void main(String[] args) {
		int a[] = {2,9,5,4,7};
		 int b[] = new int[a.length];
		
		for (int i=0; i<a.length; i++)
		{
          b[i]=a[i];
			
		}
		
		for (int i =0; i<b.length;i++)
		{
			System.out.print(b[i] + " ");
		}
		
	}

}
