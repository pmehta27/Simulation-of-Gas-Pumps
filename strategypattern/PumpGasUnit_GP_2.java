package org.com.strategypattern;

import org.com.datastore.DataStore;
import org.com.datastore.DataStore_2;

public class PumpGasUnit_GP_2 extends PumpGasUnit{

	public PumpGasUnit_GP_2(DataStore ds) {
		super(ds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pumpGasUnit() {
		//disposes unit of gas and counts # of units disposed
		DataStore_2 d = (DataStore_2) ds;
		System.out.println("Gas has been disposed");
		int l = d.get_L();		
		float price = d.get_price();		
		l +=1;
		float total = price*l;
		d.set_L(l);
		d.set_total(total);	
	}

}
