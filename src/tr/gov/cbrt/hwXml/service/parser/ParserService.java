package tr.gov.cbrt.hwXml.service.parser;

public interface ParserService {
	public static final String JAXP_SCHEMA_LANGUAGE = "http://java.sun.com/xml/jaxp/properties/schemaLanguage";
	public static final String JAXP_SCHEMA_LOCATION = "http://java.sun.com/xml/jaxp/properties/schemaSource";
	public static final String W3C_XML_SCHEMA = "http://www.w3.org/2001/XMLSchema";
	public static final String SAX_PARSER_FACT = "javax.xml.parsers.SAXParserFactory";
	public static final String XERCES_SAX_PARSER_FACT = "org.apache.xerces.jaxp.SAXParserFactoryImpl";
	public static final String JAXB_MODEL_PACKAGE = "tr.gov.cbrt.hwXml.model";

	public void parse(String xmlFile2Parse);

}
