package org.com.strategypattern;

import org.com.datastore.*;

public class GasPumpedMsg_GP_1 extends GasPumpedMsg {

	public GasPumpedMsg_GP_1(DataStore ds) {
		super(ds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gasPumpedMsg() {
		// TODO Auto-generated method stub
		//System.out.println("Gas consumed in gallons: "); 
		DataStore_1 d = (DataStore_1) ds;
		System.out.println("Amount of Gas Disposed:" + d.get_G() + "  Total Price:" + d.get_total());
	}

	
	
}
