package test;

public class MultiArray {

	public static void main(String[] args) {
	int a[][] = {{5,7,4},{8,7,9},{3,4,5}};
	int b[][] = {{2,5,1},{6,5,4},{1,2,3}};
	int c[][]=new int[3][3];
	for (int i=0; i<3; i++)
	{
		for (int j=0; j<3; j++)
		{
			c[i][j] = a[i][j]-b[i][j];
			System.out.print(c[i][j]+ "");
	}
		System.out.println();
	

	}
	
}
}
