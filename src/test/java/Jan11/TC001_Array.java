package Jan11;

import java.util.Arrays;

public class TC001_Array {

	public static void main(String[] args) 
	{
		//Arrays declaration
		int arr[];
		arr= new int[2];

		//one dim array declaration
		arr[0]=4;
		arr[1]=5;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr.length);
		//int arr1[]= {10,20,30,40,50};// for loop declaration
		
		int arr1[]= {600,20,5,40,300};// for sorting arrays
		Arrays.sort(arr1);
		
		//using foreach loop declaration
		for(int i:arr1)
		{
			System.out.println("Foreach loop:"+i);
		}
		//using only for loop declaration
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("For loop:"+arr1[i]);
		}
		System.out.println(arr1.length);
		
		// two dim array declaration
		String twodim[][] = new String[2][2];
		System.out.println("Two dim length:"+twodim.length);
		
		twodim[0][0]="Apple";
		twodim[0][1]="Apple1";
		twodim[1][0]="Apple2";
		twodim[1][1]="Apple3";
		System.out.println(twodim[0][1]);
	}

}
