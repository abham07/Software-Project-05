/*
	BY: 	ABAD HAMEED
	DATE:	OCT. 7. 2015
	ENGI3051 In-Class Assign. 1
*/

import javax.swing.JOptionPane;

public class UserInformation 
{
	public static void main(String[] args) 
	{
		// Obtain user info using JOptionPane input dialogs
		String firstName = JOptionPane.showInputDialog ("Enter first name");
		String familyName = JOptionPane.showInputDialog ("Enter family name");
		String telNumber = JOptionPane.showInputDialog ("Enter telephone number");
				
		// Display result in JOptionPane message dialog
		JOptionPane.showMessageDialog(null, "Name: " + firstName + " " + familyName
			+ "\nTelephone number: " + telNumber, "User Information", 
				JOptionPane.INFORMATION_MESSAGE);
	}
}
