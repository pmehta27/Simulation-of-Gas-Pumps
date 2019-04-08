package org.com.statepattern;

import org.com.mda_efsm.MDA_EFSM;

public class State_5 extends State {

	public State_5(MDA_EFSM m) {
		super(m);
	}

	public void Pump(){
		m.getOperations().PumpGasUnit();
		m.getOperations().GasPumpedMsg();
		m.changeState(6);
	}
	@Override
	public void StopPump(){
		m.getOperations().StopMsg();
		m.changeState(7);
	}
}
