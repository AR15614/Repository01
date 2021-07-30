package packageWeek3;

import java.util.ArrayList;
import java.util.Iterator;

// #2 - iterate through all elements in a array list.

public class ProgB {
	
		public static void main(String [] args) {
			ArrayList<String> colors = new ArrayList<String> ();
			  colors.add("red");
			  colors.add("white");
			  colors.add("yellow");
			  colors.add("green");
			  colors.add("turquoise");
			  colors.add("blue");
			  
			ArrayList<String> newcolors = new ArrayList<> ();  
			  // iterator
		        Iterator iterator = colors.iterator();
		        // hasNext() will check if iterator has the element
		        while (iterator.hasNext()){
		            System.out.println(iterator.next());  // print the element and move the cursor to the next
		        }
	     
		}
		

}
