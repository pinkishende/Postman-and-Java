package Jan11_Junit;

import org.junit.Test;

public class person_test 
{
	@Test
	public void test2() {
		Person p = new Person("niki", "yadav");
		System.out.println(p.getFullName());
	}
}
