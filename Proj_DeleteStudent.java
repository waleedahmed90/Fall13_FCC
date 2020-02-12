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

public class DeleteStudent extends JFrame implements ActionListener{

	private JPanel DeleteStudentMenu;
	static JTextField logo;
	static JButton backButton, deleteButton;
	static AdminGUI AdminMenu;
	static JLabel Lname1, Lresult;
	static JTextField fname1, resultbar;
	
	DeleteStudent(){
		this.setTitle("Deleting a Student");	
		this.setResizable(false);			//non-extending
		this.setSize(800,600);				//frame dimensions. allocated pixels on screen
		this.setLocationRelativeTo(null);	//default panel setting-> screen mid

		DeleteStudentMenu=new JPanel();
		DeleteStudentMenu.setSize(800,600);
		DeleteStudentMenu.setLayout(null);
		DeleteStudentMenu.setBackground(Color.WHITE);
		
		
		
		logo=new JTextField();
		logo.setText("DELETE A STUDENT");
		logo.setFont(new Font("Courier New",Font.BOLD,26));
		logo.setSize(380,90);
		logo.setBorder(null);
		logo.setBackground(Color.WHITE);
		logo.setEditable(false);
		logo.setLocation(248,50);
		DeleteStudentMenu.add(logo);
		
		backButton=new JButton();
		backButton.setSize(180,60);
		backButton.setText("Back");
		backButton.setFont(new Font("Courier New", Font.BOLD, 18));
		backButton.setLocation(2,2);
		backButton.setBackground(Color.WHITE);
		DeleteStudentMenu.add(backButton);
		backButton.addActionListener(this);
		
		

		Lname1=new JLabel();
		Lname1.setSize(150,20);
		Lname1.setLocation(20,130);
		Lname1.setText("Enter the name to search: ");
		Lname1.setBackground(Color.WHITE);
		fname1=new JTextField();
		fname1.setSize(380,20);
		fname1.setLocation(174,130);
		fname1.setBackground(Color.WHITE);
		DeleteStudentMenu.add(Lname1);
		DeleteStudentMenu.add(fname1);
		

		//record result bar
		Lresult=new JLabel();
		Lresult.setSize(60,20);
		Lresult.setLocation(717,510);
		Lresult.setBackground(Color.WHITE);
		Lresult.setText("RESULT");
		resultbar= new JTextField();
		resultbar.setSize(100,40);
		resultbar.setLocation(690,529);
		resultbar.setEditable(false);
		DeleteStudentMenu.add(Lresult);
		DeleteStudentMenu.add(resultbar);
		
		//Delete button record delete<->
		
		deleteButton=new JButton();
		deleteButton.setSize(140,40);
		deleteButton.setLocation(380,380);
		deleteButton.setBackground(Color.WHITE);
		deleteButton.setText("DELETE");
		DeleteStudentMenu.add(deleteButton);
		deleteButton.addActionListener(this);
		
		this.add(DeleteStudentMenu);
	
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == backButton){
			StudentGUI StudentMenu=new StudentGUI();
			this.dispose();
			StudentMenu.setVisible(true);
		}

		else if(e.getSource() == deleteButton){
			try {
				boolean check=DeleteRecord(fname1.getText());
				if(check){
				resultbar.setText("DELETED");}
				else{resultbar.setText("Not Found");}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public boolean DeleteRecord(String s)throws IOException{
		FileWriter fr=new FileWriter("tempStudent.txt");
		PrintWriter pr=new PrintWriter(fr);
		pr.println("");
		pr.close();
		
		Scanner scan = new Scanner(new File("Student.txt"));
		fr=new FileWriter("tempStudent.txt", true);
		pr=new PrintWriter(fr);
		
		boolean flag=false;
		String temp;
		String a1,a2,a3,a4,a5,a6,a7;
		while(scan.hasNextLine()){
			temp=scan.nextLine();
			if( (temp.equals(s)) ){
				flag=true;
				a1=scan.nextLine();
				a2=scan.nextLine();
				a3=scan.nextLine();
				a4=scan.nextLine();
				a5=scan.nextLine();
				a6=scan.nextLine();
			}
			else{
				pr.println(temp);
			}
		}
		pr.close();
		scan.close();
		//emptying the file
		fr=new FileWriter("Student.txt");
		pr=new PrintWriter(fr);
		pr.println("");
		pr.close();
		
		//re-writing back
		
		scan=new Scanner(new File("tempStudent.txt"));
		fr=new FileWriter("Student.txt", true);
		pr=new PrintWriter(fr);
		
		
		while(scan.hasNextLine()){
			temp=scan.nextLine();
			pr.println(temp);
		}
		scan.close();
		pr.close();
		//emptying adminTemp.txt
		fr=new FileWriter("tempStudent.txt", true);
		pr=new PrintWriter(fr);
		pr.println("");
		pr.close();
			return flag;
	}

}
	


