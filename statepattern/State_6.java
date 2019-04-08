package org.com.statepattern;

import org.com.mda_efsm.MDA_EFSM;

public class State_6 extends State {

	public State_6(MDA_EFSM m) {
		super(m);
	}
	public void Receipt(){
		m.getOperations().PrintReceipt();
		m.getOperations().ReturnCash();
		m.changeState(1);
	}
	@Override
	public void NoReceipt(){
		m.getOperations().ReturnCash();
		m.changeState(1);
	}

}
