package com.bayviewglen.zork.Item;

public class Food implements Item {

	private String name;
	private int damage;
	private int durability;
	
	public Food(){
		
	}
	
	public Food(String name){
		this.name = name;
	}	

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(Item item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void Increment() {
		// TODO Auto-generated method stub
		
	}
}