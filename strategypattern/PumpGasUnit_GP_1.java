package org.com.strategypattern;

import org.com.datastore.DataStore;
import org.com.datastore.DataStore_1;

public class PumpGasUnit_GP_1 extends PumpGasUnit{

	public PumpGasUnit_GP_1(DataStore ds) {
		super(ds);
	}

	@Override
	public void pumpGasUnit() {
		//disposes unit of gas and counts # of units disposed
		DataStore_1 d = (DataStore_1) ds;	
		System.out.println("Unit of gas has been disposed");
		int g = d.get_G();
		float p = d.get_price();
		g +=1;						
		float total = p*g;
		d.set_G(g);
		d.set_total(total);
		//DataStore_1.total = DataStore_1.price*DataStore_1.G;
	}

}
