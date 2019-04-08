package org.com.statepattern;

import org.com.mda_efsm.MDA_EFSM;

public class State_0 extends State {

	public State_0(MDA_EFSM m) {
		super(m);
	
	}

	@Override
	public void Start(){
		m.getOperations().PayMsg();
		m.getOperations().InitializeData();
		m.changeState(2);			
	}

}
