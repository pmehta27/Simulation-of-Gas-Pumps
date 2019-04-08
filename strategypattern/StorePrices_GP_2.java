package org.com.strategypattern;
import org.com.datastore.*;

public class StorePrices_GP_2 extends StorePrices {

	public StorePrices_GP_2(DataStore ds) {
		super(ds);
	}

	@Override
	public void storePrices() {
		DataStore_2 d = (DataStore_2) ds;
		float temp_a = d.get_temp_a();
		float temp_b = d.get_temp_b();
		float temp_c = d.get_temp_c();
		d.set_Sprice(temp_a);
		d.set_Rprice(temp_b);
		d.set_Pprice(temp_c);	
		System.out.println("Prices Data has been stored for GasPump-2");
		System.out.println(d.get_Sprice());
		System.out.println(d.get_Rprice());
		System.out.println(d.get_Pprice());
		
	}

		


}
