package tr.gov.cbrt.hwXml.service.parser.Impl;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.sax.SAXSource;

import org.xml.sax.InputSource;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.XMLReader;

import tr.gov.cbrt.hwXml.model.CbrtType;
import tr.gov.cbrt.hwXml.service.parser.ParserService;
import tr.gov.cbrt.hwXml.service.validator.ValidatorService;

public class SAXParserServiceImpl implements ParserService {

	@Override
	public void parse(String xmlFile2Parse) {

		try {

			System.setProperty(SAX_PARSER_FACT, XERCES_SAX_PARSER_FACT);

			SAXParserFactory spf = SAXParserFactory.newInstance();
			spf.setNamespaceAware(true);
			spf.setValidating(true);
			SAXParser saxParser = spf.newSAXParser();

			try {
				saxParser.setProperty(JAXP_SCHEMA_LANGUAGE, W3C_XML_SCHEMA);
				saxParser.setProperty(JAXP_SCHEMA_LOCATION, ValidatorService.XSD_FILE);
			} catch (SAXNotRecognizedException x) {
				x.printStackTrace(System.out);
			}

			XMLReader xmlReader = saxParser.getXMLReader();
			long startTime = System.currentTimeMillis();
			SAXSource source = new SAXSource(xmlReader,
					new InputSource(ValidatorService.XML_FILE_PATH + xmlFile2Parse));

			JAXBContext jc = JAXBContext.newInstance(JAXB_MODEL_PACKAGE);
			Unmarshaller u = jc.createUnmarshaller();

			CbrtType myType = (CbrtType) ((javax.xml.bind.JAXBElement) u.unmarshal(source)).getValue();
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
