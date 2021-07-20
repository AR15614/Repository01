package Main;

import java.util.Scanner;

public class Converter {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int menuSelection = 0;
		int lastMenuSelection = 4;
		
		double convertedUnits;
		double cfQtsLiters = .946353;  
		double cfYdsMeters = .9144;
		double cfLbsKilograms = .453592;
		double dnum;
		
		while (menuSelection != lastMenuSelection) {
			System.out.println("Please select a conversion option:");
			System.out.println("1.  Quarts to Liters");
			System.out.println("2.  Yards to Meters");
			System.out.println("3.  Pounds to Kilograms");
			System.out.println("4.  Quit");
			
		String entry = scanner.nextLine();
		
		if (entry.length() != 1)
			System.out.println("Please enter exactly one digit");
		else
			if (entry.equals("1")   ||
			    entry.equals("2")   ||  
		        entry.equals("3")   ||  
		        entry.equals("4")) {
				menuSelection = Integer.parseInt(entry);	
			    System.out.println("\n");
			    switch(menuSelection)
			     {
			       case 1:  {
					  System.out.println("Converting quarts to liters");
				      System.out.println("Please enter number of quarts");
					  String unitsFrom  = scanner.nextLine();
					  dnum = Double.parseDouble(unitsFrom);
					  convertedUnits = unitsConversion(dnum, cfQtsLiters);
					  String conversionResult = String.valueOf(convertedUnits);
				      System.out.println("This converts to " + conversionResult + 
								     " liters"); 
				      break;
						   }
				 
			    	case 2: {
				    System.out.println("Converting yards to meters");
			    	System.out.println("Please enter number of yards");
				    String unitsFrom  = scanner.nextLine();
				    dnum = Double.parseDouble(unitsFrom);
				    convertedUnits = unitsConversion(dnum, cfYdsMeters);
				    String conversionResult = String.valueOf(convertedUnits);
				    System.out.println("This converts to " + conversionResult + 
						     " meters"); 
				    break;
					}
			    	
				case 3:	{
				    System.out.println("Converting pounds to kilograms");
				    System.out.println("Please enter number of pounds");
				    String unitsFrom  = scanner.nextLine();
			        dnum = Double.parseDouble(unitsFrom);
				    convertedUnits = unitsConversion(dnum, cfLbsKilograms);
			 	    String conversionResult = String.valueOf(convertedUnits);
				    System.out.println("This converts to " + conversionResult + 
						     " kilograms"); 
				    break;
					}
			    default:
				  System.out.println("Ending program");
			      }
			   
		    	}
		         	          
			else
				System.out.println("Please enter only 1,2,3, or 4");
				
		System.out.println("\n");
		}
		
		scanner.close();
		
			
	}
	
	public static double unitsConversion(double entry, double factor) {
		double result = entry * factor;
		return result;
	}
	
		
}
