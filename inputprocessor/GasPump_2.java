package org.com.inputprocessor;

import org.com.abstractfactorypattern.AbstractFactory;
import org.com.abstractfactorypattern.ConcreteFactory_2;
import org.com.datastore.DataStore;
import org.com.datastore.DataStore_2;
import org.com.mda_efsm.MDA_EFSM;
import org.com.outputprocessor.Operations;

public class GasPump_2 
{
	/*
	 * cash: contains the value of cash deposited
	 * price: contains the price of selected gas
	 * L: contains the number of liters already pumped
	 * cash, L, price are in data store
	 * m: pointer to MDA-EFSM object
	 * d: pointer to DataStore Object
	*/
	DataStore ds;
	DataStore_2 d;
	MDA_EFSM m;
	Operations op;
	//AbstractFactory af = new ConcreteFactory_2();
	public GasPump_2()
	{
		AbstractFactory af = new ConcreteFactory_2();
		ds = af.getDataStore();
		d = (DataStore_2)ds;
		m = new MDA_EFSM();
		op = new Operations(af);
		m.setOperation(op);
	}
	public void Activate(float a, float b, float c)
	{
		// Evaluate temporary data for mda activation
		if (a > 0 && b  > 0 && c  > 0)
		{
			// Store temporary data
			d.set_temp_a(a);
			d.set_temp_b(b);
			d.set_temp_c(c);
			m.Activate();
			m.Start();
		}
	}
	public void PayCash(int c)
	{
		if (c>0)
		{
			d.set_temp_cash(c);
			m.Start();
			m.PayType(2);
		}
	}
	public void PayCredit()
	{
		d.set_temp_M(1);
		m.PayType(1);
	}
	public void Reject()
	{
		m.Reject();
	}
	public void Approved()
	{
		m.Approved();
	}
	public void Cancel()
	{
		m.Cancel();
	}
	public void Super()
	{
		m.SelectGas(2);
		m.Continue();
	}
	public void Premium()
	{
		m.SelectGas(3);
		m.Continue();
	}
	public void Regular()
	{
		m.SelectGas(1);
		m.Continue();
	}
	public void StartPump()
	{
		m.StartPump();
	}
	public void PumpLiter()
	{
		int a = d.get_M();
		float cash = d.get_cash();
		float price = d.get_price();
		int L = d.get_L();
		
		if((a==0)&(cash>=(price*(L+1)))){
			m.Pump();
		}		
		else if (a == 1){
			m.Pump();
		}
		else if((a ==0)&(cash <(price*(L+1)))){
			m.StopPump();
		}
		/*if((d.cash>0)&&(d.cash<d.price*(d.L+1)))
			m.StopPump();
		else
			m.Pump();
		*/
	}
	public void Stop()
	{
		m.StopPump();
	}
	public void Receipt()
	{
		m.Receipt();
	}
	public void NoReceipt()
	{
		m.NoReceipt();
	}
}
