package com.bayviewglen.zork.Items;

public abstract class Chest extends Unmoveables{

	public Chest() {

	}
	
	public boolean Opens(){
		return true;

		
	}
	
	public boolean isLocked(){
		return true;
		

	}
	
	public String contains(){
		return null;


	}

	
}
