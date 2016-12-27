package tr.gov.cbrt.hwXml.test;

import org.junit.Test;

import tr.gov.cbrt.hwXml.service.parser.ParserService;
import tr.gov.cbrt.hwXml.service.parser.Impl.SAXParserServiceImpl;
import tr.gov.cbrt.hwXml.service.validator.ValidatorService;

public class TestSAXParserServiceImpl {

	@Test
	public final void testParse() {
		ParserService saxParserService = new SAXParserServiceImpl();
		saxParserService.parse("Branches 5.xml");// ValidatorService.XML_FILES[2]0-1-2-3-4
	}

}
