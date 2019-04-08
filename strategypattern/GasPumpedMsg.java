package org.com.strategypattern;

import org.com.datastore.DataStore;

abstract public class GasPumpedMsg {
	DataStore ds;
	public GasPumpedMsg(DataStore ds){
		this.ds = ds;
	}
	abstract public void gasPumpedMsg();
	
}
