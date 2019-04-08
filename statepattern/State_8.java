package org.com.statepattern;

import org.com.mda_efsm.MDA_EFSM;

public class State_8 extends State {

	public State_8(MDA_EFSM m) {
		super(m);
	}
	@Override
	public void CorrectPin(){
		m.getOperations().DisplayMenu();
		m.changeState(4);
	}
	@Override
	public void IncorrectPin(){
		m.getOperations().WrongPinMsg();
		m.changeState(1);
	}

}
