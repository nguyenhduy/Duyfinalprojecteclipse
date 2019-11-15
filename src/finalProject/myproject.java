package finalProject;

import java.awt.EventQueue;
import java.awt.event.AWTEventListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class myproject {

	private JFrame frame;
	private JTextField txtWelcomeToNicoles;
	private JTextField txtEnterYourText;
	private JTextPane textPane;
	private String myTextInput;
	private JButton btnPalindromeCheckIj;
	private JButton btnPalindromeReverseCheck;
	private JButton btnPalindromeRecursiveCheck;
	private JButton btnStartPalindromeUi;
	private JButton btnStartCalculator;
	private JButton btnFindPrimeNumbers;
	private JTextField txtEnterANumber;
	private JTextPane textPane_1;
	private JTextPane textPane_2;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myproject window = new myproject();
					window.frame.setVisible(true);
					window.createContents();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public myproject() {
		initialize();
		
		
	}
	
	public void createContents()
	{
		
		myTextInput = textPane.getText();
		
		
		
		btnPalindromeCheckIj.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
			palindromeIJ testPalinIJ = new palindromeIJ();
			
			myTextInput = textPane.getText();
			
			if (testPalinIJ.checkPalindrome(myTextInput))
				JOptionPane.showMessageDialog(frame, "Your Input Text is a Palindrome");
			else
				JOptionPane.showMessageDialog(frame, "Your Input Text is NOT a Palindrome");
			
			
			}
		});
		
		
		btnPalindromeReverseCheck.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
			
			myTextInput = textPane.getText();
			
			if (PaliReverseString.checkPalindrome(myTextInput))
				JOptionPane.showMessageDialog(frame, "Your Input Text is a Palindrome");
			else
				JOptionPane.showMessageDialog(frame, "Your Input Text is NOT a Palindrome");
			
			
			}
		});
		
		
		btnPalindromeRecursiveCheck.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
			
			myTextInput = textPane.getText();
			
			if (PaliRecursion.checkPalindrome(myTextInput))
				JOptionPane.showMessageDialog(frame, "Your Input Text is a Palindrome");
			else
				JOptionPane.showMessageDialog(frame, "Your Input Text is NOT a Palindrome");
			
			
			}
		});
		
		
		btnStartPalindromeUi.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
			
				myTextInput = textPane.getText();
			
				PalindromeUI.startPalindromeUI(myTextInput);
			
			
			}
		});
		
		
		btnStartCalculator.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
			
				calculator testCalc = new calculator();
				
				testCalc.startCalculator();
			
			
			}
		});
		
		btnFindPrimeNumbers.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				myTextInput = textPane_1.getText();
				int myNumber = Integer.parseInt(myTextInput);
				
				String result = ArrayListLab.findPrime(myNumber);
				
				textPane_2.setText(result);
			
			
			}
		});
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(224, 255, 255));
		frame.setBounds(100, 100, 800, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtWelcomeToNicoles = new JTextField();
		txtWelcomeToNicoles.setBackground(new Color(135, 206, 235));
		txtWelcomeToNicoles.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcomeToNicoles.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtWelcomeToNicoles.setText("Welcome to Nicole's Final Project");
		txtWelcomeToNicoles.setBounds(283, 25, 230, 20);
		frame.getContentPane().add(txtWelcomeToNicoles);
		txtWelcomeToNicoles.setColumns(10);
		
		textPane = new JTextPane();
		textPane.setBounds(153, 95, 540, 20);
		frame.getContentPane().add(textPane);
		
		txtEnterYourText = new JTextField();
		txtEnterYourText.setBackground(new Color(152, 251, 152));
		txtEnterYourText.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterYourText.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtEnterYourText.setText("Enter Your Text Sentence Here");
		txtEnterYourText.setBounds(293, 64, 207, 20);
		frame.getContentPane().add(txtEnterYourText);
		txtEnterYourText.setColumns(10);
		
		btnPalindromeCheckIj = new JButton("Palindrome IJ Check");
		btnPalindromeCheckIj.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPalindromeCheckIj.setForeground(new Color(255, 0, 0));
		btnPalindromeCheckIj.setBackground(new Color(230, 230, 250));
		btnPalindromeCheckIj.setBounds(304, 138, 197, 23);
		frame.getContentPane().add(btnPalindromeCheckIj);
		
		btnPalindromeReverseCheck = new JButton("Palindrome Reverse Check");
		btnPalindromeReverseCheck.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPalindromeReverseCheck.setForeground(new Color(0, 0, 255));
		btnPalindromeReverseCheck.setBounds(304, 172, 196, 23);
		frame.getContentPane().add(btnPalindromeReverseCheck);
		
		btnPalindromeRecursiveCheck = new JButton("Palindrome Recursive Check");
		btnPalindromeRecursiveCheck.setForeground(new Color(255, 0, 255));
		btnPalindromeRecursiveCheck.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPalindromeRecursiveCheck.setBounds(304, 206, 196, 23);
		frame.getContentPane().add(btnPalindromeRecursiveCheck);
		
		btnStartPalindromeUi = new JButton("Start Palindrome UI");
		btnStartPalindromeUi.setIcon(new ImageIcon(myproject.class.getResource("/javax/swing/plaf/metal/icons/ocean/computer.gif")));
		btnStartPalindromeUi.setForeground(new Color(0, 0, 128));
		btnStartPalindromeUi.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnStartPalindromeUi.setBounds(304, 313, 196, 23);
		frame.getContentPane().add(btnStartPalindromeUi);
		
		btnStartCalculator = new JButton("Start Calculator");
		btnStartCalculator.setIcon(new ImageIcon(myproject.class.getResource("/javax/swing/plaf/metal/icons/Inform.gif")));
		btnStartCalculator.setForeground(new Color(220, 20, 60));
		btnStartCalculator.setBackground(new Color(127, 255, 0));
		btnStartCalculator.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnStartCalculator.setBounds(304, 388, 187, 23);
		frame.getContentPane().add(btnStartCalculator);
		
		btnFindPrimeNumbers = new JButton("Find Prime Numbers");
		btnFindPrimeNumbers.setForeground(new Color(0, 0, 255));
		btnFindPrimeNumbers.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnFindPrimeNumbers.setBounds(293, 503, 187, 23);
		frame.getContentPane().add(btnFindPrimeNumbers);
		
		txtEnterANumber = new JTextField();
		txtEnterANumber.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtEnterANumber.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterANumber.setText("Enter a Number and we will find all prime numbers less than this number");
		txtEnterANumber.setBounds(166, 447, 442, 20);
		frame.getContentPane().add(txtEnterANumber);
		txtEnterANumber.setColumns(10);
		
		textPane_1 = new JTextPane();
		textPane_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		textPane_1.setForeground(new Color(220, 20, 60));
		textPane_1.setBackground(new Color(230, 230, 250));
		textPane_1.setBounds(352, 478, 62, 20);
		frame.getContentPane().add(textPane_1);
		
		textPane_2 = new JTextPane();
		textPane_2.setBackground(new Color(211, 211, 211));
		textPane_2.setBounds(81, 530, 629, 20);
		frame.getContentPane().add(textPane_2);
	}
}
