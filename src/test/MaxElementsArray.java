package test;

public class MaxElementsArray {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int max = arr[0];
		System.out.println("Elements of array : " );
		for (int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Max elements of array is :" +max);

	}

}
