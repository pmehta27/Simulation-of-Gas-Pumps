package org.com.strategypattern;

import org.com.datastore.DataStore;

abstract public class StorePin {
	DataStore ds;
	public StorePin(DataStore ds){
		this.ds = ds;
	}
	abstract public void storePin();
}
