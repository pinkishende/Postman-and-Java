package Jan5;

public class TC002_Exception {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			int a=5;
			int b=a/0;
			System.out.println(b);
			}
		catch(Exception e) {
			//System.out.println("Exception is:"+e);// this line output Exception is:java.lang.ArithmeticException: / by zero
			System.out.println("Exception is:"+e.getMessage());//this line output is Exception is:/ by zero
				}	
		
		/*		try {
			String str=null;
			str.equals("Hello");
		}
		
		catch(Exception e) {
			System.out.println("Exception is:"+e);
		}
		
		finally
		{
			System.out.println("Hii");
		}
		Thread.sleep(300);
		System.out.println("welcome");
	*/

	}
}
