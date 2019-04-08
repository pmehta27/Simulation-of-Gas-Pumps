package org.com.strategypattern;

import org.com.datastore.*;

public class GasPumpedMsg_GP_2 extends GasPumpedMsg {

	public GasPumpedMsg_GP_2(DataStore ds) {
		super(ds);
	}

	@Override
	public void gasPumpedMsg() {
		//System.out.println("Gas consumed in liters: "); //Add the variables
		
		DataStore_2 d = (DataStore_2) ds;
		System.out.println("Amount of Gas Disposed:" + d.get_L()+ "  Total Price:" + d.get_total());
	}
	
}