package com.bayviewglen.zork;

import java.util.Scanner;

public class DialogueLevel4 {

	public DialogueLevel4() {
		// TODO Auto-generated constructor stub
	}
	
	public static void LevelIntro() throws InterruptedException{ //level start
		
		System.out.println("You wake up and look around you");
		Thread.sleep(2000);
		System.out.println("*sniff*");
		Thread.sleep(2000);
		System.out.println("You smell the scent of ashes");
		Thread.sleep(2000);
		System.out.println("You look around to that you are in a cave. Is this a Volcano?");
		Thread.sleep(2000);
		
	}
	
	public static void personOne() throws InterruptedException{
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("You see a cloaked figure in the corner");
		Thread.sleep(5000);
		System.out.println("\n\nYou think about what to do. You think to yourself\n");
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
			Thread.sleep(100);
			System.out.println("\"AAHHHHH\" you scream");
			
		
		} else{
			System.out.println("You ignore it. Which direction would you like to go?");
		}
	
		}
	
		}
	
	
	public static void levelEnd(){
		
	}
	
	public static boolean keyWord() throws InterruptedException{
		Scanner keyboard = new Scanner(System.in);
		String temp = "";
		System.out.println("There is a chest in front of you. There is a digital Screen with 4 blank spaces:");
		Thread.sleep(2000);
	
		while(!temp.equals("LEAVE")){
		System.out.println("__  __  __  __" );
		Thread.sleep(2000);
		System.out.println("If you want to open the chest, you have to type the correct Phrase: ");
		System.out.print(">");
		temp = keyboard.nextLine().toUpperCase();
		if(temp.equals("LAVA")){
			return true;
		}
		System.out.println("To leave, enter \"leave\"");
		Thread.sleep(2000);
		}
		
	return false;	
	}
	
}
