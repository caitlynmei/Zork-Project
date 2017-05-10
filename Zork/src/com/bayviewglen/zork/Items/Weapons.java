package com.bayviewglen.zork.Items;

public class Weapons implements Items  {
	
	private String Name;
	private int Damage;
	private int Durability;
	
	public Weapons(String Name, int Damage, int Durability){
		this.Name = Name;
		this.Damage = Damage;
		this.Durability = Durability;
	}
	
	public String getName(){
		return Name;
	}
	
	public int getDur(){
		return Durability;
	}
	
	public int getDam(){
		return Damage;
	}
	
	@Override
	public void getName(String Name) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean equals(Items item) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void Increment() {
		// TODO Auto-generated method stub
		
	}
	
	
}
