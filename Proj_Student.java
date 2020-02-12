
public class Student extends Person {
	String Rollno;
	String Courses;
	double CGPA;
	String Dept;
	
	Student(){
		super();
	}
	
	Student(String n, String ad, String E, String r, String Co, double cgpa, String dep){
		super(n,ad,E);
		
		this.Rollno=r;
		this.Courses=Co;
		this.CGPA=cgpa;
		this.Dept=dep;
	}
	//setters
	void set_Roll(String r){
		this.Rollno=r;
	}
	void set_Courses(String c){
		this.Courses=c;
	}
	void set_CGPA(double c){
		this.CGPA=c;
	}
	void set_Dept(String d){
		this.Dept=d;
	}
	//getters
	String get_Roll(){
		return this.Rollno;
	}
	String get_Courses(){
		return this.Courses;
	}
	double get_CGPA(){
		return this.CGPA;
	}
	String get_Dept(){
		return this.Dept;
	}
}
