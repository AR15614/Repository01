package packageWeek3;

import java.util.ArrayList;

//  #9 copy one array list into another.

public class ProgI {
	public static void main(String [] args) {
		ArrayList<String> colors = new ArrayList<String> ();
		  colors.add("red");
		  colors.add("blue");
		  colors.add("yellow");
		  colors.add("green");
		  colors.add("turquoise");
		  
		ArrayList<String> newcolors = new ArrayList<> ();
		  
		for (int i = 0;i < colors.size(); i++)
	    	  newcolors.add(colors.get(i));
		
     for (int i = 0;i < newcolors.size(); i++)
    	  System.out.println(newcolors.get(i));
		}
	}
  