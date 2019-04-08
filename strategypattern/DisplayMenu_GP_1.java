package org.com.strategypattern;

import org.com.datastore.DataStore;

public class DisplayMenu_GP_1 extends DisplayMenu
{

	public DisplayMenu_GP_1(DataStore ds) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayMenu() 
	{
		System.out.println("Display Menu for GasPump-1");
		//System.out.println(" 1. Regular\n 2. Diesel");
	}

}

