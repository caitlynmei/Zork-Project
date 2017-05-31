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

	}

	// When you come across door and put key in
	public static void level1Door() throws InterruptedException {

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
}
