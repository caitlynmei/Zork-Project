package com.bayviewglen.zork.Items;

import java.util.ArrayList;

public class Inventory {
	//this is assuming the items inputed are actual items
	private ArrayList<Items> bag = new ArrayList<Items>(); // Mr.D said to change object to item
		
	public Inventory(ArrayList<Items> myBag){
		bag = myBag;
	}
	
	public Items get(Items getMe){
	
		return bag.get(findIndex(getMe));
	}
	
	public void add(Items addMe){
		
		if(addMe.numItems == 0){
			bag.add(addMe);
			
		}else{
			bag.add(addMe);
			addMe.Increment();
	
		}
	}
	
	public void toss(Items tossMe){
		bag.remove(findIndex(tossMe));
		System.out.println("You have tossed " + tossMe);
	}
	
	//prints inventory 
	public void print(){
		
		for(Items x : bag){
			System.out.println(x);
		}
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
