package Jan3;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Welcome";
		String str1="";
		
		for(int i=0; i<str.length(); i++)
		{
			for(int j=i+1; j<str.length(); j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					str= str.substring(0,j)+"  "+str.substring(j+1);
				}
			}
			if(str.charAt(i) != ' ') 
			{
				str1 = str1 + str.charAt(i);
			}
		}
		
			System.out.println(str);
			System.out.println(str1);
	
	}

}
