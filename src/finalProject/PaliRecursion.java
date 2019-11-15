package finalProject;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PaliRecursion extends MenuControl
{
	private static String input;

	public static void add() {
		JFrame frame = new JFrame("PalindromeIJ");
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frame.setSize(700,400);
		frame.setLocationRelativeTo(null);
		JTextArea area = new JTextArea();
		area.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		area.setEditable(false);
		
		JPanel panel = new JPanel();
		JTextField field = new JTextField(15);
		
		panel.add(field);
		frame.getContentPane().add(BorderLayout.SOUTH, panel);
		frame.getContentPane().add(area);
		frame.setVisible(true);
	}
	
	public static void setText(String s)
	{
		
		input = s;
	}
	
    public static boolean checkPalindrome(String input)
    {
    
    	input = input.toLowerCase();
    	
    	return isPalindrome(input);
    	
    }

    public static boolean isPalindrome(String input)
    {
        int i = findFirstLetter(input);
        int j = findLastLetter(input);
        char frontChar = input.charAt(i);
        char lastChar = input.charAt(j);
        if (i >= j) //checks when to stop
            return true;
        if (frontChar != lastChar) // if the front character is not equal to the last character, then the string is not a palindrome
            return false;
        else
            return isPalindrome(input.substring(i+1,j));
        //extracting a substring of text from i+1 from j 
    }

    public static int findFirstLetter(String input)
    {
        int i = 0;
        for (i = 0; i <input.length(); i++)
            if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z')
                return i;
        return input.length();
    }

    public static int findLastLetter(String input)
    {
        int j;
        for (j = input.length() - 1; j>=0; j--)
            if (input.charAt(j) >= 'a' && input.charAt(j) <= 'z')
                return j;
		return j;
    }
}

