package org.com.strategypattern;

import org.com.datastore.DataStore;

abstract public class PumpGasUnit {
	DataStore ds;
	public PumpGasUnit(DataStore ds){
		this.ds = ds;
	}
	abstract public void pumpGasUnit();
}
