package org.com.statepattern;

//This is the concrete class for the Start State,
//any edges leaving this state are implemented here and only executed when the state machine is in this state 
import org.com.mda_efsm.MDA_EFSM;

public class Start extends State {

	
	public Start(MDA_EFSM m)
	{
		super(m);
	}
	@Override
	public void Activate() {
		m.getOperations().StorePrices();
		m.changeState(1);
		
	}

}
