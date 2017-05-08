package com.bayviewglen.zork;

import java.util.ArrayList;

public class Inventory {
	//this is assuming the items inputted are actual items
	private ArrayList<Items> bag = new ArrayList<Items>(); // Mr.D said to change object to item
	private int maxInv = 15;
	public Inventory(ArrayList<Items> myBag){
		bag = myBag;
		maxInv--;
	}
	
	public void add(Items addMe){
		
		if(maxInv != 0 ){
		bag.add(addMe);
		} else{
			System.out.println("Bag is full!");
		}
		
	}
	
	public void toss(Items tossMe){
		bag.remove(findIndex(tossMe));
		System.out.println("You have tossed " + tossMe);
	}

	//method to find the item in the list
	private int findIndex(Items item) {
		
		for(int i = 0; i<bag.size(); i++){
			if(bag.get(i).Equals(item)){
				return i;
			}
		}
		return -1;
	}

}
