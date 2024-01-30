package jan_1;

public class TC002_Variables {
	
	private double dblwidth;
	private double dblheight;
	private double dbldepth;
	//private static int boxid;
	

	public double voulme() {
		dblwidth=10;
		dblheight=10;
		dbldepth=10;
		double deltemp;
		deltemp =dblwidth*dblheight*dbldepth;
		return deltemp;
	}
	
	public static void main(String[] args) {
		
		TC002_Variables obj = new TC002_Variables();
				System.out.println(obj.voulme());
		
	}

}
