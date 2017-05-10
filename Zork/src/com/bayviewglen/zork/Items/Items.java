package com.bayviewglen.zork.Items;

public interface Items {
	
	public int numItems = 0; 				// number of items
	
	public String name = "Item";			// name of item
	
	public String getName(); 				// returns name of item
	
	public String getDescription();			// get characteristic description for user
	
	public boolean equals(Items item);		// comparing items
		
	public void Increment();				// 
	
}
