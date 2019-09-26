package task1;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class MyJavaFX implements ActionListener {
	JButton button, button1, button2, button3, button4;
	JLabel label, label1, label2;
	JTextField textfield;
	//String input = "";
	MyJavaFX() {
				
		JFrame f = new JFrame("ATM");
		JButton button = new JButton("Submit");
		button.setBounds(250, 200, 80, 30);
		JLabel label = new JLabel();
		label.setText("Enter an Account number 1-9:");
		label.setBounds(70, 65, 200, 100);	
		
		textfield = new JTextField();
		textfield.setBounds(250, 100, 230, 30);
		
		//input = textfield.getText();
		//System.out.println(input);
		button.setActionCommand("next");
		button.addActionListener(this);
		f.add(textfield);
		f.add(label);
		f.add(button);
		f.setSize(600, 300);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void actionPerformed(ActionEvent e) {
		MyJavaFX a1 = new MyJavaFX();
		
		JFrame f = new JFrame("ATM");
		if (e.getActionCommand() == "next") {
			label1 = new JLabel();
			label2 = new JLabel();
			
			label1.setText("Welcome Account");
			label1.setBounds(250, -10, 200, 100);
			label2.setText("What would you like to do?");
			label2.setBounds(230, 15, 200, 100);
			
			   
			
			button1 = new JButton("Check Balance");
			button1.setBounds(230, 85, 150, 30);
		
			button2 = new JButton("Withdraw Money");
			button2.setBounds(230, 125, 150, 30);
			button2.addActionListener(new WithdrawMoney());
			
			button3 = new JButton("Deposit Money");
			button3.setBounds(230, 165, 150, 30);
			button3.addActionListener(new DepositMoney());
			
			button4 = new JButton("Exit the Account");
			button4.setBounds(230, 205, 150, 30);
			button4.addActionListener(new CloseListener());
		
			f.add(label1);
			f.add(label2);
			
			f.add(button1);
			f.add(button2);
			f.add(button3);
			f.add(button4);
		
			
			f.setSize(600, 300);
			f.setLayout(null);
			f.setVisible(true);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

	public static void main(String[] args) {
		
		new MyJavaFX();
	}
}
