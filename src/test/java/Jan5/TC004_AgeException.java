package Jan5;
import java.util.Scanner;
class ageException extends Exception
{
	private int age;
	ageException(int a)
	{
		age=a;
	}
	public String toString()
	{
		return age+"is an invalid age";
	}
}

class emp
{
	String name;
	int age;
	void getempdetails() throws ageException
	{
		System.out.println("Enter your name:");
		Scanner sc= new Scanner(System.in);
		name=sc.nextLine();
		
		System.out.println("Enter your age:");
		Scanner sc1= new Scanner(System.in);
		age=sc1.nextInt();
		
		if(age<16)
		{
			throw new ageException(age);
		}
		else {
			System.out.print("Name:"+name);
			System.out.println("  Age:"+age);
		}
	}
}

public class TC004_AgeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			emp e1=new emp();
			e1.getempdetails();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}


