package org.com.strategypattern;

import org.com.datastore.DataStore;

abstract public class SetInitialValues {
	DataStore ds;
	public SetInitialValues(DataStore ds){
		this.ds = ds;
	}
	abstract public void setInitialValues();

}
