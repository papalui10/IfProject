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
	private double price;
	private String games;
	
	/**
	 * Default constructor for a Computer.
	 * Initializes all values to valid but "bad" values
	 * Used for later customization. 
	 */
	public Computers()
	{
		//default constructor 
	}
	
	public Computers(String brandName, double price, String games)
	{
		this.brandName = "unnamed brand";
		this.price = -99;
		this.games = "unnamed games";
	}
	/**
	 * Initializes a Computer instance with a value for the brandName
	 * @param brandName The brandName of the Computer.
	 */
	public String getBrandName()
	{
		return brandName;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public String getGames()
	{
		return games;
	}
	
	public void setBrandName(String brandName)
	{
		this.brandName = brandName;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public void setGames(String games)
	{
		this.games = games;
	}
}	
	
	
