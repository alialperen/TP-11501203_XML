//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.13 at 10:22:26 AM EEST 
//

package tr.gov.cbrt.hwXml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for AuditComMemberType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AuditComMemberType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.example.org/cbrt}EmployeeType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditComMemberType")
public class AuditComMemberType extends EmployeeType {

	@Override
	public String toString() {
		return "AuditComMemberType [" + (title != null ? "title=" + title + ", " : "")
				+ (assignmentDate != null ? "assignmentDate=" + assignmentDate + ", " : "")
				+ (employeeNumber != null ? "employeeNumber=" + employeeNumber + ", " : "")
				+ (firstName != null ? "firstName=" + firstName + ", " : "")
				+ (middleName != null ? "middleName=" + middleName + ", " : "")
				+ (lastName != null ? "lastName=" + lastName + ", " : "") + (ssn != null ? "ssn=" + ssn : "") + "]\r\n";
	}

}
