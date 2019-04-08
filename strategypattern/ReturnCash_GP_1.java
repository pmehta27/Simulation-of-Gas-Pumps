package org.com.strategypattern;

import org.com.datastore.*;

public class ReturnCash_GP_1 extends ReturnCash {

	public ReturnCash_GP_1(DataStore ds) {
		super(ds);
	}

	@Override
	public void returnCash() {
		// Cash transaction is not provided by GasPump1. So Returning Cash would be 0.
		System.out.println("Cash transaction is not supported by GasPump-1");
	}
		


}
