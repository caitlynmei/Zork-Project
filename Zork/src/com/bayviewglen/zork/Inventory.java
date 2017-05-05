package com.bayviewglen.zork;

import java.util.ArrayList;

public class Inventory {

	private ArrayList<Object> bag = new ArrayList<Object>(); // Mr.D said to change object to item
	
	public Inventory(ArrayList<Object> myBag){
		bag = myBag;
	}

}
