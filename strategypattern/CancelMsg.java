package org.com.strategypattern;

abstract public class CancelMsg 
{
	String msg = "";
	abstract public String cancelMsg(String msg);
}
