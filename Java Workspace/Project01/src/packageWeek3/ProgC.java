package packageWeek3;

import java.util.ArrayList;
import java.util.Iterator;

public class ProgC {
	
	// #3 insert an element into the array list at the first position.
	
		public static void main(String [] args) {
			ArrayList<String> colors = new ArrayList<String> ();
			  colors.add("red");
			  colors.add("white");
			  colors.add("yellow");
			  colors.add("green");
			  colors.add("turquoise");
			  colors.add("blue");
			  
			  // get
			  for(String name: colors){
		            System.out.println(name);}
		      
			  System.out.println("Inserting new element");
		        colors.add(0, "pink");
		        
		      for(String name: colors){
		            System.out.println(name);
		      }
	     
		}
		

}
