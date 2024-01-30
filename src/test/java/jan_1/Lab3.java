package jan_1;

public class Lab3 {
	
	String firstname;
	String lastname;
	String gender;
	String mobno;
	
	Lab3(String Fname, String Lname, String gender, String mobno)
	{
	this.firstname=Fname;
	this.lastname=Lname;
	this.gender=gender;
	this.mobno=mobno;
	}
	
	public void printdata() {
		System.out.println("Firstname is: " +firstname);
		System.out.println("Lastname is: " + lastname);
		System.out.println("Gender is: " + gender);
		System.out.println("Mobno is: " +mobno);
	}
}

