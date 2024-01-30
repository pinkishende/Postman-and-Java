package Jan5;

public class Lab3_2_personException
{
	public static void main(String[] args) {
		
		 try {
			 Lab3_2_ageException p1 = new Lab3_2_ageException("Nisha", 19);
			   p1.getempdetails();
		   }
		 catch(ageException e){
			   System.out.println(e); 
		   }
	}
}


