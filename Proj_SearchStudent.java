
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


public class SearchStudent extends JFrame implements ActionListener{

	private JPanel SearchStudentMenu;
	static JTextField logo;
	static JButton backButton, submitButton;
	static StudentGUI StudentMenu;
	
	static JLabel Lname1, lresult;
	static JTextField fname1;
	static JTextField resultbar;
	
	static JLabel Lname, Laddress, Lemail, LRoll, Lcourse, LCGPA, Ldept;
	static JTextField fname, faddress, femail, fRoll, fcourse, fCGPA, fdept;
	
	SearchStudent(){
		this.setTitle("Searching a student");	
		this.setResizable(false);			//non-extending
		this.setSize(800,600);				//frame dimensions. allocated pixels on screen
		this.setLocationRelativeTo(null);	//default panel setting-> screen mid
		
		SearchStudentMenu=new JPanel();
		SearchStudentMenu.setSize(800,600);
		SearchStudentMenu.setLayout(null);
		SearchStudentMenu.setBackground(Color.WHITE);
		
		
		
		logo=new JTextField();
		logo.setText("SEARCH A STUDENT");
		logo.setFont(new Font("Courier New",Font.BOLD,26));
		logo.setSize(380,90);
		logo.setBorder(null);
		logo.setBackground(Color.WHITE);
		logo.setEditable(false);
		logo.setLocation(248,50);
		SearchStudentMenu.add(logo);
		
		backButton=new JButton();
		backButton.setSize(180,60);
		backButton.setText("Back");
		backButton.setFont(new Font("Courier New", Font.BOLD, 18));
		backButton.setLocation(2,2);
		backButton.setBackground(Color.WHITE);
		SearchStudentMenu.add(backButton);
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
		SearchStudentMenu.add(Lname1);
		SearchStudentMenu.add(fname1);
		

		
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
		SearchStudentMenu.add(fname);
		SearchStudentMenu.add(Lname);
		
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
		SearchStudentMenu.add(faddress);
		SearchStudentMenu.add(Laddress);
		
		
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
		SearchStudentMenu.add(femail);
		SearchStudentMenu.add(Lemail);
		
		
		//roll no field and label
		LRoll=new JLabel();
		LRoll.setSize(80,20);
		LRoll.setLocation(25,255);
		LRoll.setBackground(Color.WHITE);
		LRoll.setText("Roll #: ");
		fRoll=new JTextField();
		fRoll.setSize(450,20);
		fRoll.setLocation(109,255);
		fRoll.setEditable(false);
		fRoll.setBackground(Color.WHITE);
		SearchStudentMenu.add(fRoll);
		SearchStudentMenu.add(LRoll);
		
		//course label and field
		Lcourse=new JLabel();
		Lcourse.setSize(80,20);
		Lcourse.setLocation(25,280);
		Lcourse.setBackground(Color.WHITE);
		Lcourse.setText("Courses: ");
		fcourse=new JTextField();
		fcourse.setSize(450,20);
		fcourse.setLocation(109,280);
		fcourse.setEditable(false);
		fcourse.setBackground(Color.WHITE);
		SearchStudentMenu.add(fcourse);
		SearchStudentMenu.add(Lcourse);
		
		//dept label and field
		Ldept=new JLabel();
		Ldept.setSize(80,20);
		Ldept.setLocation(25,305);
		Ldept.setBackground(Color.WHITE);
		Ldept.setText("Major: ");
		fdept=new JTextField();
		fdept.setSize(450,20);
		fdept.setLocation(109,305);
		fdept.setEditable(false);
		fdept.setBackground(Color.WHITE);
		SearchStudentMenu.add(fdept);
		SearchStudentMenu.add(Ldept);
		
		
		//CGPA label and field
		LCGPA=new JLabel();
		LCGPA.setSize(80,20);
		LCGPA.setLocation(25,330);
		LCGPA.setBackground(Color.WHITE);
		LCGPA.setText("Major: ");
		fCGPA=new JTextField();
		fCGPA.setSize(450,20);
		fCGPA.setLocation(109,330);
		fCGPA.setEditable(false);
		fCGPA.setBackground(Color.WHITE);
		SearchStudentMenu.add(fdept);
		SearchStudentMenu.add(Ldept);
		
		
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
		SearchStudentMenu.add(lresult);
		SearchStudentMenu.add(resultbar);
				
		
		
		//submit button record save<->
		
		submitButton=new JButton();
		submitButton.setSize(140,40);
		submitButton.setLocation(380,480);
		submitButton.setBackground(Color.WHITE);
		submitButton.setText("SEARCH");
		SearchStudentMenu.add(submitButton);
		submitButton.addActionListener(this);
		
		this.add(SearchStudentMenu);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource() == backButton){
			StudentMenu=new StudentGUI();
			this.dispose();
			StudentMenu.setVisible(true);
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
		Scanner scan = new Scanner(new File("Student.txt"));
		
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
				fRoll.setText(scan.nextLine()); 
				fcourse.setText(scan.nextLine());
				fdept.setText(scan.nextLine());
				fCGPA.setText(scan.nextLine());
				resultbar.setText("DONE");
				
			}
		}
		
		if(flag){
			fname1.setText("");
			resultbar.setText("Not Found");
			fname1.setText("");
			fname.setText("");
			faddress.setText("");
			femail.setText(""); 
			fRoll.setText(""); 
			fcourse.setText("");
			fdept.setText("");
			fCGPA.setText("");
		}
	}


}
