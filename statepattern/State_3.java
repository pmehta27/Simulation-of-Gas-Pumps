package org.com.statepattern;

import org.com.mda_efsm.MDA_EFSM;

public class State_3 extends State {

	public State_3(MDA_EFSM m) {
		super(m);
	}
	public void Continue(){
		m.changeState(5);
	}
	
	@Override
	public void SelectGas(int g)
	{
		if(g == 1){
			m.getOperations().SetPrice(g);
			m.changeState(4);
		}
		else if(g == 2){
			
		}
		else if(g == 3){
			m.getOperations().SetPrice(g);
			m.changeState(4);
		}
		else if(g == 4){
			m.getOperations().SetPrice(g);
			m.changeState(4);
		}
		else{
			System.out.println("Please enter correct choice.");
		}
	}
	
	@Override
	public void Cancel()
	{
		m.getOperations().CancelMsg();
		m.getOperations().ReturnCash();
		m.changeState(1);
	}




}
