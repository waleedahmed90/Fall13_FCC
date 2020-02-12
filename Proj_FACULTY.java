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

public class FACULTY extends JFrame implements ActionListener{

	private JPanel FacMenu;
	static JTextField logo;
	static JButton SearchButton, AddButton, backButton, deletebutton;
	static UIS mainMenu;
	static AddTeacher newTeacher;
	static SearchTeacher searchTeacher;
	
	FACULTY(){
		
		this.setTitle("Faculty Information Menu");	
		this.setResizable(false);	//non-extending
		this.setSize(800,600);		//frame dimensions. allocated pixels on screen
		this.setLocationRelativeTo(null);	//default panel setting-> screen mid
		
		FacMenu=new JPanel();
		FacMenu.setSize(800,600);
		FacMenu.setLayout(null);
		FacMenu.setBackground(Color.WHITE);
		
		logo=new JTextField();
		logo.setText("FACULTY MANAGEMENT MENU");
		logo.setFont(new Font("Courier New",Font.BOLD,26));
		logo.setSize(380,90);
		logo.setBorder(null);
		logo.setBackground(Color.WHITE);
		logo.setEditable(false);
		logo.setLocation(215,50);
		FacMenu.add(logo);
		
		
		
		backButton=new JButton();
		backButton.setSize(180,60);
		backButton.setText("Back");
		backButton.setFont(new Font("Courier New", Font.BOLD, 18));
		backButton.setLocation(2,2);
		backButton.setBackground(Color.WHITE);
		FacMenu.add(backButton);
		
		
		AddButton=new JButton();
		AddButton.setSize(180,60);
		AddButton.setText("Add Teacher");
		AddButton.setFont(new Font("Courier New", Font.BOLD, 18));
		AddButton.setLocation(45,200);
		AddButton.setBackground(Color.WHITE);
		FacMenu.add(AddButton);
		
		SearchButton=new JButton();
		SearchButton.setSize(180,60);
		SearchButton.setText("Search");
		SearchButton.setFont(new Font("Courier New", Font.BOLD, 18));
		SearchButton.setLocation(310,200);
		SearchButton.setBackground(Color.WHITE);
		FacMenu.add(SearchButton);
		
		deletebutton= new JButton();
		deletebutton.setSize(180,60);
		deletebutton.setText("Delete");
		deletebutton.setFont(new Font("Courier New", Font.BOLD, 18));
		deletebutton.setLocation(580,200);
		deletebutton.setBackground(Color.WHITE);
		FacMenu.add(deletebutton);
		
		backButton.addActionListener(this);
		SearchButton.addActionListener(this);
		AddButton.addActionListener(this);
		deletebutton.addActionListener(this);
		
		this.add(FacMenu);
		
		
	
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == backButton){
			mainMenu= new UIS();
			this.dispose();
			mainMenu.setVisible(true);
		}
		else if(e.getSource() == AddButton){
			newTeacher=new AddTeacher();
			this.dispose();
			newTeacher.setVisible(true);
		}
		else if(e.getSource() == SearchButton){
			searchTeacher= new SearchTeacher();
			this.dispose();
			searchTeacher.setVisible(true);
		}
		
		else if(e.getSource() == deletebutton){
			DeleteTeacher dt=new DeleteTeacher();
			this.dispose();
			dt.setVisible(true);
		}
	}

}
