package Jan4;

abstract class Shape
{
	abstract void draw();
}

class Rect extends Shape
{
	@Override
	void draw() 
	{
		System.out.println("Draw the rectangle");
	}
	
}
public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r1 = new Rect();
		r1.draw();	
		}

}
