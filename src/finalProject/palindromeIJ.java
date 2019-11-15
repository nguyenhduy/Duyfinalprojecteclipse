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
import java.awt.Font;
import javax.swing.SwingConstants;

public class palindromeIJ extends MenuControl
{
	public palindromeIJ() {
	}
	
	public void add()
	{
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
    public boolean checkPalindrome(String input)
    {
        //String input = ConsoleIO.getString("This is palindrome I&J --> Enter a palindrome candidate").toLowerCase();
        
        input = input.toLowerCase();
        
        return isPalindrome(input);
        

    }

    public boolean isPalindrome(String input) //calling a method
    {
        int i = 0;
        int j = 0;
        j = input.length()-1;
        while (i < j) //stops when i crosses j
        {
            char frontChar = input.charAt(i);
            char lastChar = input.charAt(j);
            if (frontChar < 'a' || frontChar >'z') //checks to see if i is a character
                i++;
            else if (lastChar < 'a' || lastChar > 'z') // checks to see if j is a character
                j--;
            else
            {
                if (frontChar != lastChar )//when both the top fails, compares if i & j are the same
                    return false;
                else
                {
                    i++;
                    j--;
                }
            }
        }
        return true;
    }

}

