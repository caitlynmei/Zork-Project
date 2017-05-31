package com.bayviewglen.zork;

// imports
import java.util.Scanner;

import com.bayviewglen.zork.inventory.Inventory;
import com.bayviewglen.zork.tool.Tool;

public class DialogueLevel2 {

	static Scanner keyboard = new Scanner(System.in);
	static Thread thread = new Thread();
	
	// Level 2 Intro
	public static void level2Intro() throws InterruptedException{
		System.out.println();
		System.out.println("LEVEL 2\n\n");
		System.out.println("PITCH BLACK CAVE\n*You can now use the commands up (U) and down (D) alongside the normal compass directions.\n");
		System.out.println("You wake up lying on your back in pitch dark. You can hear the sound of waves crashing\n"
				+ "against cave wall. You stand up cautiously.");
		thread.sleep(300);
		System.out.println("\nAhhhhhhhhhh....... You fall into a deep dark hole and die...");
		thread.sleep(5000);
		System.out.println("\nOnly joking! But you do fall into a hole and submerge into water. *SPLASH*");
		System.out.println("Only direction you can go is \'down\'.");
	}
	
	/*
	// Level 2: "You will run out of oxygen soon and die" message
	public static void level2NeedOxygen(){
		System.out.println();
		System.out.println("You realize you are holding your breath under the water. You will run out of air soon... ");
	}
	
	// Level 2: "Hint for getting oxygen" message 
	public static void level2ClamIntro(){
		System.out.println();
		System.out.println("You think, that's cute. But, not really. You're head hurts. You NEED oxygen. Now. ");
		System.out.println("A small silver clownfish swims into the bubbles and is caught in one. *THINK*");
		System.out.println("(*HINT: The bubbles have air. What do you need? Do you need to \'use\' it?)");
	}
	*/
	
	// Level 2: "You got oxygen" message
	public static void level2YesAir(){
		System.out.println();
		System.out.println("Good thinking!! You're like an underwater astronaut with the bubble helmet. Now you're free to traverse the ocean as you wish. :)");
	}
	
	// Level 2: "You ran out of oxygen" message
	public static void level2NoAir(){
		System.out.println();
		System.out.println("Sadly, you run out of air and suffocate. Sorry!! Good game. ");
	}
	
	//Level 2: Shark Warning
	public static void level2Shark(){
		System.out.println();
		System.out.println("You see a shark!! Run away!!");
	}
	
	//Level 2: Midnight Zone Note
	public static void level2Note() throws InterruptedException{
		System.out.println();
		System.out.println("MIDNIGHT ZONE NOTE");
		System.out.println("Good luck making if so far. If you still can\'t remember much right now, here's a clue.");
		System.out.println();
		thread.sleep(1000);
		System.out.println(" \'One fish,");
		System.out.println("  Two fish,");
		System.out.println("  Red fish,");
		System.out.println("  Blue fish...\n");
		System.out.println("  This one has a little star.");
		System.out.println("  This one has a little car.");
		System.out.println("  Say! What a lot");
		System.out.println("  Of fish there are.\'");
		System.out.println("  - excerpt from children's author Dr. Seuss\n");
		thread.sleep(5000);
		System.out.println("You suddenly feel a cold chill travelling down your spine and hear a voice echo:");
		System.out.println("\'Yes, the lovely Dr. Seuss. Kids adored him. But how would they feel if I added this in? MWAH HA HA\'\n");
		thread.sleep(1500);
		System.out.println("On the note, a new line appears at the bottom:");
		System.out.println("  This one has a bubble,");
		System.out.println("  And he is going to PAY for what he did...\n");
		System.out.println("Okaaay... And there's also an \'H\' on the note. Hmmm... ");
	}
	
	// Level 2: Cave Entrance Scene with Oarfish
	public static boolean level2Oarfish() throws InterruptedException{
		System.out.println();
		System.out.println("*SWISH*\nWhat was that? A red stripy thing just swam by... \n*WHAM*\n");
		thread.sleep(1000);
		System.out.println("You were knocked onto the sea floor by something. Your head banged onto the side of the cave. Thank goodness your oxygen bubble is still intact.");
		System.out.println("Dizzy, you look up and see an infinitely giant and long silver fish. It's really, really long. Almost three times your height... And big... You shake your");
		System.out.println("head to clear the blurriness. ");
		thread.sleep(7000);
		System.out.println("\nNope. The fish is still there, guarding the cave entrance with a long, narrow silvery body, almost like a sea serpent. It has a very deep red dorsal fin,");
		System.out.println("from its head all the way to its back.\nWait, a red dorsal fin?");
		System.out.println("\nThinking, you realize it's an oarfish. You wonder for a split second why you even know that, but the oarfish advances toward you. You back away, slowly"); 
		System.out.println("scootching your body backwards with your hands. Unfortunately, there's nowhere to go. Your back is pressed against the cave wall.\n");
		thread.sleep(9000);
		System.out.println("What do you do? It could eat you alive... It's definitely large enough to swallow you whole...\n");
		System.out.println("Option 1: Remember that knife in your inventory? That might be useful. Enter \'1\'.\nOption 2: Think again. Use your head. Maybe, violence isn\'t the answer. Enter \'2\'.\n");
		thread.sleep(1000);
		System.out.print(">");
		
		String temp = " ";
		boolean validAnswer = false;
		while (!validAnswer){
			temp = keyboard.nextLine().toUpperCase();
			if (temp.equals("1") ||  temp.equals("2") || temp.equals("OPTION 1") || temp.equals("OPTION 2")){
				validAnswer = true;
			} else if (temp.equals("HELP")){
				System.out.println("\nType which option you are thinking.");
				System.out.print(">");
			} else {
				System.out.println("That option doesn't appear in your thoughts...");
				System.out.print(">");
			}
		}
		
		if (temp.equals("1")){
			level2Oarfish1();
			return true;
		}
		
		if (temp.equals("2")){
			level2Oarfish2();
			level2Keypad();
		}
		
		return false;
	}
	
	// Level 2: Option 1: Killed by Oarfish Message
	public static boolean level2Oarfish1() throws InterruptedException{
		System.out.println("\nOption 1:\nYou take the knife out, and stab as hard as you can into the oarfish\'s right side.");
		thread.sleep(1500);
		System.out.println("The oarfish's eyes are filled with hate and anger. In a millisecond, it flicks its tail and you slam into the cave wall. *CRACK* That's going to leave more than");
		System.out.println("a bruise... You almost blank out, but it could also just be the darkness.");
		thread.sleep(4000);
		System.out.println("*POP*\nOr not... There goes your oxygen bubble... What a painful way to die...");
		
		return true;
	}
	
	// Level 2: Option 2: Made an Oarfish Friend Message
	public static void level2Oarfish2() throws InterruptedException{
		System.out.println("\nOption 2:\nNo knife... be the kind hero that dies won't you? Another memory floods into your mind. A friend was giving you a lecture about deep sea creatures.");
		System.out.println("Oarfish are gentle.");
		thread.sleep(1500);
		System.out.println("Cautiously, you remain silent and wait for the oarfish to come closer. Its eyes stare into yours. You slowly reach out a hand, and stroke its side. It bumps its");
		System.out.println("head into you. You laugh. You just made a new friend!");
		thread.sleep(6000);
		System.out.println("\nGood job! Never judge anyone by their mere appearance. Looks are always deceiving.\nThe oarfish nudges your hand to the keypad.");
	}
	
	// Level 2: Cave Keypad Code Message
	public static void level2Keypad() throws InterruptedException{
		System.out.println("\nDo you want to \'enter a code\'?\nOption 1: Enter \'yes\'.\nOption 2: Enter \'no\'.");
		System.out.print(">");
		
		String temp = " ";
		boolean validAnswer = false;
		while (!validAnswer){
			temp = keyboard.nextLine().toUpperCase();
			if (temp.equals("YES")){
				validAnswer = true;
			} else if (temp.equals("NO")){
				System.out.println("Okaaay, have fun waiting outside. Don\'t you have any curiosity? Don\'t you want to taste glory? Just say \'yes\'.");
				thread.sleep(3000);
				System.out.println("Actually, you know what? Too bad. Just a heads up, you actually have to enter a code. The only exit to this world is inside like it or not.");
				System.out.print(">");
			} else if (temp.equals("HELP")){
				System.out.println("\nType which option you are thinking.");
				System.out.print(">");
			} else {
				System.out.println("That option doesn't appear in your thoughts...");
				System.out.print(">");
			}
		}
		
		if (temp.equals("YES")){
			System.out.println("\n");
			System.out.println("Great! (*Hint: Hmmm... where there any clues along the way?)");
			System.out.println("Like perhaps, there were some clues that made you go \'hmmmm....\'?\n"); // Code is "THE"
		}
		
		// check if player enters in correct code for keypad to open cave entrance
		level2CodeCheck();
	}
	
	// Level 2: Keypad Code Check (Adapted Hangman Game for this Keypad Lock :) - CM)
	public static void level2CodeCheck(){
		
		final String VALID_CODE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		final int GUESSED_CHAR_LENGTH = 1; 			// length of guessed character (which has to be 1)
		boolean codeIsSolved = false; 				// for when code is solved by player
		int numCorrectGuesses = 0;					// stores the number of times a correct character is guessed
		String code = "THE";						// the ANSWER for the cave entrance (the code word)
		String encryptedCode = ""; 					// stores the characters the player has guessed, displayed for player to see updates 
		String guessedCharacter = ""; 				// the character that the player guessed
		String usedChars = ""; 						// stores all characters that have been guessed
		String characterList = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z"; 	// the displayed characters which the player may choose from 
		
		while (!codeIsSolved){
			codeIsSolved = false;
			
			// to update and show encrypted message
			encryptedCode = "";
			for (int i = 0; i < code.length(); i++){ 
				if (usedChars.indexOf(code.charAt(i)) != -1){
					//encryptedCode += usedChars.charAt(usedChars.indexOf(code.charAt(i))) + " ";
						encryptedCode += code.charAt(i) + " "; // simpler version of above line
				} else if (VALID_CODE_CHARACTERS.indexOf(code.charAt(i)) != -1){
						encryptedCode += "_ ";
				} 
			}
			System.out.println("KEYPAD: " + encryptedCode + "\n");
			
			// to display unused characters
			System.out.println("Unused Characters: ");
			String displayedCharacters = ""; // the displayed unused and guessed characters
			System.out.println(characterList);
					
			System.out.println("Please enter a single character: "); 
										
			guessedCharacter = "";								
			boolean validGuessedCharacter = false; // to check if guessedCharacter is a single character
			while (!validGuessedCharacter){
				validGuessedCharacter = true;
				guessedCharacter = keyboard.nextLine().toUpperCase(); 
				for (int i = 0; i < guessedCharacter.length() && validGuessedCharacter; i++){
					if (guessedCharacter.length() != 1 && VALID_CODE_CHARACTERS.indexOf(guessedCharacter.charAt(i)) == -1){ 
						validGuessedCharacter = false; 
						System.out.println("Please enter a single valid character (don't use spaces):");
					} else if (guessedCharacter.length() != 1){ 
						validGuessedCharacter = false; 
						System.out.println("Please enter a \'single\' valid character (don't use spaces):");
					} else if (usedChars.indexOf(guessedCharacter) != -1){
						validGuessedCharacter = false;
						System.out.println("You have already guessed the character \'" + guessedCharacter + "\', please select again: "); // to check if guessed character was already used
					} 
				}
			}
			
			// to print and update the displayed characters guesser may use
			int index = 0;
			index = characterList.indexOf(guessedCharacter);
			for (int i = 0; i < characterList.length(); i++){
				if (i == index){
					displayedCharacters += "_";
				} else {
					displayedCharacters += characterList.charAt(i);
				}
			}
			characterList = displayedCharacters;
			
			// to check if guessed character is in message
			for (int i = 0; i < GUESSED_CHAR_LENGTH; i++){
				if (code.indexOf(guessedCharacter.charAt(i)) != -1){
					System.out.println("The character \'" + guessedCharacter + "\' is in the phrase.\n");
					numCorrectGuesses++;
				} else {
					System.out.println("The character \'" + guessedCharacter + "\' is not in the phrase.\n");
				}
				usedChars += guessedCharacter;
			}
			
			if (numCorrectGuesses == 3){
				codeIsSolved = true;
			}
		}
		System.out.println("KEYPAD: THE");
		System.out.println("\nGreat! You opened the cave! The sea floor shakes, and the boulder rolls slightly to the side, revealing a gap just large enough for you to enter to your east.");
	}
		
	// Level 2: Mirror Memory Flashback
	public static void level2Mirror() throws InterruptedException{
		System.out.println("\nYou see your own reflection looking back at you in the mirror. You look like death. Your hair is a mess, you have dark bags under your eyes, and your ");
		System.out.println("clothes are torn from this journey. But, you smile. You made it this far and you're proud of that. You gasp as you relive a memory...");
		thread.sleep(4000);
		loading();
		System.out.println("\n\nYour best friend smiled at you on his birthday. July 6th. You gave him the book he had his eye on for years about the midnight zone sea creatures. He was"); 
		System.out.println("a huge dork when it came to marine animals. He had a huge obsession and was practically a walking encyclopedia. His name was... Odd, it\'s on the tip of ");
		System.out.println("your tongue. You can\'t remember... ");
		thread.sleep(4000);
		loading();
		System.out.println("\n\nBut something happened. The last time he saw you, he was really scared. He had to do something that would be extraordinarily dangerous. And he warned you,");
		System.out.println("what were his last words? Something about staying away from him... ");	
	}
	
	// Level 2: Ending Message
	public static void level2Ending(int currentLevel, Tool secondKey) throws InterruptedException{
		thread.sleep(3000);
		System.out.println();
		System.out.println("\nYou blink again, and the flashback is gone. You look in the mirror, and you see yourself looking fresh and healthy, like someone who didn't just almost "
				+ "\ndie in the deep sea. There is also the faint outline of a silver key glowing in your jeans pocket. You look down at yourself. Shocked, you realize you are no longer"
				+ "\na walking zombie. You reach into your pocket and pull out a silver key. Two keys down! It is added into your inventory.");
		Inventory.add(secondKey);
		thread.sleep(9000);
		System.out.println("\n\nA swirl of light glows around you and you blank out...");
		System.out.println();
		System.out.println("END OF LEVEL 2: EXIT THE SEA WORLD");
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
