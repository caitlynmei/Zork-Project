package com.bayviewglen.zork;

import java.util.Scanner;

public class Dialogue {
	
	static Scanner keyboard = new Scanner(System.in);
	
	static Thread thread = new Thread();

	// methods for each level... 
	
	public static void level1end() throws InterruptedException{ //to be called after completing level 1
		thread.sleep(1500);
		System.out.println("The clouds around you start to disappear one by one.");
		System.out.println("\n\nYou think about what to do. You think to yourself\n");
		thread.sleep(2000);
		System.out.println("\t\"Hang onto the chest\" - \"Do Nothing\" - \"Close eyes\"\n" );
		thread.sleep(2000);
		System.out.println("What do you say?");
		System.out.print(">");
		String temp = "";
		
		boolean valid = false;
		while(!valid){
			temp = keyboard.nextLine().toUpperCase();	
		if(temp.equals("HANG ONTO THE CHEST") || temp.equals("HANG ONTO CHEST") || temp.equals("DO NOTHING") || temp.equals("CLOSE EYES")){
			valid = true;
		}else if(temp.equals("HELP")){
			System.out.println("\nType what you want to do.");
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
			System.out.println("What do you say?");
			System.out.print(">");
			
			temp = "";
			valid = false;
			while(!valid){
				temp = keyboard.nextLine().toUpperCase();	
			if(temp.equals("DO NOTHING") || temp.equals("CLOSE EYES")){
				valid = true;
			}else if(temp.equals("HELP")){
				System.out.println("\nType what you want to do.");
			}
			}
			
			if(temp.equals("DO NOTHING")){
				thread.sleep(2000);
				System.out.println("You watch as the clouds around you disappear.");
				thread.sleep(2000);
				System.out.println("You see the clouds beneath you disappear.");
				System.out.println("You Fall. Everything goes dark.");
			} else{
			
			}
			
			
		}else if(temp.equals("DO NOTHING")){
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
	
	
	public static void level0() throws InterruptedException{
		
		 System.out.println("\nMysterious figure :");
		 System.out.println("Look who decided to finally wake up");
					thread.sleep(3000);
					
					System.out.println("\n\nYou think about what to say. You think to yourself\n");
					thread.sleep(2000);
					System.out.println("\t\"Who are you?\" - \"Where am I?\"\n" );
					thread.sleep(2000);
					System.out.println("What do you say?");
					System.out.print(">");
					String temp = "";
					boolean valid = false;
					while (!valid){
					
					temp = keyboard.nextLine().toUpperCase();
					if(temp.equals("WHO ARE YOU?") ||  temp.equals("WHO ARE U?") || temp.equals("WHERE AM I?") || temp.equals("WHO ARE YOU") || temp.equals("WHERE AM I") || temp.equals("WHO ARE U")){
						valid = true;
					}else if(temp.equals("HELP")){
						System.out.println("\nType what you are thinking.");
					}
					else{
						System.out.println("That doesn't appear in your thoughts...");
						System.out.print(">");
					}
						
					}
					
					if(temp.equals("WHO ARE YOU?") || temp.equals("WHO ARE YOU") || temp.equals("WHO ARE U") || temp.equals("WHO ARE U?")){
						System.out.println("\nYou say:\nWho are you?\n");
						thread.sleep(2000);
						System.out.println("\nMysterious Figure:");
						System.out.println("You don't remember? You don't remember the hell you put me through?");
						thread.sleep(2500);
						System.out.println("Well, that will make this more enjoyable. I might feel a bit guilty after though...");
						thread.sleep(2000);
						
						
						
						
					}else if( temp.equals("WHERE AM I?") || temp.equals("WHERE AM I")){
						
						System.out.println("\nYou say:\nWhere am I?");
						thread.sleep(2000);
						System.out.println("\nMysterious Figure:");
						System.out.println("You are in a place where you will finally get what you deserve.");
						thread.sleep(3000);
						System.out.println("\nYou say:\nWho are you?\n");
						thread.sleep(2000);
						System.out.println("\nMysterious Figure:");
						System.out.println("You don't Remember? You don't remember the hell you put me through?");
						thread.sleep(2500);
						System.out.println("Well, that will make this more enjoyable. I might feel a bit guilty after though...");
						thread.sleep(2500);
					}
					
					System.out.println("\n\nYou think about what to say. You think to yourself\n");
					thread.sleep(2000);
					System.out.println("\t\"What do you mean?\" - \"I don't remember\"\n" );
					thread.sleep(2000);
					System.out.println("What do you say?");
					System.out.print(">");
					temp = "";
					valid = false;
					while (!valid){
					
					temp = keyboard.nextLine().toUpperCase();
					if(temp.equals("WHAT DO YOU MEAN?") ||  temp.equals("I DON'T REMEMBER") || temp.equals("WHAT DO YOU MEAN") || temp.equals("I DONT REMEMBER") || temp.equals("WHAT DO U MEAN") || temp.equals("WHAT DO U MEAN?")){
						valid = true;
					}else if(temp.equals("HELP")){
						System.out.println("\nType what you are thinking.");
					}else{
						System.out.println("That doesn't appear in your thoughts...");
						System.out.print(">");
					}
					}
					
					System.out.println("\nMysterious Figure:");
					System.out.println("You will see very soon... have fun");
					thread.sleep(2500);
					
					System.out.println("\nThe dark figure starts laughing as their figure fades from the dimly lit airplane hanger.");
					thread.sleep(6000);
					System.out.println("\nSuddenly the ground beneath you collapses and you fall. Everything goes dark.");
				
					
						
	
				
			
	
	}
}
