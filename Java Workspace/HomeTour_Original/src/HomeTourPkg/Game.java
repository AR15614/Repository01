package HomeTourPkg;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Game {
	
	static int i;
	static int rmfrom;
	static int rmto;
	static int dir;
    static char dir_uc;
	static int menuSelection;
	static int roomPresentIn = 1;   // game starts at the outside south side of the house ROOM 1
	static char end_Game = 'N';
	static int nbrExits;
    static int score = 0;
    static int roomNbrSelection;
    static int winner = 0;
    static int exitsInChosenDirection;
    static int saveExitSub;
    static int usrInput;
	static int goodRoomNbrEntered;
	static int integerEntered;
	static int arraySub;
	
	public static void main(String[] args) {
		                                      // Room #
		String [] Rooms = {"Outside North",   //   0      also serves as short description
				           "Outside South",   //   1      
				           "Foyer        ",   //   2      Outside North & Outside South are considered 
				           "Hall         ",   //   3      rooms for the purpose of this program. 
				           "Dining Room  ",   //   4
				           "Kitchen      ",   //   5
				           "Living Room  ",   //   6
				           "Bedroom      ",   //   7
				           "Bathroom     "};  //   8
		
		String [] RoomsLongDescr = {"North side of the house",   
		                            "South side of the house",
		                            "Main entrance to the house",
		                            "Hallway to all other rooms",
		                            "Where meals are served  ",
		                            "Where meals are cooked    ",
		                            "Where entertaining and relaxing happen  ",
		                            "Where people get their nightly rest",
		                            "Where the call of nature is answered    "};  
		
		String [] Direction = {"(placeholder)","North", "East", "South", "West"};
	
		
		final int PassagewayFrom [] =  {0,1,2,2,3, 3,3,3,3, 3,3,4, 4,5,5,6,6,7,7, 7, 8, 8}; // from room #
		final int PassagewayTo [] =    {3,2,1,3,2, 4,5,0,8, 7,6,5, 3,3,4,3,7,6,3, 8, 7, 3}; // to room #
		final int PassageDirection[] = {3,1,3,1,3, 4,4,1,2, 2,2,1, 2,2,3,4,1,3,4, 1, 3, 4}; // 1=N, 2=E, 3=S, 4=W
//	    final int ExitNbr [] =         {1,2,2,5,5,12,7,1,11,9,4,6,12,7,6,4,8,8,9,10,10,11}; // exit #
		final int RoomVisited [] =     {1,1,0,0,0,0,0,0,0};
	 
		nbrExits = PassagewayFrom.length;
		
		//System.out.println("PW#    From  Room Name          To   Room Name          Exit #      Dir ");
		//System.out.println("       RM#                      Rm#  \n");
	
	    /*	for (i = 0;i < nbrExits;i++) 
		      { rmfrom = PassagewayFrom[i];
		        rmto = PassagewayTo[i];
		        dir = PassageDirection[i];
		      
		    System.out.println(i + "        " + PassagewayFrom[i] + "   " + Rooms[rmfrom] + "      " +
		        PassagewayTo[i] + "    " + Rooms[rmto] + " " + "     Exit: " + ExitNbr[i]  + "     " +
		    	PassageDirection[i] + " " + Direction[dir]); }  */
				
		PrintInstructionsA();
		System.out.println("The following is a list of the rooms:\n");
		System.out.println("RM#  Short Descr     Long Descr");
		System.out.println("______________________________________________\n");
			for (i = 0;i < Rooms.length;i++) 
				System.out.println(i + "    " + Rooms[i] + "   " + RoomsLongDescr[i]);
		System.out.println("\n");
		PrintInstructionsB();
		
		
		System.out.println("Enter your name to begin");
		
		Scanner scanner = new Scanner(System.in);		
		String player = scanner.nextLine();
		System.out.println("Welcome, " + player + "\n");
		System.out.println("You are at the front entrance on the south side of the house.");
		System.out.println("You have just knocked on the door and it has been opened.\n");
		System.out.println("Enter \"GO\" + the direction you want to go - North, South, East, or West");
		System.out.println("Enter either the whole word or the first letter (N, S, E, or W)");
		System.out.println("Example: \"GO N\" or \"GO NORTH\" - (not case sensitive)");
	
		
		do {   //1+
			System.out.println("\nYou are now in room " + roomPresentIn + " - " + 
	                Rooms[roomPresentIn]);
			String direction = scanner.nextLine();
			String ucdirection = direction.toUpperCase();
			dir_uc = direction.charAt(0);
		

			if ((direction.equals("X")) || (direction.equals("x"))) {   //2+
				end_Game = 'Y';
				System.out.println("Game finished"); 
			}  //2-
			else {  //2+
				score++;
				menuSelection = CheckEntry(ucdirection);
	    		
				if (menuSelection == 0)
					System.out.println("Incorrect Entry, try again");
				else {  //3+ 
				
				// If there is only one exit in the chosen direction, it is the one that will be used	 );
				
				// Find out how many exits from this room go in the chosen direction			
					exitsInChosenDirection = 0;
		 
					for (i = 0;i < nbrExits;i++) {  //4+
		 	
						if ((PassagewayFrom[i] == roomPresentIn)
						& (PassageDirection[i] == menuSelection)) {  //5+
					   	   exitsInChosenDirection++;
					   	   saveExitSub = i;
						       }  //5-
					    } //4-
					}  //3-
 	 	

 	 	        
				    if (exitsInChosenDirection == 0)
				    	 System.out.println("This direction does not go to another room from here");
			
				    else if (exitsInChosenDirection == 1) {  //3+
				    // If there is only one exit in the chosen direction, it is the one that will be used	
				        roomPresentIn = PassagewayTo[saveExitSub];
				    	System.out.println("Moving to room " + roomPresentIn);
				        RoomVisited[roomPresentIn] = 1; 
				    }  //3-
				    
	        		else if (exitsInChosenDirection > 1) {  //3+
	        			// If there is more than one exit in the chosen direction, the player will have to pick 
	        			// which room he wants to move to
						System.out.println("There are " + exitsInChosenDirection + " in your selected direction");
						System.out.println("Enter the number of the room you want to enter\n");	
				        int[] intArray = new int[exitsInChosenDirection];
				        arraySub = 0;
				        
						for (i = 0;i < nbrExits;i++) {// 4+
							if ((PassagewayFrom[i] == roomPresentIn)
				 			 & (PassageDirection[i] == menuSelection))  { //5+
				 					   roomNbrSelection = PassagewayTo[i];
				 					   System.out.println(PassagewayTo[i] + " " +  Rooms[PassagewayTo[i]]) ;
				 					   intArray[arraySub] = PassagewayTo[i];
				 					   arraySub++;
				 					   }  //5-
					    	}//4-
						
						goodRoomNbrEntered = 0;
						integerEntered = 0;
						do { // 4+
					    	do { // 5+
				        		Scanner sc=new Scanner(System.in);
				        		try
				        		{ // 6+
				        			System.out.println("Please input the room number of one of these rooms");
				        			//nextInt will throw InputMismatchException
				        			//if the next token does not match the Integer
				        			//regular expression, or is out of range
				        			usrInput=sc.nextInt();
				        			integerEntered = 1;
				        		}  // 6-
				        		catch(InputMismatchException exception)
				        		{  // 6+
				        			//Print "This is not an integer"
				        			//when user put other than integer
				        			System.out.println("This is not an integer");
				        		}  // 6-
					    	
					    	for (i=0; i <exitsInChosenDirection; i++) { //6+
					    		if (usrInput == intArray[i])
					        // if good room number, goodRoomNbrEntered = 1
					    	       goodRoomNbrEntered = 1;}  //6-
					    	} while (integerEntered == 0);   // 5-
					    	if (goodRoomNbrEntered == 0)
					    		System.out.println("This room number is not one of the choices you have\n");
						} // 4-
					    while (goodRoomNbrEntered == 0);	
					    	
					    roomPresentIn = usrInput;
						System.out.println("You have entered room " + roomPresentIn + " - " 
					                + Rooms[roomPresentIn] + "\n");
						
						RoomVisited[roomPresentIn] = 1;
				    	}  //3-
					
					
	        		
				} //2-
			
		} //1-
		
		while (end_Game != 'Y'); 
		
		System.out.println("Game over, score is " + score);
		winner = 1;
		for (i=0;i<Rooms.length;i++)
			if (RoomVisited[i] == 0)
				winner = 0;
		if (winner == 0)
		   System.out.println("You didn't visit all the rooms, you lose");
		else
		   System.out.println("You visited all the rooms, you win!");
	    scanner.close();

	    }

			

 public static int CheckEntry(String entryString) {
  	 if      ((entryString.equals("GO N")) || (entryString.equals("GO NORTH")))
 	     return 1;
 	 else if ((entryString.equals("GO S"))  || (entryString.equals("GO SOUTH")))
 	     return 3;
 	 else if ((entryString.equals("GO E"))  || (entryString.equals("GO EAST")))
 		 return 2;
 	 else if ((entryString.equals("GO W"))  || (entryString.equals("GO WEST")))
 		 return 4;
 	 else
 		 return 0; 		
 	}
	
 	 
 
	public static void PrintInstructionsA () {
System.out.println("\nThis game allows the player to take a tour of the house which is the subject of the exercise.\n");

System.out.println("In order to play the game, the participant will enter \"GO X\" where \"X\" is either N, S, E, or W, or"
		+ "the words North, South, East, or West spelled out.");
System.out.println("Depending on what room the player is in, it will take him/her to one of the other rooms.");  
System.out.println("From there he can continue entering moves until he wishes to exit.  There are also moves which");
System.out.println("will take him to the exits.\n");  

System.out.println("At the beginning of the game, the player is at the front door, and knocks on the door, and the door"); 
System.out.println("is opened.  He/she may then enter the house and explore the rooms by entering his chosen direction.");  
System.out.println("Not all rooms have passageways in all directions.  If he enters a direction from a room from which"); 
System.out.println("there is no passageway to another room, he will receive an error message.\n");  

System.out.println("There are 20 possible moves.  There are 9 rooms.  (Note:  for the purposes of this game, the outsides of");
System.out.println("the house on both the north and south sides are considered rooms, and a direction may be entered from them.\n");  
System.out.println("However, they do not count in the score of rooms visited");

System.out.println("The game will keep track of how many moves the player takes to get through the entire house, and"); 
System.out.println("display the results at the end.  The objective is to get as low number of moves as possible.");  
System.out.println("An entry of a move which does not result in going to another room will count as a move.  If the player");
System.out.println("goes out of the house at the north end, he/she may re-enter, but that will be counted as 2 moves"); 
System.out.println("(one for the exit and one for the re-entry).\n");  }

	public static void PrintInstructionsB () {
System.out.println("The game is over when the player exits the house out of the front door, the way he/she entered.");  
System.out.println("If the game ends and the player has not been through all of the rooms, he/she automatically loses.");

	}


	
} 

