package jan_1;
import java.util.Scanner;
public class TC007_Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mobno is:");
		String num= sc.next();
		Lab3 obj=new Lab3("Nikita","Yadav","Female",num);
		obj.printdata();
	}

}
