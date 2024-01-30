package Jan11_Junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Lab5_DateJunit
{
	@Test
	public void test() {
		Lab5_Date d1 = new Lab5_Date(25,12,2023);
		System.out.println(d1.toString());
		assertEquals("Date [Day=25, Month=12, Year=2023]",d1.toString());
	}
}

