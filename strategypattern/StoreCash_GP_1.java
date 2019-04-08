package org.com.strategypattern;

import org.com.datastore.DataStore;

public class StoreCash_GP_1 extends StoreCash {

	public StoreCash_GP_1(DataStore ds) {
		super(ds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void storeCash() {
		//GasPump-1 has No Cash Method
	}

}
