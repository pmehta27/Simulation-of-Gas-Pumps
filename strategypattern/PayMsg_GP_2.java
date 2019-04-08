package org.com.strategypattern;

import org.com.datastore.DataStore;

public class PayMsg_GP_2 extends PayMsg {

	public PayMsg_GP_2(DataStore ds) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void payMsgType() {
		System.out.println("\n 1. Credit\n 2. Cash ");
	}

}