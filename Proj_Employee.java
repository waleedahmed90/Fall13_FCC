
public class Employee extends Person{
	
	String desig;
	double salary;
	String office;
	
	Employee(){
		super();
	}
	
	Employee(String n, String ad, String e, String d, double s, String of){
		super(n,d,e);
		this.desig=d;
		this.salary=s;
		this.office=of;
	}
	
	void set_designation(String d){
		this.desig=d;
	}
	
	void set_office(String o){
		this.office=o;
	}	
	void set_salary(double s){
		this.salary=s;
	}
	
	String get_designation(){
		return this.desig;
	}
	
	String get_office(){
		return this.office;
	}
	
	double get_salary(){
		return this.salary;
	}


}
