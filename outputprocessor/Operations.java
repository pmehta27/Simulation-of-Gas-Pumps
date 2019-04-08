/*
 * This class represents the Output Processor of the MDA 
 * and is the client of the various action strategies.  
 * Each action having more than one strategy has an abstract class
 * which is associated to the OP, while actions having only one strategy are directly defined with the OP. 
 */

package org.com.outputprocessor;
import org.com.abstractfactorypattern.*;
import org.com.datastore.DataStore;
import org.com.strategypattern.*;
public class Operations {
	private AbstractFactory af;
	private StorePrices sprices;
	private PayMsg pmsg;
	private StoreCash scash;
	private DisplayMenu dmenu;
	private RejectMsg rejectmsg;
	private SetPrice setprice;
	private ReadyMsg readymsg;
	private SetInitialValues svalues;
	private PumpGasUnit pgunit;
	private GasPumpedMsg gpmsg;
	private StopMsg stopmsg;
	private PrintReceipt printr;
	private CancelMsg cancelmsg;
	private ReturnCash returncash;
	private WrongPinMsg wpmsg;
	private StorePin storepin;
	private EnterPinMsg enterpinmsg;
	private InitializeData initializedata;
	private SetValueM set_m;
	public static DataStore data;
	public Operations(AbstractFactory af) {
		this.af = af;
	}
	public void StorePrices()
	{
		this.sprices= this.af.getStorePrices();
		this.sprices.storePrices();
	}
	public void PayMsg()
	{
		//displays a type of Payment Method
		//System.out.println("\n Please make the payment\n");
		this.pmsg=this.af.getPayMsg();
		this.pmsg.payMsgType();
	}
	public void StoreCash()
	{
		this.scash=this.af.getStoreCash();
		this.scash.storeCash();
	}
	public void DisplayMenu()
	{
		this.dmenu = this.af.getDisplayMenu();
		this.dmenu.displayMenu();
	}
	public void RejectMsg()
	{
		this.rejectmsg = this.af.getRejectMsg();
		this.rejectmsg.rejectMsg();	
	}
	public void SetPrice(int g)
	{
		this.setprice=this.af.getsetPrice();
		this.setprice.setPrice(g);
	}
	public void ReadyMsg()
	{
		this.readymsg = this.af.getReadyMsg();
		this.readymsg.readyMsg();
	}
	public void SetInitialValues()
	{
		this.svalues = this.af.getInitialValues();
		this.svalues.setInitialValues();
	}
	public void PumpGasUnit()
	{	
		this.pgunit = this.af.getPumpGasUnit();
		this.pgunit.pumpGasUnit();
	}
	public void GasPumpedMsg()
	{	
		this.gpmsg = this.af.getGasPumpedMsg();
		this.gpmsg.gasPumpedMsg();
	}
	public void StopMsg()
	{	
		this.stopmsg = this.af.getStopMsg();
		this.stopmsg.stopMsg();
	}
	public void PrintReceipt()
	{	
		this.printr = this.af.getPrintReceipt();
		this.printr.printReceipt();
	}
	public void CancelMsg() 
	{	
		this.cancelmsg = this.af.getCancelMsg();
		this.cancelmsg.cancelMsg("Transaction Cancelled");
	}
	public void ReturnCash()
	{ 
		this.returncash = this.af.getReturnCash();
		this.returncash.returnCash();
	}
	public void WrongPinMsg() 
	{	
		this.wpmsg = this.af.getWrongPinMsg();
		this.wpmsg.wrongPinMsg();
	}
	public void StorePin() 
	{	
		this.storepin = this.af.getStorePin();
		this.storepin.storePin();
	}
	public void EnterPinMsg() 
	{	
		this.enterpinmsg = this.af.getEnterPinMsg();
		this.enterpinmsg.enterPinMsg();
	}
	public void InitializeData() 
	{	
		this.initializedata = this.af.getInitializeData();
		this.initializedata.initializeData();
	}
	public void SetValueM()
	{
		this.set_m = this.af.getValueM();
		this.set_m.setValueM();
	}
}
