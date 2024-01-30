package Jan4;

class Base_parent
{
	public void basemethod()
	{
		System.out.println("This is parent class");
	}
}

class Derived_Child extends Base_parent
{
	public void derivedmethod()
	{
		super.basemethod();// super method is used to access parent class constructor
		System.out.println("This is child class");
	}
}


public class TC001_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Derived_Child dc= new Derived_Child();
		//dc.basemethod();
		dc.derivedmethod();
		
		//Using instance of operator
		if(dc instanceof Base_parent)
		{
			System.out.println("It is instance:Yes");
		}
		else {
			System.out.println("It is Instnace:No");
		}
	}

}
