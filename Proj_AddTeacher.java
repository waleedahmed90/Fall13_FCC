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

public class AddTeacher extends JFrame implements ActionListener{

	private JPanel AddTeacherMenu;
	static JTextField logo;
	static JButton backButton, submitButton;
	static FACULTY FacultyMenu;
	static JLabel Lname, Laddress, Lemail, Lphn, Lcourses, Lrank, Lsalary, Loffice;
	static JTextField fname, faddress, femail, fphn, fcourses, frank, fsalary, foffice;
	
	AddTeacher(){
		this.setTitle("Adding a new teacher");	
		this.setResizable(false);			//non-extending
		this.setSize(800,600);				//frame dimensions. allocated pixels on screen
		this.setLocationRelativeTo(null);	//default panel setting-> screen mid
		
		AddTeacherMenu=new JPanel();
		AddTeacherMenu.setSize(800,600);
		AddTeacherMenu.setLayout(null);
		AddTeacherMenu.setBackground(Color.WHITE);
		
		
		
		logo=new JTextField();
		logo.setText("ADD A NEW TEACHER");
		logo.setFont(new Font("Courier New",Font.BOLD,26));
		logo.setSize(380,90);
		logo.setBorder(null);
		logo.setBackground(Color.WHITE);
		logo.setEditable(false);
		logo.setLocation(248,50);
		AddTeacherMenu.add(logo);
		
		backButton=new JButton();
		backButton.setSize(180,60);
		backButton.setText("Back");
		backButton.setFont(new Font("Courier New", Font.BOLD, 18));
		backButton.setLocation(2,2);
		backButton.setBackground(Color.WHITE);
		AddTeacherMenu.add(backButton);
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
		AddTeacherMenu.add(fname);
		AddTeacherMenu.add(Lname);
		
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
		AddTeacherMenu.add(faddress);
		AddTeacherMenu.add(Laddress);
		
		
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
		AddTeacherMenu.add(femail);
		AddTeacherMenu.add(Lemail);
		
		
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
		AddTeacherMenu.add(fphn);
		AddTeacherMenu.add(Lphn);
		
		//courses label and field
		Lcourses=new JLabel();
		Lcourses.setSize(80,20);
		Lcourses.setLocation(25,280);
		Lcourses.setBackground(Color.WHITE);
		Lcourses.setText("Courses: ");
		fcourses=new JTextField();
		fcourses.setSize(450,20);
		fcourses.setLocation(109,280);
		fcourses.setBackground(Color.WHITE);
		AddTeacherMenu.add(fcourses);
		AddTeacherMenu.add(Lcourses);
		
		//rank label and field
		Lrank=new JLabel();
		Lrank.setSize(80,20);
		Lrank.setLocation(25,305);
		Lrank.setBackground(Color.WHITE);
		Lrank.setText("Rank: ");
		frank=new JTextField();
		frank.setSize(450,20);
		frank.setLocation(109,305);
		frank.setBackground(Color.WHITE);
		AddTeacherMenu.add(frank);
		AddTeacherMenu.add(Lrank);
		
		
		//salary label and field
		Lsalary=new JLabel();
		Lsalary.setSize(80,20);
		Lsalary.setLocation(25,330);
		Lsalary.setBackground(Color.WHITE);
		Lsalary.setText("Salary: ");
		fsalary=new JTextField();
		fsalary.setSize(450,20);
		fsalary.setLocation(109,330);
		fsalary.setBackground(Color.WHITE);
		AddTeacherMenu.add(fsalary);
		AddTeacherMenu.add(Lsalary);
		
		//office field and label
		Loffice=new JLabel();
		Loffice.setSize(80,20);
		Loffice.setLocation(25,355);
		Loffice.setBackground(Color.WHITE);
		Loffice.setText("Office: ");
		foffice=new JTextField();
		foffice.setSize(450,20);
		foffice.setLocation(109,355);
		foffice.setBackground(Color.WHITE);
		AddTeacherMenu.add(foffice);
		AddTeacherMenu.add(Loffice);
		
		//submit button record save<->
		
		submitButton=new JButton();
		submitButton.setSize(140,40);
		submitButton.setLocation(380,480);
		submitButton.setBackground(Color.WHITE);
		submitButton.setText("SAVE");
		AddTeacherMenu.add(submitButton);
		submitButton.addActionListener(this);
		
		this.add(AddTeacherMenu);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource() == backButton){
			FacultyMenu=new FACULTY();
			this.dispose();
			FacultyMenu.setVisible(true);
		}
		
		else if(e.getSource() == submitButton){
				
		teacher t=new teacher();
		t.set_name(String.valueOf(fname.getText())); t.set_Address(String.valueOf(faddress.getText())); 
		t.set_email(String.valueOf(femail.getText())); t.set_course(String.valueOf(fcourses.getText())); 
		t.set_rank(String.valueOf(frank.getText())); t.set_office(String.valueOf(foffice.getText())); 
		t.set_salary(Double.valueOf(String.valueOf(fsalary.getText())));
			//System.out.println(String.valueOf(fname.getText()));
		//t.set_salary(Double.valueOf(fname.getText()));
			//System.out.println(t.get_name());
				FileWriter fileWritter;
				try {
					fileWritter = new FileWriter("Faculty.txt",true);
					PrintWriter pr=new PrintWriter(fileWritter);
					
					pr.println(t.get_name());
					pr.println(t.get_Address());
					pr.println(t.get_email());
					pr.println(t.get_course());
					pr.println(t.get_office());
					pr.println(t.get_rank());
					pr.println(t.get_salary());
					pr.println("             ");
					pr.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				} 
			
			//going back to the faculty window
			FacultyMenu=new FACULTY();
			this.dispose();
			FacultyMenu.setVisible(true);
			
		}
	}

}
