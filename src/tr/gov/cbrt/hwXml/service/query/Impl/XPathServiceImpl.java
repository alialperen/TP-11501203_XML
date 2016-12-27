package tr.gov.cbrt.hwXml.service.query.Impl;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Node;
import org.dom4j.XPath;
import org.dom4j.io.SAXReader;
import org.jaxen.SimpleNamespaceContext;

import tr.gov.cbrt.hwXml.service.query.QueryService;
import tr.gov.cbrt.hwXml.service.validator.ValidatorService;

public class XPathServiceImpl implements QueryService {

	@SuppressWarnings("unchecked")
	public void query(String xmlFile2Query, String query) {
		try {
			SAXReader reader = new SAXReader();
			Document document = reader.read(new File(ValidatorService.XML_FILE_PATH + xmlFile2Query));
			HashMap<String, String> map = new HashMap<String, String>();

			XPath xpath = DocumentHelper.createXPath(query);
			xpath.setNamespaceContext(new SimpleNamespaceContext(map));

			ArrayList<Node> nodes = (ArrayList<Node>) xpath.selectNodes(document);
			for (Node node : nodes) {
				System.out.println(node.getStringValue());
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
}
