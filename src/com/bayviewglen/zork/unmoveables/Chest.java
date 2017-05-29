package com.bayviewglen.zork.unmoveables;


import java.util.ArrayList;

import com.bayviewglen.zork.item.Item;
import com.bayviewglen.zork.tool.Key;

public class Chest extends Unmoveables{

	private boolean locked;
	private String name;
	private String description;
	
	private static ArrayList<Item> Chest;

	public Chest() {
		name = "Chest";
		locked = false;
		description = "this is a Chest";
	}
	
	public Chest(String myName){
		name = myName.toUpperCase();
		locked = false;
	}
	public String getName(){
		return name;
	}
	
	public void addItem(Item myItem){
		Chest.add(myItem);
	}
	
	public void removeItem(Item myItem){
		if(Chest.size() >= 0){

		Chest.remove(findIndex(myItem));
			
		}
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
	@Override
	public String itemType() {
		return "chest";
	}

	private static int findIndex(Item item) {
		
		for(int i = 0; i<Chest.size(); i++){
			if(Chest.get(i).equals(item)){
				return i;
			}
		}
		return -1;
	}

	
}
