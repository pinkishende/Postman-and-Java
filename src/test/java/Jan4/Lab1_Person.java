package Jan4;

public class Lab1_Person 
{
	public static void main(String[] args)
	{
		Account smith=new Account("Smith",2000);
		   Account kathy=new Account("kathy",3000);
		   smith.deposite(2000);
		   kathy.withdraw(2000);
		   
		   smith.displaybalance();
		   kathy.displaybalance();
	}

}


