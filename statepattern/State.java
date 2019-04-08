package org.com.statepattern;
////Decentralized Solution -- State classes responsible for changing states and performing actions
//Class created to design State Pattern
//State class responsible for specific State Related Actions.
import org.com.mda_efsm.MDA_EFSM;

abstract public class State {
	MDA_EFSM m;
	public State(MDA_EFSM m) {
		this.m = m;
	}

	public void Activate(){};
	public void Start(){};
	public void Approved(){};
	public void Reject(){};
	public void Cancel() {};
	public void SelectGas(int g){};
	public void Continue(){};
	public void StartPump(){};
	public void Pump(){};
	public void StopPump() {};
	public void CorrectPin(){};
	public void IncorrectPin(){};
	public void PayType(int i){};
	public void Receipt(){};
	public void NoReceipt(){};
}
