package com.bayviewglen.zork;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.bayviewglen.zork.Item.Food;
import com.bayviewglen.zork.Item.Inventory;
import com.bayviewglen.zork.Item.Item;

/**
 * Class Game - the main class of the "Zork" game.
 *
 * Author: Michael Kolling Version: 1.1 Date: March 2000
 * 
 * This class is the main class of the "Zork" application. Zork is a very
 * simple, text based adventure game. Users can walk around some scenery. That's
 * all. It should really be extended to make it more interesting!
 * 
 * To play this game, create an instance of this class and call the "play"
 * routine.
 * 
 * This main class creates and initialises all the others: it creates all rooms,
 * creates the parser and starts the game. It also evaluates the commands that
 * the parser returns.
 */

class Game {
	static Thread thread = new Thread(); // thread for delays

	private Parser parser;
	private Room currentRoom;
	// This is a MASTER object that contains all of the rooms and is easily
	// accessible.
	// The key will be the name of the room -> no spaces (Use all caps and
	// underscore -> Great Room would have a key of GREAT_ROOM
	// In a hashmap keys are case sensitive.
	// masterRoomMap.get("GREAT_ROOM") will return the Room Object that is the
	// Great Room (assuming you have one).
	private HashMap<String, Room> masterRoomMap;

	Food apple = new Food("apple");
	
	private void initRooms(String fileName) throws Exception {
		masterRoomMap = new HashMap<String, Room>();
		Scanner roomScanner;
		try {
			HashMap<String, HashMap<String, String>> exits = new HashMap<String, HashMap<String, String>>();
			roomScanner = new Scanner(new File(fileName));
			while (roomScanner.hasNext()) {
				Room room = new Room();
				
				// Read the Name
				String roomName = roomScanner.nextLine();
				room.setRoomName(roomName.split(":")[1].trim());
				
				// Read the Description
				String roomDescription = roomScanner.nextLine();
				room.setDescription(roomDescription.split(":")[1].replaceAll("<br>", "\n").trim());
				
				// Read the Exits
				String roomExits = roomScanner.nextLine();
				
				// An array of strings in the format E-RoomName
				String[] rooms = roomExits.split(":")[1].split(",");
				HashMap<String, String> temp = new HashMap<String, String>();
				for (String s : rooms) {
					temp.put(s.split("-")[0].trim(), s.split("-")[1]);
				}

				exits.put(roomName.substring(10).trim().toUpperCase().replaceAll(" ", "_"), temp);

				// This puts the room we created (Without the exits in the
				// masterMap)
				masterRoomMap.put(roomName.toUpperCase().substring(10).trim().replaceAll(" ", "_"), room);

				// Now we better set the exits.
			}

			for (String key : masterRoomMap.keySet()) {
				Room roomTemp = masterRoomMap.get(key);
				HashMap<String, String> tempExits = exits.get(key);
				for (String s : tempExits.keySet()) {
					// s = direction
					// value is the room.

					String roomName2 = tempExits.get(s.trim());
					Room exitRoom = masterRoomMap.get(roomName2.toUpperCase().replaceAll(" ", "_"));
					roomTemp.setExit(s.trim().charAt(0), exitRoom);

				}

			}

			roomScanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the game and initialize its internal map.
	 */
	public Game() { // I got the levels thing, I'll finish it later - CM
		int currentLevel = 1;
		try {
			if (currentLevel == 1)
				initRooms("data/levels/level1.dat");
			else if (currentLevel == 2)
				initRooms("data/levels/level2.dat");
			else if (currentLevel == 3)
				initRooms("data/levels/level3.dat");
			else if (currentLevel == 4)
				initRooms("data/levels/level4.dat");
			currentRoom = masterRoomMap.get("ROOM_1");
		} catch (Exception e) {
			e.printStackTrace();
		}
		parser = new Parser();
	}

	public boolean resetLevel(int currentLevel){
		while (currentLevel > 0){ // the stuff in ("...") is wrong
			// stuff that has to be reset
			// can't right now since no one wrote an actual level
		}
		return false;
	}
	
	/**
	 * Main play routine. Loops until end of play.
	 */
	public void play() throws InterruptedException {
		printWelcome();
		System.out.println(currentRoom.longDescription());

		// Enter the main command loop. Here we repeatedly read commands and
		// execute them until the game is over.

		boolean finished = false;
		while (!finished) {
			Command command = parser.getCommand();
			finished = processCommand(command);
		}
		System.out.println("Thank you for playing. Good bye for now!");
	}

	/**
	 * Print out the opening message for the player.
	 */
	private void printWelcome() throws InterruptedException {

		System.out.println();
		System.out.println("Welcome to \'Anonymous'!");
		System.out.println();
		System.out.println("\'Anonymous\' is going to be the most incredible and mysterious adventure game you've ever seen!!");
		System.out.println("You play the game by entering commands with your keyboard when you see the \'>\' symbol.\n");
		System.out.println("You can also type \'help\' for a bit of advice.\n");
		thread.sleep(8000);
		System.out.println("Are you prepared for some serious challenges?");
		System.out.println();
		
		// And the game begins!!
		loading(); // displays loading message
		System.out.println();
		System.out.println("\nIt's dark. You hear a distant voice and open your eyes to find that you're in a cage.\n"
				+ "The cage is inside a dark airplane hanger. It is night time.\n");
		thread.sleep(6500);
		System.out.println("The ground is cold cement. You are wearing a T-Shirt and worn out jeans. You are also wearing"
				+ "\ndress shoes covered in dust. You don't remember who you are, where you came from or even what"
				+ "\n your name is.");
		System.out.println("A dark figure approaches the cage shown by the back light of the night sky.");
		thread.sleep(8000); 
		Dialogue.level0(); // Gaby, the word remember has a capital (can you change it?) -CM
		System.out.println();
	}

	// loading Method: prints the "Loading . . . . " message
	private void loading() throws InterruptedException {
		System.out.println();
		thread.sleep(1500); // delays code
		System.out.print("Loading");
		for (int i = 0; i < 4; i++) {
			System.out.print("   .");
			thread.sleep(1500);
		}

	}

	/**
	 * Given a command, process (that is: execute) the command. If this command
	 * ends the game, true is returned, otherwise false is returned.
	 * @throws InterruptedException 
	 */
	private boolean processCommand(Command command) throws InterruptedException {
		if (command.isUnknown()) {
			System.out.println("I don't know what you mean...");
			return false;
		}

		String commandWord = command.getCommandWord();
		
		// help commands
		if (commandWord.equalsIgnoreCase("help"))
			printHelp();
		else if (commandWord.equalsIgnoreCase("rules"))
			printGameRules();
		else if (commandWord.equalsIgnoreCase("commandlist"))
			printCommandList();
		// look command
		else if (commandWord.equalsIgnoreCase("look"))
			printLook(); 
		
		// directions
		else if (commandWord.equalsIgnoreCase("go")) // we need to work this, the person can't actually move that much... 
			goRoom(command);
		else if (commandWord.equalsIgnoreCase("north") || commandWord.equalsIgnoreCase("n"))
			goRoomDirection("north");
		else if (commandWord.equalsIgnoreCase("east") || commandWord.equalsIgnoreCase("e"))
			goRoomDirection("east");
		else if (commandWord.equalsIgnoreCase("south") || commandWord.equalsIgnoreCase("s"))
			goRoomDirection("south");
		else if (commandWord.equalsIgnoreCase("west") || commandWord.equalsIgnoreCase("w"))
			goRoomDirection("west");
		else if (commandWord.equalsIgnoreCase("up") || commandWord.equalsIgnoreCase("u"))
			goRoomDirection("up");
		else if (commandWord.equalsIgnoreCase("down") || commandWord.equalsIgnoreCase("d"))
			goRoomDirection("down");
		
		// Other command actions
		else if (commandWord.equalsIgnoreCase("eat") || commandWord.equalsIgnoreCase("drink"))
			System.out.println("Do you really think you should be having a meal at a time like this?");
		else if (commandWord.equalsIgnoreCase("hi"))
			System.out.println("Hi back! What's up?");
		
		// Inventory actions
		else if (commandWord.equalsIgnoreCase("take"))
			Inventory.add(apple); // make this method -CM
		else if (commandWord.equalsIgnoreCase("drop"))
			removeItem(command); // make this method -CM
				
		// else if (commandWord.equals("inventory"))
		// printInventory(command);
		
		// quit command 
		else if (commandWord.equalsIgnoreCase("quit")) {
			if (command.hasSecondWord())
				System.out.println("Would you like to save your progress?"); // make data file!!
			else
				return true; // signal that we want to quit <-- we need to do
								// this -CM
		}
		return false;
	}

	/* method prints inventory -CM
	private void printInventory(Command command) {
		System.out.println("You have: ");
		if (bag.getNumItems() == 0) {
			System.out.println("You have nothing right now.");
		} else {
			for (int i = 0; i < bag.getNumItems(); i++) {
				Item currentItem = bag.getInventory().get(i);
				if (currentItem != null) {
					System.out.println(currentItem.getDescription());
				}
			}
		}
	}
	*/

	private void printLook() {
		// in here: boolean to check which level
		// 			have to link this to level description later
		
	}

	// method lets you store items in inventory. I got this -CM
	private void getItem(Command command) {
		// TODO Auto-generated method stub
	}

	// method lets you remove items in inventory. -CM
	private void removeItem(Command command) {
		// TODO Auto-generated method stub

	}

	/**
	 * Print out some help information. Here we print some stupid, cryptic
	 * message and a list of the command words.
	 * @throws InterruptedException 
	 */
	private void printHelp() throws InterruptedException {
		loading();
		System.out.println("\n");
		System.out.println("You are lost. You are going to die alone and forever be forgotten.");
		System.out.println();
		thread.sleep(6000);
		System.out.println("Just joking!! :)");
		System.out.println("Don't worry. We will help guide you through this:");
		System.out.println("- to see the game rules, enter: \'rules\'");
		System.out.println("- to see the list of commands you may use, enter: \'commandlist\'");
	}

	private void printGameRules() throws InterruptedException{
		loading();
		System.out.println("\n");
		System.out.println("Remember what your goal is. Here is a refresher of the game rules. \n");
		System.out.println("**Whatever the rules end up being... ");
	}
	
	private void printCommandList() throws InterruptedException{
		loading();
		System.out.println("\n");
		System.out.println("You can try using the following command words:");
		parser.showCommands(); // prints command words from validCommands String 
		System.out.println("Yes, you can call for help if you need it (like what you are doing right now)\n");
	}
	
	/**
	 * Try to go to one direction. If there is an exit, enter the new room,
	 * otherwise print an error message. 
	 * 
	 * This method is for when the user types in "go" as first word
	 */
	private void goRoom(Command command) {		
		// if there is no second word, we don't know where to go...
		if (!command.hasSecondWord()) {
			System.out.println("Go where? (*Hint: direction)");
			return;
		}
		
		// String direction = command.getSecondWord(); original

		String secondWord = command.getSecondWord();
		String direction = "";
		if (secondWord.equalsIgnoreCase("north") || secondWord.equalsIgnoreCase("n"))
			direction = "north";
		else if (secondWord.equalsIgnoreCase("east") || secondWord.equalsIgnoreCase("e"))
			direction = "east";
		else if (secondWord.equalsIgnoreCase("south") || secondWord.equalsIgnoreCase("s"))
			direction = "south";
		else if (secondWord.equalsIgnoreCase("west") || secondWord.equalsIgnoreCase("w"))
			direction = "west";
		else if (secondWord.equalsIgnoreCase("up") || secondWord.equalsIgnoreCase("u"))
			direction = "up";
		else if (secondWord.equalsIgnoreCase("down") || secondWord.equalsIgnoreCase("d"))
			direction = "down";
		else {
			System.out.println();
			System.out.println("That is not a valid direction.");
			System.out.println("Please enter \'commandlist\' to see the valid directions.");
		}
		
		// Try to leave current room.
		Room nextRoom = currentRoom.nextRoom(direction);

		if (nextRoom == null){
			System.out.println();
			System.out.println("There is no exit here!");
		} else {
			currentRoom = nextRoom;
			System.out.println(currentRoom.longDescription());
		}
	}
	
	/*
	 * This method determines whether the player can move in a direction. This is for 
	 * when the player directly types in the direction, and not "go" first. 
	 */
	private void goRoomDirection(String direction){
		
		// Try to leave current room.
		Room nextRoom = currentRoom.nextRoom(direction);

		if (nextRoom == null)
			System.out.println("There is no door!");
		else {
			currentRoom = nextRoom;
			System.out.println(currentRoom.longDescription());
		}
	}

}