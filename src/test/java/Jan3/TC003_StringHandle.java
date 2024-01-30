package Jan3;

public class TC003_StringHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= new String("pooja");
		String str2= new String("sam");
		System.out.println("String1:"+str1+"----------String2:"+str2);
		String str3= new String("pooja");
		String str4 = str3;
		System.out.println("String1:"+str3+"----------String2:"+str4);
		
		System.out.println("Length:"+str1.length());
		System.out.println("Indexof:"+str1.indexOf("j"));
		
		String s1="This is beautiful day";
		System.out.println(s1.trim().concat("Hello"));
		System.out.println(s1.substring(8,17));
		System.out.println(str1.toUpperCase());  //using to touppercase method 
		
		System.out.println(str1.equals(s1)); //using equals() method
		System.out.println(str1==str2);
		
		StringBuffer sb= new StringBuffer("Welcome ");
		System.out.println(sb.append("to 2024"));// using for StringBuffer class
		System.out.println(s1.concat("to 2024"));//using for only string class
		System.out.println(sb.reverse());//using for reverse string given in the code
		
		
	}

}
