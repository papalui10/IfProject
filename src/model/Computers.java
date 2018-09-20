package model;

public class Computers
{
	//Declaration section
	//Data member section
	//Also called instance variables
	//These are special - they get a "default" value
	//All numbers => 0
	//boolean => false
	//Objects => null!!!
	
	private String brandName;
	private int price;
	private String games;
	
	public Computers()
	{
		//default constructor 
	}
	
	public Computers(String brandName, int price, String games)
	{
		this.brandName = brandName;
		this.price = price;
		this.games = games;
	}

}
