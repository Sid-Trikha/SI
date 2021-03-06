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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedFlexContainerResource">
 *       &lt;sequence>
 *         &lt;element name="objectPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}semanticDescriptor"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}semanticDescriptorAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}subscription"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}allJoynInterface"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}allJoynInterfaceAnnc"/>
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
    "objectPath",
    "enable",
    "childResource",
    "semanticDescriptorOrSemanticDescriptorAnncOrSubscription"
})

@XmlRootElement(name = Naming.ALLJOYNSVCOBJECTANNC_SN)
public class AllJoynSvcObjectAnnc
    extends AnnouncedFlexContainerResource
{

    //@XmlElement(required = true)
    @XmlElement(name = Naming.OBJECTPATH_SN, required = true)
    protected String objectPath;
    @XmlElement(name = Naming.ENABLE_SN)
    protected Boolean enable;
    @XmlElement(name = Naming.CHILDRESOURCE_SN)
    protected List<ChildResourceRef> childResource;
    @XmlElements({
    	@XmlElement(name = "semanticDescriptor", namespace = "http://www.onem2m.org/xml/protocols", type = SemanticDescriptor.class),
        @XmlElement(name = "semanticDescriptorAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = SemanticDescriptorAnnc.class),
        @XmlElement(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class),
        @XmlElement(name = "allJoynInterface", namespace = "http://www.onem2m.org/xml/protocols", type = AllJoynInterface.class),
        @XmlElement(name = "allJoynInterfaceAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = AllJoynInterfaceAnnc.class)
    })
    protected List<Object> semanticDescriptorOrSemanticDescriptorAnncOrSubscription;

    /**
     * Gets the value of the objectPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectPath() {
        return objectPath;
    }

    /**
     * Sets the value of the objectPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectPath(String value) {
        this.objectPath = value;
    }

    /**
     * Gets the value of the enable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnable() {
        return enable;
    }

    /**
     * Sets the value of the enable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnable(Boolean value) {
        this.enable = value;
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
     //   if (childResource == null) {
     //       childResource = new ArrayList<ChildResourceRef>();
     //   }
        return this.childResource;
    }
    
    public void addChildResource(ChildResourceRef value) {
    	if (childResource == null) {
    		childResource = new ArrayList<ChildResourceRef>();
    	}
    	this.childResource.add(value);
    }

    /**
     * Gets the value of the semanticDescriptorOrSemanticDescriptorAnncOrSubscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the semanticDescriptorOrSemanticDescriptorAnncOrSubscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSemanticDescriptorOrSemanticDescriptorAnncOrSubscription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SemanticDescriptor }
     * {@link SemanticDescriptorAnnc }
     * {@link Subscription }
     * {@link AllJoynInterface }
     * {@link AllJoynInterfaceAnnc }
     * 
     * 
     */
    public List<Object> getSemanticDescriptorOrSemanticDescriptorAnncOrSubscription() {
     //   if (semanticDescriptorOrSemanticDescriptorAnncOrSubscription == null) {
     //       semanticDescriptorOrSemanticDescriptorAnncOrSubscription = new ArrayList<Object>();
     //   }
        return this.semanticDescriptorOrSemanticDescriptorAnncOrSubscription;
    }
    
    public void addSemanticDescriptorOrSemanticDescriptorAnncOrSubscription(Object value) {
    	if (semanticDescriptorOrSemanticDescriptorAnncOrSubscription == null) {
    		semanticDescriptorOrSemanticDescriptorAnncOrSubscription = new ArrayList<Object>();
    	}
    	this.semanticDescriptorOrSemanticDescriptorAnncOrSubscription.add(value);
    }

}
