/*
 * BY...: LUC GAUPIN
 * CLASS: COP2250
 * ASSIG: MODULE 5
 * PROFE: PROFESSOR PISANO
 * PURPO: THIS PROGRAM WITH RUN DICE, AND IT WILL SAVE ALL THE INFORMATION NEEDED TO A FILE
 * 		  AND ALSO TAKE INFORMATION FROM THE FILE AND OUTPUT IT IF REQUESTED BY THE USER.
 */

package module5;

// ALL THE IMPORTS
import java.util.*;
import java.io.*;
import java.math.*;

public class Driver {
	
	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		
		// THIS IS FOR THE MENU, IT PROMPTS THE USER TO CHOOSE ONE OR THE OTHER
		System.out.println("Welcome! Does an old dice game need to be loaded?\n");
		System.out.println("1. Yes (Load Old Roll)");
		System.out.println("2. No (New Dice Roll/ Run if havent ran program before)");
		System.out.println("Choice: ");
		
		// CREATING AN INSTANCE OF THE DICE
		Dice di = new Dice();
		
		//TAKES IN USER CHOICE
		int userChoice = in.nextInt();
		
		// IF THE USER CHOOSES 1, THE PROGRAM WILL LOAD THE PREVIOUS GAME RAN IF THERE WAS ONE
		if(userChoice == 1) {
			
			// THIS CALLS THE SHOWPASTRUN() METHOD IN THE DICE.JAVA FILE WHICH WILL RUN THE CODE TO DISPLAY THE PAST RUN OF THE SIMULATOR
			di.showPastRun();
		}
		
		// IF THE USER CHOOSES 2, THE PROGRAM WILL RUN A NEW SIMULATOR RUN
		else if(userChoice == 2) {
			System.out.println("\n\nNew Dice-Roll Simulator Run:");
			
			// THIS CALLS THE ROLL() METHOD IN THE DICE.JAVA FILE WHICH WILL RUN THE CODE TO GENERATE A NEW SIMULATOR
			di.roll();
		}
	}
}

/*
 
  	THIS SECTION BELOW IS THE PROGRAM WITH THE PREVIOUS GAME BEING LOADED
 
 
	 Welcome! Does an old dice game need to be loaded?
	
	1. Yes (Load Old Roll)
	2. No (New Dice Roll/ Run if havent ran program before)
	Choice: 
	1
	
	
	Here is the previous dice roll: 
	
	
	Program output of: 11-12-2020 09:55
	The dice rolled a 3
	The dice rolled a 3
	The dice rolled a 4
	The dice rolled a 6
	The dice rolled a 2
	The dice rolled a 5
	The dice rolled a 6
	The dice rolled a 6
	The dice rolled a 3
	The dice rolled a 5
	NUMBER OF 6 ROLLS: 3
	
	
	BELOW IS PROGRAM RAN BUT WITH NEW ROLL
	
	
	Welcome! Does an old dice game need to be loaded?

	1. Yes (Load Old Roll)
	2. No (New Dice Roll/ Run if havent ran program before)
	Choice: 
	2
	
	
	New Dice-Roll Simulator Run:
	Program output of: 11-12-2020 18:18
	The dice rolled a 3
	The dice rolled a 4
	The dice rolled a 6
	The dice rolled a 5
	The dice rolled a 3
	The dice rolled a 1
	The dice rolled a 2
	The dice rolled a 2
	The dice rolled a 2
	The dice rolled a 6
	NUMBER OF 6 ROLLS: 2


 */
