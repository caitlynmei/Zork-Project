package com.bayviewglen.zork.Item;

public class Food implements Item {

	private String name;
	
	public Food(){
		// nothing to do yet...
	}
	
	public Food(String name){
		this.name = name;
	}	

	@Override
	public String getName() {
		
		return name;
	}


	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(Item item) {
		if(name.equalsIgnoreCase(item.getName())){
			return true;
		}
		return false;
	}

	@Override
	public String itemType() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}