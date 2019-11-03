package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.ComponentOrientation;

import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainFrame extends JFrame {

	private JPanel contentPane;
	private double num1;
	private double num2;
	private double result;
	private boolean b;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainFrame frame = new mainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	static double add(double a, double b) {
		double result = a + b;
		return result;
	}

	static double sub(double a, double b) {
		double result = a - b;
		return result;
	}
	
	static double mult(double a , double b) {
		double result = a * b;
		return result;
	}
	
	static double div(double a , double b) {
		double result = a / b;
		return result;
	}
	
	
	public static String fmt(double d)
	{
	    if(d == (long) d)
	        return String.format("%d",(long)d);
	    else
	        return String.format("%s",d);
	}
	/**
	 * Create the frame.
	 */
	public mainFrame() {
		num1 = 0;
		num2 = 0;
		result = 0;
		b = false;
		
		
		setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 396);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Iman's Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JTextArea txtDisplay = new JTextArea();
		txtDisplay.setForeground(Color.WHITE);
		txtDisplay.setFont(new Font("Monospaced", Font.BOLD, 30));
		txtDisplay.setBackground(Color.GRAY);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b == false) {
					num1 = num1*10+7;
					txtDisplay.setText(fmt(num1));
				}
				else {
					num2 = num2*10+7;
					txtDisplay.setText(fmt(num2));
				}
				
				
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn7.setForeground(Color.BLACK);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1 = num1*10+8;
				txtDisplay.setText(fmt(num1));

			}
		});
		btn8.setForeground(Color.BLACK);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1 = num1*10+9;
				txtDisplay.setText(fmt(num1));

			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn9.setForeground(Color.BLACK);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = num1*10+4;
				txtDisplay.setText(fmt(num1));

			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn4.setForeground(Color.BLACK);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = num1*10+5;
				txtDisplay.setText(fmt(num1));

			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn5.setForeground(Color.BLACK);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = num1*10+6;
				txtDisplay.setText(fmt(num1));

			}
		});
		btn6.setForeground(Color.BLACK);
		
		JButton btnMultiply = new JButton("\u00D7");
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMultiply.setForeground(Color.BLACK);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = num1*10+1;
				txtDisplay.setText(fmt(num1));

			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn1.setForeground(Color.BLACK);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = num1*10+2;
				txtDisplay.setText(fmt(num1));

			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn2.setForeground(Color.BLACK);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = num1*10+3;
				txtDisplay.setText(fmt(num1));
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn3.setForeground(Color.BLACK);
		
		JButton btnSubtract = new JButton("-\t");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSubtract.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSubtract.setForeground(Color.BLACK);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = num1*10+0;
				txtDisplay.setText(fmt(num1));
			}
		});
		btn0.setForeground(Color.BLACK);
		
		JButton btnComma = new JButton(".");
		btnComma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnComma.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnComma.setForeground(Color.BLACK);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b = true;
				if(num1 > 0 && num2 > 0) {
					result = add(num1, num2);
					num1 = result;
					num2 = 0;
					txtDisplay.setText(fmt(result));
					
				}
			}
		});
		btnPlus.setForeground(Color.BLACK);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEqual.setForeground(Color.BLACK);
		
		JButton btnDivsion = new JButton("\u00F7 ");
		btnDivsion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDivsion.setForeground(Color.BLACK);
		btnDivsion.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton button_1 = new JButton("");
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton button_2 = new JButton("");
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(txtDisplay, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(btn4, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
											.addComponent(btn1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
										.addComponent(btnComma, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(btn2, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
										.addComponent(btn0, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
										.addComponent(btn5, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)))
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addComponent(btn7, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btn8, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(button, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnDivsion, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btn9, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnMultiply, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btn6, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnPlus, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
										.addComponent(btn3, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(btnSubtract, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnEqual, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))))))
					.addGap(20))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtDisplay, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(17)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDivsion, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnMultiply, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn9, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
						.addComponent(btn8, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn7, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btn6, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
						.addComponent(btnSubtract, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn4, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btn3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
								.addComponent(btn2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
								.addComponent(btn1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnPlus, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
								.addComponent(btn0, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnComma, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
						.addComponent(btnEqual, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
					.addGap(25))
		);
		contentPane.setLayout(gl_contentPane);
		txtDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	}
}
