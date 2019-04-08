package org.com.statepattern;

import org.com.mda_efsm.MDA_EFSM;

public class State_4 extends State {

	public State_4(MDA_EFSM m) {
		super(m);
	}
	public void StartPump(){
		m.getOperations().SetInitialValues();
		m.getOperations().ReadyMsg();
		m.changeState(6);
	}

}
