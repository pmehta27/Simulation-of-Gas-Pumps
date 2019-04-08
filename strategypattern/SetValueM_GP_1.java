package org.com.strategypattern;

import org.com.datastore.*;

public class SetValueM_GP_1 extends SetValueM {

	public SetValueM_GP_1(DataStore ds) {
		super(ds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setValueM() {
		// TODO Auto-generated method stub
		DataStore_1 d = (DataStore_1) ds;
		int temp_m = d.get_temp_M();
		d.set_temp_M(temp_m);
	}
	

}
