package com.bayviewglen.zork;

/**
 * * Class Command - Part of the "Zork" game. * * author: Michael Kolling *
 * version: 1.0 * date: July 1999 * * This class holds information about a
 * command that was issued by the user. * A command currently consists of two
 * strings: a command word and a * second word (for example, if the command was
 * "take map", then the two strings * obviously are "take" and "map"). * The way
 * this is used is: Commands are already checked for being valid * command
 * words. * If the user entered an invalid command (a word that is not * known)
 * then the command word is <null>. * * If the command had only one word, then
 * the second word is <null>. * * The second word is not checked at the moment.
 * It can be anything. If this * game is extended to deal with items, then the
 * second part of the command * should probably be changed to be an item rather
 * than a String.
 */

class Command {

	private String commandWord;
	private String secondWord;
	private String thirdWord;
	private String fourthWord;
	private String fifthWord;

	/*
	 * Create a command object. First and second word must be supplied, but
	 * either one (or both) can be null. The command word should be null to
	 * indicate that this was a command that is not recognized by this game.
	 */
	public Command(String firstWord, String secondWord, String thirdWord, String fourthWord, String fifthWord) {
		commandWord = firstWord;
		this.secondWord = secondWord;
		this.thirdWord = thirdWord;
		this.fourthWord = fourthWord;
		this.fifthWord = fifthWord;
		
		if (commandWord != null){
			commandWord = commandWord.toUpperCase();
		}
		
		if (this.secondWord != null){
			this.secondWord = this.secondWord.toUpperCase();
		}
		
		if (this.thirdWord != null){
			this.thirdWord = this.thirdWord.toUpperCase();
		}
		
		if (this.fourthWord != null){
			this.fourthWord = this.fourthWord.toUpperCase();
		}
		
		if (this.fifthWord != null){
			this.fifthWord = this.fifthWord.toUpperCase();
		}
	}

	/*
	 * getCommandWord method gets the command word when called. If the 
	 * command was not understood, the result is returned as null.
	 */
	public String getCommandWord() {
		return commandWord;
	}

	/*
	 * @return the second word of this command. Returns null if there was no
	 * second word.
	 */
	public String getSecondWord() {
		return secondWord;
	}

	// @return the third word of this command. Returns null if there was no
	// third word.
	public String getThirdWord() {
		return thirdWord;
	}

	/*
	 * @return the fourth word of this command. Returns null if there was no
	 * second word.
	 */
	public String getFourthWord() {
		return fourthWord;
	}
	
	// @return the fifth word of this command. Returns null if there was no
	// second word
	public String getFifthWord() {
		return fifthWord;
	}
	
	
	
	// @return true if this command was not understood.
	public boolean isUnknown() {
		return (commandWord == null);
	}

	// @return true if the command has a second word.
	public boolean hasSecondWord() {
		return (secondWord != null);
	}

	// @return true if the command has a third word.
	public boolean hasThirdWord() {
		return (thirdWord != null);
	}

	// @return true if the command has a fourth word.
	public boolean hasFourthWord() {
		return (fourthWord != null);
	}

	// @return true if the command has a fifth word.
	public boolean hasFifthWord() {
		return (fifthWord != null);
	}

}
