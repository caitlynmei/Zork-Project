package com.bayviewglen.zork;

public interface Items {

	public String Name = "Item";
	
	public void Name (String Name);	
	
	public boolean equals(Items item);
	
	public int amount = 0; 
	
	public void Increment();
	
}
