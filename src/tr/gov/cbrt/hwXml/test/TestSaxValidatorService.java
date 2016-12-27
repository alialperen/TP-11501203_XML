package tr.gov.cbrt.hwXml.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import tr.gov.cbrt.hwXml.service.validator.ValidatorService;
import tr.gov.cbrt.hwXml.service.validator.Impl.SaxValidatorServiceImpl;

public class TestSaxValidatorService {

	@Test
	public final void testInternalXSDValidate() {
		ValidatorService saxValidatorService = new SaxValidatorServiceImpl();
		Boolean valid = saxValidatorService.internalXSDValidate(ValidatorService.XML_FILES[1]);// 0-1-2-3-4
		assertTrue(valid);
	}

	@Test
	public final void testExternalXSDValidate() {
		ValidatorService saxValidatorService = new SaxValidatorServiceImpl();
		Boolean valid = saxValidatorService.externalXSDValidate(ValidatorService.XML_FILES[1]);// 0-1-2-3-4
		assertTrue(valid);
	}

	@Test
	public final void testIsWellFormed() {
		ValidatorService saxValidatorService = new SaxValidatorServiceImpl();
		Boolean wellFormed = saxValidatorService.isWellFormed(ValidatorService.XML_FILES[1]);// 0-1-2-3-4
		assertTrue(wellFormed);
	}

}
