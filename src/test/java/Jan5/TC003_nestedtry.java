package Jan5;

public class TC003_nestedtry {
	public static void main(String args[]) 
    { 
        try { 
            int a = 10; 
            System.out.println(a);
            try { 
                int b = a / 0; 
                System.out.println(b);
            } 
            catch (Exception e1) { 
                System.out.println("Hii"); 
            } 
        } 
        catch (Exception e2) { 
            System.out.println("Hello"); 
        } 
    } 
} 


