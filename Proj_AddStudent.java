
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


public class AddStudent extends JFrame implements ActionListener{

	private JPanel AddStudentMenu;
	static JTextField logo;
	static JButton /*addbutton,*/ backButton, submitButton;
	static StudentGUI StudentMenu;
	static JLabel Lname, Laddress, Lemail, Lphn, LRoll, Lcourse, LCGPA, Ldept;
	static JTextField fname, faddress, femail, fphn, fRoll, fcourse, fCGPA, fdept;
	
	AddStudent(){
		this.setTitle("Adding a new student");	
		this.setResizable(false);			//non-extending
		this.setSize(800,600);				//frame dimensions. allocated pixels on screen
		this.setLocationRelativeTo(null);	//default panel setting-> screen mid
		
		AddStudentMenu=new JPanel();
		AddStudentMenu.setSize(800,600);
		AddStudentMenu.setLayout(null);
		AddStudentMenu.setBackground(Color.WHITE);
		
		
		
		logo=new JTextField();
		logo.setText("ADD A NEW STUDENT");
		logo.setFont(new Font("Courier New",Font.BOLD,26));
		logo.setSize(380,90);
		logo.setBorder(null);
		logo.setBackground(Color.WHITE);
		logo.setEditable(false);
		logo.setLocation(248,50);
		AddStudentMenu.add(logo);
		
		backButton=new JButton();
		backButton.setSize(180,60);
		backButton.setText("Back");
		backButton.setFont(new Font("Courier New", Font.BOLD, 18));
		backButton.setLocation(2,2);
		backButton.setBackground(Color.WHITE);
		AddStudentMenu.add(backButton);
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
		AddStudentMenu.add(fname);
		AddStudentMenu.add(Lname);
		
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
		AddStudentMenu.add(faddress);
		AddStudentMenu.add(Laddress);
		
		
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
		AddStudentMenu.add(femail);
		AddStudentMenu.add(Lemail);
		
		
		//phone no field and label
		Lphn=new JLabel();
		Lphn.setSize(80,20);
		Lphn.setLocation(25,255);
		Lphn.setBackground(Color.WHITE);
		Lphn.setText("Phone #: ");
		fphn=new JTextField();
		fphn.setSize(450,20);
		fphn.setLocation(109,255);
		fphn.setBackground(Color.WHITE);
		AddStudentMenu.add(fphn);
		AddStudentMenu.add(Lphn);
		
		//course label and field
		LRoll=new JLabel();
		LRoll.setSize(80,20);
		LRoll.setLocation(25,280);
		LRoll.setBackground(Color.WHITE);
		LRoll.setText("Roll #: ");
		fRoll=new JTextField();
		fRoll.setSize(450,20);
		fRoll.setLocation(109,280);
		fRoll.setBackground(Color.WHITE);
		AddStudentMenu.add(fRoll);
		AddStudentMenu.add(LRoll);
		
		//rank label and field
		LCGPA=new JLabel();
		LCGPA.setSize(80,20);
		LCGPA.setLocation(25,305);
		LCGPA.setBackground(Color.WHITE);
		LCGPA.setText("CGPA: ");
		fCGPA=new JTextField();
		fCGPA.setSize(450,20);
		fCGPA.setLocation(109,305);
		fCGPA.setBackground(Color.WHITE);
		AddStudentMenu.add(fCGPA);
		AddStudentMenu.add(LCGPA);
		
		
		//salary label and field
		Ldept=new JLabel();
		Ldept.setSize(80,20);
		Ldept.setLocation(25,330);
		Ldept.setBackground(Color.WHITE);
		Ldept.setText("Major: ");
		fdept=new JTextField();
		fdept.setSize(450,20);
		fdept.setLocation(109,330);
		fdept.setBackground(Color.WHITE);
		AddStudentMenu.add(fdept);
		AddStudentMenu.add(Ldept);
		
		//office field and label
		Lcourse=new JLabel();
		Lcourse.setSize(80,20);
		Lcourse.setLocation(25,355);
		Lcourse.setBackground(Color.WHITE);
		Lcourse.setText("Courses: ");
		fcourse=new JTextField();
		fcourse.setSize(450,20);
		fcourse.setLocation(109,355);
		fcourse.setBackground(Color.WHITE);
		AddStudentMenu.add(fcourse);
		AddStudentMenu.add(Lcourse);
		
		//submit button record save<->
		
		submitButton=new JButton();
		submitButton.setSize(140,40);
		submitButton.setLocation(380,480);
		submitButton.setBackground(Color.WHITE);
		submitButton.setText("SAVE");
		AddStudentMenu.add(submitButton);
		submitButton.addActionListener(this);
		
		this.add(AddStudentMenu);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource() == backButton){
			StudentMenu=new StudentGUI();
			this.dispose();
			StudentMenu.setVisible(true);
		}
		
		else if(e.getSource() == submitButton){
				
		Student t=new Student();
		
		t.set_name(String.valueOf(fname.getText())); t.set_Address(String.valueOf(faddress.getText())); 
		t.set_email(String.valueOf(femail.getText())); t.set_Roll(String.valueOf(fRoll.getText())); 
		t.set_Courses(String.valueOf(fcourse.getText())); t.set_Dept(String.valueOf(fdept.getText())); 
		t.set_CGPA(Double.valueOf(String.valueOf(fCGPA.getText())));
			//System.out.println(String.valueOf(fname.getText()));
		//t.set_salary(Double.valueOf(fname.getText()));
			//System.out.println(t.get_name());
				FileWriter fileWritter;
				try {
					fileWritter = new FileWriter("Student.txt",true);
					PrintWriter pr=new PrintWriter(fileWritter);
					
					pr.println(t.get_name());
					pr.println(t.get_Address());
					pr.println(t.get_email());
					pr.println(t.get_Roll());
					pr.println(t.get_Courses());
					pr.println(t.get_Dept());
					pr.println(t.get_CGPA());
					pr.println("                 ");
					
					pr.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				} 
			
			//going back to the student window
			StudentMenu=new StudentGUI();
			this.dispose();
			StudentMenu.setVisible(true);
			
		}
	}

}
