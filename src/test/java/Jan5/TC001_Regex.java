package Jan5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TC001_Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Hello";
		String pattern = "Hello";
		boolean pattermatch = Pattern.matches(str, pattern);
		
		System.out.println("Matching:"+pattermatch);
		
		
		String input="Shope,Hop,Hopping,Chopping";
		Pattern p1= Pattern.compile("Hop");
		Matcher m1=p1.matcher(input);
		System.out.println(m1.matches());
		while(m1.find())
		{
			System.out.println(m1.group()+":"+m1.start()+":"+m1.end());
		}
		
		String n1="1234567890";
		String adhar="7545 3435 7684";
		String email="niki@gmai.com";
		String s1="Welcome to amazon 12345";
		
		Pattern adharpattern= Pattern.compile("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
		Pattern emailpattern= Pattern.compile("^(.+)@(\\S+).com");
		Pattern p2= Pattern.compile("^[A-Z].*[0-9]$");//("[0-9]$") for number
		//Pattern p3= Pattern.compile("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d");
		Pattern p3= Pattern.compile("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
		
		Matcher m2=p2.matcher(s1);
		//for string pattern
				if(m2.find()){
					System.out.println("pattern matched");
				}
				else{
					System.out.println("pattern not matched");
				}
				
		Matcher num=p3.matcher(n1);
		//for phone num pattern
				if(num.find()){
					System.out.println("phno pattern matched");
				}
				else{
					System.out.println("phno pattern not matched");
				}
				
				
		Matcher email_4=emailpattern.matcher(email);
		//for email pattern
			if(email_4.find()){
				System.out.println("Email pattern matched");
			}
			else{
				System.out.println("Email pattern not matched");
			}
			
			Matcher Adhar = adharpattern.matcher(adhar);
			//for adhar pattern
					if(Adhar.find()){
						System.out.println("Adhar pattern matched");
					}
					else{
						System.out.println("Adhar pattern not matched");
					}
	}

}
