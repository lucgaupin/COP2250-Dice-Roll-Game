package module5;

import java.util.*;
import java.io.*;
import java.math.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Dice {
	
	// VARIABLE DECLARATIONS
	static int max = 6;
	static int min = 1;
	static String sideUp;
	
	// THIS IS FOR THE RANDOM NUMBER GENERATOR, CALLING THE RANDOM().
	static Random rand = new Random();

	public static void roll() throws IOException {
		
		// THIS IS TO TELL THE PROGRAM THAT WERE GOING TO BE SAVING AND TAKING DATA FROM A FILE CALLED MYOUTPUT.TXT
		PrintWriter outputFile = new PrintWriter("myoutput.txt");
		
		// THIS IS THE COUNTER IN ORDER TO CALCULATE HOW MANY 6'S SHOW UP IN THE PROGRAM
		int sixCounter = 0;
		
		// BELOW THE 5 LINES INCLUDE THE CODE IN ORDER TO GET THE SYSTEM DATE/TIME AND PUT IT IN THE FILE.
		LocalDateTime dateAndTime = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm"); 
	    String formattedDate = dateAndTime.format(myFormatObj); 
	    
	    // BELOW I AM OUTPUTTING THE DATE/ TIME IN THE PROGRAM TO THE USER BUT ALSO INTO THE FILE THAT IS GOING TO BE SAVED
	    System.out.println("Program output of: " + formattedDate); 
	    outputFile.println("Program output of: " + formattedDate); 
	    
		// LOOP BELOW RUNS WHEN THE USER CALLS THE ROLL() METHOD IN THE DRIVER CLASS, IT WILL RUN 10X AND GIVE RANDOM NUMBER EACH TIME
		for(int roll = 0; roll < 10; roll++) {
			
			// CALCULATION TO GET THE RANDOM NUMBER
			int randomNumber = rand.nextInt((max - min) + 1) + min;
			
			// SETTING THE RANDOM NUMBER TO THE SIDEUP VARIABLE
			String sideUp = String.valueOf(randomNumber);
			
			// OUTPUTTING THE RESULTS TO THE USER AND TO THE FILE
			outputFile.println("The dice rolled a " + sideUp);
			System.out.println("The dice rolled a " + sideUp);
			
			// COUNTER TO FIND THE NUMBER OF TIMES A 6 SHOWS UP. IF 6, THEN ADD 1 TO THE COUNTER.
			// THIS IS IN THE LOOP CAUSE ITS GOING TO CHECK EACH TIME A ROLL IS THROWN (10X)
			// AND THEN COUNT IF A 6 SHOWS UP.
			if(randomNumber == 6) {
				sixCounter++;
			}
		}
		
		// THE OUTPUT OF THE SIXCOUNTER. IT WILL TELL YOU HOW MANY TIMES A 6 SHOWS UP.
		outputFile.println("NUMBER OF 6 ROLLS: " + sixCounter);
		System.out.println("NUMBER OF 6 ROLLS: " + sixCounter);
		outputFile.close();
	}
	
	public static void showPastRun() throws IOException {
		
		// THE FILE() METHOD IS OPENING UP THE MYOUTPUT.TXT FILE TO READ INTO THE PROGRAM AND EVENTUALLY DISPLAY THE RESULTS IF THERE ARE ANY.
		File myFile = new File("myoutput.txt");
		Scanner inputFile = new Scanner(myFile);
		
		System.out.println("\n\nHere is the previous dice roll: \n\n");
		
		// THE LOOP BELOW READS FILE UNTIL THERE IS NO MORE DATA LEFT TO READ
		while (inputFile.hasNext())
		{
			String str = inputFile.nextLine();
			System.out.println(str);
		}
		// CLOSES THE FILE
		inputFile.close(); 
	}
	
	public static String getSideUp() {
		return sideUp;
	}

}
