package com.bayviewglen.zork.unmoveables;


import java.util.ArrayList;

import com.bayviewglen.zork.Lockable;
import com.bayviewglen.zork.item.Item;
import com.bayviewglen.zork.tool.Key;

public class Chest implements Lockable{

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
	private static int findIndex(Item item) {
		
		for(int i = 0; i<Chest.size(); i++){
			if(Chest.get(i).equals(item)){
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean isLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unlock(Key key) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
