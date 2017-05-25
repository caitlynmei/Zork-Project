package com.bayviewglen.zork;
/*
 * Author:  Michael Kolling
 * Version: 1.0
 * Date:    July 1999
 * 
 * This class is part of Zork. Zork is a simple, text based adventure game.
 *
 * This parser reads user input and tries to interpret it as a "Zork"
 * command. Every time it is called it reads a line from the terminal and
 * tries to interpret the line as a two word command. It returns the command
 * as an object of class Command.
 *
 * The parser has a set of known command words. It checks user input against
 * the known commands, and if the input is not one of the known commands, it
 * returns a command object that is marked as an unknown command.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class Parser {
	private CommandWords commands; // holds all valid command words

	public Parser() {
		commands = new CommandWords();
	}

	public Command getCommand() {
		String inputLine = ""; // will hold the full input line
		/*
		String word1;
		String word2;
		String word3;
		String word4;
		String word5;
		*/
		ArrayList <String> words = new ArrayList <String>();

		System.out.print("> "); // print prompt

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			inputLine = reader.readLine();
		} catch (java.io.IOException exc) {
			System.out.println("There was an error during reading: " + exc.getMessage());
		}

		/*
		 * Tokenizer: the process of breaking a stream of text up into words,
		 * phrases, symbols, or other meaningful elements called tokens. The
		 * following tokens are declared word1, word2, etc. respectively.
		 * 
		 * The user's input text is tokenized below
		 * 
		 * Note: anything after the declared number of tokens will be ignored
		 * for the rest of the input line.
		 */
		StringTokenizer tokenizer = new StringTokenizer(inputLine);

		while (tokenizer.hasMoreTokens()){
			String temp = tokenizer.nextToken();
			
			if(isUseful(temp)){
				words.add(temp);
			}
		}
		
		/*
		if (tokenizer.hasMoreTokens()) {
			word1 = tokenizer.nextToken(); // get first word
		} else {
			word1 = null;
		}

		if (tokenizer.hasMoreTokens()) {
			word2 = tokenizer.nextToken(); // get second word
		} else {
			word2 = null;
		}

		if (tokenizer.hasMoreTokens()) {
			word3 = tokenizer.nextToken(); // get third word
		} else {
			word3 = null;
		}

		if (tokenizer.hasMoreTokens()) {
			word4 = tokenizer.nextToken(); // get fourth word
		} else {
			word4 = null;
		}

		if (tokenizer.hasMoreTokens()) {
			word5 = tokenizer.nextToken(); // get fifth word
		} else {
			word5 = null;
		}
		*/
		
		/*
		 * The following checks for whether this word is an known command in the
		 * game's command vocabulary. If so, create a command with that word. If
		 * not, create a "nil" command (for unknown command). 
		 
		if (commands.isCommand(word1)){
			return new Command(word1, word2, word3, word4, word5);
		} else {
			return new Command(null, word2, word3, word4, word5);
		}
		*/
		
		return new Command(words);
		
	}

	
	public boolean isUseful(String word){
		if (word != null){
			return true;
		}
		return false;
	}
	
	// Set: use contains() method, like a list but can't have duplicates
	// however, we might not actually need this... - CM
	public void uselessWords() {
		Set<String> ignoreWords = new HashSet<String>();
		ignoreWords.add("the");
		ignoreWords.add("a");
		ignoreWords.add("an");
		ignoreWords.add("and");
		ignoreWords.add("to");
		ignoreWords.add("that");
		ignoreWords.add("is");
		ignoreWords.add("it");
		ignoreWords.add("in");
		ignoreWords.add("if");

		// System.out.println(ignoreWords);
	}

	/**
	 * Print out a list of valid command words.
	 */
	public void showCommands() {
		commands.showAll();
	}

}