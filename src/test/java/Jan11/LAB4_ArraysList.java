package Jan11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LAB4_ArraysList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList name = new ArrayList();
		 name.add("USB");
		 name.add("Mobile");
		 name.add("Charger");
		 name.add("Headphones");
		
		 Collections.sort(name);  // for collection sorting
		for(Object product : name )
		{
			System.out.println("Product:"+product);
		}
	}
}
