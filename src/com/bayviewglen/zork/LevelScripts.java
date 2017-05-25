package com.bayviewglen.zork;

public abstract class LevelScripts {

	public static void getScript(Command command, int currentLevel) {
		String commandWord = command.getWord(0);
		String secondWord = command.getWord(1);
		String thirdWord = command.getWord(2);
		String fourthWord = command.getWord(3);

		if (currentLevel == 1) {
			// list stuff in here
			System.out.println("That is not an item with legible words on it.");
			
		} else if (currentLevel == 2) {

			if (secondWord.equalsIgnoreCase("intro") && thirdWord.equalsIgnoreCase("sign")) {
				System.out.println("\nINTRO SIGN");
				System.out.println("BEWARE: SHARK!!!\nJust stay inside the \'Kelp Forest\' to the east. ");
			} else if (secondWord.equalsIgnoreCase("abyss") && thirdWord.equalsIgnoreCase("sign")) {
				System.out.println("\nABYSS SIGN\nGood job once more! Follow the path of the glow in the dark road.");
				System.out.println("\'E\'\nHmmmm.... interesting, another letter.");
			} else if (secondWord.equalsIgnoreCase("midnight") && thirdWord.equalsIgnoreCase("zone")
					&& fourthWord.equalsIgnoreCase("note")) {
				System.out.println("\nMIDNIGHT ZONE NOTE");
				System.out.println(
						"Good luck making if so far. If you still can't remember much right now, here's a clue.");
				System.out.println("//rhyme of whatever we want the guy to remember...");
				System.out.println(".\n.\n.\n.");
				System.out.println("And there's also an \'H\'. Hmmm...");
			} else {
				System.out.println("That is not an item with legible words on it.");
			}
			
		} else if (currentLevel == 3) {
			// list stuff in here
			System.out.println("That is not an item with legible words on it.");
			
		} else if (currentLevel == 4) {
			// list stuff in here
			System.out.println("That is not an item with legible words on it.");
			
		} else {
			System.out.println("That is not an item with legible words on it.");
		}
	}
}
