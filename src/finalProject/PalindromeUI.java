package finalProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PalindromeUI extends MenuControl {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField input;
	private JTextField palindromeIJ;
	private JTextField paliRecursion;
	private JTextField PaliReverseString;
	
	/**
	 * Launch the application.
	 */

	public static void startPalindromeUI(String myinput) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PalindromeUI frame = new PalindromeUI(myinput);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	


	/**
	 * Create the frame.
	 */
	public PalindromeUI(String myinput) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPalindromeTester = new JLabel("Enter Palindrome Candidate");
		lblPalindromeTester.setBounds(6, 0, 184, 26);
		contentPane.add(lblPalindromeTester);
		
		input = new JTextField();
		input.setBounds(6, 21, 438, 26);
		contentPane.add(input);
		input.setColumns(10);
		
		JButton btnTestPalindrome = new JButton("Test");
		btnTestPalindrome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paliRecursion.setText(myinput);
			}
		});
		btnTestPalindrome.setBounds(152, 49, 145, 29);
		contentPane.add(btnTestPalindrome);
		
		palindromeIJ = new JTextField();
		palindromeIJ.setEditable(false);
		palindromeIJ.setBounds(6, 82, 438, 47);
		contentPane.add(palindromeIJ);
		palindromeIJ.setColumns(10);
		
		paliRecursion = new JTextField();
		paliRecursion.setEditable(false);
		paliRecursion.setColumns(10);
		paliRecursion.setBounds(6, 141, 438, 47);
		contentPane.add(paliRecursion);
		
		PaliReverseString = new JTextField();
		PaliReverseString.setEditable(false);
		PaliReverseString.setColumns(10);
		PaliReverseString.setBounds(6, 200, 438, 47);
		contentPane.add(PaliReverseString);
	}

	public JTextField getPaliRecursion() {
		return paliRecursion;
	}

	public void setPaliRecursion(JTextField paliRecursion) {
		this.paliRecursion = paliRecursion;
	}

	public JTextField getPaliReverseString() {
		return PaliReverseString;
	}

	public void setPaliReverseString(JTextField paliReverseString) {
		PaliReverseString = paliReverseString;
	}

}