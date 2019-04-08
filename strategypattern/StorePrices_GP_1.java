package org.com.strategypattern;

import org.com.datastore.DataStore;
import org.com.datastore.DataStore_1;

public class StorePrices_GP_1 extends StorePrices{

	public StorePrices_GP_1(DataStore ds) {
		super(ds);
	}

	public void storePrices() {
		DataStore_1 d = (DataStore_1) ds;
		float temp_a = d.get_temp_a();
		float temp_b = d.get_temp_b();
		d.set_Rprice(temp_a);
		d.set_Dprice(temp_b);
		System.out.println("Prices Data has been stored for GasPump-1");
		System.out.println(d.get_Rprice());
		System.out.println(d.get_Dprice());
		
	}
}
