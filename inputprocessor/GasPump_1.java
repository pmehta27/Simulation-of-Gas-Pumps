package org.com.inputprocessor;

import org.com.abstractfactorypattern.AbstractFactory;
import org.com.abstractfactorypattern.ConcreteFactory_1;
//import org.com.datastore.Data;
import org.com.datastore.DataStore;
import org.com.datastore.DataStore_1;
import org.com.mda_efsm.MDA_EFSM;
import org.com.outputprocessor.Operations;

public class GasPump_1 {
	DataStore ds;
	MDA_EFSM m;
	DataStore_1 d;
	Operations op;
	//AbstractFactory af = new ConcreteFactory_1();
	public GasPump_1()
	{
		AbstractFactory af = new ConcreteFactory_1();
		ds = af.getDataStore();
		d = (DataStore_1)ds;
		m = new MDA_EFSM();
		op = new Operations(af);
		m.setOperation(op);
	}
	public void Activate(float a, float b)
	{

		// Evaluate temporary data for mda activation
		if (a > 0 && b > 0)
		{
			// Store temporary data
			d.set_temp_a(a);
			d.set_temp_b(b);
			m.Activate();
		}
		else
		{
			System.out.println("Entered values of a and b should be greater than 0");
		}
	}
	public void Start()
	{
		// Call Start function
		m.Start();
	}

	public void PayCredit()
	{
		// Call Pay Credit function
		d.set_temp_M(1);
		m.PayType(1);
	}

	public void Reject()
	{
		// Call Reject function
		m.Reject();
	}
	public void PayDebit(String p)
	{
		d.set_temp_M(2);
		d.set_temp_p(p);
		m.PayType(3);
	}
	public void Pin(String x)
	{
		if(x.equals(d.get_pin()))
			m.CorrectPin();
		else
			m.IncorrectPin();
	}
	public void Approved()
	{
		// Call Approved function
		m.Approved();
	}
	public void Cancel()
	{
		// Call Cancel function
		m.Cancel();
	}
	public void Diesel()
	{
		m.SelectGas(4);
		m.Continue();
	}
	public void Regular()
	{
		m.SelectGas(1);
		m.Continue();
	}
	public void StartPump()
	{
		if(d.get_price()>0)
		{
			//m.Continue();
			m.StartPump();
		}
	}
	public void PumpGallon()
	{
		m.Pump();
	}
	public void StopPump()
	{
		m.StopPump();
		m.Receipt();
	}
	public void FullTank()
	{
		m.StopPump();
		m.Receipt();
	}
}
