package com.bayviewglen.zork;

import java.util.Scanner;

public class Dialogue {
	
	static Scanner keyboard = new Scanner(System.in);
	
	static Thread thread = new Thread();

	// methods for each level... 
	

	
	
	public static void level0() throws InterruptedException{
		
		 System.out.println("\nMysterious figure :");
		 System.out.println("Look who decided to finally wake up");
					thread.sleep(1500);
					
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
					if(temp.equals("WHO ARE YOU?") || temp.equals("WHERE AM I?") || temp.equals("WHO ARE YOU") || temp.equals("WHERE AM I") ){
						valid = true;
					}
					else{
						System.out.println("That doesn't appear in your thoughts...");
						System.out.print(">");
					}
						
					}
					
					if(temp.equals("WHO ARE YOU?") || temp.equals("WHO ARE YOU")){
						System.out.println("\nYou say:\nWho are you?\n");
						thread.sleep(2000);
						System.out.println("\nMysterious Figure:");
						System.out.println("You don't Remember? You don't remember the hell you put me through?");
						thread.sleep(2500);
						System.out.println("Well, that will make this more enjoyable. I might feel a bit guilty after though...");
						thread.sleep(2000);
						
						
						
						
					}else if( temp.equals("WHERE AM I?") || temp.equals("WHERE AM I")){
						
						System.out.println("\nYou say:\nWhere am I?");
						thread.sleep(2000);
						System.out.println("\nMysterious Figure:\n");
						System.out.println("You are in a place where you will finally get what you deserve.");
						thread.sleep(3000);
						System.out.println("\nYou say:\nWho are you?\n");
						thread.sleep(1000);
						System.out.println("Mysterious Figure:\n");
						System.out.println("You don't Remember? You don't remember the hell you put me through?");
						thread.sleep(2500);
						System.out.println("Well, that will make this more enjoyable. I might feel a bit guilty after though...");
						
					}
					
		
				
	}
	
	
}
