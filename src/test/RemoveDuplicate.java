package test;

public class RemoveDuplicate {

	    public static void main(String[] args) {
	        int a[] = {10,20,10,50};
	        
	 
	        for (int i = 0; i < a.length; i++) {
	            boolean isDuplicate = false;
	            
	    
	            for (int j = i + 1; j < a.length; j++) {
	                if (a[i] == a[j]) {
	                   
	                    isDuplicate = true;
	                    break;
	                }
	            }
	            
	      
	            if (!isDuplicate) {
	                System.out.print(a[i] + " ");
	            }
	        }
	    }
	}

