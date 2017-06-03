package com.bayviewglen.zork;

import java.util.ArrayList;
import java.util.Scanner;

public class DialogueLevel4 {

	public DialogueLevel4() {
		// TODO Auto-generated constructor stub
	}
	
	public static void LevelIntro() throws InterruptedException{ //level start
		System.out.println("LEVEL 4 - FINAL LEVEL\n\n" );
		System.out.println("You wake up and look around you");
		Thread.sleep(2000);
		System.out.println("*sniff*");
		Thread.sleep(2000);
		System.out.println("You smell the scent of ashes");
		Thread.sleep(2000);
		System.out.println("You look around to see that you are in a cave.");
		Thread.sleep(2000);
		
	}
	
	public static void personOne() throws InterruptedException{
		Scanner keyboard = new Scanner(System.in); 
	
		Thread.sleep(1000);
		System.out.println("\nYou think about what to do. You think to yourself\n");
		Thread.sleep(2000);
		System.out.println("\t\"Approach them\" - \"Ignore\"\n" );
		Thread.sleep(2000);
		System.out.println("What do you do?");
		System.out.print(">");
		String temp = "";
		boolean valid = false;
		while (!valid){
		
		temp = keyboard.nextLine().toUpperCase();
		if(temp.equals("APPROACH") || temp.equals("APPROACH THEM") || temp.equals("IGNORE")){
			valid = true;
		}else if(temp.equals("HELP")){
			System.out.println("\nType what you are thinking.");
		}
		else{
			System.out.println("That doesn't appear in your thoughts...");
			System.out.print(">");
		}
			
		
		if(temp.equals("APPROACH")|| temp.equals("APPROACH THEM")){
		
			System.out.println("You approach the figure. As you get closer the figure turns around");
			Thread.sleep(1000);
			System.out.println("\"AAHHHHH\" you scream");
			Thread.sleep(1000);
			System.out.println("\nYou think about what to say. You think to yourself\n");
			Thread.sleep(2000);
			System.out.println("\t\"Hi\" - \"Help\"\n" );
			Thread.sleep(2000);
			System.out.println("What do you say?");
			System.out.print(">");
			temp = "";
			valid = false;
			while (!valid){
			
			temp = keyboard.nextLine().toUpperCase();
			if(temp.equals("HI") || temp.equals("HELP")){
				valid = true;
			}else{
				System.out.println("That doesn't appear in your thoughts...");
				System.out.print(">");
			}
			}
				System.out.println("You say " + temp);
				Thread.sleep(2000);
				System.out.println("The creature starts to shake and mumble an unknown language");
				Thread.sleep(2000);
				
				String random = "ABCDEFGHIJKLMNOPQRSTUVWQYZabcdefghijklmnopqrstuvwqyz";
				int randomInt;
				for(int i =0; i<20;i++){
					 randomInt = (int)(Math.random()*random.length());
					System.out.print(random.substring(randomInt, randomInt+1));
					Thread.sleep(50);
				}
				Thread.sleep(1000);
				System.out.println("\nThe walls start to shake and crack");
				Thread.sleep(2000);
				System.out.println("You duck for cover.");
				Thread.sleep(2000);
				System.out.println("When the shaking stops, you look up to see an \"L\" carved into the wall.");
				Thread.sleep(2500);
				System.out.println("The figure returns to the corner and turns around. As if nothing happened.");
				Thread.sleep(2500);
				System.out.println("You think to yourself. \"Maybe this L will be valuable to me in the future?\" and continue on your journey.");
				Thread.sleep(4000);
			
				
		
		} 
	
		}
	
		}
	

	public static void levelEnd(){
		
	}
	
	public static boolean keyWord() throws InterruptedException{
		Scanner keyboard = new Scanner(System.in);
		String temp = "";
		Thread.sleep(1500);
		System.out.println("There is a chest in front of you. There is a digital Screen with 4 blank spaces:");
		Thread.sleep(2000);
	
		while(!temp.equals("LEAVE")){
		System.out.println("\n __  __  __  __" );
		Thread.sleep(2000);
		System.out.println("\nIf you want to open the chest, you have to type the correct Phrase: ");
		System.out.print(">");
		temp = keyboard.nextLine().toUpperCase();
		if(temp.equals("LAVA")){
			System.out.println("Correct. The chest pops open.");
			return true;
		} if(temp.equals("LEAVE")){
			System.out.println("You Leave.");
			Thread.sleep(2000);
		}else{
		System.out.println("Incorrect keyword.");
		System.out.println("To leave, enter \"leave\"");
		Thread.sleep(1500);
		}
		}
		
	return false;	
	}
	
}
