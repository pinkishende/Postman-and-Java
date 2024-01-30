package Jan4;

interface Samplecal //using interface incomplete method
	{
		int add(int a,int b);
	}
	
public class TC005_Interfce implements Samplecal
	{
	public static void main(String[] args) 
	{
			// TODO Auto-generated method stub
		TC005_Interfce cal = new TC005_Interfce();
			System.out.println(cal.add(10,20));
	}

	@Override
	public int add(int a, int b) 
	{
		int cal=a+b;
		return cal;
	}

}
