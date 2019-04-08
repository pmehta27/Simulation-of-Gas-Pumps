package org.com.strategypattern;

import org.com.datastore.*;

public class SetValueM_GP_2 extends SetValueM {

	public SetValueM_GP_2(DataStore ds) {
		super(ds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setValueM() {
		// TODO Auto-generated method stub
		DataStore_2 d = (DataStore_2) ds;
		int temp_m = d.get_temp_M();
		d.set_M(temp_m);
	}

}
