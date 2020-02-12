import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class teacher extends Person{
		String courses, rank, office;
		double salary;
		
		teacher(){
			super();
		}
		
		teacher(String n, String ad, String e, String co, String r, String off, double sal){
			super(n,ad,e);
			this.courses=co;
			this.rank=r;
			this.office=off;
			this.salary=sal;
		}

		void set_course(String c){
			this.courses=c;
		}
		String get_course(){
			return this.courses;
		}

		void set_rank(String r){
			this.rank=r;
		}
		String get_rank(){
			return this.rank;
		}

		void set_office(String o){
			this.office=o;
		}
		String get_office(){
			return this.office;
		}

		void set_salary(double s){
			this.salary=s;
		}
		double get_salary(){
			return this.salary;
		}
		
		
		/*void saveRecord()throws IOException{
			FileWriter fileWritter = new FileWriter("Faculty.txt",true); 
			PrintWriter pr=new PrintWriter(fileWritter);
			
			pr.println(super.get_name()+ "/*" +super.get_Address()+ "/*" +super.get_email()+"/*"+get_course()+"/*"+get_office()+"/*"+get_rank()+"/*"+get_salary());
			 
			pr.close();
		}*/
		
	}