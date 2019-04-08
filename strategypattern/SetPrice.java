package org.com.strategypattern;

import org.com.datastore.DataStore;

abstract public class SetPrice {

	DataStore ds;
	public SetPrice(DataStore ds){
		this.ds = ds;
	}
	abstract public void setPrice(int g);
	
}
