package jan_1;

public class TC003_controlstmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int m=-5;
		while(n>0) {
			System.out.println("The vaule of n is:"+n);
			n--;
			}
		do {
			System.out.println("The vaule of n is:"+m);
			n--;
		}while(m>0);	
		
		for(int i=0; i<=4; i++) {
			
			switch(i) {
			case 0:
				System.out.println("i vaule is 0");
				break;
			case 1:
				System.out.println("i vaule is 1");
				break;	
			case 2:
				System.out.println("i vaule is 2");
				break;	
			case 3:
				System.out.println("i vaule is 3");
				break;
			default:
				System.out.println("i value is greater than 3");
			}
		}

	}

}




