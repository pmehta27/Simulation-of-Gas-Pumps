package org.com.abstractfactorypattern;
import org.com.datastore.DataStore;
import org.com.strategypattern.*;
//Abstract Factory pattern is a factory class whose derivatives will be gas pump specific Concrete Factories
//It is responsible to provide the necessary strategy pattern classes 

abstract public class AbstractFactory {
	
	abstract public StorePrices getStorePrices();
	abstract public PayMsg getPayMsg();
	abstract public StoreCash getStoreCash();
	abstract public DisplayMenu getDisplayMenu();
    abstract public RejectMsg getRejectMsg();
    abstract public SetPrice getsetPrice();
    abstract public ReadyMsg getReadyMsg();
    abstract public SetInitialValues getInitialValues();
    abstract public PumpGasUnit getPumpGasUnit();
    abstract public GasPumpedMsg getGasPumpedMsg();
    abstract public StopMsg getStopMsg();
    abstract public PrintReceipt getPrintReceipt();
    abstract public ReturnCash getReturnCash();
    abstract public CancelMsg getCancelMsg();
    abstract public WrongPinMsg getWrongPinMsg();
    abstract public StorePin getStorePin();
    abstract public EnterPinMsg getEnterPinMsg();
    abstract public InitializeData getInitializeData();
    abstract public DataStore getDataStore();
	abstract public SetValueM getValueM();
}
