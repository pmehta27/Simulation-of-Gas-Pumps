package org.com.datastore;

public class DataStore_1 extends DataStore {
	private float temp_a; 		// to store price of Regular Gas per gallon while invoking Activate()
	private float temp_b;		// to store price of Diesel Gas per gallon while invoking Activate()
	private String temp_p;		// to store pin value while invoking PayDebit()
	private String pin;			// to store the pin value
	private float price;		// 
	private int G;				//
	private float total;		//
	private float Rprice;		// 
	private float Dprice;		//
	private int temp_M;
	private float cash;
	public void set_temp_a(float a)
	{
		temp_a = a;
	}
	public float get_temp_a()
	{
		return temp_a;
	}
	public void set_temp_b(float b)
	{
		temp_b = b;
	}
	public float get_temp_b()
	{
		return temp_b;
	}
	public void set_temp_p(String p)
	{
		temp_p = p;
	}
	public String get_temp_p()
	{
		return temp_p;
	}
	public void set_temp_M(int m)
	{
		temp_M = m;
	}
	public int get_temp_M()
	{
		return temp_M;
	}
	public void set_pin(String p)
	{
		pin = p;
	}
	public String get_pin()
	{
		return pin;
	}
	public void set_price(float p)
	{
		price = p;
	}
	public float get_price()
	{
		return price;
	}
	public void set_G(int g)
	{
		G = g;
	}
	public int get_G()
	{
		return G;
	}
	public void set_total(float t)
	{
		total = t;
	}
	public float get_total()
	{
		return total;
	}
	public void set_Rprice(float r)
	{
		Rprice = r;
	}
	public float get_Rprice()
	{
		return Rprice;
	}
	public void set_Dprice(float d)
	{
		Dprice = d;
	}
	public float get_Dprice()
	{
		return Dprice;
	}
	public void set_cash(float c){
		cash = c;
	}
	public float get_cash()
	{
		return cash;
	}
}
