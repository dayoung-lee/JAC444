package task1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class WithdrawMoney implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("ATM");
		Account account = new Account();

		JLabel label = new JLabel();
		label.setText("Enter the amount:");
		label.setBounds(70, 65, 200, 100);
		JTextField textfield = new JTextField();
		textfield.setBounds(250, 100, 230, 30);
		JButton button = new JButton("Withdraw");
		button.setBounds(250, 200, 100, 30);
		button.setActionCommand("next");

		f.add(label);
		f.add(button);
		f.add(textfield);
		f.setSize(600, 300);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void action(ActionEvent e) {
	
	}

}
