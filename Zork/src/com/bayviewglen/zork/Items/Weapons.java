package com.bayviewglen.zork.Items;

public class Weapons implements Items  {

	private int Damage;
	private int Durability;
	private int weight;
	private String Name;
	
	public Weapons(int Damage,int Durability, int Weight, String Name){
		this.Damage = Damage;
		this.Durability = Durability;
		this.weight = Weight;
		this.Name = Name;
	}
	public int getDur(){
		return Durability;
	}
	public int getDam(){
		return Damage;
	}
	public int getwei(){
		return weight;
	}
	
	public String getname(){
		return Name;
	}
	
	
	@Override
	public void Name(String Name) {
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
