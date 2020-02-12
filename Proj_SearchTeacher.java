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

public class SearchTeacher extends JFrame implements ActionListener{

	private JPanel SearchTeacherMenu;
	static JTextField logo;
	static JButton backButton, submitButton;
	static FACULTY FacultyMenu;

	static JLabel Lname1, lresult;
	static JTextField fname1;
	static JTextField resultbar;
	
	
	static JLabel Lname, Laddress, Lemail, Lcourses, Lrank, Lsalary, Loffice;
	static JTextField fname, faddress, femail, fcourses, frank, fsalary, foffice;
	
	SearchTeacher(){
		this.setTitle("Searching a teacher");	
		this.setResizable(false);			//non-extending
		this.setSize(800,600);				//frame dimensions. allocated pixels on screen
		this.setLocationRelativeTo(null);	//default panel setting-> screen mid
		
		SearchTeacherMenu=new JPanel();
		SearchTeacherMenu.setSize(800,600);
		SearchTeacherMenu.setLayout(null);
		SearchTeacherMenu.setBackground(Color.WHITE);
		
		
		
		logo=new JTextField();
		logo.setText("SEARCH A TEACHER");
		logo.setFont(new Font("Courier New",Font.BOLD,26));
		logo.setSize(380,90);
		logo.setBorder(null);
		logo.setBackground(Color.WHITE);
		logo.setEditable(false);
		logo.setLocation(248,50);
		SearchTeacherMenu.add(logo);
		
		backButton=new JButton();
		backButton.setSize(180,60);
		backButton.setText("Back");
		backButton.setFont(new Font("Courier New", Font.BOLD, 18));
		backButton.setLocation(2,2);
		backButton.setBackground(Color.WHITE);
		SearchTeacherMenu.add(backButton);
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
		SearchTeacherMenu.add(Lname1);
		SearchTeacherMenu.add(fname1);
		


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
		SearchTeacherMenu.add(fname);
		SearchTeacherMenu.add(Lname);
		
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
		SearchTeacherMenu.add(faddress);
		SearchTeacherMenu.add(Laddress);
		
		
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
		SearchTeacherMenu.add(femail);
		SearchTeacherMenu.add(Lemail);
		
		
		//courses no field and label
		Lcourses=new JLabel();
		Lcourses.setSize(80,20);
		Lcourses.setLocation(25,255);
		Lcourses.setBackground(Color.WHITE);
		Lcourses.setText("Courses: ");
		fcourses=new JTextField();
		fcourses.setSize(450,20);
		fcourses.setLocation(109,255);
		fcourses.setEditable(false);
		fcourses.setBackground(Color.WHITE);
		SearchTeacherMenu.add(fcourses);
		SearchTeacherMenu.add(Lcourses);
		
		//rank label and field
		Lrank=new JLabel();
		Lrank.setSize(80,20);
		Lrank.setLocation(25,280);
		Lrank.setBackground(Color.WHITE);
		Lrank.setText("Rank: ");
		frank=new JTextField();
		frank.setSize(450,20);
		frank.setLocation(109,280);
		frank.setEditable(false);
		frank.setBackground(Color.WHITE);
		SearchTeacherMenu.add(frank);
		SearchTeacherMenu.add(Lrank);
		
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
		SearchTeacherMenu.add(fsalary);
		SearchTeacherMenu.add(Lsalary);
		
		
		//office label and field
		Loffice=new JLabel();
		Loffice.setSize(80,20);
		Loffice.setLocation(25,330);
		Loffice.setBackground(Color.WHITE);
		Loffice.setText("Office: ");
		foffice=new JTextField();
		foffice.setSize(450,20);
		foffice.setLocation(109,330);
		foffice.setEditable(false);
		foffice.setBackground(Color.WHITE);
		SearchTeacherMenu.add(foffice);
		SearchTeacherMenu.add(Loffice);
		
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
		SearchTeacherMenu.add(lresult);
		SearchTeacherMenu.add(resultbar);
						
				
				
		
		//submit button record save<->
		
		submitButton=new JButton();
		submitButton.setSize(140,40);
		submitButton.setLocation(380,480);
		submitButton.setBackground(Color.WHITE);
		submitButton.setText("SEARCH");
		SearchTeacherMenu.add(submitButton);
		submitButton.addActionListener(this);
		
		this.add(SearchTeacherMenu);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == backButton){
			FacultyMenu=new FACULTY();
			this.dispose();
			FacultyMenu.setVisible(true);
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
		Scanner scan = new Scanner(new File("Faculty.txt"));
		
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
				fcourses.setText(scan.nextLine()); 
				frank.setText(scan.nextLine());
				fsalary.setText(scan.nextLine());
				foffice.setText(scan.nextLine());
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
			fcourses.setText(""); 
			frank.setText("");
			fsalary.setText("");
			foffice.setText("");
		}
	}

}
