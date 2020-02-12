
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


public class AdminGUI extends JFrame implements ActionListener{

	private JPanel AdmMenu;
	static JTextField logo;
	static JButton SearchButton, AddButton, backButton ,deletebutton;
	static UIS mainMenu;
	static AddAdmin newAdmin;
	static SearchAdmin SearchAdminMenu;
	
	AdminGUI(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Admin Information Menu");	
		this.setResizable(false);	//non-extending
		this.setSize(800,600);		//frame dimensions. allocated pixels on screen
		this.setLocationRelativeTo(null);	//default panel setting-> screen mid
		
		AdmMenu=new JPanel();
		AdmMenu.setSize(800,600);
		AdmMenu.setLayout(null);
		AdmMenu.setBackground(Color.WHITE);
		
		logo=new JTextField();
		logo.setText("ADMIN MANAGEMENT MENU");
		logo.setFont(new Font("Courier New",Font.BOLD,26));
		logo.setSize(380,90);
		logo.setBorder(null);
		logo.setBackground(Color.WHITE);
		logo.setEditable(false);
		logo.setLocation(215,50);
		AdmMenu.add(logo);
		
		
		
		backButton=new JButton();
		backButton.setSize(180,60);
		backButton.setText("Back");
		backButton.setFont(new Font("Courier New", Font.BOLD, 18));
		backButton.setLocation(2,2);
		backButton.setBackground(Color.WHITE);
		AdmMenu.add(backButton);
		
		
		AddButton=new JButton();
		AddButton.setSize(180,60);
		AddButton.setText("Add Admin");
		AddButton.setFont(new Font("Courier New", Font.BOLD, 18));
		AddButton.setLocation(45,200);
		AddButton.setBackground(Color.WHITE);
		AdmMenu.add(AddButton);
		
		SearchButton=new JButton();
		SearchButton.setSize(180,60);
		SearchButton.setText("Search");
		SearchButton.setFont(new Font("Courier New", Font.BOLD, 18));
		SearchButton.setLocation(310,200);
		SearchButton.setBackground(Color.WHITE);
		AdmMenu.add(SearchButton);
		
		deletebutton= new JButton();
		deletebutton.setSize(180,60);
		deletebutton.setText("Delete");
		deletebutton.setFont(new Font("Courier New", Font.BOLD, 18));
		deletebutton.setLocation(580,200);
		deletebutton.setBackground(Color.WHITE);
		AdmMenu.add(deletebutton);
		
		backButton.addActionListener(this);
		SearchButton.addActionListener(this);
		AddButton.addActionListener(this);
		deletebutton.addActionListener(this);
		
		this.add(AdmMenu);
	
	}
	
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == backButton){
			mainMenu= new UIS();
			this.dispose();
			mainMenu.setVisible(true);
		}
		else if(e.getSource() == AddButton){
			newAdmin=new AddAdmin();
			this.dispose();
			newAdmin.setVisible(true);
		}
		else if(e.getSource() == SearchButton){
			SearchAdminMenu=new SearchAdmin();
			this.dispose();
			SearchAdminMenu.setVisible(true);
		}
		else if(e.getSource() == deletebutton){
			DeleteAdmin da=new DeleteAdmin();
			this.dispose();
			da.setVisible(true);
		}
	}
}
