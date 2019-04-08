package org.com.strategypattern;

import org.com.datastore.*;

public class StorePin_GP_1 extends StorePin {

	public StorePin_GP_1(DataStore ds) {
		super(ds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void storePin() {
		// TODO Auto-generated method stub
		DataStore_1 d =(DataStore_1) ds;
		 
		String temp_p = d.get_temp_p();
		d.set_pin(temp_p);
		System.out.println("GasPump-1 --> Pin has been stored");
	}

}
