package finalProject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

public class calculator extends MenuControl {
	private final JLabel calcArea = new JLabel("");

	// calculator control
	private String calcAreaDefault = new String("0.0");
	private boolean initialCalcAreaInputState;
	private enum STATE { INITIAL, SAVE1, SAVE2, CALC };
	private STATE mathState;
	
	// calculator values
	private enum OPERATOR { NOOP, PLUS, MINUS, DIVIDE, MULTIPLY };
    private OPERATOR mathOp;
	private double arg1;
    private double arg2;
    private double calcAnswer;
	/**
	 * Launch the application.
	 */
	public void startCalculator() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void calculateAnswer()  // method to perform calculation
	{
	    switch(mathOp)
	    {
	        case PLUS:
	            calcAnswer = arg1 + arg2;
	            break;
	        case MINUS:
	            calcAnswer = arg1 - arg2;
	            break;
	        case DIVIDE:
	            calcAnswer = arg1 / arg2;
	            break;
	        case MULTIPLY:
	            calcAnswer = arg1 * arg2;
	            break;
	        case NOOP:
	            calcAnswer = arg1;
	    }
		calcArea.setText(String.valueOf(calcAnswer));
	    arg1 = Double.valueOf(calcArea.getText());
	    mathState = STATE.CALC;
		initialCalcAreaInputState = true;
	}
	
	private void updateCalcArea(String string) {
		if (initialCalcAreaInputState) {  // sets text to string on initial key typed
			calcArea.setText(string);
			initialCalcAreaInputState = false;
	    } else  {                         // concatenates string to end of text subsequent keys typed
			calcArea.setText(calcArea.getText() + string);
	    }
	}
	
	/**
	 * Save values for Calculator.
	 */
	private void saveValueOfArg1() { // method to store 1st value in calculation (arg1)
	    arg1 = Double.valueOf(calcArea.getText());
	    mathState = STATE.SAVE1;
		initialCalcAreaInputState = true;
	}
	
	private void saveValueOfArg2() { // method to store 2nd value in calculation (arg2)
		if (mathState != STATE.CALC) {
			arg2 = Double.valueOf(calcArea.getText());
			mathState = STATE.SAVE2;
		}
	}
	
	private void saveValueOfMathOp(OPERATOR op) { // method to store operator
		mathOp = op;
	}
	
	private void clearCalculator() {  // helper method to clear and update calculator to default
		calcArea.setText(calcAreaDefault);
		mathState = STATE.INITIAL;
		initialCalcAreaInputState = true;
		arg1 = 0.0;
		arg2 = 0.0;
		calcAnswer = 0.0;
	}

	/**
	 * Create the frame.
	 */
	public calculator() {
		getContentPane().setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 415);
		getContentPane().setLayout(null);
		calcArea.setForeground(Color.WHITE);
		calcArea.setFont(new Font("Lucida Grande", Font.PLAIN, 72));
		calcArea.setHorizontalAlignment(SwingConstants.RIGHT);
		calcArea.setBounds(18, 6, 377, 67);
		getContentPane().add(calcArea);
		
		JButton button_1 = new JButton("1");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_1.setBackground(Color.RED);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				button_1.setBackground(Color.RED);
			}
		});
		button_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.WHITE));
		button_1.setOpaque(true);
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(255, 0, 51));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_1.getText());
			}
		});
		button_1.setBounds(35, 86, 75, 40);
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_2.setBackground(Color.RED);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				button_2.setBackground(Color.RED);
			}
		});
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_2.getText());
			}
		});
		button_2.setOpaque(true);
		button_2.setForeground(Color.WHITE);
		button_2.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.WHITE));
		button_2.setBackground(new Color(255, 0, 51));
		button_2.setBounds(122, 86, 75, 40);
		getContentPane().add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_3.setBackground(Color.RED);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				button_3.setBackground(Color.RED);
			}
		});
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_3.getText());
			}
		});
		button_3.setOpaque(true);
		button_3.setForeground(Color.WHITE);
		button_3.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.WHITE));
		button_3.setBackground(new Color(255, 0, 51));
		button_3.setBounds(209, 86, 75, 40);
		getContentPane().add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_4.setBackground(Color.RED);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				button_4.setBackground(Color.RED);
			}
		});
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_4.getText());
			}
		});
		button_4.setOpaque(true);
		button_4.setForeground(Color.WHITE);
		button_4.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.WHITE));
		button_4.setBackground(new Color(255, 0, 51));
		button_4.setBounds(35, 138, 75, 40);
		getContentPane().add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_5.setBackground(Color.RED);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				button_5.setBackground(Color.RED);
			}
		});
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_5.getText());
			}
		});
		button_5.setOpaque(true);
		button_5.setForeground(Color.WHITE);
		button_5.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.WHITE));
		button_5.setBackground(new Color(255, 0, 51));
		button_5.setBounds(122, 138, 75, 40);
		getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_6.setBackground(Color.RED);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				button_6.setBackground(Color.RED);
			}
		});
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_6.getText());
			}
		});
		button_6.setOpaque(true);
		button_6.setForeground(Color.WHITE);
		button_6.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.WHITE));
		button_6.setBackground(new Color(255, 0, 51));
		button_6.setBounds(209, 138, 75, 40);
		getContentPane().add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_7.setBackground(Color.RED);
			}
			
			public void mouseReleased(MouseEvent e) {
				button_7.setBackground(Color.RED);
			}
		});
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_7.getText());
			}
		});
		button_7.setOpaque(true);
		button_7.setForeground(Color.WHITE);
		button_7.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.WHITE));
		button_7.setBackground(new Color(255, 0, 51));
		button_7.setBounds(35, 190, 75, 40);
		getContentPane().add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_8.setBackground(Color.RED);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				button_8.setBackground(Color.RED);
			}
		});
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_8.getText());
			}
		});
		button_8.setOpaque(true);
		button_8.setForeground(Color.WHITE);
		button_8.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.WHITE));
		button_8.setBackground(new Color(255, 0, 51));
		button_8.setBounds(122, 190, 75, 40);
		getContentPane().add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_9.setBackground(Color.RED);
			}
			
			public void mouseReleased(MouseEvent e) {
				button_9.setBackground(Color.RED);
			}
		});
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_9.getText());
			}
		});
		button_9.setOpaque(true);
		button_9.setForeground(Color.WHITE);
		button_9.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.WHITE));
		button_9.setBackground(new Color(255, 0, 51));
		button_9.setBounds(209, 190, 75, 40);
		getContentPane().add(button_9);
		
		JButton button_0 = new JButton("0");
		button_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_0.setBackground(Color.RED);
			}
			
			public void mouseReleased(MouseEvent e) {
				button_0.setBackground(Color.RED);
			}
		});
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_0.getText());
			}
		});
		button_0.setOpaque(true);
		button_0.setForeground(Color.WHITE);
		button_0.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.WHITE));
		button_0.setBackground(new Color(255, 0, 51));
		button_0.setBounds(122, 242, 75, 40);
		getContentPane().add(button_0);
		
		JButton button_plus = new JButton("+");
		button_plus.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_plus.setBackground(Color.GREEN);
			}
			
			public void mouseReleased(MouseEvent e) {
				button_plus.setBackground(new Color(0,255,0));
			}
		});
		button_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveValueOfArg1();
				saveValueOfMathOp(OPERATOR.PLUS);
			}
		});
		button_plus.setOpaque(true);
		button_plus.setForeground(Color.BLACK);
		button_plus.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.WHITE));
		button_plus.setBackground(new Color(51, 204, 0));
		button_plus.setBounds(327, 138, 75, 40);
		getContentPane().add(button_plus);
		
		JButton button_minus = new JButton("-");
		button_minus.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_minus.setBackground(Color.GREEN);
			}
			
			public void mouseReleased(MouseEvent e) {
				button_minus.setBackground(new Color(0,255, 0));
			}
		});
		button_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveValueOfArg1();
				saveValueOfMathOp(OPERATOR.MINUS);
			}
		});
		button_minus.setOpaque(true);
		button_minus.setForeground(Color.BLACK);
		button_minus.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.WHITE));
		button_minus.setBackground(new Color(51, 204, 0));
		button_minus.setBounds(327, 190, 75, 40);
		getContentPane().add(button_minus);
		
		JButton button_equals = new JButton("=");
		button_equals.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_equals.setBackground(Color.GREEN);
			}
			
			public void mouseReleased(MouseEvent e) {
				button_equals.setBackground(new Color(0, 255, 0));
			}
		});
		button_equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveValueOfArg2();
				calculateAnswer();
			}
		});
		button_equals.setOpaque(true);
		button_equals.setForeground(Color.BLACK);
		button_equals.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.WHITE));
		button_equals.setBackground(new Color(51, 204, 0));
		button_equals.setBounds(327, 242, 75, 40);
		getContentPane().add(button_equals);
		
		JButton button_clear = new JButton("AC");
		button_clear.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_clear.setBackground(Color.WHITE);
			}
			
			public void mouseReleased(MouseEvent e) {
				button_clear.setBackground(Color.GREEN);
			}
		});
		button_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearCalculator();
			}
		});
		button_clear.setOpaque(true);
		button_clear.setForeground(Color.BLACK);
		button_clear.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.WHITE));
		button_clear.setBackground(new Color(51, 204, 0));
		button_clear.setBounds(327, 85, 75, 40);
		getContentPane().add(button_clear);
		
	}
}


