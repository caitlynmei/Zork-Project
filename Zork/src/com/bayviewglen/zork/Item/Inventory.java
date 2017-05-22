package com.bayviewglen.zork.Item;

import java.util.ArrayList;

public class Inventory {
	//this is assuming the items inputed are actual items
	private static ArrayList<Item> bag = new ArrayList<Item>(); // Mr.D said to change object to item
		
	public Inventory(ArrayList<Item> myBag){
		bag = myBag;
	}
	
	public Item get(Item getMe){
	
		return bag.get(findIndex(getMe));
	}
	
	public static void add(Item addMe){
		if(addMe.numItems == 0){
			bag.add(addMe);
		} else {
			bag.add(addMe);
			addMe.Increment();
		}
	}
	
	public void toss(Item tossMe){
		bag.remove(findIndex(tossMe));
		System.out.println("You have tossed " + tossMe);
	}
	
	//prints inventory 
	public static void printInventory(){
		
		for(Item x : bag){
			System.out.println(x);
		}
	}

	// method to find the item in the list
	private int findIndex(Item item) {
		
		for(int i = 0; i<bag.size(); i++){
			if(bag.get(i).equals(item)){
				return i;
			}
		}
		return -1;
	}

}
