package org.com.strategypattern;

import org.com.datastore.DataStore;

public class StorePin_GP_2 extends StorePin {

	public StorePin_GP_2(DataStore ds) {
		super(ds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void storePin() {
		// TODO Auto-generated method stub
		// GasPump2 doesn't support PayDebit transaction
		
	}

}
