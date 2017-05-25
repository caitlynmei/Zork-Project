package com.bayviewglen.zork.Item;

public class Tool implements Item{
			
	private String name;
	
	public Tool(String myName){
		name = myName;
		
	}
	


	@Override
	public boolean equals(Item item) {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}



	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String itemType() {
		return "Tool";
	}




}



