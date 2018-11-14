//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.14 at 02:09:16 PM EST 
//


package com.example.response;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * The root tag AnalyzerReport has BugInstance as child element, which contains a
 * property named "id". There can be multiple occurrence of BugInstance, one per each
 * instance of bug from the SwA tools. The "id" attribute in the BugInstance tag is a unique
 * integer id generated by the Assessment Parser tool.
 *
 *
 * <p>Java class for BugInstanceType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BugInstanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Methods" type="{https://www.swamp.com/com/scarf/struct}MethodsType" minOccurs="0"/>
 *         &lt;element name="BugLocations" type="{https://www.swamp.com/com/scarf/struct}BugLocationsType"/>
 *         &lt;element name="BugGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BugRank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BugSeverity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cweld" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BugMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResolutionSuggestion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BugTrace" type="{https://www.swamp.com/com/scarf/struct}BugTraceType" minOccurs="0"/>
 *         &lt;element name="BugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BugInstanceType", propOrder = {
		"className",
		"methods",
		"bugLocations",
		"bugGroup",
		"bugRank",
		"bugSeverity",
		"cweld",
		"bugMessage",
		"resolutionSuggestion",
		"bugTrace",
		"bugCode"
})
public class BugInstanceType {

	@XmlElement(name = "ClassName")
	protected String className;
	@XmlElement(name = "Methods")
	protected MethodsType methods;
	@XmlElement(name = "BugLocations", required = true)
	protected BugLocationsType bugLocations;
	@XmlElement(name = "BugGroup")
	protected String bugGroup;
	@XmlElement(name = "BugRank")
	protected String bugRank;
	@XmlElement(name = "BugSeverity")
	protected String bugSeverity;
	@XmlElement(name = "Cweld")
	protected List<String> cweld;
	@XmlElement(name = "BugMessage")
	protected String bugMessage;
	@XmlElement(name = "ResolutionSuggestion")
	protected String resolutionSuggestion;
	@XmlElement(name = "BugTrace")
	protected BugTraceType bugTrace;
	@XmlElement(name = "BugCode", required = true)
	protected String bugCode;
	@XmlAttribute(name = "id", required = true)
	protected int id;

	/**
	 * Gets the value of the className property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * Sets the value of the className property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setClassName(String value) {
		this.className = value;
	}

	/**
	 * Gets the value of the methods property.
	 *
	 * @return possible object is
	 * {@link MethodsType }
	 */
	public MethodsType getMethods() {
		return methods;
	}

	/**
	 * Sets the value of the methods property.
	 *
	 * @param value allowed object is
	 *              {@link MethodsType }
	 */
	public void setMethods(MethodsType value) {
		this.methods = value;
	}

	/**
	 * Gets the value of the bugLocations property.
	 *
	 * @return possible object is
	 * {@link BugLocationsType }
	 */
	public BugLocationsType getBugLocations() {
		return bugLocations;
	}

	/**
	 * Sets the value of the bugLocations property.
	 *
	 * @param value allowed object is
	 *              {@link BugLocationsType }
	 */
	public void setBugLocations(BugLocationsType value) {
		this.bugLocations = value;
	}

	/**
	 * Gets the value of the bugGroup property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getBugGroup() {
		return bugGroup;
	}

	/**
	 * Sets the value of the bugGroup property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setBugGroup(String value) {
		this.bugGroup = value;
	}

	/**
	 * Gets the value of the bugRank property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getBugRank() {
		return bugRank;
	}

	/**
	 * Sets the value of the bugRank property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setBugRank(String value) {
		this.bugRank = value;
	}

	/**
	 * Gets the value of the bugSeverity property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getBugSeverity() {
		return bugSeverity;
	}

	/**
	 * Sets the value of the bugSeverity property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setBugSeverity(String value) {
		this.bugSeverity = value;
	}

	/**
	 * Gets the value of the cweld property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the cweld property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getCweld().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link String }
	 */
	public List<String> getCweld() {
		if (cweld == null) {
			cweld = new ArrayList<String>();
		}
		return this.cweld;
	}

	/**
	 * Gets the value of the bugMessage property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getBugMessage() {
		return bugMessage;
	}

	/**
	 * Sets the value of the bugMessage property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setBugMessage(String value) {
		this.bugMessage = value;
	}

	/**
	 * Gets the value of the resolutionSuggestion property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getResolutionSuggestion() {
		return resolutionSuggestion;
	}

	/**
	 * Sets the value of the resolutionSuggestion property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setResolutionSuggestion(String value) {
		this.resolutionSuggestion = value;
	}

	/**
	 * Gets the value of the bugTrace property.
	 *
	 * @return possible object is
	 * {@link BugTraceType }
	 */
	public BugTraceType getBugTrace() {
		return bugTrace;
	}

	/**
	 * Sets the value of the bugTrace property.
	 *
	 * @param value allowed object is
	 *              {@link BugTraceType }
	 */
	public void setBugTrace(BugTraceType value) {
		this.bugTrace = value;
	}

	/**
	 * Gets the value of the bugCode property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getBugCode() {
		return bugCode;
	}

	/**
	 * Sets the value of the bugCode property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setBugCode(String value) {
		this.bugCode = value;
	}

	/**
	 * Gets the value of the id property.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 */
	public void setId(int value) {
		this.id = value;
	}

}
