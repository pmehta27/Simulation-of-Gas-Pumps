package org.com.strategypattern;

import org.com.datastore.DataStore;

abstract public class StorePrices {
	
	DataStore ds;
	public StorePrices(DataStore ds){
		this.ds = ds;
	}
	public abstract void storePrices();
}
