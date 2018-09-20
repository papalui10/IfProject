package controller;

//Import Section
import model.Computers;

import javax.swing.JOptionPane;

public class Ifcontroller
{
	private Computers userComputer;
	/**
	 * Builds the instance Controller
	 */
	public Ifcontroller()
	{
		userComputer = new Computers();
	}
	
	/**
	 * This is where the program starts calling methods to run the program.
	 */
	public void start()
	{
		String userInput = JOptionPane.showInputDialog("Enter your favorite computer brand");
		userComputer.setBrandName(userInput);
		
		userInput = JOptionPane.showInputDialog("Enter your price");
		int price = -99;
		if(validInt(userInput))
		{
			price = Integer.parseInt(userInput);
		}
		userComputer.setPrice(price);
		
		userInput = JOptionPane.showInputDialog("Enter the games for your computer");
		userComputer.setGames(userInput);
		
		JOptionPane.showMessageDialog(null, "Your favorite computer brand is" + userComputer.getBrandName() + "!");
		JOptionPane.showMessageDialog(null, "Your budget is" + userComputer.getPrice() + "!");
		JOptionPane.showMessageDialog(null, "Your games are" + userComputer.getGames());
	}
	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You need to type in a whole number :D");
		}
		
		return isValid;
	}
}