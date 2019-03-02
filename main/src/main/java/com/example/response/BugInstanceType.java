//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.26 at 05:36:24 PM EST 
//


package com.example.response;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * 				The root tag AnalyzerReport has BugInstance as child element, which contains a
 * 				property named "id". There can be multiple occurrence of BugInstance, one per each
 * 				instance of bug from the SwA tools. The "id" attribute in the BugInstance tag is a unique
 * 				integer id generated by the Assessment Parser tool.
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
 *         &lt;element name="ClassName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Methods" type="{https://www.swamp.com/com/scarf/struct}MethodsType" minOccurs="0"/>
 *         &lt;element name="BugLocations" type="{https://www.swamp.com/com/scarf/struct}BugLocationsType"/>
 *         &lt;element name="CweId" type="{http://www.w3.org/2001/XMLSchema}normalizedString" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BugGroup" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="BugCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="BugRank" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BugSeverity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BugMessage" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="ResolutionSuggestion" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="BugTrace" type="{https://www.swamp.com/com/scarf/struct}BugTraceType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 * @author drmonster
 * @version $Id: $Id
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BugInstanceType", propOrder = {
        "className",
        "methods",
        "bugLocations",
        "cweId",
        "bugGroup",
        "bugCode",
        "bugRank",
        "bugSeverity",
        "bugMessage",
        "resolutionSuggestion",
        "bugTrace"
})
public class BugInstanceType {

    @XmlElement(name = "ClassName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String className;
    @XmlElement(name = "Methods")
    protected MethodsType methods;
    @XmlElement(name = "BugLocations", required = true)
    protected BugLocationsType bugLocations;
    @XmlElement(name = "CweId")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> cweId;
    @XmlElement(name = "BugGroup")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String bugGroup;
    @XmlElement(name = "BugCode", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String bugCode;
    @XmlElement(name = "BugRank")
    protected Integer bugRank;
    @XmlElement(name = "BugSeverity")
    protected Integer bugSeverity;
    @XmlElement(name = "BugMessage")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String bugMessage;
    @XmlElement(name = "ResolutionSuggestion")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String resolutionSuggestion;
    @XmlElement(name = "BugTrace")
    protected BugTraceType bugTrace;
    @XmlAttribute(name = "id", required = true)
    protected int id;

    /**
     * Gets the value of the className property.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the methods property.
     *
     * @return a {@link com.example.response.MethodsType} object.
     */
    public MethodsType getMethods() {
        return methods;
    }

    /**
     * Sets the value of the methods property.
     *
     * @param value
     *     allowed object is
     *     {@link com.example.response.MethodsType}
     */
    public void setMethods(MethodsType value) {
        this.methods = value;
    }

    /**
     * Gets the value of the bugLocations property.
     *
     * @return a {@link com.example.response.BugLocationsType} object.
     */
    public BugLocationsType getBugLocations() {
        return bugLocations;
    }

    /**
     * Sets the value of the bugLocations property.
     *
     * @param value
     *     allowed object is
     *     {@link com.example.response.BugLocationsType}
     */
    public void setBugLocations(BugLocationsType value) {
        this.bugLocations = value;
    }

    /**
     * Gets the value of the cweId property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cweId property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCweId().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String}
     *
     * @return a {@link java.util.List} object.
     */
    public List<String> getCweId() {
        if (cweId == null) {
            cweId = new ArrayList<String>();
        }
        return this.cweId;
    }

    /**
     * Gets the value of the bugGroup property.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getBugGroup() {
        return bugGroup;
    }

    /**
     * Sets the value of the bugGroup property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setBugGroup(String value) {
        this.bugGroup = value;
    }

    /**
     * Gets the value of the bugCode property.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getBugCode() {
        return bugCode;
    }

    /**
     * Sets the value of the bugCode property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setBugCode(String value) {
        this.bugCode = value;
    }

    /**
     * Gets the value of the bugRank property.
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getBugRank() {
        return bugRank;
    }

    /**
     * Sets the value of the bugRank property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.Integer}
     */
    public void setBugRank(Integer value) {
        this.bugRank = value;
    }

    /**
     * Gets the value of the bugSeverity property.
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getBugSeverity() {
        return bugSeverity;
    }

    /**
     * Sets the value of the bugSeverity property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.Integer}
     */
    public void setBugSeverity(Integer value) {
        this.bugSeverity = value;
    }

    /**
     * Gets the value of the bugMessage property.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getBugMessage() {
        return bugMessage;
    }

    /**
     * Sets the value of the bugMessage property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setBugMessage(String value) {
        this.bugMessage = value;
    }

    /**
     * Gets the value of the resolutionSuggestion property.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getResolutionSuggestion() {
        return resolutionSuggestion;
    }

    /**
     * Sets the value of the resolutionSuggestion property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setResolutionSuggestion(String value) {
        this.resolutionSuggestion = value;
    }

    /**
     * Gets the value of the bugTrace property.
     *
     * @return a {@link com.example.response.BugTraceType} object.
     */
    public BugTraceType getBugTrace() {
        return bugTrace;
    }

    /**
     * Sets the value of the bugTrace property.
     *
     * @param value
     *     allowed object is
     *     {@link com.example.response.BugTraceType}
     */
    public void setBugTrace(BugTraceType value) {
        this.bugTrace = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return a int.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value a int.
     */
    public void setId(int value) {
        this.id = value;
    }

}
