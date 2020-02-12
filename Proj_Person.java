
public class Person {
	String name;
	String Address;
	String email;
	
	
	Person(){	
	}
	
	Person(String n, String Ad, String e){
		this.name=n;
		this.Address=Ad;
		this.email=e;
	}

	void set_name(String n){
		this.name=n;
	}
	String get_name(){
		return this.name;
	}
	void set_Address(String ad){
		this.Address=ad;
	}
	String get_Address(){
		return this.Address;
	}
	void set_email(String e){
		this.email=e;
	}
	String get_email(){
		return this.email;
	}
}
