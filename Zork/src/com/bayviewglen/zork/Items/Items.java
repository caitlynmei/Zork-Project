package com.bayviewglen.zork.Items;

public interface Items {
	
	public int amount = 0; 
	
	public void getName(String Name);	 	// get Name of item
	
	public boolean equals(Items item);		// comparing items
		
	public void Increment();				
	
}
