package packageWeek3;
import java.util.ArrayList;

   //  #4 retrieve an element (at a specified index) from a given array list.

public class ProgD {
		
		public static void main(String [] args) {
			ArrayList<String> colors = new ArrayList<String> ();
			  colors.add("red");
			  colors.add("blue");
			  colors.add("yellow");
			  colors.add("green");
			  colors.add("turquoise");
			  
	     for (int i = 0;i < colors.size(); i++)
	    	  System.out.println(i + " " + colors.get(i));
	     
	     System.out.println("Getting element at position 1");
	     // getting element on a specified index
	        System.out.println(colors.get(1));

		}
		
}
