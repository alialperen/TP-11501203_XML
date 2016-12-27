package tr.gov.cbrt.hwXml.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestDomValidatorService.class, TestSaxValidatorService.class, TestDomParserServiceImpl.class,
		TestSAXParserServiceImpl.class, TestXPathServiceImpl.class })
public class AllTests {

}
