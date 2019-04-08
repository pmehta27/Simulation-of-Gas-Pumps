package org.com.strategypattern;

import org.com.datastore.DataStore;

public class WrongPinMsg_GP_2 extends WrongPinMsg{

	public WrongPinMsg_GP_2(DataStore ds) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void wrongPinMsg() {
		// TODO Auto-generated method stub
		System.err.println("INCORRECT PIN");
	}

}

