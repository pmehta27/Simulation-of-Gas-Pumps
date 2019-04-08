package org.com.strategypattern;

import org.com.datastore.DataStore;

abstract public class SetValueM {
	DataStore ds;
	public SetValueM(DataStore ds){
		this.ds = ds;
	}
	abstract public void setValueM();
}
