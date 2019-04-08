package org.com.strategypattern;

import org.com.datastore.*;

public class SetPrice_GP_2 extends SetPrice {

	public SetPrice_GP_2(DataStore ds) {
		super(ds);

	}

	@Override
	public void setPrice(int g) {
		DataStore_2 d = (DataStore_2) ds;
		
		if(g == 1){
			float rprice = d.get_Rprice();
			d.set_price(rprice);			
		}
		else if(g == 2){
			float sprice = d.get_Sprice();
			d.set_price(sprice);			
		}
		else if(g == 3){
			float pprice = d.get_Pprice();
			d.set_price(pprice);			
		}
		else if(g == 4){
			//GasPump-2 has no Diesel support.			
		}
		else
		{
			System.out.println("Invalid Gas Type");
		}
		
		if(d.get_M()==1){
			float price = d.get_price();
			price  = (float) (1.1*price);
			d.set_price(price);			
		}
		
	}

}
