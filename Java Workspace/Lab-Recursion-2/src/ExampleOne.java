
public class ExampleOne {
 	
	    public static void main(String[] args) {
	        //create some dummy data for our method
            
	    	int input = 6;
	    	
	    	ExampleOne eo = new ExampleOne();
	    	
	    	//call your methods here
	    	
	    	System.out.println(eo.factorial(input));
	    }

	    public int factorial(int num) {
	    
	    	if (num <= 0) return 0;
	    	if (num == 1) return 1;
	    	
	    	return num * factorial(num - 1);
	    	
	    }
	    
	
}
