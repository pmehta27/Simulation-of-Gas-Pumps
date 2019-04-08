package org.com.strategypattern;

import org.com.datastore.DataStore;

abstract public class StoreCash {
	DataStore ds;
	public StoreCash(DataStore ds){
		this.ds = ds;
	}
	abstract public void storeCash();
}
