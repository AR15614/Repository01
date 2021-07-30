package packageWeek3;
import java.util.ArrayList;

public class ProgF {
	
	//  #6 remove the third element from an array list. 
	
	 	
			public static void main(String [] args) {
				ArrayList<String> colors = new ArrayList<String> ();
				  colors.add("red");
				  colors.add("blue");
				  colors.add("yellow");
				  colors.add("green");
				  colors.add("turquoise");
				  
		     for (int i = 0;i < colors.size(); i++)
		    	  System.out.println(i + " " + colors.get(i));
		     
		     System.out.println("removing element at position 2");
		     // getting element on a specified index
		     colors.remove(1);
		        
		     for (int i = 0;i < colors.size(); i++)
			    	  System.out.println(i + " " + colors.get(i));

			}
			
	}


