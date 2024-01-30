package Jan4;

public class Lab5_SavingAccount2 extends Lab5_Account2 {
final double minbalance;
	
	
	public Lab5_SavingAccount2(String accholder, double initialval) {
		super(accholder, initialval);
		this.minbalance = 2000;
	}

	@Override
	public void withdraw(double withdraw) {
		if(balance>=minbalance) {
			balance-=withdraw;
			System.out.println("balance is : "+ balance);
		}else
			System.out.println("Balance insufficient");
	}
}
