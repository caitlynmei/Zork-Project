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
		System.out.println("LEVEL 3");
		System.out.println("You wake up lying on your back in pitch dark. You can hear the sound of waves crashing\n"
				+ "against cave wall. You stand up cautiously.");
		thread.sleep(1500);
		System.out.println("Ahhhhhhhhhh....... You fall into a deep dark hole and die...");
		thread.sleep(5000);
		System.out.println("Only joking! But you do fall into a hole and submerge into water. *SPLASH*");
		System.out.println("Only direction you can go is \'down\'.");
	}
	
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
		System.out.println("(*HINT: The bubbles have air. What do you need? Do you need to \'use' it?)");
	}

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
	public static void level2Note(){
		System.out.println();
		System.out.println("MIDNIGHT ZONE NOTE");
		System.out.println("Good luck making if so far. If you still can\'t remember much right now, here's a clue.");
		System.out.println();
		System.out.println("\'One fish,");
		System.out.println("  Two fish,");
		System.out.println("  Red fish,");
		System.out.println("  Blue fish...\n");
		System.out.println("  This one has a little star.");
		System.out.println("  This one has a little car.");
		System.out.println("  Say! What a lot");
		System.out.println("  Of fish there are.\'");
		System.out.println("  - excerpt from children's author Dr. Seuss\n");
		System.out.println("You suddenly feel a cold chill travelling down your spine and hear a voice echo:");
		System.out.println("\'Yes, the lovely Dr. Seuss. Kids adored him. But how would they feel if I added this in? MWAH HA HA\'\n");
		System.out.println("On the note, a new line appears at the bottom:");
		System.out.println("  This one has a bubble,");
		System.out.println("  And he is going to PAY for what he did...\n");
		System.out.println("Okaaay... And there's also an \'H\' on the note. Hmmm... ");
	}
	
	// Level 2: Cave Entrance Scene with Oarfish
	public static void level2Oarfish() throws InterruptedException{
		System.out.println();
		System.out.println("*SWISH*\nWhat was that? A red stripy thing just swam by... \n*WHAM*");
		thread.sleep(1000);
		System.out.println("You were knocked onto the sea floor by something. Your head banged onto the side of the cave. Thank goodness your oxygen bubble is still intact.");
		System.out.println("Dizzy, you look up and see an infinitely giant and long silver fish. It's really, really long. Almost three times your height... And big... You shake your");
		System.out.println("head to clear the blurriness. ");
		thread.sleep(3000);
		System.out.println("Nope. The fish is still there, guarding the cave entrance with a long, narrow silvery body, almost like a sea serpent. It has a very deep red dorsal fin,");
		System.out.println("from its head all the way to its back.\nWait, a red dorsal fin?");
		System.out.println("\nThinking, you realize it's an oarfish. You wonder for a split second why you even know that, but the oarfish advances toward you. You back away, slowly"); 
		System.out.println("scootching your body backwards with your hands. Unfortunately, there's nowhere to go. Your back is pressed against the cave wall.\n");
		System.out.println("What do you do? It could eat you alive... It's definitely large enough to swallow you whole...");
		//continue here...
	}
	
	// Level 2: Ending Message
	public static void level2Ending(int currentLevel, Tool secondKey) throws InterruptedException{
		System.out.println();
		System.out.println("But something happened. The last time he saw you, he was really scared. He had to do something that would be extraordinarily dangerous. And he warned you, "
				+ "\nwhat were his last words? Something about staying away from him... ");
		thread.sleep(5000);
		System.out.println("\nYou blink again, and the flashback is gone. You look in the mirror, and you see yourself looking fresh and healthy, like someone who didn't just almost "
				+ "\ndie in the deep sea. There is also the faint outline of a silver key glowing in your jeans pocket. You look down at yourself. Shocked, you realize you are no longer"
				+ "\na walking zombie. You reach into your pocket and pull out a silver key. Two keys down! It is added into your inventory.");
		Inventory.add(secondKey);
		System.out.println("\n\nA swirl of light glows around you and you blank out...");
		System.out.println();
		System.out.println("END OF LEVEL 2: EXIT THE SEA WORLD");;
	}

}
