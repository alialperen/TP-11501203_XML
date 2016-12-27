package tr.gov.cbrt.hwXml.service.validator;

public interface ValidatorService {

	public static final String JAXP_SCHEMA_LANGUAGE = "http://java.sun.com/xml/jaxp/properties/schemaLanguage";
	public static final String XSD_FILE = ".\\xmldata\\cbrt.xsd";
	public static final String XML_FILE_PATH = ".\\xmldata\\";
	public static final String TXT_FILE_PATH = ".\\txtdata\\";
	public static final String[] XML_FILES = { "Employees.xml", "Clients.xml", "Branches.xml", "ShareHolders.xml",
			"Management.xml" };

	public Boolean internalXSDValidate(String xmlFile2Validate);

	public Boolean externalXSDValidate(String xmlFile2Validate);

	public Boolean isWellFormed(String xmlFile2Validate);

}
