package org.com.mda_efsm;
import org.com.statepattern.*;
import java.util.ArrayList;
import org.com.outputprocessor.*;
//part of State Pattern 
public class MDA_EFSM {
	
	
	Operations op;
	State current_state;
	static ArrayList<State> stList;
	
	public MDA_EFSM()
	{
		stList = new ArrayList<State>(8);
		stList.add(new Start(this));
		stList.add(new State_0(this));
		stList.add(new State_1(this));
		stList.add(new State_2(this));
		stList.add(new State_3(this));
		stList.add(new State_4(this));
		stList.add(new State_5(this));
		stList.add(new State_6(this));
		stList.add(new State_8(this));
		current_state = stList.get(0); 
		
	}
	public void Activate() {
		//op.StorePrices();
		current_state.Activate();
	}

	public void Start() {
		
		current_state.Start();
	}

	public void Approved() {
		current_state.Approved();
	}

	public void Reject() {
		current_state.Reject();
	}
	
	public void Cancel() {
		current_state.Cancel();
	}

	public void PayType(int i) {
		current_state.PayType(i);
	}

	public void CorrectPin() {
		current_state.CorrectPin();
	}

	public void IncorrectPin() {
		current_state.IncorrectPin();
	}

	public void SelectGas(int i) {
		current_state.SelectGas(i);	
	}

	public void Continue() {
		current_state.Continue();
	}

	public void StartPump() {
		current_state.StartPump();
	}

	public void Pump() {
		current_state.Pump();	
	}

	public void StopPump() {
		current_state.StopPump();
	}

	public void Receipt() {
		current_state.Receipt();
	}

	public void NoReceipt() {
		current_state.NoReceipt();	
	}
	
	public void setOperation(Operations op) {
		
		this.op = op;
	}
	public Operations getOperations()
	{
		return op;
	}
	public void changeState(int s)
	{
		current_state = stList.get(s);
	}
}
