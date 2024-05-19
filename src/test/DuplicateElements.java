package test;

public class DuplicateElements {

	public static void main(String[] args) {
		int[] a = {11, 21, 31, 21, 41, 11, 51};
		System.out.println("Elements of array : " );
for (int i=0;i<a.length; i++)
{
	for (int j=i+1;j<a.length; j++ )
	{
		if (a[i]==a[j])
		{
			System.out.println("Duplicate Number: " +a[i]);
		}
	}
}
	}

}
