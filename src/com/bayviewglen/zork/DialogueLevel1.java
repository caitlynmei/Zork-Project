package com.bayviewglen.zork;

import java.util.Scanner;

public class DialogueLevel1 {

	static Scanner keyboard = new Scanner(System.in);

	static Thread thread = new Thread();

	// Level 1 Introduction
	public static void level1Intro() throws InterruptedException {
		System.out.println("LEVEL 1");
		System.out.println(
				"You wake up on a fluffy surface. You look around to see blue skies and the bright sun in the Morning sky.");
		thread.sleep(2000);
		System.out.println(
				"Squinting, you look around to see a ground of white fluff which seems to resemble the clouds you are used to seeing above your head.");
		thread.sleep(2000);
		System.out.println(
				"You try to remember how you got here, but only remember the scary figure that greeted you from outside the cage you were trapped in.");
		thread.sleep(2000);
		System.out.println("*Since this is the beginning of the game here aer a few tips;");
		thread.sleep(2000);
		System.out.println("*You are able to walk around and the goal is to escape this level.");
		thread.sleep(2000);
		System.out.println("*How you escape is up to you, GOOD LUCK...");
		thread.sleep(2000);
	}

	// When you first meet Jack
	public static void Jack1stMeeting() throws InterruptedException {
		System.out.println("Hello, are you here to help me?");
		thread.sleep(2000);
		System.out.println("Options: \t\"Yes\" - \"No\"");
		System.out.print(">");
		String temp = "";
		boolean valid = false;
		while (!valid) {
			temp = keyboard.nextLine().toUpperCase();
			if (temp.equals("YES") || temp.equals("NO")) {
				valid = true;
			} else if (temp.equals("HELP")) {
				System.out.println("\nType exactly what you want to do, make sure no there are no extra spaces");
			}
		}
		if (temp.equals("YES")) {
			thread.sleep(2000);
			System.out.println("Perfect, well my name is Jack and I need your help!");
			thread.sleep(2000);
			System.out.println("The giant has stole my bean so I am unable to grow my beanstalk and return home.");
			thread.sleep(2000);
			System.out.println("You need to find giant's castle and get it back for me!");
			thread.sleep(2000);
			System.out.println("\"You think to yourself and say\"...");
			System.out.println("Options: \t\"Why should I help?\" - \"What do I get out of this?\"");
			System.out.print(">");
			String temp2 = "";
			boolean valid2 = false;
			while (!valid2) {
				temp2 = keyboard.nextLine().toUpperCase();
				if (temp2.equals("WHY SHOULD I HELP?") || temp.equals("What do I get out of this?")) {
					valid2 = true;
				} else if (temp2.equals("HELP")) {
					System.out.println("\nType exactly what you want to do, make sure no there are no extra spaces");
				} else {
					System.out.println("ERROR- Make sure you type exactly what you want to do with no extra spaces...");
				}
			}
			if (temp2.equals("WHY SHOULD I HELP?")) {
				thread.sleep(2000);
				System.out.println("Hmmmmm, if you do I can give something.");
				thread.sleep(2000);
				System.out.println("I have no use for this key but I think you might need it. ");
			}
			if (temp2.equals("WHAT DO I GET OUT OF THIS?")) {
				thread.sleep(2000);
				System.out.println("Hmmmmm, if you do I can give something.");
				thread.sleep(2000);
				System.out.println("I have no use for this key but I think you might need it. ");
			}
		}
		if (temp.equals("NO")) {
			thread.sleep(2000);
			System.out.println("The. you may walk away...");
			thread.sleep(2000);

		}

	}

	// When you encounter Giant
	public static void level1Giant() throws InterruptedException {
		System.out.println("You have come across a castle.");
		thread.sleep(2000);
		System.out.println("You decide to...");
		thread.sleep(2000);
		System.out.println("\t\"Knock\" - \"Do Nothing\" - \"Stare\"\n");
		System.out.print(">");
		String temp = "";
		boolean valid = false;
		while (!valid) {
			temp = keyboard.nextLine().toUpperCase();
			if (temp.equals("KNOCK") || temp.equals("DO NOTHING")) {
				valid = true;
			} else if (temp.equals("HELP")) {
				System.out.println("\nType exactly what you want to do, make sure no there are no extra spaces");
			}
		}
		if (temp.equals("KNOCK")) {
			thread.sleep(2000);
			System.out.println("You hear loud footsteps");
			thread.sleep(2000);
			System.out.println("Your scared but can't seem to move your feet");
		}
		if (temp.equals("DO NOTHING")) {
			thread.sleep(2000);
			System.out.println("You don't know what to do but stare at the door.");
			thread.sleep(2000);
			System.out.println("");
		}

	}

	// When you get bean & meet Jack for 2nd time
	public static void Jack2ndMeeting() throws InterruptedException {
		System.out.println("Hey did you get the bean?");
		thread.sleep(2000);
//PUT KEY INTO INVENTORY HERE
	}

	// When you come across door there is keypad
	public static void level1Door() throws InterruptedException {

	}

	// Level 1 Code Check
	public static void level2CodeCheck() {

		final String VALID_CODE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		final int GUESSED_CHAR_LENGTH = 1; // length of guessed character (which
											// has to be 1)
		boolean codeIsSolved = false; // for when code is solved by player
		int numCorrectGuesses = 0; // stores the number of times a correct
									// character is guessed
		String code = "FIND"; // the ANSWER for the cave entrance (the code word)
		String encryptedCode = ""; // stores the characters the player has
									// guessed, displayed for player to see
									// updates
		String guessedCharacter = ""; // the character that the player guessed
		String usedChars = ""; // stores all characters that have been guessed
		String characterList = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z"; // the
																						// displayed
																						// characters
																						// which
																						// the
																						// player
																						// may
																						// choose
																						// from

		while (!codeIsSolved) {
			// to update and show encrypted message
			for (int b = 0; b < encryptedCode.length(); b++) {
				if (usedChars.indexOf(encryptedCode.charAt(b)) != -1) {
					encryptedCode += usedChars.charAt(usedChars.indexOf(code.charAt(b))) + " ";
					// codedMessage += phrase.charAt(b); // simpler version of
					// above line
				} else if (VALID_CODE_CHARACTERS.indexOf(encryptedCode.charAt(b)) != -1) {
					encryptedCode += "_ ";
				} else {
					encryptedCode += "/ ";
				}
			}

			System.out.println(encryptedCode);

			// to display unused characters
			System.out.println("Unused Characters: ");
			String displayedCharacters = ""; // the displayed unused and guessed
												// characters
			System.out.println(characterList);

			System.out.println("Please enter a single character: ");

			guessedCharacter = "";
			boolean validGuessedCharacter = false; // to check if
													// guessedCharacter is a
													// single character
			while (!validGuessedCharacter) {
				validGuessedCharacter = true;
				guessedCharacter = keyboard.nextLine().toUpperCase();
				for (int i = 0; i < guessedCharacter.length() && validGuessedCharacter; i++) {
					if (guessedCharacter.length() != 1
							&& VALID_CODE_CHARACTERS.indexOf(guessedCharacter.charAt(i)) == -1) {
						validGuessedCharacter = false;
						System.out.println("Please enter a single valid character (don't use spaces):");
					} else if (guessedCharacter.length() != 1) {
						validGuessedCharacter = false;
						System.out.println("Please enter a \'single\' valid character (don't use spaces):");
					} else if (usedChars.indexOf(guessedCharacter) != -1) {
						validGuessedCharacter = false;
						System.out.println("You have already guessed the character \'" + guessedCharacter
								+ "\', please select again: "); // to check if
																// guessed
																// character was
																// already used
					}
				}
			}

			// to print and update the displayed characters guesser may use
			int index = 0;
			index = characterList.indexOf(guessedCharacter);
			for (int i = 0; i < characterList.length(); i++) {
				if (i == index) {
					displayedCharacters += "_";
				} else {
					displayedCharacters += characterList.charAt(i);
				}
			}
			characterList = displayedCharacters;

			// to check if guessed character is in message
			for (int i = 0; i < GUESSED_CHAR_LENGTH; i++) {
				if (code.indexOf(guessedCharacter.charAt(i)) != -1) {
					System.out.println("The character \'" + guessedCharacter + "\' is in the phrase.\n");
					numCorrectGuesses++;
				} else {
					System.out.println("The character \'" + guessedCharacter + "\' is not in the phrase.\n");
				}
				usedChars += guessedCharacter;
			}

			if (numCorrectGuesses == 3) {
				codeIsSolved = true;
			}
		}
		System.out.println("You hear a click.");
	}

	// Level 1 Outro
	public static void level1Outro() throws InterruptedException {
		System.out.println("The clouds around you start to disappear one by one.");
		System.out.println("\n\nYou think about what to do. You think to yourself\n");
		thread.sleep(2000);
		System.out.println("Options: \"Do Nothing\" - \"Close eyes\"\n");
		thread.sleep(2000);
		System.out.println("What do you do?");
		System.out.print(">");
		String temp = "";
		boolean valid = false;
		while (!valid) {
			temp = keyboard.nextLine().toUpperCase();
			if (temp.equals("DO NOTHING") || temp.equals("CLOSE EYES")) {
				valid = true;
			} else if (temp.equals("HELP")) {
				System.out.println("\nType what you want to do. Make sure you don't have any extra spaces!");
			}
		}
		if (temp.equals("DO NOTHING")) {
			thread.sleep(2000);
			System.out.println("You watch as the clouds around you disappear.");
			thread.sleep(2000);
			System.out.println("You see the clouds beneath you disappear.");
			System.out.println("You Fall. Everything goes dark.");
		} else {
			thread.sleep(2000);
			System.out.println("You close your eyes, and hope for the best.");
			thread.sleep(2000);
			System.out
					.println("The anticipation is high and you anxiously wait for the cloud beneath you to disappear.");
			thread.sleep(2000);
			System.out.println("You feel a falling sensation and lose conciousness.");
		}

		thread.sleep(2000);
		System.out.println("You see a child skipping on a hot summers day.");
		thread.sleep(2000);
		System.out.println("\"Do I know her?\" you ask yourself.");
		thread.sleep(2000);
		System.out.println("She starts skipping away.");
		thread.sleep(2000);
		System.out.println("\"Wait!\" you call.");
		thread.sleep(2000);
		System.out.println("\nEverything fades to black");
		thread.sleep(2000);
		System.out.println("END OF LEVEL 1");
	}
	// loading Method: prints the "Loading . . . . " message
	private static void loading() throws InterruptedException {
		System.out.println();
		thread.sleep(1500); // delays code
		System.out.print("Loading");
		
		for (int i = 0; i < 4; i++) {
			System.out.print("   .");
			thread.sleep(1500);
		}
	}
}
