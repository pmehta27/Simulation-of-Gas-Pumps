package org.com.strategypattern;

import org.com.datastore.DataStore;

abstract public class InitializeData {
	DataStore ds;
	public InitializeData(DataStore ds){
		this.ds = ds;
	}
	public abstract void initializeData();
}
