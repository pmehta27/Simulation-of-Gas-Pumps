package org.com.strategypattern;

import org.com.datastore.DataStore;

abstract public class ReturnCash {
	DataStore ds;
	public ReturnCash(DataStore ds){
		this.ds = ds;
	}
	abstract public void returnCash();
}
