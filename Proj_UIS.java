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

public class UIS extends JFrame implements ActionListener{

	private JPanel mainMenu;
	static JTextField logo;
	static JButton Faculty, Student, Admin;
	static FACULTY faculty;
	static StudentGUI student;
	static AdminGUI admin;
	
	UIS(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//default close operation->action
		this.setTitle("FCC Information System");	
		this.setResizable(false);	//non-extending
		this.setSize(800,600);		//frame dimensions. allocated pixels on screen
		this.setLocationRelativeTo(null);	//default panel setting-> screen mid
		
		
		mainMenu=new JPanel();
		mainMenu.setSize(800,600);
		mainMenu.setLayout(null);
		mainMenu.setBackground(Color.WHITE);
		
		logo=new JTextField("  MAIN MENU");
		logo.setFont(new Font("Courier New",Font.BOLD,26));
		logo.setSize(320,90);
		logo.setBorder(null);
		logo.setBackground(Color.WHITE);
		logo.setEditable(false);
		logo.setLocation(300,50);
		mainMenu.add(logo);
		
		Faculty=new JButton();
		Faculty.setSize(180,60);
		Faculty.setText("FACULTY");
		Faculty.setFont(new Font("Courier New", Font.BOLD, 18));
		Faculty.setLocation(45,200);
		Faculty.setBackground(Color.WHITE);
		mainMenu.add(Faculty);
		
		Student=new JButton();
		Student.setSize(180,60);
		Student.setText("STUDENTS");
		Student.setFont(new Font("Courier New", Font.BOLD, 18));
		Student.setLocation(310,200);
		Student.setBackground(Color.WHITE);
		mainMenu.add(Student);
		
		Admin=new JButton();
		Admin.setSize(180,60);
		Admin.setText("ADMIN");
		Admin.setFont(new Font("Courier New", Font.BOLD, 18));
		Admin.setLocation(580,200);
		Admin.setBackground(Color.WHITE);
		mainMenu.add(Admin);
		
		
	

		Faculty.addActionListener(this);
		Student.addActionListener(this);
		Admin.addActionListener(this);
		
		
		this.add(mainMenu);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
			if(e.getSource() == Faculty){
				faculty=new FACULTY();
				this.dispose();	///amazing
				faculty.setVisible(true);
			}
			
			else if(e.getSource() == Student){
				student= new StudentGUI();
				this.dispose();
				student.setVisible(true);
			}
			else if(e.getSource() == Admin){
				admin=new AdminGUI();
				this.dispose();
				admin.setVisible(true);
			}

	}
	
}
