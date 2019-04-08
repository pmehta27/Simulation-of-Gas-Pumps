package org.com.datastore;
//Acts as the information holder for GasPump 2
public class DataStore_2 extends DataStore{
	private float temp_a;
	private float temp_b;
	private float temp_c;
	private int temp_cash;
	private float Sprice;
	private float Rprice;
	private float Pprice;
	private float cash;
	private float total;
	private int L;
	private float price;	
	private int temp_M;
	private int M;
	
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
	
	public void set_temp_c(float c)
	{
		temp_c = c;
	}
	public float get_temp_c()
	{
		return temp_c;
	}
	public void set_temp_cash(int c)
	{
		temp_cash = c;
	}
	public int get_temp_cash()
	{
		return temp_cash;
	}
	public void set_Sprice(float s)
	{
		Sprice = s;
	}
	public float get_Sprice()
	{
		return Sprice;
	}
	public void set_Rprice(float r)
	{
		Rprice = r;
	}
	public float get_Rprice()
	{
		return Rprice;
	}
	public void set_Pprice(float p)
	{
		Pprice = p;
	}
	public float get_Pprice()
	{
		return Pprice;
	}
	public void set_cash(float c)
	{
		cash = c;
	}
	public float get_cash()
	{
		return cash;
	}
	public void set_total(float t)
	{
		total = t;
	}
	public float get_total()
	{
		return total;
	}
	public void set_L(int l)
	{
		L = l;
	}
	public int get_L()
	{
		return L;
	}	
	public void set_price(float p)
	{
		price = p;
	}
	public float get_price()
	{
		return price;
	}
	public void set_temp_M(int m)
	{
		temp_M = m;
	}
	public int get_temp_M()
	{
		return temp_M;
	}
	public void set_M(int m)
	{
		M = m;
	}
	public int get_M()
	{
		return M;
	}
}
