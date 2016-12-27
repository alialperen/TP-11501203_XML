package tr.gov.cbrt.hwXml.service.validator.Impl;

import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import tr.gov.cbrt.hwXml.handler.SimpleErrorHandler;
import tr.gov.cbrt.hwXml.service.validator.ValidatorService;

public class DomValidatorServiceImpl implements ValidatorService {

	public Boolean internalXSDValidate(String xmlFile2Validate) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setValidating(true);
			factory.setNamespaceAware(true);
			factory.setAttribute(JAXP_SCHEMA_LANGUAGE, XMLConstants.W3C_XML_SCHEMA_NS_URI);
			DocumentBuilder builder = factory.newDocumentBuilder();
			builder.setErrorHandler(new SimpleErrorHandler());
			builder.parse(new InputSource(XML_FILE_PATH + xmlFile2Validate));
		} catch (IllegalArgumentException | ParserConfigurationException | SAXException | IOException e) {
			System.out.println(xmlFile2Validate + " is NOT valid");
			System.out.println("Reason: " + e.getClass().getName() + " " + e.getLocalizedMessage());
			return false;
		}
		return true;
	}

	public Boolean externalXSDValidate(String xmlFile2Validate) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setValidating(false);
			factory.setNamespaceAware(true);
			SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			factory.setSchema(schemaFactory.newSchema(new Source[] { new StreamSource(XSD_FILE) }));
			DocumentBuilder builder = factory.newDocumentBuilder();
			builder.setErrorHandler(new SimpleErrorHandler());
			builder.parse(new InputSource(XML_FILE_PATH + xmlFile2Validate));
		} catch (IllegalArgumentException | ParserConfigurationException | SAXException | IOException e) {
			System.out.println(xmlFile2Validate + " is NOT valid");
			System.out.println("Reason: " + e.getClass().getName() + " " + e.getLocalizedMessage());
			return false;
		}
		return true;
	}

	public Boolean isWellFormed(String xmlFile2Validate) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setValidating(false);
			factory.setNamespaceAware(true);
			DocumentBuilder builder = factory.newDocumentBuilder();
			builder.setErrorHandler(new SimpleErrorHandler());
			builder.parse(new InputSource(XML_FILE_PATH + xmlFile2Validate));
		} catch (ParserConfigurationException | SAXException | IOException e) {
			System.out.println(xmlFile2Validate + " is NOT valid");
			System.out.println("Reason: " + e.getClass().getName() + " " + e.getLocalizedMessage());
			return false;
		}
		return true;
	}

}
