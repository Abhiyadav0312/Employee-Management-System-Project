
package bank.management.system;
import java.awt.Color;

import javax.swing.*;
import java.awt.*;

import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener{
	long random;
	JTextField pan,adhar;

	JButton next;
	JRadioButton syes,sno,eyes,eno;
	JComboBox religion,occupation,category,education,income;
	String formno;
	

	public SignupTwo(String formno) {
		this.formno =  formno;
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
		
		String valReligion[] = {"hindu","Muslim","Sikh","Christan","Other"};
		religion = new JComboBox(valReligion);
		religion.setBounds(300,140,400,30);
		religion.setBackground(Color.WHITE);
		add(religion);
		
		
		JLabel fname = new JLabel("Category:");
		fname.setFont(new Font("Ralway",Font.BOLD,20));
		fname.setBounds(100,190,200,30);
		add(fname);
		
		String valcategory[] = {"General","OBC","ST","ST","Other"};
		 category = new JComboBox(valcategory);
		category.setBounds(300,190,400,30);
		category.setBackground(Color.WHITE);
		add(category);
		
		
		
		JLabel dob = new JLabel("Income:");
		dob.setFont(new Font("Ralway",Font.BOLD,20));
		dob.setBounds(100,240,200,30);
		add(dob);
		
		String incomecategory[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
		 income= new JComboBox(incomecategory);
		income.setBounds(300,240,400,30);
		income.setBackground(Color.WHITE);
		add(income);
		
		
		
		JLabel gender = new JLabel("Educational");
		gender.setFont(new Font("Ralway",Font.BOLD,20));
		gender.setBounds(100,290,200,30);
		add(gender);
		
		
		
		JLabel email = new JLabel("Qualification:");
		email.setFont(new Font("Ralway",Font.BOLD,20));
		email.setBounds(100,315,200,30);
		add(email);
		
		String occupationValues[] = {"Salaried","Non-Salaried","Bussiness","Retired","Other"};
		 occupation= new JComboBox(occupationValues);
		occupation.setBounds(300,390,400,30);
		occupation.setBackground(Color.WHITE);
		add(occupation);
		
		
		
		JLabel marital = new JLabel("Occupation:");
		marital.setFont(new Font("Ralway",Font.BOLD,20));
		marital.setBounds(100,390,200,30);
		add(marital);
		
		String educationalValues[] = {"Non-Graduate","Graduate","Post-Gratduate","Doctrate","Other"};
		 education= new JComboBox(educationalValues);
		education.setBounds(300,315,400,30);
		education.setBackground(Color.WHITE);
		add(education);
		
		
		
		
		
		
		
		JLabel address = new JLabel("PAN Number:");
		address.setFont(new Font("Ralway",Font.BOLD,20));
		address.setBounds(100,440,200,30);
		add(address);
		
		pan = new JTextField();
		pan .setFont(new Font("raleway",Font.BOLD,14));
		pan .setBounds(300,440,400,30);
		add(pan );
		
		JLabel city = new JLabel("Adhar Number:");
		city.setFont(new Font("Ralway",Font.BOLD,20));
		city.setBounds(100,490,200,30);
		add(city);
		
		adhar = new JTextField();
		adhar .setFont(new Font("raleway",Font.BOLD,14));
		adhar .setBounds(300,490,400,30);
		add(adhar );
		
		JLabel state = new JLabel("Senior Citizen:");
		state.setFont(new Font("Ralway",Font.BOLD,20));
		state.setBounds(100,540,200,30);
		add(state);
		
		 syes= new JRadioButton("Yes");
		 syes.setBounds(300,540, 100,30);
		 syes.setBackground(Color.WHITE);
			add(syes);
			
			 sno= new JRadioButton("No");
			 sno.setBounds(450,540, 100,30);
			 sno.setBackground(Color.WHITE);
			add(sno);
			
			ButtonGroup sgroup = new ButtonGroup();
			sgroup.add(syes);
			sgroup.add(sno);
			
		 
		
		JLabel pin= new JLabel("Existing Account:");
		pin.setFont(new Font("Ralway",Font.BOLD,20));
		pin.setBounds(100,590,200,30);
		add(pin);
		
		 eyes= new JRadioButton("Yes");
		 eyes.setBounds(300,590, 100,30);
		 eyes.setBackground(Color.WHITE);
			add(eyes);
			
			 eno= new JRadioButton("No");
			 eno.setBounds(450,590, 100,30);
			 eno.setBackground(Color.WHITE);
			add(eno);
			
			ButtonGroup egroup = new ButtonGroup();
			egroup.add(eyes);
			egroup.add(eno);
			
		
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
		String sreligion = (String)religion.getSelectedItem();
		String scategory = (String)category.getSelectedItem();
		String sincome = (String)income.getSelectedItem();
		String seducation = (String)education.getSelectedItem();
		String soccupation = (String)occupation.getSelectedItem();
		String seniorcitizen = null;
		if(syes.isSelected()) {
			seniorcitizen = "Yes";
		}else if(sno.isSelected()) {
			seniorcitizen = "No";
			
		}
		
		String existingaccount = null;
		if(eyes.isSelected()) {
			existingaccount = "Yes";
		}else if(eno.isSelected()) {
			existingaccount = "No";
		
		}
		String span = pan.getText();
		String sadhar = adhar.getText();
		
		
		try {
			
				Conn c = new Conn();
				String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+sadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
				
				c.s.executeUpdate(query);
				
				setVisible(false);
				new SignupThree(formno).setVisible(true);
				
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

	public static void main(String[] args) {
		new SignupTwo("");

	}

}

