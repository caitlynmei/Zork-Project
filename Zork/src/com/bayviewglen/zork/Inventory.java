package com.bayviewglen.zork;

import java.util.ArrayList;

public class Inventory {
	//this is assuming the items inputed are actual items
	private ArrayList<Items> bag = new ArrayList<Items>(); // Mr.D said to change object to item
	private int maxInv = 15;
	
	public Inventory(ArrayList<Items> myBag){
		bag = myBag;
	}
	
	public Items get(Items getMe){
	
		return bag.get(findIndex(getMe));
	}
	
	public void add(Items addMe){
		
		if(maxInv != 0 && addMe.amount == 0){
			bag.add(addMe);
			maxInv --;
		}else if(maxInv != 0){
			bag.add(addMe);
			addMe.Increment();
			maxInv --;
		}else{
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
			if(bag.get(i).equals(item)){
				return i;
			}
		}
		return -1;
	}

}
