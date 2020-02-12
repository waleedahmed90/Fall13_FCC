
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


public class StudentGUI extends JFrame implements ActionListener{

	private JPanel StuMenu;
	static JTextField logo;
	static JButton SearchButton, AddButton, backButton, deletebutton;
	static UIS mainMenu;
	static AddStudent newStudent;
	static SearchStudent searchStudent;
	
	StudentGUI(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Student Information Menu");	
		this.setResizable(false);	//non-extending
		this.setSize(800,600);		//frame dimensions. allocated pixels on screen
		this.setLocationRelativeTo(null);	//default panel setting-> screen mid
		
		StuMenu=new JPanel();
		StuMenu.setSize(800,600);
		StuMenu.setLayout(null);
		StuMenu.setBackground(Color.WHITE);
		
		logo=new JTextField();
		logo.setText("STUDENT MANAGEMENT MENU");
		logo.setFont(new Font("Courier New",Font.BOLD,26));
		logo.setSize(380,90);
		logo.setBorder(null);
		logo.setBackground(Color.WHITE);
		logo.setEditable(false);
		logo.setLocation(215,50);
		StuMenu.add(logo);
		
		
		
		backButton=new JButton();
		backButton.setSize(180,60);
		backButton.setText("Back");
		backButton.setFont(new Font("Courier New", Font.BOLD, 18));
		backButton.setLocation(2,2);
		backButton.setBackground(Color.WHITE);
		StuMenu.add(backButton);
		
		
		AddButton=new JButton();
		AddButton.setSize(180,60);
		AddButton.setText("Add Student");
		AddButton.setFont(new Font("Courier New", Font.BOLD, 18));
		AddButton.setLocation(45,200);
		AddButton.setBackground(Color.WHITE);
		StuMenu.add(AddButton);
		
		SearchButton=new JButton();
		SearchButton.setSize(180,60);
		SearchButton.setText("Search");
		SearchButton.setFont(new Font("Courier New", Font.BOLD, 18));
		SearchButton.setLocation(310,200);
		SearchButton.setBackground(Color.WHITE);
		StuMenu.add(SearchButton);
		
		deletebutton= new JButton();
		deletebutton.setSize(180,60);
		deletebutton.setText("Delete");
		deletebutton.setFont(new Font("Courier New", Font.BOLD, 18));
		deletebutton.setLocation(580,200);
		deletebutton.setBackground(Color.WHITE);
		StuMenu.add(deletebutton);
		
		
		backButton.addActionListener(this);
		SearchButton.addActionListener(this);
		AddButton.addActionListener(this);
		deletebutton.addActionListener(this);
		this.add(StuMenu);
	
	}
	
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == backButton){
			mainMenu= new UIS();
			this.dispose();
			mainMenu.setVisible(true);
		}
		else if(e.getSource() == AddButton){
			newStudent=new AddStudent();
			this.dispose();
			newStudent.setVisible(true);
		}
		else if(e.getSource() == SearchButton){
			searchStudent = new SearchStudent();
			this.dispose();
			searchStudent.setVisible(true);
		}
		else if(e.getSource() == deletebutton){
			DeleteStudent dS=new DeleteStudent();
			this.dispose();
			dS.setVisible(true);
		}
	}

}
