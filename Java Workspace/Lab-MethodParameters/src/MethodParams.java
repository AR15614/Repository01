
public class MethodParams {
	
	 public static void main(String[] args) {
	        //create a class instance
	        MethodParams mp = new MethodParams();	       

	        //call your method here
	 
	 double d = mp.convertIntToDouble(44);

     //print the value to the console
     System.out.println(d);
     
     System.out.println(mp.sum(1.0, 2, 3));
	    
	 } 
	 
    	public double convertIntToDouble(int num){
    		return (double)num;	
    	}
    	
    	public double sum(double num1, int num2, int num3){
    	    return num1 + num2 + num3;  
    	} 
    	
    	
    	
}
