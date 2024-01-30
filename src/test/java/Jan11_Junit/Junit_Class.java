package Jan11_Junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Junit_Class 
{
	@Test
	public void test2() {
		Person p = new Person("niki", "yadav");
		System.out.println(p.getFullName());
		assertEquals("niki yadav", p.getFullName());
	}
}
