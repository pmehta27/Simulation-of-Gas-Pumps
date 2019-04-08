package org.com.strategypattern;

import org.com.datastore.*;

public class PrintReceipt_GP_2 extends PrintReceipt{

	public PrintReceipt_GP_2(DataStore ds) {
		super(ds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printReceipt() {
		DataStore_2 d = (DataStore_2) ds;
		
		System.out.println("================= RECEIPT =================");
		System.out.println("Unit Disposed:"+ d.get_L()+ "  Total Price:"+ d.get_total());
		System.out.println("============================================");
	}

}
