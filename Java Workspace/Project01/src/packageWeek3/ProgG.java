package packageWeek3;

import java.util.ArrayList;

public class ProgG {

	// #7  search an element in a array list
	
	public static void main(String [] args) {
		ArrayList<String> colors = new ArrayList<String> ();
		  colors.add("red");
		  colors.add("blue");
		  colors.add("yellow");
		  colors.add("green");
		  colors.add("turquoise");
		  colors.add("purple");
		  colors.add("chartruse");
		  
     for (int i = 0;i < colors.size(); i++)
    	  System.out.println(i + " " + colors.get(i));
     
          
     int retval = colors.indexOf("green");
     System.out.println("The element green is at index " + retval);

	}
	
}
