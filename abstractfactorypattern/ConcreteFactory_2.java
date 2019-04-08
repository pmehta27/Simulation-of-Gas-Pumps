package org.com.abstractfactorypattern;

import org.com.datastore.*;
import org.com.strategypattern.*;

public class ConcreteFactory_2 extends AbstractFactory {
	DataStore ds;
	StorePrices obj;
	PayMsg obj1;
	StoreCash obj2;
	DisplayMenu obj3;
	RejectMsg obj4;
	SetPrice obj5;
	ReadyMsg obj6;
	SetInitialValues obj7;
	PumpGasUnit obj8;
	GasPumpedMsg obj9;
	StopMsg obj10;
	PrintReceipt obj11;
	CancelMsg obj12; 
	ReturnCash obj13;
	WrongPinMsg obj14;
	StorePin obj15;
	EnterPinMsg obj16;
	InitializeData obj17;
	SetValueM obj18;
	public ConcreteFactory_2()
	{
		this.ds = new DataStore_2();
		this.obj = new StorePrices_GP_2(this.ds);		
		this.obj1 = new PayMsg_GP_2(this.ds);
		this.obj2 = new StoreCash_GP_2(this.ds);
		this.obj3 = new DisplayMenu_GP_2(this.ds);
		this.obj4 = new RejectMsg_GP_2(this.ds);
		this.obj5 = new SetPrice_GP_2(this.ds);
		this.obj6 = new ReadyMsg_GP_2(this.ds);
		this.obj7 = new SetInitialValues_GP_2(this.ds);
		this.obj8 = new PumpGasUnit_GP_2(this.ds);
		this.obj9 = new GasPumpedMsg_GP_2(this.ds);
		this.obj10 = new StopMsg_GP_2(this.ds);
		this.obj11 = new PrintReceipt_GP_2(this.ds);
		this.obj12 = new CancelMsg_GP_2(this.ds);
		this.obj13 = new ReturnCash_GP_2(this.ds);
		this.obj14 = new WrongPinMsg_GP_2(this.ds);
		this.obj15 = new StorePin_GP_2(this.ds);
		this.obj16 = new EnterPinMsg_GP_2(this.ds);
		this.obj17 = new InitializeData_GP_2(this.ds);
		this.obj18 = new SetValueM_GP_2(this.ds);
	}

	@Override
	public StorePrices getStorePrices() {
		return obj;
	}
	@Override
	public PayMsg getPayMsg() {

		return obj1;	
	}

	@Override
	public StoreCash getStoreCash() {
		return obj2;
	}

	@Override
	public DisplayMenu getDisplayMenu() {
		return obj3;
	}

	@Override
	public RejectMsg getRejectMsg() {
		return obj4;
	}

	@Override
	public SetPrice getsetPrice() {
		return obj5;
	}

	@Override
	public ReadyMsg getReadyMsg() {
		return obj6;
	}

	@Override
	public SetInitialValues getInitialValues() {
		return obj7;
	}

	@Override
	public PumpGasUnit getPumpGasUnit() {
		return obj8;
	}

	@Override
	public GasPumpedMsg getGasPumpedMsg() {
		return obj9;
	}

	@Override
	public StopMsg getStopMsg() {
		return obj10;
	}

	@Override
	public PrintReceipt getPrintReceipt() {
		return obj11;
	}

	@Override
	public ReturnCash getReturnCash() {
		//GasPump1 has no defined responsibility to execute ReturnCash()
		return obj13;
	}

	@Override
	public CancelMsg getCancelMsg() {
		return obj12;
	}

	@Override
	public WrongPinMsg getWrongPinMsg() {
		return obj14;
	}

	@Override
	public StorePin getStorePin() {
		return obj15;
	}

	@Override
	public EnterPinMsg getEnterPinMsg() {
		return obj16;
	}

	@Override
	public InitializeData getInitializeData() {
		return obj17;
	}
	public SetValueM getValueM(){
		return obj18;
	}
	@Override
	public DataStore getDataStore() {
		return this.ds;
	}


}
