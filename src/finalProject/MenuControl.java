package finalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class MenuControl extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	


	/**
	 * Launch the application.
	 */
	public static void startMenu(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuControl frame = new MenuControl();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private JMenuItem mntmPaliRecursion;

	/**
	 * Create the frame.
	 */
	public MenuControl() {
		getContentPane().setBackground(Color.RED);
		
		JLabel lblNewLabel = new JLabel("HELLO! WELCOME TO NICOLE'S MENU!!!");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Phosphate", Font.PLAIN, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("Midterm");
		menuBar.add(mnFile);
		
		JMenuItem mntmStartrestart = new JMenuItem("Start/Restart");
		mnFile.add(mntmStartrestart);
		
		JMenuItem mntmScore = new JMenuItem("Score");
		mnFile.add(mntmScore);
		
		JMenu mnNewMenu_1 = new JMenu("New menu");
		mnFile.add(mnNewMenu_1);
		
		JMenu mnCalculator = new JMenu("Intro");
		menuBar.add(mnCalculator);
		
		JMenu mnJumpers = new JMenu("Jumpers");
		mnCalculator.add(mnJumpers);
		
		JMenuItem mntmOriginal = new JMenuItem("Original");
		mnJumpers.add(mntmOriginal);
		
		JMenuItem mntmInputs = new JMenuItem("Inputs");
		mnJumpers.add(mntmInputs);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Pythagorus");
		mnCalculator.add(mntmNewMenuItem);
		
		JMenu mnNewMenu = new JMenu("Sprint 1");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmShorthand = new JMenuItem("Shorthand");
		mnNewMenu.add(mntmShorthand);
		
		
		
		JMenu mnSprint = new JMenu("Sprint 2");
		menuBar.add(mnSprint);
		
		JMenuItem mntmCalculator = new JMenuItem("Calculator");
		mntmCalculator.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				calculator frame = new calculator();
				frame.setVisible(true);			
			}
			
		});
		mnSprint.add(mntmCalculator);
		JMenuItem mntmpalindromeIJ = new JMenuItem("Palindrome IJ");
		mntmpalindromeIJ.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				palindromeIJ frame = new palindromeIJ();
				frame.getContentPane().add(mntmpalindromeIJ);
				frame.setVisible(true);
			}
		});
		mnNewMenu.add(mntmpalindromeIJ);
		JMenuItem mntmPaliRecursion = new JMenuItem("Palindrome Recursion");
		mntmPaliRecursion.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				PaliRecursion frame = new PaliRecursion();
				frame.getContentPane().add(mntmPaliRecursion);
				frame.setVisible(true);
			}
		});
		mnNewMenu.add(mntmPaliRecursion);
		JMenuItem mntmPaliReverseString = new JMenuItem("Palindrome Reverse String");
		mntmPaliReverseString.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				PaliReverseString frame = new PaliReverseString();
				frame.getContentPane().add(mntmPaliReverseString);
				frame.setVisible(true);
			}
		});
		mnNewMenu.add(mntmPaliReverseString);
		
	}
}

