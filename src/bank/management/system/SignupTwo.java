
package bank.management.system;
import java.awt.Color;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener{
	long random;
	JTextField nameTextField,fnameTextField,emailTextField, addressTextField,cityTextField,stateTextField,pinTextField;
	JDateChooser dateChooser;
	JButton next;
	JRadioButton male,female,married,unmarried,other;
	

	public SignupTwo() {
		setLayout(null);
		setTitle("NEW ACCOUNT FORM - PAGE 2");
		
		
		
		
		JLabel additionalDetails = new JLabel("Page 2: Additional Details");
		additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
		additionalDetails.setBounds(290,80,400,30);
		add(additionalDetails);
		
		JLabel name = new JLabel("Religion:");
		name.setFont(new Font("Raleway",Font.BOLD,20));
		name.setBounds(100,140,100,30);
		add(name);
		 nameTextField = new JTextField();
		nameTextField.setFont(new Font("raleway",Font.BOLD,14));
		nameTextField.setBounds(300,140,400,30);
		add(nameTextField);
		
		JLabel fname = new JLabel("Category:");
		fname.setFont(new Font("Ralway",Font.BOLD,20));
		fname.setBounds(100,190,200,30);
		add(fname);
		 fnameTextField = new JTextField();
		fnameTextField.setFont(new Font("raleway",Font.BOLD,14));
		fnameTextField.setBounds(300,190,400,30);
		add(fnameTextField);
		
		JLabel dob = new JLabel("Income:");
		dob.setFont(new Font("Ralway",Font.BOLD,20));
		dob.setBounds(100,240,200,30);
		add(dob);
		
		 dateChooser = new JDateChooser();
		dateChooser.setBounds(300, 240, 200, 30);
		add(dateChooser);
		
		
		JLabel gender = new JLabel("Educational:");
		gender.setFont(new Font("Ralway",Font.BOLD,20));
		gender.setBounds(100,290,200,30);
		add(gender);
		
		 male = new JRadioButton("Male");
		male.setBounds(300,290, 60,30);
		male.setBackground(Color.WHITE);
		add(male);
		
		 female = new JRadioButton("Female");
		female.setBounds(450,290, 120,30);
		female.setBackground(Color.WHITE);
		add(female);
		
		ButtonGroup gendergroup = new ButtonGroup();
		gendergroup.add(male);
		gendergroup.add(female);
		
		JLabel email = new JLabel("Qualification:");
		email.setFont(new Font("Ralway",Font.BOLD,20));
		email.setBounds(100,340,200,30);
		add(email);
		emailTextField = new JTextField();
		emailTextField.setFont(new Font("raleway",Font.BOLD,14));
		emailTextField.setBounds(300,340,400,30);
		add(emailTextField);
		
		JLabel marital = new JLabel("Occupation:");
		marital.setFont(new Font("Ralway",Font.BOLD,20));
		marital.setBounds(100,390,200,30);
		add(marital);
		
		 married= new JRadioButton("Married");
		married.setBounds(300,390, 100,30);
		married.setBackground(Color.WHITE);
		add(married);
		
		 unmarried= new JRadioButton("Unmarried");
		unmarried.setBounds(450,390, 100,30);
		unmarried.setBackground(Color.WHITE);
		add(unmarried);
		
		 other= new JRadioButton("Other");
		other.setBounds(630,390, 100,30);
		other.setBackground(Color.WHITE);
		add(other);
		
		
		ButtonGroup maritalgroup = new ButtonGroup();
		maritalgroup.add(married);
		maritalgroup.add(unmarried);
		maritalgroup.add(other);
		
		
		
		
		
		JLabel address = new JLabel("PAN Number:");
		address.setFont(new Font("Ralway",Font.BOLD,20));
		address.setBounds(100,440,200,30);
		add(address);
		 addressTextField = new JTextField();
		addressTextField.setFont(new Font("raleway",Font.BOLD,14));
		addressTextField.setBounds(300,440,400,30);
		add(addressTextField);
		
		JLabel city = new JLabel("Adhar Number:");
		city.setFont(new Font("Ralway",Font.BOLD,20));
		city.setBounds(100,490,200,30);
		add(city);
		cityTextField = new JTextField();
		cityTextField.setFont(new Font("raleway",Font.BOLD,14));
		cityTextField.setBounds(300,490,400,30);
		add(cityTextField);
		
		JLabel state = new JLabel("Senior Citizen:");
		state.setFont(new Font("Ralway",Font.BOLD,20));
		state.setBounds(100,540,200,30);
		add(state);
		 stateTextField = new JTextField();
		stateTextField.setFont(new Font("raleway",Font.BOLD,14));
		stateTextField.setBounds(300,540,400,30);
		add(stateTextField);
		
		JLabel pin= new JLabel("Existing Account:");
		pin.setFont(new Font("Ralway",Font.BOLD,20));
		pin.setBounds(100,590,200,30);
		add(pin);
		 pinTextField = new JTextField();
		pinTextField.setFont(new Font("raleway",Font.BOLD,14));
		pinTextField.setBounds(300,590,400,30);
		add(pinTextField);
		
		  next = new JButton("NEXT");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway", Font.BOLD,14));
		next.setBounds(620, 660, 80, 30);
		next.addActionListener(this);
		add(next);
		
		
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(850,800);
		setLocation(350,10);
		setVisible(true);
		
		
	}
	public void actionPerformed(ActionEvent ae) {
		String formno = ""+ random;
		String name = nameTextField.getText();
		String fname = fnameTextField.getText();
		String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
		String gender = null;
		if(male.isSelected()) {
			gender = "Male";
		}else if(female.isSelected()) {
			gender = "Female";
			
		}
		String email = emailTextField.getText();
		String marital = null;
		if(married.isSelected()) {
			marital = "Married";
		}else if(unmarried.isSelected()) {
			marital = "Unmarried";
		}else {
			marital = "Other";
		}
		String address = addressTextField.getText();
		String city = cityTextField.getText();
		String state = stateTextField.getText();
		String pin = pinTextField.getText();
		
		try {
			if(name.equals("")) {
				JOptionPane.showMessageDialog(null,"Name Is Required");
			}else {
				Conn c = new Conn();
				String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+email+"','"+address+"','"+pin+"','"+dob+"','"+gender+"','"+marital+"','"+city+"','"+state+"')";
				
				c.s.executeUpdate(query);
				
			}
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

	public static void main(String[] args) {
		new SignupTwo();

	}

}

