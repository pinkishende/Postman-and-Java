package jan_1;
import java.util.Scanner;

public class TC005_Lab2 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num= sc.nextInt();
		if(num>0) {
			System.out.println("Num is Positive");
		}
		else {
			System.out.println("Num is Negative");
		}
		
	}
	

}
