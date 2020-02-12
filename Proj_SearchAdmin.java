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

public class SearchAdmin extends JFrame implements ActionListener{
	
	private JPanel SearchAdminMenu;
	static JTextField logo;
	static JButton backButton, submitButton;
	static AdminGUI AdminMenu;
	static JLabel Lname1, lresult;
	static JTextField fname1;
	static JTextField resultbar;
	static JLabel Lname, Laddress, Lemail, Ldesig, Loffice, Lsalary;
	static JTextField fname, faddress, femail, fdesig, foffice, fsalary;
	
	SearchAdmin(){
		this.setTitle("Searching an Employee");	
		this.setResizable(false);			//non-extending
		this.setSize(800,600);				//frame dimensions. allocated pixels on screen
		this.setLocationRelativeTo(null);	//default panel setting-> screen mid
		
		SearchAdminMenu=new JPanel();
		SearchAdminMenu.setSize(800,600);
		SearchAdminMenu.setLayout(null);
		SearchAdminMenu.setBackground(Color.WHITE);
		
		
		
		logo=new JTextField();
		logo.setText("SEARCH AN EMPLOYEE");
		logo.setFont(new Font("Courier New",Font.BOLD,26));
		logo.setSize(380,90);
		logo.setBorder(null);
		logo.setBackground(Color.WHITE);
		logo.setEditable(false);
		logo.setLocation(248,50);
		SearchAdminMenu.add(logo);
		
		backButton=new JButton();
		backButton.setSize(180,60);
		backButton.setText("Back");
		backButton.setFont(new Font("Courier New", Font.BOLD, 18));
		backButton.setLocation(2,2);
		backButton.setBackground(Color.WHITE);
		SearchAdminMenu.add(backButton);
		backButton.addActionListener(this);
		
		//query bar
		
		Lname1=new JLabel();
		Lname1.setSize(150,20);
		Lname1.setLocation(20,130);
		Lname1.setText("Enter the name to search: ");
		Lname1.setBackground(Color.WHITE);
		fname1=new JTextField();
		fname1.setSize(380,20);
		fname1.setLocation(174,130);
		fname1.setBackground(Color.WHITE);
		SearchAdminMenu.add(Lname1);
		SearchAdminMenu.add(fname1);
		
		//name label and field
		Lname=new JLabel();
		Lname.setSize(80,20);
		Lname.setLocation(25,180);
		Lname.setBackground(Color.WHITE);
		Lname.setText("Name: ");
		fname=new JTextField();
		fname.setSize(450,20);
		fname.setLocation(109,180);
		fname.setEditable(false);
		fname.setBackground(Color.WHITE);
		SearchAdminMenu.add(fname);
		SearchAdminMenu.add(Lname);
		
		//address field and label
		Laddress=new JLabel();
		Laddress.setSize(80,20);
		Laddress.setLocation(25,205);
		Laddress.setBackground(Color.WHITE);
		Laddress.setText("Address: ");
		faddress=new JTextField();
		faddress.setSize(450,20);
		faddress.setLocation(109,205);
		faddress.setEditable(false);
		faddress.setBackground(Color.WHITE);
		SearchAdminMenu.add(faddress);
		SearchAdminMenu.add(Laddress);
		
		
		//email field and label
		Lemail=new JLabel();
		Lemail.setSize(80,20);
		Lemail.setLocation(25,230);
		Lemail.setBackground(Color.WHITE);
		Lemail.setText("Email: ");
		femail=new JTextField();
		femail.setSize(450,20);
		femail.setLocation(109,230);
		femail.setEditable(false);
		femail.setBackground(Color.WHITE);
		SearchAdminMenu.add(femail);
		SearchAdminMenu.add(Lemail);
		
		
		//desig no field and label
		Ldesig=new JLabel();
		Ldesig.setSize(80,20);
		Ldesig.setLocation(25,255);
		Ldesig.setBackground(Color.WHITE);
		Ldesig.setText("Designation: ");
		fdesig=new JTextField();
		fdesig.setSize(450,20);
		fdesig.setLocation(109,255);
		fdesig.setEditable(false);
		fdesig.setBackground(Color.WHITE);
		SearchAdminMenu.add(fdesig);
		SearchAdminMenu.add(Ldesig);
		
		//office label and field
		Loffice=new JLabel();
		Loffice.setSize(80,20);
		Loffice.setLocation(25,280);
		Loffice.setBackground(Color.WHITE);
		Loffice.setText("Office: ");
		foffice=new JTextField();
		foffice.setSize(450,20);
		foffice.setLocation(109,280);
		foffice.setEditable(false);
		foffice.setBackground(Color.WHITE);
		SearchAdminMenu.add(foffice);
		SearchAdminMenu.add(Loffice);
		
		//salary label and field
		Lsalary=new JLabel();
		Lsalary.setSize(80,20);
		Lsalary.setLocation(25,305);
		Lsalary.setBackground(Color.WHITE);
		Lsalary.setText("Salary: ");
		fsalary=new JTextField();
		fsalary.setSize(450,20);
		fsalary.setLocation(109,305);
		fsalary.setEditable(false);
		fsalary.setBackground(Color.WHITE);
		SearchAdminMenu.add(fsalary);
		SearchAdminMenu.add(Lsalary);
		
		//record result bar
		lresult=new JLabel();
		lresult.setSize(60,20);
		lresult.setLocation(717,510);
		lresult.setBackground(Color.WHITE);
		lresult.setText("RESULT");
		resultbar= new JTextField();
		resultbar.setSize(100,40);
		resultbar.setLocation(690,529);
		resultbar.setEditable(false);
		SearchAdminMenu.add(lresult);
		SearchAdminMenu.add(resultbar);
		
		//submit button record save<->
		
		submitButton=new JButton();
		submitButton.setSize(140,40);
		submitButton.setLocation(380,380);
		submitButton.setBackground(Color.WHITE);
		submitButton.setText("SEARCH");
		SearchAdminMenu.add(submitButton);
		submitButton.addActionListener(this);
		
		this.add(SearchAdminMenu);
	
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource() == backButton){
				AdminMenu= new AdminGUI();
				this.dispose();
				AdminMenu.setVisible(true);
			
		}
		
		else if(e.getSource() == submitButton){
			try {
				SearchFile(fname1.getText());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public void SearchFile(String s)throws IOException{
		Scanner scan = new Scanner(new File("Admin.txt"));
		
		boolean flag=true;
		
		String temp;
		
		while(scan.hasNextLine()){
		
			temp=scan.nextLine();
			
			if(temp.equals(s)){
				
				flag=false;
				
				fname1.setText("");
				fname.setText(temp);
				faddress.setText(scan.nextLine());
				femail.setText(scan.nextLine()); 
				fdesig.setText(scan.nextLine()); 
				foffice.setText(scan.nextLine());
				fsalary.setText(scan.nextLine());
				
				resultbar.setText("DONE");
				
			}
		}
		
		if(flag){
			fname1.setText("");
			resultbar.setText("Not Found");
		}
		
		return;
		
	}
}
