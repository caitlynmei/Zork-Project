package snippet;

public class Snippet {
	 thread.sleep(1500);
			System.out.println("The clouds around you start to disappear one by one.");
			thread.sleep(2000);
			System.out.println("\n\nYou think about what to do. You think to yourself\n");
			thread.sleep(2000);
			System.out.println("\t\"Hang onto the chest\" - \"Do Nothing\" - \"Close your eyes\"\n" );
			thread.sleep(2000);
			System.out.println("What do you do?");
			System.out.print(">");
			String temp = "";
			
			boolean valid = false;
			while(!valid){
				temp = keyboard.nextLine().toUpperCase();	
			if(temp.equals("HANG ONTO THE CHEST") || temp.equals("HANG ONTO CHEST") || temp.equals("DO NOTHING") || temp.equals("NOTHING")|| temp.equals("CLOSE YOUR EYES") || temp.equals("CLOSE EYES")){
				valid = true;
			}else if(temp.equals("HELP")){
				System.out.println("\nType what you want to do.");
				System.out.print(">");
				temp = "";
			}else{
				System.out.println("That doesn't appear in your thoughts.");
				temp = "";
			}
			}
			
			if(temp.equals("HANG ONTO CHEST") || temp.equals("HANG ONTO CHEST")){
		
				System.out.println("As you go to hang onto the chest, it disappears. You fall on your face.");
				thread.sleep(3000);
				
				System.out.println("The clouds around you keep disappearing.");
				thread.sleep(2500);
				System.out.println("\n\nYou think about what to do. You think to yourself\n");
				thread.sleep(2500);
				System.out.println("\t \"Do Nothing\" - \"Close your eyes\"\n" );
				thread.sleep(2000);
				System.out.println("What do you do?");
				System.out.print(">");
				
				temp = "";
				valid = false;
				while(!valid){
					temp = keyboard.nextLine().toUpperCase();	
				if(temp.equals("DO NOTHING") || temp.equals("NOTHING")|| temp.equals("CLOSE YOUR EYES") || temp.equals("CLOSE EYES")){
					valid = true;
				}else if(temp.equals("HELP")){
					System.out.println("\nType what you want to do.");
				}
				}
				
				if(temp.equals("DO NOTHING")|| temp.equals("NOTHING")){
					
					System.out.println("You watch as the clouds around you disappear.");
					thread.sleep(2000);
					System.out.println("You see the clouds beneath you disappear.");
					thread.sleep(2000);
					System.out.println("You Fall. Everything goes dark.\n");
				} else{
					
					System.out.println("You close your eyes, and hope for the best.");
					thread.sleep(2000);
					System.out.println("The anticipation is high and you anxiously wait for the cloud beneath you to disappear.");
					thread.sleep(2000);
					System.out.println("You feel a falling sensation and lose conciousness.\n");
				}
				
				
			}else if(temp.equals("DO NOTHING")){
				
				System.out.println("You watch as the clouds around you disappear.");
				thread.sleep(2000);
				System.out.println("You see the clouds beneath you disappear.");
				thread.sleep(2000);
				System.out.println("You Fall. Everything goes dark.\n");
			}else{
				
				System.out.println("You close your eyes, and hope for the best.");
				thread.sleep(2000);
				System.out.println("The anticipation is high and you anxiously wait for the cloud beneath you to disappear.");
				thread.sleep(2000);
				System.out.println("You feel a falling sensation and lose conciousness.\n");
			}
			
			thread.sleep(3000);
			System.out.println("You see a child skipping on a hot summers day.");
			thread.sleep(3000);
			System.out.println("\"Do I know her?\" you ask yourself.");
			thread.sleep(3000);
			System.out.println("She starts skipping away from you.");
			thread.sleep(3000);
			System.out.println("\"Wait!\" you call.");
			thread.sleep(3000);
			System.out.println("\nEverything fades to black");
	
		
	}
	
}

