package Jan4;

public class Lab5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lab5_SavingAccount2 sav1 = new Lab5_SavingAccount2("Niki", 5000);
		Lab5_CurrentAccount2 cur1 = new Lab5_CurrentAccount2("yadav", 3000);
		
		sav1.display();
		cur1.display();
		
		sav1.withdraw(3000);
		cur1.withdraw(1000);
	}
}
