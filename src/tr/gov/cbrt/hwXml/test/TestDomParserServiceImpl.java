package tr.gov.cbrt.hwXml.test;

import org.junit.Test;

import tr.gov.cbrt.hwXml.service.parser.ParserService;
import tr.gov.cbrt.hwXml.service.parser.Impl.DomParserServiceImpl;
import tr.gov.cbrt.hwXml.service.validator.ValidatorService;

public class TestDomParserServiceImpl {

	@Test
	public final void testParse() {
		ParserService domParserService = new DomParserServiceImpl();
		domParserService.parse(ValidatorService.XML_FILES[0]);//"Branches 5.xml" 0-1-2-3-4
	}

}
