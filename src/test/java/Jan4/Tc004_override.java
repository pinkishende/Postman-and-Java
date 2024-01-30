package Jan4;

class parent{
	void show(){
		System.out.println("This is parent show");
	}
}
class child extends parent
{
	@Override
	void show(){
		//super.show();
		System.out.println("This is child show");
	}
}
public class Tc004_override {

	public static void main(String[] args) 
	{
		parent p= new parent();
		p.show();
		
		child c= new child();
		c.show();
}
}
