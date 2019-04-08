package org.com.strategypattern;

import org.com.datastore.DataStore;

public class CancelMsg_GP_1 extends CancelMsg 
{

	public CancelMsg_GP_1(DataStore ds) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String cancelMsg(String msg) 
	{
		msg="Sorry! Couldn't process your request.";
		// TODO Auto-generated method stub
		return msg;
	}

}
