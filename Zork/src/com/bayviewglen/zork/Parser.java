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
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class Parser {
    private CommandWords commands;  // holds all valid command words

    public Parser() 
    {
        commands = new CommandWords();
    }

    public Command getCommand() 
    {
        String inputLine = "";   // will hold the full input line
        String word1;
        String word2;

        System.out.print("> ");     // print prompt

        BufferedReader reader = 
            new BufferedReader(new InputStreamReader(System.in));
        try {
            inputLine = reader.readLine();
        }
        catch(java.io.IOException exc) {
            System.out.println ("There was an error during reading: " + exc.getMessage());
        }
        
        // tokenizer is the process of breaking a stream of text up into words, phrases,
        // symbols, or other meaningful elements called tokens. 
        StringTokenizer tokenizer = new StringTokenizer(inputLine);

        if(tokenizer.hasMoreTokens())
            word1 = tokenizer.nextToken();      // get first word
        else
            word1 = null;
        if(tokenizer.hasMoreTokens())
            word2 = tokenizer.nextToken();      // get second word
        else
            word2 = null;

        // note: we just ignore the rest of the input line.

        // Now check whether this word is known. If so, create a command
        // with it. If not, create a "nil" command (for unknown command).

        if(commands.isCommand(word1))
            return new Command(word1, word2);
        else
            return new Command(null, word2);
    }

    // Set: use contains() method, like a list but can't have duplicates 
    public void uselessWords (){
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
    	System.out.println(ignoreWords);
    }
    
    /**
     * Print out a list of valid command words.
     */
    public void showCommands()
    {
        commands.showAll();
    }
    
}