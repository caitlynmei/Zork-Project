package com.bayviewglen.zork.Item;

public interface Item {
	
	public int numItems = 0; 				// number of items
	
	public String name = "Item";			// name of item
	
	public String getName(); 				// returns name of item
	
	public String getDescription();			// get characteristic description for user
	
	public boolean equals(Item item);		// comparing items
		
	public void Increment();				// 
	
}
