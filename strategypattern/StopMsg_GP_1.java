package org.com.strategypattern;

import org.com.datastore.DataStore;

public class StopMsg_GP_1 extends StopMsg {

	public StopMsg_GP_1(DataStore ds) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void stopMsg() {
		// TODO Auto-generated method stub
		System.out.println("Pump Stopped");
		//Stop pump msg and receipt msg optional
	}
	
}
