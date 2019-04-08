package org.com.strategypattern;

import org.com.datastore.DataStore;

public class EnterPinMsg_GP_1 extends EnterPinMsg 
{

	public EnterPinMsg_GP_1(DataStore ds) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enterPinMsg() {
		// TODO Auto-generated method stub
		System.out.println("Enter Pin for GasPump-1: ");
	}
	
}
