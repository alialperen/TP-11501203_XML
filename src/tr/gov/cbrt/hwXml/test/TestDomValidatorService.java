package tr.gov.cbrt.hwXml.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import tr.gov.cbrt.hwXml.service.validator.ValidatorService;
import tr.gov.cbrt.hwXml.service.validator.Impl.DomValidatorServiceImpl;

public class TestDomValidatorService {

	@Test
	public final void testInternalXSDValidate() {
		ValidatorService domValidatorService = new DomValidatorServiceImpl();
		Boolean valid = domValidatorService.internalXSDValidate(ValidatorService.XML_FILES[1]);// 0-1-2-3-4
		assertTrue(valid);
	}

	@Test
	public final void testExternalXSDValidate() {
		ValidatorService domValidatorService = new DomValidatorServiceImpl();
		Boolean valid = domValidatorService.externalXSDValidate(ValidatorService.XML_FILES[1]);// 0-1-2-3-4
		assertTrue(valid);
	}

	@Test
	public final void testIsWellFormed() {
		ValidatorService domValidatorService = new DomValidatorServiceImpl();
		Boolean wellFormed = domValidatorService.isWellFormed(ValidatorService.XML_FILES[1]);// 0-1-2-3-4
		assertTrue(wellFormed);
	}

}
