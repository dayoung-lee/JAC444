package task2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javafx.scene.Scene;

public class AddressBook implements ActionListener {
	JButton button, button1, button2, button3, button4, button5;
	JTextField textfield, textfield1, textfield2, textfield4;
	JLabel label, label1, label2, label3, label4;
	int fName, lName, city1, postal, prov1;
	
	
	final int FNAME = 32;
	final int LNAME = 32;
	final int CITY = 20;
	final int POSTAL1 = 6;
	protected int count = 0;

	public AddressBook() {
		fName = 32;
		lName = 32;
		city1 = 20;
		prov1 = 20;
		postal = 6;
		AddressBookGUI();
	}

	public void AddressBookGUI() {

		JFrame f = new JFrame("Address Book");

		label = new JLabel();
		label.setText("First Name:");
		label.setBounds(20, 40, 100, 20);
		textfield = new JTextField();
		textfield.setBounds(100, 40, 450, 28);

		label1 = new JLabel();
		label1.setText("Last Name:");
		label1.setBounds(20, 80, 100, 20);
		textfield1 = new JTextField();
		textfield1.setBounds(100, 80, 450, 28);

		label2 = new JLabel();
		label2.setText("City:");
		label2.setBounds(20, 130, 100, 20);
		textfield2 = new JTextField();
		textfield2.setBounds(60, 130, 100, 28);

		label3 = new JLabel();
		label3.setText("Province:");
		label3.setBounds(170, 130, 100, 20);

		String[] province = { "Select Province", "Alberta", "British Columbia", "Manitoba", "New Brunswick",
				"Newfoundland and Labrador", "Northwest Terriotories", "Nova Scotia", "Nunavut", "Ontario",
				"Prince Edward Island", "Quebec", "Saskatchewan", "Yukon" };

		JComboBox combo1 = new JComboBox(province);
		combo1.setBounds(235, 130, 120, 28);
		// prov1 = Integer.parseInt(combo1.getSelectedItem().toString());

		label4 = new JLabel();
		label4.setText("Postal Code:");
		label4.setBounds(370, 130, 100, 20);
		textfield4 = new JTextField();
		textfield4.setBounds(450, 130, 100, 28);

		button = new JButton("Add");
		button.setBounds(10, 190, 80, 30);
		button.addActionListener(this);

		button1 = new JButton("First");
		button1.setBounds(100, 190, 80, 30);

		button2 = new JButton("Next");
		button2.setBounds(190, 190, 80, 30);

		button3 = new JButton("Previous");
		button3.setBounds(280, 190, 90, 30);

		button4 = new JButton("Last");
		button4.setBounds(380, 190, 80, 30);

		button5 = new JButton("Update");
		button5.setBounds(470, 190, 80, 30);

		f.add(label);
		f.add(textfield);
		f.add(label1);
		f.add(textfield1);
		f.add(label2);
		f.add(textfield2);
		f.add(label3);
		f.add(combo1);
		f.add(label4);
		f.add(textfield4);

		// add
		f.add(button);
		button.addActionListener(this);
		// fist
		f.add(button1);
		button1.addActionListener(this);
		// next
		f.add(button2);
		button2.addActionListener(this);
		// previous
		f.add(button3);
		button3.addActionListener(this);
		// last
		f.add(button4);
		button4.addActionListener(this);
		// update
		f.add(button5);
		button5.addActionListener(this);

		f.setSize(600, 300);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			AddContact();
		}if (e.getSource() == button1) {
			firstContact();
		}if(e.getSource() == button2) {
			previousContact();
		}if(e.getSource() == button3) {
			lastContact();
		}if(e.getSource() == button4) {
			updateContact();
		}
	}


	// add
	private void AddContact() {
		try (RandomAccessFile inout = new RandomAccessFile("AddressBook.dat", "rw");){
			inout.seek(inout.length());
			write(inout);
		}
		catch(FileNotFoundException ex) {}
		catch (IOException ex) {}
		catch (IndexOutOfBoundsException ex) {}
	
	}

	//first
	
	private void firstContact() {
		try (RandomAccessFile inout = new RandomAccessFile("AddressBook.dat", "rw");) {
				if (inout.length() > 0) {
					inout.seek(0);
					read(inout);
					System.out.println("Reading address #1");
					count = 1;
				}
				else {
					System.out.println("Address is empty!");
				}
			}
			catch (IOException ex) {}
		
	}
	//previous
	private void previousContact() {
		try ( RandomAccessFile inout = new RandomAccessFile("AddressBook.dat", "rw");
			) {
				if (count > 1) 
					count--;
				else
					count = 1;
				inout.seek((count * 91) - 91);
				read(inout);
				System.out.println("Reading address #" + count);
			}
			catch (IOException ex) {}
		
	}
	// last
	private void lastContact() {
		try (RandomAccessFile inout = new RandomAccessFile("AddressBook.dat", "rw");) {
				count = ((int)inout.length()) / 91;
				inout.seek((count * 91) - 91);
				read(inout);
				System.out.println("Reading address #" + count);
			}
			catch (IOException ex) {}		
	}
	
	//update
	private void updateContact() {
		try (RandomAccessFile inout = new RandomAccessFile("AddressBook.dat", "rw");) {
			 	inout.seek(count * 91 - 91);
			 	write(inout);
			}
			catch (FileNotFoundException ex) {}
			catch (IOException ex) {}		
	}

	private void read(RandomAccessFile inout)throws IOException {
		AddressBook adb = new AddressBook();
		// TODO Auto-generated method stub
		int a, b;
		byte[] fName = new byte[FNAME];
		a = inout.read(fName);
		adb.textfield.setText(new String(fName));
		byte[] lName = new byte[LNAME];
		b = inout.read(lName);
		adb.textfield1.setText(new String(fName));
		
		byte[] city = new byte[CITY];
		a += inout.read(city);
		adb.textfield2.setText(new String(city));
		
		byte[] postal = new byte[POSTAL1];
		a += inout.read(postal);
		adb.textfield4.setText(new String(postal));		
		
	}

	
	private void write(RandomAccessFile inout) throws IOException {
		AddressBook adb = new AddressBook();
		inout.write(fixedLength(adb.textfield.getText().getBytes(), fName));
		inout.write(fixedLength(adb.textfield1.getText().getBytes(), lName));
		inout.write(fixedLength(adb.textfield2.getText().getBytes(), city1));
		// inout.write(fixedLength(adb.textfield.getText().getBytes(), prov1));
		inout.write(fixedLength(adb.textfield4.getText().getBytes(), postal));
		System.out.println("Address #" + count + " saved!");

	}

	private byte[] fixedLength(byte[] x, int n) {
		byte[] b = new byte[n];
		for (int i = 0; i < x.length; i++) {
			b[i] = x[i];
		}
		return b;
	}

	public static void main(String[] args) {

		new AddressBook();

	}
}
