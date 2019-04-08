package org.com.strategypattern;

import org.com.datastore.DataStore;

public class ReadyMsg_GP_2  extends ReadyMsg {

	public ReadyMsg_GP_2(DataStore ds) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void readyMsg() {
		System.out.println("Pump is ready");
		
	}
	
}
