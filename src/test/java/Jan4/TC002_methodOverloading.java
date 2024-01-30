package Jan4;

class box
{
	box(){
		System.out.println("This is default const");
	}
	
	box(int a)
	{
		System.out.println("This is parametrized const:"+a);
	}
}
public class TC002_methodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		box b1= new box();
		box b2=new box(20);
	}

}
