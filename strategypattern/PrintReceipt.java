package org.com.strategypattern;

import org.com.datastore.DataStore;

abstract public class PrintReceipt {

	DataStore ds;
	public PrintReceipt(DataStore ds){
		this.ds = ds;
	}
	abstract public void printReceipt();
}
