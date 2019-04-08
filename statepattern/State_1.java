package org.com.statepattern;

import org.com.mda_efsm.MDA_EFSM;

public class State_1 extends State {

	public State_1(MDA_EFSM m) {
		super(m);
	}

	public void PayType(int a){
		if(a == 1){
			m.getOperations().SetValueM();
			m.changeState(3);
		}
		else if(a == 2){
			m.getOperations().StoreCash();
			m.getOperations().DisplayMenu();
			m.getOperations().SetValueM();
			m.changeState(4);
		}
		else if(a == 3){			
			m.getOperations().EnterPinMsg();
			m.getOperations().StorePin();
			m.getOperations().SetValueM();
			m.changeState(8);
		}
		else{
			
		}
	}
}
