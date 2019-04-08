package org.com.strategypattern;


import org.com.datastore.*;

public class SetInitialValues_GP_2 extends SetInitialValues{

	public SetInitialValues_GP_2(DataStore ds) {
		super(ds);
	}

	@Override
	public void setInitialValues() {
		DataStore_2 d = (DataStore_2) ds;
		
		d.set_L(0);
		d.set_total(0);			
	}

}


