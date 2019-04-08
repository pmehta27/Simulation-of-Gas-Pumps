package org.com.strategypattern;

import org.com.datastore.*;

public class InitializeData_GP_1 extends InitializeData {

	public InitializeData_GP_1(DataStore ds) {
		super(ds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initializeData() {
		DataStore_1 d = (DataStore_1) ds;		
		d.set_price(0);
		d.set_cash(0);
		System.out.println("Data Initialized for GasPump-1");
		
	}
	
}
