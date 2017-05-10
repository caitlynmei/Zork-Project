package com.bayviewglen.zork.Items;

public abstract class Weapons implements Items  {
	
	private String name;
	private int damage;
	private int durability;
	
	public Weapons(String name, int damage, int durability){
		this.name = name;
		this.damage = damage;
		this.durability = durability;
	}
	
	public String getName(){
		return name;
	}
		
	public abstract String getDescription();
	
	@Override
	public boolean equals(Items item) {
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
