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

class CommandWords { // CM

	// Constant String holding all valid first command words (word1)
	private static final String validCommands[] = {"help", "rules", "commandlist", "look", "hi", "go", "quit", "save", "eat", "use", "take", "drop", "toss", "read", "inventory",
												   "north", "south", "east", "west", "up", "down", "n", "s", "e", "w", "u", "d"
												   };
	/**
	 * Constructor - initialize the command words.
	 **/
	public CommandWords() {
		
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

	// showAll Method: prints all valid commands
	public void showAll() {
		for (int i = 0; i < validCommands.length; i++) {
			System.out.println("- " + validCommands[i]);
		}
	}

}
