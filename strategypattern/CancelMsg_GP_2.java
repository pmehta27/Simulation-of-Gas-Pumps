package org.com.strategypattern;

import org.com.datastore.DataStore;

public class CancelMsg_GP_2 extends CancelMsg 
{

	public CancelMsg_GP_2(DataStore ds) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String cancelMsg(String msg) 
	{
		msg="Sorry! Couldn't process your request.";
		return msg;
	}

}
