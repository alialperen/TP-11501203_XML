package tr.gov.cbrt.hwXml.service.validator.Impl;

import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import tr.gov.cbrt.hwXml.handler.SimpleErrorHandler;
import tr.gov.cbrt.hwXml.service.validator.ValidatorService;

public class SaxValidatorServiceImpl implements ValidatorService {

	public Boolean internalXSDValidate(String xmlFile2Validate) {
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			factory.setValidating(true);
			factory.setNamespaceAware(true);

			SAXParser parser = factory.newSAXParser();
			parser.setProperty(JAXP_SCHEMA_LANGUAGE, XMLConstants.W3C_XML_SCHEMA_NS_URI);

			XMLReader reader = parser.getXMLReader();
			reader.setErrorHandler(new SimpleErrorHandler());
			reader.parse(new InputSource(XML_FILE_PATH + xmlFile2Validate));
		} catch (ParserConfigurationException | SAXException | IOException e) {
			System.out.println(xmlFile2Validate + " is NOT valid");
			System.out.println("Reason: " + e.getClass().getName() + " " + e.getLocalizedMessage());
			return false;
		}
		return true;
	}

	public Boolean externalXSDValidate(String xmlFile2Validate) {
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			factory.setValidating(false);
			factory.setNamespaceAware(true);
			SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			factory.setSchema(schemaFactory.newSchema(new Source[] { new StreamSource(XSD_FILE) }));
			SAXParser parser = factory.newSAXParser();
			XMLReader reader = parser.getXMLReader();
			reader.setErrorHandler(new SimpleErrorHandler());
			reader.parse(new InputSource(XML_FILE_PATH + xmlFile2Validate));
		} catch (ParserConfigurationException | SAXException | IOException e) {
			System.out.println(xmlFile2Validate + " is NOT valid");
			System.out.println("Reason: " + e.getClass().getName() + " " + e.getLocalizedMessage());
			return false;
		}
		return true;
	}

	public Boolean isWellFormed(String xmlFile2Validate) {
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			factory.setValidating(false);
			factory.setNamespaceAware(true);

			SAXParser parser = factory.newSAXParser();

			XMLReader reader = parser.getXMLReader();
			reader.setErrorHandler(new SimpleErrorHandler());
			reader.parse(new InputSource(XML_FILE_PATH + xmlFile2Validate));
		} catch (ParserConfigurationException | SAXException | IOException e) {
			System.out.println(xmlFile2Validate + " is NOT valid");
			System.out.println("Reason: " + e.getClass().getName() + " " + e.getLocalizedMessage());
			return false;
		}
		return true;
	}

}
