package com.bayviewglen.zork.Item;

public class SecondKey implements Item{
	
	// can't be removed from inventory
	
	private String name = "Sea Key";
	private String description = "This is a silver key which you bravely fought "
			+ "to obtain from the Midnight Zone of the Sea World in Level 2.";
	
	public SecondKey(){
		// nothing to do yet...
	}
	
	public SecondKey(String name){
		this.name = name;
	}	

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public boolean equals(Item item) {
		if(name.equalsIgnoreCase(item.getName())){
			return true;
		}
		return false;
	}	
}
