package test;
import java.util.*;

// Class to perform addition
class Add {
    int a, b, c;
    
    // Constructor
    Add(int x, int y) {
        a = x;
        b = y;
        c = a + b; // Compute the sum when an object is created
    }
    
    // Method to get the result
    public int getResult() {
        return c;
    }
}

// Class to output the result
class Output {
    private int result;
    
    // Constructor that takes an Add object to get the result
    Output(Add add) {
        result = add.getResult();
    }
    
    // Method to print the result
    public void display() {
        System.out.println("The Result is: " + result);
    }
}

public class AbstractionTwo {
    public static void main(String args[]) {
        int m, n;
        Scanner ss = new Scanner(System.in);
        
        System.out.println("Enter M value: ");
        m = ss.nextInt();
        
        System.out.println("Enter N value: ");
        n = ss.nextInt();
        
        Add aa = new Add(m, n);  // Create Add object
        Output oo = new Output(aa);  // Create Output object with Add object
        oo.display();  // Display the result
        
        ss.close();  // Close the scanner to prevent resource leak
    }
}
