package org.com.strategypattern;

import org.com.datastore.*;

public class ReturnCash_GP_2 extends ReturnCash{
	public ReturnCash_GP_2(DataStore ds) {
		super(ds);
		// TODO Auto-generated constructor stub
	}

	public void returnCash()
	{
		DataStore_2 d = (DataStore_2) ds;
		int m = d.get_M();
		if(m == 0)
		{
			float cash = d.get_cash();
			float total = d.get_total();			
			System.out.println("Return Cash:"+ (cash-total));
		}
		else
		{
			System.out.println("No Cash would be return by GasPump-2");
		}
	}
}
