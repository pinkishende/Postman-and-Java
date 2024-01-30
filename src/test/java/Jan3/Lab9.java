package Jan3;
import java.util.Scanner;

public class Lab9 {

	public static void main(String[] args) {
		
		//Scanner sc= new Scanner(System.in);
		//System.out.println("Enter String:");
		//String str1=sc.nextLine();
		
		String str="Welcome";//add string
		StringBuffer sb= new StringBuffer(str);
		
		for(int i=0; i<str.length(); i++)
		{
			char ch =str.charAt(i);
			if(i%2==1) {
				sb.setCharAt(i,'#');
			}
		}
		System.out.println("The String: "+sb);//replace odd position with #			
		
	
}
}
