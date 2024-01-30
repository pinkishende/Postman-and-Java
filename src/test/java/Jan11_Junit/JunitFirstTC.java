package Jan11_Junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitFirstTC {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("This is before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("This is after class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("This is before");
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("This is after");
	}

	@Test
	public void test1() {
		System.out.println("This is test1");
	}
	
	@Test
	public void test2() {
		System.out.println("This is test2");
	}
}

