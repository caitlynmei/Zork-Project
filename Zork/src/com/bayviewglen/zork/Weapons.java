package com.bayviewglen.zork;

public abstract class Weapons implements Items {

	private int Damage;
	private int Durability;
	private int weight;
	private String Name;
	
	public Weapons(int Damage,int Durrability, int Weight, String Name){
		this.Damage = Damage;
		this.Durability = Durrability;
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
	public void setdur(int newDurabillity){
		this.Durrability = newDurabillity;
	}
	
	
}
