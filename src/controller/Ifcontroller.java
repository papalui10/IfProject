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
		/*
		 * String userInput = JOptionPane.showInputDialog("Enter your favorite computer brand");
		 
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
		*/
	loopy();
	
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
	public boolean validDouble(String mightBeDouble)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(mightBeDouble);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null,  "type in a decimal value AKA a number with a . in the middle");
		}
		
		return isValid;
	}
	
	private void loopy()
	{
		//define a variable before the loop
		boolean isFinished = false;
		int someCount = 7;
		Computers userComputer = new Computers();
		
		//test the code
		while (!isFinished)
		{
			
			//do code
			JOptionPane.showMessageDialog(null, "Virus Detected!");
			
			someCount++;
			//someCount+= 1;
			
			//Update the test variable
			if (someCount >= 20)
			{
				isFinished = true;
			}
		}		
		
		
		String response = JOptionPane.showInputDialog(null, "What is the price of your PC?");
		double price = -99;
		boolean isValid = validDouble(response);
		while(!isValid)
		{
			response = JOptionPane.showInputDialog(null, "What is the price of your PC?");
			if(validDouble(response))
			{
				price = Double.parseDouble(response);
				isValid = true;
			}
			
		}
		userComputer.setPrice(Double.parseDouble(response));
		
		for (double time = 0; time < 10; time++)
		{
			if(isFinished)
			JOptionPane.showMessageDialog(null, "This is the end of the world " + time);
				
		}
		response = JOptionPane.showInputDialog(null, "Enter desired FPS");
		double FPS = -99;
		boolean isValid2 = validDouble(response);
		while(!isValid2)
		{
			response = JOptionPane.showInputDialog(null, "Enter desired FPS");
			if(validDouble(response))
			{
				FPS = Double.parseDouble(response);
				isValid2 = true;
			}
		}
		userComputer.setFPS(Double.parseDouble(response));
		
		response = JOptionPane.showInputDialog("Enter your favorite PC brand?");
		userComputer.setBrandName(response);
	}
}