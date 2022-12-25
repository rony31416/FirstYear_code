import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Dialog", Font.BOLD, 12));
		frame.setBounds(100, 100, 350, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Scientific Calculator");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 22));
		lblNewLabel.setBounds(12, 12, 326, 15);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.BOLD, 14));
		textField.setBounds(12, 28, 318, 57);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u221A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 22));
		btnNewButton.setBounds(12, 108, 54, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("e^x");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnNewButton_1.setBounds(78, 108, 54, 37);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnSin.setFont(new Font("Ubuntu Thin", Font.BOLD, 14));
		btnSin.setBounds(144, 108, 54, 37);
		frame.getContentPane().add(btnSin);
		
		JButton btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setHorizontalAlignment(SwingConstants.LEADING);
		btnCos.setFont(new Font("Ubuntu Thin", Font.PLAIN, 14));
		btnCos.setBounds(210, 108, 54, 37);
		frame.getContentPane().add(btnCos);
		
		JButton btnTan = new JButton("tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.setFont(new Font("Ubuntu Thin", Font.PLAIN, 14));
		btnTan.setBounds(276, 108, 54, 37);
		frame.getContentPane().add(btnTan);
		
		JButton btnNewButton_5 = new JButton("π\n");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double a = Math.acos(-1);
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_5.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNewButton_5.setBounds(12, 157, 54, 37);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_1_1 = new JButton("log");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_1.setFont(new Font("Ubuntu Thin", Font.PLAIN, 14));
		btnNewButton_1_1.setBounds(78, 157, 54, 37);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("sinh");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_2_1.setFont(new Font("Ubuntu Thin", Font.PLAIN, 10));
		btnNewButton_2_1.setBounds(144, 157, 54, 37);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("cosh");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double a = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnNewButton_3_1.setFont(new Font("Ubuntu Thin", Font.PLAIN, 8));
		btnNewButton_3_1.setBounds(210, 157, 54, 37);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_4_1 = new JButton("tanh");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double a = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_4_1.setFont(new Font("Dialog", Font.PLAIN, 8));
		btnNewButton_4_1.setBounds(276, 157, 54, 37);
		frame.getContentPane().add(btnNewButton_4_1);
		
		JButton btnExponent = new JButton("x^y");
		btnExponent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "X^Y";
				
			}
		});
		btnExponent.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnExponent.setBounds(12, 206, 54, 37);
		frame.getContentPane().add(btnExponent);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnPercent.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnPercent.setBounds(78, 206, 54, 37);
		frame.getContentPane().add(btnPercent);
		
		JButton btnClear = new JButton("AC");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Dialog", Font.BOLD, 13));
		btnClear.setBounds(144, 206, 54, 37);
		frame.getContentPane().add(btnClear);
		
		JButton btnBackSpace = new JButton("D");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length()>0) 
				{
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
					
					
				}
				
				
			}
		});
		btnBackSpace.setFont(new Font("Dialog", Font.BOLD, 20));
		btnBackSpace.setBounds(210, 206, 54, 37);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
				
			}
		});
		btnAdd.setFont(new Font("Dialog", Font.PLAIN, 22));
		btnAdd.setBounds(276, 206, 54, 37);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSquare = new JButton("x^2");
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double a = Double.parseDouble(textField.getText());
				double fact = a*a;
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		btnSquare.setHorizontalAlignment(SwingConstants.LEFT);
		btnSquare.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnSquare.setBounds(12, 250, 54, 37);
		frame.getContentPane().add(btnSquare);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Dialog", Font.BOLD, 22));
		btn7.setBounds(78, 250, 54, 37);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Dialog", Font.BOLD, 22));
		btn8.setBounds(144, 250, 54, 37);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Dialog", Font.BOLD, 22));
		btn9.setBounds(210, 250, 54, 37);
		frame.getContentPane().add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnSub.setFont(new Font("Dialog", Font.PLAIN, 22));
		btnSub.setBounds(276, 250, 54, 37);
		frame.getContentPane().add(btnSub);
		
		JButton btnInverse = new JButton("1/x");
		btnInverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double a = 1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnInverse.setFont(new Font("Dialog", Font.PLAIN, 12));
		btnInverse.setBounds(12, 294, 54, 37);
		frame.getContentPane().add(btnInverse);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Dialog", Font.BOLD, 22));
		btn4.setBounds(78, 294, 54, 37);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Dialog", Font.BOLD, 22));
		btn5.setBounds(144, 294, 54, 37);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Dialog", Font.BOLD, 22));
		btn6.setBounds(210, 294, 54, 37);
		frame.getContentPane().add(btn6);
		
		JButton btnMul = new JButton("X");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnMul.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnMul.setBounds(276, 294, 54, 37);
		frame.getContentPane().add(btnMul);
		
		JButton btnFactorial = new JButton("n!");
		btnFactorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double a = Double.parseDouble(textField.getText());
				double fact = 1;
				while(a!=0) 
				{
					fact*=a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
			
		});
		btnFactorial.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnFactorial.setBounds(12, 338, 54, 37);
		frame.getContentPane().add(btnFactorial);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Dialog", Font.BOLD, 22));
		btn1.setBounds(78, 338, 54, 37);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Dialog", Font.BOLD, 22));
		btn2.setBounds(144, 338, 54, 37);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Dialog", Font.BOLD, 22));
		btn3.setBounds(210, 338, 54, 37);
		frame.getContentPane().add(btn3);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnDivide.setFont(new Font("Dialog", Font.PLAIN, 22));
		btnDivide.setBounds(276, 338, 54, 37);
		frame.getContentPane().add(btnDivide);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double a = Double.parseDouble(String.valueOf(textField.getText()));
				a = a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setFont(new Font("Dialog", Font.PLAIN, 12));
		btnPlusMinus.setBounds(12, 381, 54, 37);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
				
			}
		});
		btn0.setFont(new Font("Dialog", Font.BOLD, 22));
		btn0.setBounds(78, 381, 120, 37);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setVerticalAlignment(SwingConstants.BOTTOM);
		btnDot.setFont(new Font("Dialog", Font.BOLD, 30));
		btnDot.setBounds(210, 381, 54, 37);
		frame.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());
				
				if(operation == "+")
				{
					result = first+second;
					answer = String.format("%.2f", result);
					textField.setText(answer);				
				}
				
				else if(operation == "-")
				{
					result = first-second;
					answer = String.format("%.2f", result);
					textField.setText(answer);				
				}
				else if(operation == "*")
				{
					result = first*second;
					answer = String.format("%.2f", result);
					textField.setText(answer);				
				}
				else if(operation == "/")
				{
					result = first/second;
					answer = String.format("%.2f", result);
					textField.setText(answer);				
				}
				else if(operation == "%")
				{
					result = first%second;
					answer = String.format("%.2f", result);
					textField.setText(answer);				
				}
				else if(operation == "X^Y")
				{
					double res = 1;
					for(int i = 0 ; i < second;i++)
					{
						res = first*res;
					}
					
							
					answer = String.format("%.2f", res);
					textField.setText(answer);
					
				}
				else if(operation == "pi")
				{
					result = Math.acos(-1);
					answer = String.format("%f", result);
					textField.setText(answer);				
				}
				
				
				
			}
		});
		btnEqual.setFont(new Font("Dialog", Font.PLAIN, 22));
		btnEqual.setBounds(276, 381, 54, 37);
		frame.getContentPane().add(btnEqual);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.setVerticalAlignment(SwingConstants.BOTTOM);
		rdbtnNewRadioButton.setBounds(12, 93, 46, 17);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.setVerticalAlignment(SwingConstants.BOTTOM);
		rdbtnOff.setBounds(75, 93, 81, 17);
		frame.getContentPane().add(rdbtnOff);
	}
}
