//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.07 at 09:56:03 AM KST 
//


package net.herit.iot.onem2m.resource;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;

import net.herit.iot.message.onem2m.OneM2mRequest.OPERATION;
import net.herit.iot.message.onem2m.OneM2mResponse.RESPONSE_STATUS;
import net.herit.iot.onem2m.core.util.OneM2MException;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}flexContainerResource">
 *       &lt;sequence>
 *         &lt;element name="operationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operationState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inputDataPointLinks" type="{http://www.onem2m.org/xml/protocols}listOfDataLinks" minOccurs="0"/>
 *         &lt;element name="outputDataPointLinks" type="{http://www.onem2m.org/xml/protocols}listOfDataLinks" minOccurs="0"/>
 *         &lt;element name="inputLinks" type="{http://www.onem2m.org/xml/protocols}listOfDataLinks" minOccurs="0"/>
 *         &lt;element name="outputLinks" type="{http://www.onem2m.org/xml/protocols}listOfDataLinks" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}semanticDescriptor"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}subscription"/>
 *           &lt;/choice>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "operationName",
    "operationState",
    "inputDataPointLinks",
    "outputDataPointLinks",
    "inputLinks",
    "outputLinks",
    "childResource",
    "semanticDescriptorOrSubscription"
})
public class GenericInterworkingOperationInstance
    extends FlexContainerResource
{

	public final static String SCHEMA_LOCATION = "CDT-genericInterworkingOperationInstance-v2_7_0.xsd";
	
    //@XmlElement(required = true)
	@XmlElement(name = Naming.OPERATIONNAME_SN, required = true)
    protected String operationName;
    //@XmlElement(required = true)
	@XmlElement(name = Naming.OPERATIONSTATE_SN, required = true)
    protected String operationState;
	@XmlElement(name = Naming.INPUTDATAPOINTLINKS_SN)
    protected ListOfDataLinks inputDataPointLinks;
	@XmlElement(name = Naming.OUTPUTDATAPOINTLINKS_SN)
    protected ListOfDataLinks outputDataPointLinks;
	@XmlElement(name = Naming.INPUTLINKS_SN)
    protected ListOfDataLinks inputLinks;
	@XmlElement(name = Naming.OUTPUTLINKS_SN)
    protected ListOfDataLinks outputLinks;
	@XmlElement(name = Naming.CHILDRESOURCE_SN)
    protected List<ChildResourceRef> childResource;
    @XmlElements({
    	@XmlElement(name = "semanticDescriptor", namespace = "http://www.onem2m.org/xml/protocols", type = SemanticDescriptor.class),
        @XmlElement(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class)
    })
    protected List<RegularResource> semanticDescriptorOrSubscription;

    /**
     * Gets the value of the operationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * Sets the value of the operationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationName(String value) {
        this.operationName = value;
    }

    /**
     * Gets the value of the operationState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationState() {
        return operationState;
    }

    /**
     * Sets the value of the operationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationState(String value) {
        this.operationState = value;
    }

    /**
     * Gets the value of the inputDataPointLinks property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfDataLinks }
     *     
     */
    public ListOfDataLinks getInputDataPointLinks() {
        return inputDataPointLinks;
    }

    /**
     * Sets the value of the inputDataPointLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfDataLinks }
     *     
     */
    public void setInputDataPointLinks(ListOfDataLinks value) {
        this.inputDataPointLinks = value;
    }

    /**
     * Gets the value of the outputDataPointLinks property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfDataLinks }
     *     
     */
    public ListOfDataLinks getOutputDataPointLinks() {
        return outputDataPointLinks;
    }

    /**
     * Sets the value of the outputDataPointLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfDataLinks }
     *     
     */
    public void setOutputDataPointLinks(ListOfDataLinks value) {
        this.outputDataPointLinks = value;
    }

    /**
     * Gets the value of the inputLinks property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfDataLinks }
     *     
     */
    public ListOfDataLinks getInputLinks() {
        return inputLinks;
    }

    /**
     * Sets the value of the inputLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfDataLinks }
     *     
     */
    public void setInputLinks(ListOfDataLinks value) {
        this.inputLinks = value;
    }

    /**
     * Gets the value of the outputLinks property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfDataLinks }
     *     
     */
    public ListOfDataLinks getOutputLinks() {
        return outputLinks;
    }

    /**
     * Sets the value of the outputLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfDataLinks }
     *     
     */
    public void setOutputLinks(ListOfDataLinks value) {
        this.outputLinks = value;
    }

    /**
     * Gets the value of the childResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildResourceRef }
     * 
     * 
     */
    public List<ChildResourceRef> getChildResource() {
      //  if (childResource == null) {
      //      childResource = new ArrayList<ChildResourceRef>();
      //  }
        return this.childResource;
    }
    
    public void addChildResource(ChildResourceRef value) {
    	if (childResource == null) {
    		childResource = new ArrayList<ChildResourceRef>();
    	}
    	this.childResource.add(value);
    }

    /**
     * Gets the value of the semanticDescriptorOrSubscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the semanticDescriptorOrSubscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSemanticDescriptorOrSubscription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SemanticDescriptor }
     * {@link Subscription }
     * 
     * 
     */
    public List<RegularResource> getSemanticDescriptorOrSubscription() {
      //  if (semanticDescriptorOrSubscription == null) {
      //      semanticDescriptorOrSubscription = new ArrayList<RegularResource>();
      //  }
        return this.semanticDescriptorOrSubscription;
    }
    
    public void addSemanticDescriptorOrSubscription(RegularResource value) {
    	if (semanticDescriptorOrSubscription == null) {
    		semanticDescriptorOrSubscription = new ArrayList<RegularResource>();
    	}
    	this.semanticDescriptorOrSubscription.add(value);
    }
    
 // added in CDT-2.7.0
   	public void validate(OPERATION operation) throws OneM2MException {
   		
   		super.validate(operation);
   		
   		if (operation.equals(OPERATION.CREATE)) {	// CREATE 요청에 대한 데이터 유효성 체크
   			
   			if (this.operationName == null) {				
   				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "operationName is M on CREATE");				
   			}
   			
   			if (this.operationState == null) {				
   				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "operationState is M on CREATE");				
   			}
   		} 
   		
   		if (operation.equals(OPERATION.UPDATE)) {	// CREATE 요청에 대한 데이터 유효성 체크
   			
   			if (this.operationName != null) {				
   				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "operationName is NP on UPDATE");				
   			}
   		} 
   		
   	}

}
