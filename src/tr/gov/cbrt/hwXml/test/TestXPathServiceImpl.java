package tr.gov.cbrt.hwXml.test;

import org.junit.Test;

import tr.gov.cbrt.hwXml.service.query.QueryService;
import tr.gov.cbrt.hwXml.service.query.Impl.XPathServiceImpl;
import tr.gov.cbrt.hwXml.service.validator.ValidatorService;

public class TestXPathServiceImpl {

	@Test
	public final void testQuery() {
		QueryService xpathService = new XPathServiceImpl();
		xpathService.query(ValidatorService.XML_FILES[0], "//Employee");
		xpathService.query(ValidatorService.XML_FILES[3], "//ShareHolder/D_type");

	}

}
