package test;

public class ArraySecondLargest
{

    public static void main(String[] args) 
    {
        int a[] = {5, 6, 8, 2, 3};
        int max = 0; 
        int secondMax = 0; 

        for (int i = 0; i < a.length; i++) 
        {
            if (a[i] > max) 
            {
             secondMax = max;
             max = a[i];
            }
            else if (a[i] > secondMax && a[i] != max) 
            {
               
                secondMax = a[i];
     }
     }
             if (secondMax != max) 
             {
            System.out.println("Second largest number is: " + secondMax);
        } 
             
        
    }
}
