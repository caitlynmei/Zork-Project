package com.bayviewglen.zork;

import java.util.Scanner;

public class DialogueLevel1 {
	
	static Scanner keyboard = new Scanner(System.in);
	
	static Thread thread = new Thread(); 
	
	//Level 1 Introduction
	public static void level1Intro() throws InterruptedException{
	System.out.println("You wake up on a fluffy surface. You look around to see blue skies and the bright sun in the Morning sky.");
	thread.sleep(2000);
	System.out.println("Squinting, you look around to see a ground of white fluff which seems to resemble the clouds you are used to seeing above your head.");
	thread.sleep(2000);
	System.out.println("You try to remember how you got here, but only remember the scary figure that greeted you from outside the cage you were trapped in.");
	thread.sleep(2000);
	System.out.println();
	
	
	}
	
	
	//When you come across Jack
	public static void level1JackDialogue() throws InterruptedException{
		
	}
	
	
	//When you encounter Giant
	public static void level1Giant() throws InterruptedException{
	System.out.println("You decide to knock");
	
	//Giant Reply

	}
	
	//Level 1 Outro
	public static void level1end() throws InterruptedException{ //to be called after completing level 1
		thread.sleep(1500);
		System.out.println("The clouds around you start to disappear one by one.");
		System.out.println("\n\nYou think about what to do. You think to yourself\n");
		thread.sleep(2000);
		System.out.println("\t\"Hang onto the chest\" - \"Do Nothing\" - \"Close eyes\"\n" );
		thread.sleep(2000);
		System.out.println("What do you do?");
		System.out.print(">");
		String temp = "";
		
		boolean valid = false;
		while(!valid){
			temp = keyboard.nextLine().toUpperCase();	
		if(temp.equals("HANG ONTO THE CHEST") || temp.equals("HANG ONTO CHEST") || temp.equals("DO NOTHING") || temp.equals("CLOSE EYES")){
			valid = true;
		}else if(temp.equals("HELP")){
			System.out.println("\nType what you want to do. Make sure you don't have any extra spaces!");
		}
		}
		
		if(temp.equals("HANG ONTO CHEST") || temp.equals("HANG ONTO CHEST")){
			thread.sleep(2000);
			System.out.println("As you go to hang onto the chest, it disappears. You fall on your face.");
			thread.sleep(2000);
			
			System.out.println("The clouds around you keep disappearing.");
			System.out.println("\n\nYou think about what to do. You think to yourself\n");
			thread.sleep(2000);
			System.out.println("\t \"Do Nothing\" - \"Close eyes\"\n" );
			thread.sleep(2000);
			System.out.println("What do you do?");
			System.out.print(">");
			
			temp = "";
			valid = false;
			while(!valid){
				temp = keyboard.nextLine().toUpperCase();	
			if(temp.equals("DO NOTHING") || temp.equals("CLOSE EYES")){
				valid = true;
			}else if(temp.equals("HELP")){
				System.out.println("\nType what you want to do. Make sure you don't have any extra spaces!");
			}
			}
			
		if(temp.equals("DO NOTHING")){
			thread.sleep(2000);
			System.out.println("You watch as the clouds around you disappear.");
			thread.sleep(2000);
			System.out.println("You see the clouds beneath you disappear.");
			System.out.println("You Fall. Everything goes dark.");
		}else{
			thread.sleep(2000);
			System.out.println("You close your eyes, and hope for the best.");
			thread.sleep(2000);
			System.out.println("The anticipation is high and you anxiously wait for the cloud beneath you to disappear.");
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
		}	
	}
	
	
}
