package tr.gov.cbrt.hwXml.service.parser.Impl;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import tr.gov.cbrt.hwXml.model.CbrtType;
import tr.gov.cbrt.hwXml.service.parser.ParserService;
import tr.gov.cbrt.hwXml.service.validator.ValidatorService;

public class DomParserServiceImpl implements ParserService {

	@Override
	public void parse(String xmlFile2Parse) {
		try {
			JAXBContext jc = JAXBContext.newInstance(JAXB_MODEL_PACKAGE);
			Unmarshaller u = jc.createUnmarshaller();

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			dbf.setNamespaceAware(true);
			DocumentBuilder db = dbf.newDocumentBuilder();
			long startTime = System.currentTimeMillis();

			CbrtType myType = (CbrtType) ((javax.xml.bind.JAXBElement) u
					.unmarshal(new File(ValidatorService.XML_FILE_PATH + xmlFile2Parse))).getValue();
			long endTime = System.currentTimeMillis();

			System.out.println("file:"+xmlFile2Parse+", parsing time:"+(endTime - startTime)+"ms");
			Path p = Paths.get(ValidatorService.XML_FILE_PATH + xmlFile2Parse);
			String fileName = p.getFileName().toString();
			Files.write(Paths.get(ValidatorService.TXT_FILE_PATH + fileName + ".txt"), myType.toString().getBytes());
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

}
