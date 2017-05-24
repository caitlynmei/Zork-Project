package com.bayviewglen.zork.Item;

public abstract class Chest extends Unmoveables{

	private boolean locked;
	private boolean key;
	public Chest() {

	}
	
	public boolean Opens(){
		return true;

		
	}
	public void isLocked(){
		this.locked = true;
	}
	public void setlocked(boolean key){
		this.locked = key;
	}
	
	public boolean CheckisLocked(){
		return locked;
		

	}
	
	public String contains(){
		return null;


	}

	
}
