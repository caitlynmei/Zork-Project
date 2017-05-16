package com.bayviewglen.zork.Items;

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
	@Override
	public void Increment() {
		// TODO Auto-generated method stub		
	}
		
	public int getDur(){
		return durability;
	}
	
	public int getDam(){
		return damage;
	}
		
}
