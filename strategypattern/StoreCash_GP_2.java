package org.com.strategypattern;

import org.com.datastore.DataStore;
import org.com.datastore.DataStore_2;

public class StoreCash_GP_2 extends StoreCash {

	public StoreCash_GP_2(DataStore ds) {
		super(ds);

	}

	public void storeCash() {
		DataStore_2 d = (DataStore_2) ds;
		float temp = d.get_temp_cash();
		d.set_cash(temp);
		System.out.println("Cash Stored");
		
	}

}
