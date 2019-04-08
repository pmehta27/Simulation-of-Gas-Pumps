package org.com.strategypattern;

import org.com.datastore.*;

public class SetPrice_GP_1 extends SetPrice {

	public SetPrice_GP_1(DataStore ds) {
		super(ds);
	}

	@Override
	public void setPrice(int g) {
		DataStore_1 d = (DataStore_1) ds;
		
		if(g == 1){
			float rprice = d.get_Rprice();
			d.set_price(rprice);
			
		}
		else if(g == 2){
			//GasPump-1 has no Super Support.
		}
		else if(g == 3){
			//GasPump-1 has no Premium Support.
		}
		else if(g == 4){
			float dprice = d.get_Dprice();
			d.set_price(dprice);							
		}
		else
		{
			System.out.println("Invalid Gas Type");
		}
	}
	
}
