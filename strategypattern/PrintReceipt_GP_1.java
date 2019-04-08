package org.com.strategypattern;

import org.com.datastore.*;

public class PrintReceipt_GP_1 extends PrintReceipt{
	
	public PrintReceipt_GP_1(DataStore ds) {
		super(ds);
	}

	@Override
	public void printReceipt() {
		
		
		DataStore_1 d = (DataStore_1) ds;	
		
		System.out.println("================= RECEIPT =================");
		System.out.println("Unit Disposed:"+ d.get_G()+ "  Total Price:"+ d.get_total());
		System.out.println("============================================");

	}

}
