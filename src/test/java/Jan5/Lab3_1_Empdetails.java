package Jan5;

public class Lab3_1_Empdetails {
	

	public static void main(String[] args) 
	{
		Lab3_1_Employee emp = new Lab3_1_Employee();
		emp.setFname("Niki");
		emp.setLname("xyz");
	    
	        EmployeeName ck = new EmployeeName();
	        try {
	            ck.empdetails(emp.getFname(),emp.getLname());
	            System.out.println("Employee name is: "+emp.getFname()+" "+emp.getLname());
	        	} 
	        
	        catch (InvalidNameException e) {
	            System.out.println("Invalid Name: " + e.getMessage());
	        }
	}
}

