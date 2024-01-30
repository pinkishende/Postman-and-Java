package Jan4;

public class SavingAccount
{ 
	private double currentBal;

   public void minbal(double balance)
	{
	   currentBal=balance;	
	}
   
   public void withdraw(double amount)
   {
	   if(amount <= currentBal)
	   {
		   currentBal -= amount;
		   System.out.println("Balance"+currentBal);
	   }
	   else
	   {
		   System.out.println("Insufficient balance"); 
	   }
   }
}
