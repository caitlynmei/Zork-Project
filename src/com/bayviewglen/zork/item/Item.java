package com.bayviewglen.zork.item;

public interface Item {
	

	
	public String name = "Item";			// name of item
	
	public String getName(); 				// returns name of item
	
	public String getDescription();			// get characteristic description for user
	
	public boolean equals(Item item);		// comparing items
	
	public String itemType();

	
	
	
}
