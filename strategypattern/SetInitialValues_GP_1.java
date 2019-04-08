package org.com.strategypattern;

import org.com.datastore.DataStore;
import org.com.datastore.DataStore_1;

public class SetInitialValues_GP_1 extends SetInitialValues {

	public SetInitialValues_GP_1(DataStore ds) {
		super(ds);
	}

	@Override
	public void setInitialValues() {
		DataStore_1 d = (DataStore_1) ds;	
		d.set_G(0);
		d.set_total(0);
	}

}
