package packageWeek3;
import java.util.ArrayList;

   //  #5 update specific array element by given element.

public class ProgE {
		
		public static void main(String [] args) {
			ArrayList<String> colors = new ArrayList<String> ();
			  colors.add("red");
			  colors.add("blue");
			  colors.add("yellow");
			  colors.add("green");
			  colors.add("turquoise");
			  
	     for (int i = 0;i < colors.size(); i++)
	    	  System.out.println(i + " " + colors.get(i));
	     
	     System.out.println("Updating element at position 3");
	     // getting element on a specified index
	     colors.set(3, "purple");
	        
	     for (int i = 0;i < colors.size(); i++)
		    	  System.out.println(i + " " + colors.get(i));

		}
		
}
