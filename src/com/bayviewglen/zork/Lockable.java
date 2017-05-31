package com.bayviewglen.zork;

import com.bayviewglen.zork.tool.Key;

public interface Lockable {
	//Used for Locking Chest and Rooms

	//checks if object is locked.
	public boolean isLocked(); 
	
	//lock and unlock, returns true if successful
	public boolean unlock(Key key);
}
