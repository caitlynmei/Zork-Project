package com.bayviewglen.zork;
/* * Author:  Michael Kolling. 
 * * Version: 1.0 
 * * Date:    July 1999 
 * *  
 * * This class holds an enumeration of all command words known to the game.
 * * It is used to recognize commands as they are typed in. 
 * * This class is part of the "Zork" game.
 * */

import java.util.ArrayList;

class CommandWords {

	// Constant String holding all valid first command words (word1)
	private static final String validCommands[] = {"help", "rules", "commandlist", "look", "hi", "go", "quit", "save", "eat", "use", "take", "drop", "toss", "read", "inventory",
												   "north", "south", "east", "west", "up", "down", "n", "s", "e", "w", "u", "d"
												   };
	/**
	 * Constructor - initialize the command words.
	 **/
	public CommandWords() {
		// nothing to do at the moment...
	}

	/**
	 ** Check whether a given String is a valid command word. Return true if it
	 ** is, false if it isn't.
	 **/
	public boolean isCommand(String aString) { 
		for (int i = 0; i < validCommands.length; i++) {
			if (validCommands[i].equalsIgnoreCase(aString)){
				return true;
			}
		} // if we get here, the string was not found in the commands
		return false;
	}
	
	/*
	public String isCommandString(ArrayList<String> words){
		return words.get(0);
	}
	*/
	
	// showAll Method: prints all valid commands
	public void showAll() {
		for (int i = 0; i < validCommands.length; i++) {
			//if (i == validCommands.length - 1) {
				//System.out.print(validCommands[i]);
			//} else if (i == 0){
			//	System.out.print("- " + validCommands[i]);
			//} else {
				System.out.println("- " + validCommands[i]);
			//}
		}
		//System.out.println();
	}

}
