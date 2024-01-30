package jan_1;

public class constructor {
	int mathmarks;
	int scimarks;
	int engmarks;

	constructor(int math, int sci, int eng)
	{
	this.mathmarks=math;
	this.scimarks=sci;
	this.engmarks=eng;
	}
	
	public void total()
	{
		int totalmarks;
		totalmarks= mathmarks + scimarks + engmarks;
		System.out.println("total mark is :"+totalmarks);
	}
}
