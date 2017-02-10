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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;

import net.herit.iot.onem2m.core.util.OneM2MException;
import net.herit.iot.onem2m.resource.Naming;

import org.w3c.dom.Element;


/**
 * XSD-1.6.0
 * <p>Java class for primitiveContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="primitiveContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='lax' namespace='http://www.onem2m.org/xml/protocols' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "primitiveContent", propOrder = {
   // "any"
	"anyOrAny"  // changed from any to anyOrAny in CDT-2.7.0 
})
public class PrimitiveContent {

	//@XmlAnyElement(lax = true)
    @XmlElements({
        //@XmlElement(name="uri", type = UriContent.class),
    	 @XmlElement(type = UriContent.class),
        @XmlElement(name=Naming.URILIST_SN, namespace = "http://www.onem2m.org/xml/protocols", type = UriListContent.class),
        @XmlElement(name=Naming.ACCESSCONTROLPOLICY_SN, namespace = "http://www.onem2m.org/xml/protocols", type = AccessControlPolicy.class),
        @XmlElement(name=Naming.AE_SN, namespace = "http://www.onem2m.org/xml/protocols", type = AE.class),
        @XmlElement(name=Naming.CONTAINER_SN, namespace = "http://www.onem2m.org/xml/protocols", type = Container.class),
        @XmlElement(name=Naming.CONTENTINSTANCE_SN, namespace = "http://www.onem2m.org/xml/protocols", type = ContentInstance.class),
        @XmlElement(name=Naming.CSEBASE_SN, namespace = "http://www.onem2m.org/xml/protocols", type = CSEBase.class),
        @XmlElement(name=Naming.DELIVERY_SN, namespace = "http://www.onem2m.org/xml/protocols", type = Delivery.class),
        @XmlElement(name=Naming.EVENTCONFIG_SN, namespace = "http://www.onem2m.org/xml/protocols", type = EventConfig.class),
        @XmlElement(name=Naming.EXECINSTANCE_SN, namespace = "http://www.onem2m.org/xml/protocols", type = ExecInstance.class),
        @XmlElement(name=Naming.GROUP_SN, namespace = "http://www.onem2m.org/xml/protocols", type = Group.class),
        @XmlElement(name=Naming.LOCATIONPOLICY_SN, namespace = "http://www.onem2m.org/xml/protocols", type = LocationPolicy.class),
        //@XmlElement(name="", namespace = "http://www.onem2m.org/xml/protocols", type = M2mServiceSubscriptionProfile.class),
        @XmlElement(name=Naming.MGMTCMD_SN, namespace = "http://www.onem2m.org/xml/protocols", type = MgmtCmd.class),
        //@XmlElement(name="", namespace = "http://www.onem2m.org/xml/protocols", type = MgmtObj.class),
        @XmlElement(name=Naming.NODE_SN, namespace = "http://www.onem2m.org/xml/protocols", type = Node.class),
        @XmlElement(name=Naming.POLLINGCHANNEL_SN, namespace = "http://www.onem2m.org/xml/protocols", type = PollingChannel.class),
        @XmlElement(name=Naming.REMOTECSE_SN, namespace = "http://www.onem2m.org/xml/protocols", type = RemoteCSE.class),
        @XmlElement(name=Naming.REQUEST_SN, namespace = "http://www.onem2m.org/xml/protocols", type = Request.class),
        @XmlElement(name=Naming.SCHEDULE_SN, namespace = "http://www.onem2m.org/xml/protocols", type = Schedule.class),
        //@XmlElement(name="", namespace = "http://www.onem2m.org/xml/protocols", type = ServiceSubscribedAppRule.class),
        //@XmlElement(name="", namespace = "http://www.onem2m.org/xml/protocols", type = ServiceSubscribedNode.class),
        @XmlElement(name=Naming.STATSCOLLECT_SN, namespace = "http://www.onem2m.org/xml/protocols", type = StatsCollect.class),
        @XmlElement(name=Naming.STATSCONFIG_SN, namespace = "http://www.onem2m.org/xml/protocols", type = StatsConfig.class),
        @XmlElement(name=Naming.SUBSCRIPTION_SN, namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class),
        @XmlElement(name=Naming.ACCESSCONTROLPOLICYANNC_SN, namespace = "http://www.onem2m.org/xml/protocols", type = AccessControlPolicyAnnc.class),
        @XmlElement(name=Naming.AEANNC_SN, namespace = "http://www.onem2m.org/xml/protocols", type = AEAnnc.class),
        @XmlElement(name=Naming.CONTAINERANNC_SN, namespace = "http://www.onem2m.org/xml/protocols", type = ContainerAnnc.class),
        @XmlElement(name=Naming.CONTENTINSTANCEANNC, namespace = "http://www.onem2m.org/xml/protocols", type = ContentInstanceAnnc.class),
        @XmlElement(name=Naming.GROUPANNC_SN, namespace = "http://www.onem2m.org/xml/protocols", type = GroupAnnc.class),
        @XmlElement(name=Naming.LOCATIONPOLICYANNC_SN, namespace = "http://www.onem2m.org/xml/protocols", type = LocationPolicyAnnc.class),
        //@XmlElement(name="mgmtObjAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = MgmtObjAnnc.class),
        @XmlElement(name=Naming.NODEANNC_SN, namespace = "http://www.onem2m.org/xml/protocols", type = NodeAnnc.class),
        @XmlElement(name=Naming.REMOTECSEANNC_SN, namespace = "http://www.onem2m.org/xml/protocols", type = RemoteCSEAnnc.class),
        @XmlElement(name=Naming.SCHEDULEANNC_SN, namespace = "http://www.onem2m.org/xml/protocols", type = ScheduleAnnc.class),
        @XmlElement(name=Naming.NOTIFICATION_SN, namespace = "http://www.onem2m.org/xml/protocols", type = Notification.class)
    })  
    // protected List<Object> any;
	protected List<Object> anyOrAny;
	
	
    public PrimitiveContent(Object contentObj) { // throws OneM2MException {
    	
    	//CONTENT_TYPE contentType = message.getContentType();
//    	Object contentObj = message.getContentObject();
//    	this.getAny().add(contentObj);
//    	this.addAny(contentObj);
    	this.addAnyOrAny(contentObj);
//    	
//    	if (contentType == null) {
//    		
//    		this.getAny().add(message.getContentObject());
////    		try {
////    			byte[] content = message.getContent();
////    			if (content != null) {
////    				this.getAny().add(new String(message.getContent(), "UTF-8"));
////    			}
////				
////			} catch (Exception e) {
////				log.debug("Handled exception", e);
////				throw new OneM2MException(RESPONSE_STATUS.INTERNAL_SERVER_ERROR, "Exception in initialization of PrimitiveContent");
////			}
//    	} else {
//	    	switch (message.getContentType()) {
//	    	case RES_XML:
//	    	case RES_JSON:
//	        	Resource res = Manager.getContentResource(message, manager);
//	        	if (res != null) {
//	        		this.getAny().add(res);
//	        		return;
//	        	}
//	        	break;
//	    	case XML:
//	    	case JSON:
//	    	case ATTRS_XML:
//	    	case ATTRS_JSON:
//	    	case NTFY_JSON:
//	    	case NTFY_XML:
//	    		// TBD
//	   		default:
//	   			try {
//	    			byte[] content = message.getContent();
//	    			if (content != null) {
//	    				this.getAny().add(new String(message.getContent(), "UTF-8"));
//	    			}
//				} catch (Exception e) {
//					log.debug("Handled exception", e);
//				}
//	    	}
//    	}
    		    
    }

    public PrimitiveContent() {
		// TODO Auto-generated constructor stub
	}

	/**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAnyOrAny() {
//    	if (anyOrAny == null) {
//    		anyOrAny = new ArrayList<Object>();
//    	}
    	return this.anyOrAny;
    }

    public void addAnyOrAny(Object obj) {
    	if (anyOrAny == null) {
    		anyOrAny = new ArrayList<Object>();
    	}
    	this.anyOrAny.add(obj);
    }

    
}
