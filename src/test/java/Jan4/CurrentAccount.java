package Jan4;

public class CurrentAccount extends SavingAccount {
	private double overdraftLimit;
	public void overdraftLimit(double limit){
		overdraftLimit=limit;
	}
	public boolean withdraw1(double amount){
		if(amount <= overdraftLimit){
			overdraftLimit-=amount;
			System.out.println("overdraft limit:"+overdraftLimit);
			return true;
		}
		else{
			System.out.println("Exceeded overdraft limit");
			return false;
		}
	}
public static void main(String[] args) {
	CurrentAccount ca= new CurrentAccount();
		ca.minbal(1000);
		ca.withdraw(500);
		ca.overdraftLimit(1000);
		ca.withdraw1(500);
	}
}
