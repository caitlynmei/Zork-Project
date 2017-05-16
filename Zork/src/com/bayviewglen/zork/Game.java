package com.bayviewglen.zork;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

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

	public ArrayList<Object> bag = new ArrayList<Object>();

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
	public Game() {
		try {
			initRooms("data/levels/level1.dat");
			currentRoom = masterRoomMap.get("ROOM_1");
		} catch (Exception e) {
			e.printStackTrace();
		}
		parser = new Parser();
	}

	/**
	 * Main play routine. Loops until end of play.
	 */
	public void play() throws InterruptedException {
		printWelcome();

		// Enter the main command loop. Here we repeatedly read commands and
		// execute them until the game is over.

		boolean finished = false;
		while (!finished) {
			Command command = parser.getCommand();
			finished = processCommand(command);
		}
		System.out.println("Thank you for playing.  Good bye.");
	}

	/**
	 * Print out the opening message for the player.
	 */
	private void printWelcome() throws InterruptedException {

		System.out.println();
		System.out.println("Welcome to \'WhateverWeCallThis\'!");
		System.out.println();
		System.out.println("\'WhateverWeCallThis\' is going to be the most incredible adventure game you've ever seen!!");
		System.out.println("You play the game by typing commands with your keyboard when you see the \'>\' symbol.");
		System.out.println("You can type \'help\' for a refresher of the game rules.\n");
		thread.sleep(8000);
		System.out.println("Get ready for some serious challenges! Ready??");
		System.out.println();
		
		// And the game begins!!
		loading(); // displays loading message
		System.out.println();
		System.out.println("\nIt's dark. You hear a distant voice and open your eyes to find that you're in a cage.\n"
				+ "The cage is inside a dark airplane hanger. It is night time.\n");
		thread.sleep(6500);
		System.out.println("The ground is cold cement. You are wearing a T-Shirt and worn out jeans. "
				+ "You are also wearing dress shoes covered in dust.\n"
				+ "You don't remember who you are, where you came from or even what your name is.\n"
				+ "A dark figure approaches the cage shown by the back light" + " of the night sky.");
		thread.sleep(8000);
		Dialogue.level0();
		System.out.println();
	}

	// loading Method: prints the "Loading . . . . " message
	private void loading() throws InterruptedException {

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
		if (commandWord.equals("help"))
			printHelp();
		else if (commandWord.equals("go"))
			goRoom(command);
		else if (commandWord.equals("take"))
			getItem(command); // make this method -CM
		else if (commandWord.equals("drop"))
			removeItem(command); // make this method -CM
		// else if (commandWord.equals("inventory"))
		// printInventory(command);
		else if (commandWord.equals("quit")) {
			if (command.hasSecondWord())
				System.out.println("Quit what?");
			else
				return true; // signal that we want to quit <-- we need to do
								// this -CM
		} else if (commandWord.equals("eat")) {
			System.out.println("Do you really think you should be eating at a time like this?");
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

	// method lets you store items in inventory. I got this -CM
	private void getItem(Command command) {
		// TODO Auto-generated method stub
	}

	// method lets you remove items in inventory. -CM
	private void removeItem(Command command) {
		// TODO Auto-generated method stub

	}

	// implementations of user commands:
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
		System.out.println("Don't worry. We will help guide you through this.");
		System.out.println();
		System.out.println("Remember what your goal is. This is a refresher of the game rules. \n");
		System.out.println("You can try using the following command words:");
		parser.showCommands(); // prints command words from validCommands String (or the word1)
		System.out.println("Yes, you can call for help if you need it (like what you are doing right now)");
	}

	/**
	 * Try to go to one direction. If there is an exit, enter the new room,
	 * otherwise print an error message.
	 */
	private void goRoom(Command command) {
		if (!command.hasSecondWord()) {
			// if there is no second word, we don't know where to go...
			System.out.println("Go where?");
			return;
		}

		String direction = command.getSecondWord();

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