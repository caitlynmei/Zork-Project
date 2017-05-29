package Tools;

import com.bayviewglen.zork.Item.Item;

public class Key implements Item{
	
	// can't be removed from inventory
	
	private String name;
	private String description; 
	private String chest; 
	private int type;
	private boolean LevelKey;
	
	

	public Key(String myName, String myChest){
		name = myName;
		chest = myChest.toUpperCase();
		
	}	
	public void setDescription(String myDescription){	
		description = myDescription;
	}
	
	public String getDescription(){
		return description;
	}

	public String getName() {
		
		return name;
	}
	
	public String getChest(){
		return chest;
	}


	public boolean equals(Item item) {
		if(name.equalsIgnoreCase(item.getName())){
			return true;
		}
		return false;
	}

	@Override
	public String itemType() {
		return "Key";
	}
	public int getType() {
		return type;
	}	
	public void setType(int type){
		this.type = type;
	}
	
	public boolean getlevelKey(){
		return LevelKey;
	}
	public void setLevelKey(boolean levelKey){
		this.LevelKey = levelKey;
	}
	
	public void changelevel(int currentLevel, boolean LevelKey){
		if(LevelKey)
			currentLevel++;
	}
}
