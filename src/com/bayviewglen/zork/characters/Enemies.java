package com.bayviewglen.zork.characters;

public class Enemies implements Characters {
	
	private String enemiesName;
	private String enemiesDescription;
	private int enemiesHealth;
	private int enemiesArmour;
	private int enemiesDamage;

	public Enemies(){
		//Default Constructor
		enemiesName = "grunt";
		enemiesDescription = "gaby";
		enemiesHealth = 1;
		enemiesArmour = 0;
		enemiesDamage = 1;
	}
	public String Description(){
		return "It is a "+ enemiesName+ " be careful!";
	}
	
	public String LongDescription(){
		return "It is a " + enemiesName+ "\n It has "+ enemiesHealth + " and "+enemiesArmour;
	}
	
	public String getEnemiesName(){
		return enemiesName;
	}
	public void setEnemiesName(String enemiesName){
		this.enemiesName = enemiesName;
	}
	
	public String getEnemiesDescriptions(){
		return enemiesDescription;
	}
	public void setEnemiesDescriptions(String enemiesDescription){
		this.enemiesDescription = enemiesDescription;
		
	}
	public void setEnemiesHealth(int enemiesHealth){
		this.enemiesHealth = enemiesHealth;
	}
	public void setEnemiesArmour(int enemiesArmour){
		this.enemiesArmour = enemiesArmour;
	}
	public int getEnemiesHealth(){
		return enemiesHealth;
	}
	public int getEnemiesArmour(){
		return enemiesArmour;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(Characters Characters) {
		// TODO Auto-generated method stub
		return false;
	}

}
