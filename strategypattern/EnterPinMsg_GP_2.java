package org.com.strategypattern;

import org.com.datastore.DataStore;

public class EnterPinMsg_GP_2 extends EnterPinMsg 
{

	public EnterPinMsg_GP_2(DataStore ds) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enterPinMsg() {
		// TODO Auto-generated method stub
		// PayDebit not supported by GasPump-2
	}
	
}
