//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 03:13:54 오후 KST 
//


package net.herit.iot.onem2m.resource;


import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}regularResource">
 *       &lt;sequence>
 *         &lt;element name="stateTag" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="operation" type="{http://www.onem2m.org/xml/protocols}operation"/>
 *         &lt;element name="target" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="originator" type="{http://www.onem2m.org/xml/protocols}ID"/>
 *         &lt;element name="requestID" type="{http://www.onem2m.org/xml/protocols}requestID"/>
 *         &lt;element name="metaInformation" type="{http://www.onem2m.org/xml/protocols}metaInformation"/>
 *         &lt;element name="primitiveContent" type="{http://www.onem2m.org/xml/protocols}primitiveContent"/>
 *         &lt;element name="requestStatus" type="{http://www.onem2m.org/xml/protocols}requestStatus"/>
 *         &lt;element name="operationResult" type="{http://www.onem2m.org/xml/protocols}operationResult"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded">
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
    "stateTag",
    "operation",
    "target",
    "originator",
    "requestID",
    "metaInformation",
    "primitiveContent",
    "requestStatus",
    "operationResult",
    "childResource",
    "subscription"
})
//@XmlRootElement(name = "request")
@XmlRootElement(name = Naming.REQUEST_SN)
public class Request
    extends RegularResource
{
//	public final static String SCHEMA_LOCATION = "CDT-request-v1_2_0.xsd";
//	public final static String SCHEMA_LOCATION = "CDT-request-v1_6_0.xsd";
	public final static String SCHEMA_LOCATION = "CDT-request-v2_7_0.xsd";

    //@XmlElement(required = true)
    @XmlElement(name = Naming.STATETAG_SN, required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer stateTag;
    //@XmlElement(required = true)
    @XmlElement(name = Naming.OPERATION_SN, required = true)  //opn->op XSD-1.6.0
    protected Integer operation;
    //@XmlElement(required = true)
    @XmlElement(name = Naming.TARGET_SN, required = true)
    @XmlSchemaType(name = "anyURI")
    protected String target;
    //@XmlElement(required = true)
    @XmlElement(name = Naming.ORIGINATOR_SN, required = true)
    protected String originator;
    //@XmlElement(required = true)
    @XmlElement(name = Naming.REQUESTID_SN, required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String requestID;
    //@XmlElement(required = true)
    @XmlElement(name = Naming.METAINFORMATION_SN)
    protected MetaInformation metaInformation;
    //@XmlElement(required = true)
    @XmlElement(name = Naming.PRIMITIVECONTENT_SN, required = true)
    protected PrimitiveContent primitiveContent;
    //@XmlElement(required = true)
    @XmlElement(name = Naming.REQUESTSTATUS_SN, required = true)
    protected Integer requestStatus;
    //@XmlElement(required = true)
    @XmlElement(name = Naming.OPERATIONRESULT_SN, required = true)
    protected OperationResult operationResult;
    @XmlElement(name = Naming.CHILDRESOURCE_SN)
    protected List<ChildResourceRef> childResource;
    @XmlElement(name = Naming.SUBSCRIPTION_SN, namespace = "http://www.onem2m.org/xml/protocols")
    protected List<Subscription> subscription;

    /**
     * Gets the value of the stateTag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStateTag() {
        return stateTag;
    }

    /**
     * Sets the value of the stateTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStateTag(Integer value) {
        this.stateTag = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOperation(Integer value) {
        this.operation = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginator(String value) {
        this.originator = value;
    }

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the metaInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MetaInformation }
     *     
     */
    public MetaInformation getMetaInformation() {
        return metaInformation;
    }

    /**
     * Sets the value of the metaInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaInformation }
     *     
     */
    public void setMetaInformation(MetaInformation value) {
        this.metaInformation = value;
    }

    /**
     * Gets the value of the primitiveContent property.
     * 
     * @return
     *     possible object is
     *     {@link PrimitiveContent }
     *     
     */
    public PrimitiveContent getPrimitiveContent() {
        return primitiveContent;
    }

    /**
     * Sets the value of the primitiveContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimitiveContent }
     *     
     */
    public void setPrimitiveContent(PrimitiveContent value) {
        this.primitiveContent = value;
    }

    /**
     * Gets the value of the requestStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRequestStatus() {
        return requestStatus;
    }

    /**
     * Sets the value of the requestStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRequestStatus(Integer value) {
        this.requestStatus = value;
    }

    /**
     * Gets the value of the operationResult property.
     * 
     * @return
     *     possible object is
     *     {@link OperationResult }
     *     
     */
    public OperationResult getOperationResult() {
        return operationResult;
    }

    /**
     * Sets the value of the operationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationResult }
     *     
     */
    public void setOperationResult(OperationResult value) {
        this.operationResult = value;
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
//    	if (childResource == null) {
//    		childResource = new ArrayList<ChildResourceRef>();
//        }
    	return this.childResource;
    }
    
    public void addChildResource(ChildResourceRef ch) {
    	if (childResource == null) {
    		childResource = new ArrayList<ChildResourceRef>();
        }
    	this.childResource.add(ch);
    }

    /**
     * Gets the value of the subscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subscription }
     * 
     * 
     */
    public List<Subscription> getSubscription() {
//    	if (subscription == null) {
//    		subscription = new ArrayList<Subscription>();
//        }
    	return this.subscription;
    }
    
    public void addSubscription(Subscription sub) {
    	if (subscription == null) {
    		subscription = new ArrayList<Subscription>();
        }
    	this.subscription.add(sub);
    }

}
