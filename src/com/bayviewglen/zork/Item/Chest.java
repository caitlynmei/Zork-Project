package com.bayviewglen.zork.Item;


import java.util.ArrayList;

import Tools.Key;

public abstract class Chest extends Unmoveables{

	private boolean locked;
	private String name;
	
	private static ArrayList<Item> Chest;

	public Chest() {
		name = "Chest";
		locked = false;
	}
	public Chest(String myName){
		name = myName.toUpperCase();
		locked = false;
	}
	public String getName(){
		return name;
	}
	
	public boolean Open(){
		return true;
		
	}
	
	public void isLocked(){
		locked = true;
	}
	
	public void lockChest(){
		locked = false;
	}
	
	public boolean unlockChest(Key myKey, Chest myChest){
		if(myKey.getChest().equals(name)){
			return true;
		}
		return false;
	}
	


	public boolean CheckisLocked(){
		return locked;
		

	}
	
	public String contains(){
		return " " +  Chest; //<-- make prettier


	}

	
}
