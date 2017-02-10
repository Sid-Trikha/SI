//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 03:14:16 오후 KST 
//


package net.herit.iot.onem2m.resource;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}mgmtResource">
 *       &lt;sequence>
 *         &lt;element name="capabilityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attached" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="capabilityActionStatus" type="{http://www.onem2m.org/xml/protocols}actionStatus"/>
 *         &lt;element name="currentState" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="enable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="disable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;element ref="{http://www.onem2m.org/xml/protocols}subscription" maxOccurs="unbounded"/>
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
    "capabilityName",
    "attached",
    "capabilityActionStatus",
    "currentState",
    "enable",
    "disable",
    "childResource",
    "subscription"
})
//@XmlRootElement(name = "deviceCapability")
@XmlRootElement(name = Naming.DEVICECAPABILITY_SN)
public class DeviceCapability
    extends MgmtResource
{
//	public static final String SCHEMA_LOCATION = "CDT-deviceCapability-v1_2_0.xsd";
//	public static final String SCHEMA_LOCATION = "CDT-deviceCapability-v1_6_0.xsd";
	public static final String SCHEMA_LOCATION = "CDT-deviceCapability-v2_7_0.xsd";

    //@XmlElement(required = true)
    @XmlElement(name = Naming.CAPABILITYNAME_SN, required = true)
    protected String capabilityName;
    @XmlElement(name = Naming.ATTACHED_SN)
//    protected boolean attached;
    protected Boolean attached;
    //@XmlElement(required = true)
    @XmlElement(name = Naming.CAPABILITYACTIONSTATUS_SN, required = true)
    protected ActionStatus capabilityActionStatus;
    @XmlElement(name = Naming.CURRENTSTATE_SN)
//    protected boolean currentState;
    protected Boolean currentState;
    @XmlElement(name = Naming.ENABLE_SN)
    protected Boolean enable;
    @XmlElement(name = Naming.DISABLE_SN)
    protected Boolean disable;
    @XmlElement(name = Naming.CHILDRESOURCE_SN)
    protected List<ChildResourceRef> childResource;
    //@XmlElement(namespace = "http://www.onem2m.org/xml/protocols")
    @XmlElement(name = Naming.SUBSCRIPTION_SN, namespace = "http://www.onem2m.org/xml/protocols")
    protected List<Subscription> subscription;

    /**
     * Gets the value of the capabilityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapabilityName() {
        return capabilityName;
    }

    /**
     * Sets the value of the capabilityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapabilityName(String value) {
        this.capabilityName = value;
    }

    /**
     * Gets the value of the attached property.
     * 
     */
    public Boolean isAttached() {
        return attached;
    }

    /**
     * Sets the value of the attached property.
     * 
     */
    public void setAttached(Boolean value) {
        this.attached = value;
    }

    /**
     * Gets the value of the capabilityActionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ActionStatus }
     *     
     */
    public ActionStatus getCapabilityActionStatus() {
        return capabilityActionStatus;
    }

    /**
     * Sets the value of the capabilityActionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionStatus }
     *     
     */
    public void setCapabilityActionStatus(ActionStatus value) {
        this.capabilityActionStatus = value;
    }

    /**
     * Gets the value of the currentState property.
     * 
     */
    public Boolean isCurrentState() {
        return currentState;
    }

    /**
     * Sets the value of the currentState property.
     * 
     */
    public void setCurrentState(Boolean value) {
        this.currentState = value;
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
     * Gets the value of the disable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisable() {
        return disable;
    }

    /**
     * Sets the value of the disable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisable(Boolean value) {
        this.disable = value;
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
//    	}
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
//    	}
    	return this.subscription;
    }
    
    public void addSubscription(Subscription sub) {
    	if (subscription == null) {
    		subscription = new ArrayList<Subscription>();
    	}
    	this.subscription.add(sub);
    }

    @Override
	public void validate(OPERATION operation) throws OneM2MException {
		
		if (operation.equals(OPERATION.CREATE)) {	// create 요청에 의해 생성된 리소스에 대한 유효성 체크 (DB저장전)

			if (this.mgmtDefinition == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'mgmtDefinition' is M on CREATE operation");
			}
			if (this.capabilityName == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'capabilityName' is M on memAvailable operation");
			}
			if (this.attached == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'attached' is M on CREATE operation");
			}
			if (this.capabilityActionStatus == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'capabilityActionStatus' is M on CREATE operation");
			}
			if (this.currentState == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'currentState' is M on CREATE operation");
			}
			
		} else if (operation.equals(OPERATION.UPDATE)) {	// update 요청에 의해 생성된 리소스에 대한 유효성 체크 (DB저장전)
			
			if (this.mgmtDefinition != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'mgmtDefinition' is NP on UPDATE operation");
			}
			if (this.objectIDs != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'objectIDs' is NP on UPDATE operation");
			}
			if (this.objectPaths != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'objectPaths' is NP on UPDATE operation");
			}
			
		}
	
		super.validate(operation);
		
	}

}
