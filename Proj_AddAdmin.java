
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.PrintWriter;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;


public class AddAdmin extends JFrame implements ActionListener {

	private JPanel AddAdminMenu;
	static JTextField logo;
	static JButton backButton, submitButton;
	static AdminGUI AdminMenu;
	static JLabel Lname, Laddress, Lemail, Ldesig, Loffice, Lsalary;
	static JTextField fname, faddress, femail, fdesig, foffice, fsalary;
	
	AddAdmin(){
		this.setTitle("Adding a new employee");	
		this.setResizable(false);			//non-extending
		this.setSize(800,600);				//frame dimensions. allocated pixels on screen
		this.setLocationRelativeTo(null);	//default panel setting-> screen mid
		
		AddAdminMenu=new JPanel();
		AddAdminMenu.setSize(800,600);
		AddAdminMenu.setLayout(null);
		AddAdminMenu.setBackground(Color.WHITE);
		
		
		
		logo=new JTextField();
		logo.setText("ADD A NEW EMPLOYEE");
		logo.setFont(new Font("Courier New",Font.BOLD,26));
		logo.setSize(380,90);
		logo.setBorder(null);
		logo.setBackground(Color.WHITE);
		logo.setEditable(false);
		logo.setLocation(248,50);
		AddAdminMenu.add(logo);
		
		backButton=new JButton();
		backButton.setSize(180,60);
		backButton.setText("Back");
		backButton.setFont(new Font("Courier New", Font.BOLD, 18));
		backButton.setLocation(2,2);
		backButton.setBackground(Color.WHITE);
		AddAdminMenu.add(backButton);
		backButton.addActionListener(this);
		
		//name label and field
		Lname=new JLabel();
		Lname.setSize(80,20);
		Lname.setLocation(25,180);
		Lname.setBackground(Color.WHITE);
		Lname.setText("Name: ");
		fname=new JTextField();
		fname.setSize(450,20);
		fname.setLocation(109,180);
		fname.setBackground(Color.WHITE);
		AddAdminMenu.add(fname);
		AddAdminMenu.add(Lname);
		
		//address field and label
		Laddress=new JLabel();
		Laddress.setSize(80,20);
		Laddress.setLocation(25,205);
		Laddress.setBackground(Color.WHITE);
		Laddress.setText("Address: ");
		faddress=new JTextField();
		faddress.setSize(450,20);
		faddress.setLocation(109,205);
		faddress.setBackground(Color.WHITE);
		AddAdminMenu.add(faddress);
		AddAdminMenu.add(Laddress);
		
		
		//email field and label
		Lemail=new JLabel();
		Lemail.setSize(80,20);
		Lemail.setLocation(25,230);
		Lemail.setBackground(Color.WHITE);
		Lemail.setText("Email: ");
		femail=new JTextField();
		femail.setSize(450,20);
		femail.setLocation(109,230);
		femail.setBackground(Color.WHITE);
		AddAdminMenu.add(femail);
		AddAdminMenu.add(Lemail);
		
		
		//desig no field and label
		Ldesig=new JLabel();
		Ldesig.setSize(80,20);
		Ldesig.setLocation(25,255);
		Ldesig.setBackground(Color.WHITE);
		Ldesig.setText("Designation: ");
		fdesig=new JTextField();
		fdesig.setSize(450,20);
		fdesig.setLocation(109,255);
		fdesig.setBackground(Color.WHITE);
		AddAdminMenu.add(fdesig);
		AddAdminMenu.add(Ldesig);
		
		//office label and field
		Loffice=new JLabel();
		Loffice.setSize(80,20);
		Loffice.setLocation(25,280);
		Loffice.setBackground(Color.WHITE);
		Loffice.setText("Office: ");
		foffice=new JTextField();
		foffice.setSize(450,20);
		foffice.setLocation(109,280);
		foffice.setBackground(Color.WHITE);
		AddAdminMenu.add(foffice);
		AddAdminMenu.add(Loffice);
		
		//salary label and field
		Lsalary=new JLabel();
		Lsalary.setSize(80,20);
		Lsalary.setLocation(25,305);
		Lsalary.setBackground(Color.WHITE);
		Lsalary.setText("Salary: ");
		fsalary=new JTextField();
		fsalary.setSize(450,20);
		fsalary.setLocation(109,305);
		fsalary.setBackground(Color.WHITE);
		AddAdminMenu.add(fsalary);
		AddAdminMenu.add(Lsalary);
		
		//submit button record save<->
		
		submitButton=new JButton();
		submitButton.setSize(140,40);
		submitButton.setLocation(380,380);
		submitButton.setBackground(Color.WHITE);
		submitButton.setText("SAVE");
		AddAdminMenu.add(submitButton);
		submitButton.addActionListener(this);
		
		this.add(AddAdminMenu);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource() == backButton){
			AdminMenu=new AdminGUI();
			this.dispose();
			AdminMenu.setVisible(true);
		}
		
		else if(e.getSource() == submitButton){
				
		Employee t=new Employee();
		t.set_name(String.valueOf(fname.getText())); t.set_Address(String.valueOf(faddress.getText())); 
		t.set_email(String.valueOf(femail.getText())); t.set_designation(String.valueOf(fdesig.getText())); 
		t.set_office(String.valueOf(foffice.getText())); t.set_salary(Double.valueOf(String.valueOf(fsalary.getText()))); 
		
		FileWriter fileWritter;
				try {
					fileWritter = new FileWriter("Admin.txt",true);
					PrintWriter pr=new PrintWriter(fileWritter);
					
					pr.println(t.get_name());
					pr.println(t.get_Address());
					pr.println(t.get_email());
					pr.println(t.get_designation());
					pr.println(t.get_office());
					pr.println(t.get_salary());
					pr.println("              ");
					
					pr.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				} 
			
			//going back to the admin window
			AdminMenu=new AdminGUI();
			this.dispose();
			AdminMenu.setVisible(true);
			
		}
	}

}
