package org.com.strategypattern;

import org.com.datastore.DataStore;

public class RejectMsg_GP_1 extends RejectMsg {

	public RejectMsg_GP_1(DataStore ds) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void rejectMsg() {
		System.out.println("Credit Card not approved.. Please try again");
		
	}

}
