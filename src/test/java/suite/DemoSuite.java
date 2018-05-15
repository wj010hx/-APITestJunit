package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import junitDemo.Test1;
import junitDemo.Test2;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	Test1.class,
	Test2.class
})

public class DemoSuite {

}
