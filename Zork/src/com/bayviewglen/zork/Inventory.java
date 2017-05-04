package com.bayviewglen.zork;

import java.util.ArrayList;

public class Inventory {

	private ArrayList<Object> bag = new ArrayList<Object>();
	
	public Inventory(Object item){
		bag.add(item);
	}
}
