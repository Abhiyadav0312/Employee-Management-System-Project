package bank.management.system;
import java.awt.Color;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener {
	JButton login,clear,signup;
	JTextField cardTextField;
	JPasswordField pinTextField;
	
	Login(){
		setTitle("AUTOMATED TELLER MACHINE");
		setLayout(null);
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("logo.jpg"));
		Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel label = new JLabel(i3);
		label.setBounds(70,10,100,100);
		add(label);
		
		JLabel text = new JLabel("WELCOME TO ATM");
		text.setFont(new Font("Osward",Font.BOLD,38));
		text.setBounds(200,40,400,40);
		add(text);
		
		JLabel cardno = new JLabel("Card No:");
		cardno.setFont(new Font("raleway",Font.BOLD,28));
		cardno.setBounds(200,150,150,30);
		add(cardno);
		
		 cardTextField = new JTextField();
		cardTextField.setBounds(380,150,250,30);
		cardTextField.setFont(new Font("Arial",Font.BOLD,14));
		add(cardTextField);
		
		JLabel pin = new JLabel("Pin:");
		pin.setFont(new Font("Raleway",Font.BOLD,28));
		pin.setBounds(200,220,400,40);
		add(pin);
		
		 pinTextField = new JPasswordField ();
		pinTextField.setBounds(380,220,250,30);
		pinTextField.setFont(new Font("Arial",Font.BOLD,14));
		add(pinTextField);
		
		 login = new JButton("SIGN IN");
		login.setBounds(380,300,100,30);
		login.setBackground(Color.BLACK);
		login.setForeground(Color.WHITE);
		login.addActionListener(this);
		add(login);
		
		clear = new JButton("CLEAR");
		clear.setBounds(530,300,100,30);
		clear.setBackground(Color.BLACK);
		clear.setForeground(Color.WHITE);
		clear.addActionListener(this);
		add(clear);
		
		signup = new JButton("SIGN UP");
		signup.setBounds(380,350,250,30);
		signup.setBackground(Color.BLACK);
		signup.setForeground(Color.WHITE);
		signup.addActionListener(this);
		add(signup);
		
		
		
		
		getContentPane().setBackground(Color.WHITE);
		setSize(800,480);
		setLocation(350,200);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae) {
		 if(ae.getSource()== clear) {
			 cardTextField.setText("");
			 pinTextField.setText("");
		
		
	}else if(ae.getSource() == login){
		
	}else if(ae.getSource() == signup) {
		setVisible(false);
		new SignupOne().setVisible(true);
		
	}
	}

	public static void main(String[] args) {
		new Login();
		

	}

}
