package com.bayviewglen.zork;

import java.util.Scanner;

public class DialogueLevel2 {

	static Scanner keyboard = new Scanner(System.in);

	static Thread thread = new Thread();

	// Level 2 Intro
	public static void level2Intro() throws InterruptedException{
		System.out.println("You wake up lying on your back in pitch dark. You can hear the sound of waves crashing\n"
				+ "against cave walls.");
		System.out.println("You stand up cautiously.");
		thread.sleep(5000);
		
		// user has to move eventually, so any move will make you fall into a hole...
		System.out.println("Ahhhhhhhhhh....... You fall into a deep dark hole and die...");
		System.out.println("Only joking! But you do fall into a hole and submerge into water.\n*SPLASH*");
	}
	
	// Level 2 Ending
	public static void level2Ending(int currentLevel) throws InterruptedException{
		//if (){
		System.out.println("But something happened. The last time he saw you, he was really scared. He had "
				+ "to do something that would be extraordinarily dangerous. And he warned you, what were his "
				+ "last words? Something about staying away from him... ");
		thread.sleep(5000);
		System.out.println("You blink again, and the flashback is gone. You look in the mirror, and you see "
				+ "yourself looking fresh and healthy, like someone who didn't just almost die in the deep sea. "
				+ "There is also the faint outline of a silver key glowing in your jeans pocket. You look down"
				+ " at yourself. Shocked, you realize you are no longer a walking zombie. You reach into your "
				+ "pocket and pull out a silver key. Two keys down! It is added into your inventory.");
		currentLevel++;
	}

}
