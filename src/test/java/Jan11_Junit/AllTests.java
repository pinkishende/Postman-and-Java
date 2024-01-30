package Jan11_Junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Junit_Class.class, JunitFirstTC.class, person_test.class })
public class AllTests {

}
