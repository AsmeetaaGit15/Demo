package test;

public class Armstrong {

    public static void main(String[] args) {
        int originalNumber = 153;
        int count = 0;
        int temp = originalNumber;
        int armstrongSum = 0;
        int digit;

        // Calculate number of digits
      //  while (temp > 0) {
      //      count++;
      //      temp /= 10;
     //   }
     //   System.out.println("Number of digits: " + count);

      //  temp = originalNumber; // Reset temp to original number for digit extraction

        // Calculate sum of cube of digits
        while (temp > 0) {
            digit = temp % 10;
            armstrongSum += (digit * digit * digit);
            temp /= 10;
        }

        System.out.println("Sum of cube of digits: " + armstrongSum);

        // Check if the number is Armstrong
        if (armstrongSum == originalNumber) {
            System.out.println("The Number is Armstrong");
        } else {
            System.out.println("The Number is not Armstrong");
        }
    }
}
