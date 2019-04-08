package org.com.statepattern;

import org.com.mda_efsm.MDA_EFSM;

public class State_2 extends State {

	public State_2(MDA_EFSM m) {
		super(m);
	}
	public void Approved(){
		m.getOperations().DisplayMenu();
		m.changeState(4);
	}
	@Override
	public void Reject(){
		m.getOperations().RejectMsg();
		m.changeState(1);
	}


}
