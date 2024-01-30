package Jan11_Junit;

import org.junit.Test;

public class Person
{
	private String fname;
	private String lname;
	public Person(String fname, String lname)
	{
		if(fname==null && lname==null)
		{
			throw new IllegalArgumentException("Both name cannot be null");
		}
		this.fname = fname;
		this.lname = lname;	
	}
	public String getFullName()
	{
		String first=(this.fname !=null)?this.fname:"?";
		String last=(this.lname !=null)?this.lname:"?";
		return first+" " +last;	
	}
	public String getfname()
	{
		return this.fname;
	}
	public String getlname()
	{
		return this.lname;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//@Test
		//	public void test1() {
		Person p = new Person("niki", "yadav");
		System.out.println(p.getFullName());
	}
}

