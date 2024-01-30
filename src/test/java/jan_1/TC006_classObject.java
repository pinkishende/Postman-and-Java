package jan_1;
import java.util.Scanner;
import static java.lang.Math.sqrt;   //lang is package

public class TC006_classObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);//using scanner class to input from user
		System.out.println("Enter your Name:");
		String name= sc.nextLine();
		System.out.println("Your name is:"+name);
		
		System.out.println("Square root:"+sqrt(900));
		
		Scanner sc1=new Scanner(System.in);
		int i=sc1.nextInt();
		System.out.println("Enterd No:"+i);
	}

}
