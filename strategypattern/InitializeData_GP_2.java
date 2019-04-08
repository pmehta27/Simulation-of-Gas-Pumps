package org.com.strategypattern;

import org.com.datastore.*;

public class InitializeData_GP_2 extends InitializeData {

	public InitializeData_GP_2(DataStore ds) {
		super(ds);

	}

	@Override
	public void initializeData() {
		DataStore_2 d = (DataStore_2) ds;
		d.set_price(0);
		d.set_cash(0);
		System.out.println("Data Initialized for GasPump-2");
	}

}
