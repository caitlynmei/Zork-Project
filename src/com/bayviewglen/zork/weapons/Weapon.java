package com.bayviewglen.zork.weapons;

import com.bayviewglen.zork.item.Item;

public abstract class Weapon implements Item  {
	
	private String name;
	private int damage;
	private int durability;
	
	public Weapon(String name, int damage, int durability){
		this.name = name;
		this.damage = damage;
		this.durability = durability;
	}
	
	public String getName(){
		return name;
	}
		
	public abstract String getDescription();
	
	@Override
	public boolean equals(Item item) {
		// TODO Auto-generated method stub
		return false;
	}

		
	public int getDur(){
		return durability;
	}
	
	public int getDam(){
		return damage;
	}
		
}
