//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 03:14:07 오후 KST 
//


package net.herit.iot.onem2m.resource;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedResource">
 *       &lt;sequence>
 *         &lt;element name="memberType" type="{http://www.onem2m.org/xml/protocols}memberType" minOccurs="0"/>
 *         &lt;element name="currentNrOfMembers" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="maxNrOfMembers" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="memberIDs" type="{http://www.onem2m.org/xml/protocols}listOfURIs" minOccurs="0"/>
 *         &lt;element name="membersAccessControlPolicyIDs" type="{http://www.onem2m.org/xml/protocols}listOfURIs" minOccurs="0"/>
 *         &lt;element name="memberTypeValidated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="consistencyStrategy" type="{http://www.onem2m.org/xml/protocols}consistencyStrategy" minOccurs="0"/>
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "memberType",
    "currentNrOfMembers",
    "maxNrOfMembers",
    "memberIDs",
    "membersAccessControlPolicyIDs",
    "memberTypeValidated",
    "consistencyStrategy",
    "groupName",
    "childResource",
    // "subscription"		changed from subscription to subscriptionOrSemanticDescriptor in CDT-2.7.0
    "subscriptionOrSemanticDescriptorOrSemanticDescriptorAnnc"
})
//@XmlRootElement(name = "groupAnnc")
@XmlRootElement(name = Naming.GROUPANNC_SN)
public class GroupAnnc
    extends AnnouncedResource
{
//	public final static String SCHEMA_LOCATION = "CDT-group-v1_2_0.xsd";
//	public final static String SCHEMA_LOCATION = "CDT-group-v1_6_0.xsd";
	public final static String SCHEMA_LOCATION = "CDT-group-v2_7_0.xsd";
	

	public static final List<String> MA = new ArrayList<String>(
			Arrays.asList(Naming.RESOURCEID_SN,
							Naming.RESOURCENAME_SN,
							Naming.EXPIRATIONTIME_SN,
							Naming.ACCESSCONTROLPOLICYIDS_SN,
							Naming.LABELS_SN
			)
		);
		public static final Set<String> OA = new HashSet<String>(
			Arrays.asList(Naming.MEMBERTYPE_SN,
							Naming.CURRENTNROFMEMBERS_SN,
							Naming.MAXNROFMEMBERS_SN,
							Naming.MEMBERIDS_SN,
							Naming.MEMBERSACCESSCONTROLPOLICYIDS_SN,
							Naming.MEMBERTYPEVALIDATED_SN,
							Naming.CONSISTENCYSTRATEGY_SN,
							Naming.GROUPNAME_SN
							
			)
		);
	
	
    @XmlElement(name = Naming.MEMBERTYPE_SN)
    protected Integer memberType;
    @XmlElement(name = Naming.CURRENTNROFMEMBERS_SN)
    @XmlSchemaType(name = "positiveInteger")
    protected Integer currentNrOfMembers;
    @XmlElement(name = Naming.MAXNROFMEMBERS_SN)
    @XmlSchemaType(name = "positiveInteger")
    protected Integer maxNrOfMembers;
    @XmlList
    @XmlElement(name = Naming.MEMBERIDS_SN)
    protected List<String> memberIDs;
    @XmlList
    @XmlElement(name = Naming.MEMBERSACCESSCONTROLPOLICYIDS_SN)
    protected List<String> membersAccessControlPolicyIDs;
    @XmlElement(name = Naming.MEMBERTYPEVALIDATED_SN)
    protected Boolean memberTypeValidated;
    @XmlElement(name = Naming.CONSISTENCYSTRATEGY_SN)
    protected Integer consistencyStrategy;
    @XmlElement(name = Naming.GROUPNAME_SN)
    protected String groupName;
    @XmlElement(name = Naming.CHILDRESOURCE_SN)
    protected List<ChildResourceRef> childResource;
    //@XmlElement(name = Naming.SUBSCRIPTION_SN, namespace = "http://www.onem2m.org/xml/protocols")
    //protected List<Subscription> subscription;
    @XmlElements({
        @XmlElement(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class),
        @XmlElement(name = "semanticDescriptor", namespace = "http://www.onem2m.org/xml/protocols", type = SemanticDescriptor.class),
        @XmlElement(name = "semanticDescriptorAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = SemanticDescriptorAnnc.class)
    })
    protected List<Resource> subscriptionOrSemanticDescriptorOrSemanticDescriptorAnnc;

    /**
     * Gets the value of the memberType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMemberType() {
        return memberType;
    }

    /**
     * Sets the value of the memberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMemberType(Integer value) {
        this.memberType = value;
    }

    /**
     * Gets the value of the currentNrOfMembers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentNrOfMembers() {
        return currentNrOfMembers;
    }

    /**
     * Sets the value of the currentNrOfMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentNrOfMembers(Integer value) {
        this.currentNrOfMembers = value;
    }

    /**
     * Gets the value of the maxNrOfMembers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNrOfMembers() {
        return maxNrOfMembers;
    }

    /**
     * Sets the value of the maxNrOfMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNrOfMembers(Integer value) {
        this.maxNrOfMembers = value;
    }

    /**
     * Gets the value of the memberIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memberIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMemberIDs() {
//    	if (memberIDs == null) {
//    		memberIDs = new ArrayList<String>();
//    	}
    	return this.memberIDs;
    }
    
    public void addMemberIDs(String mid) {
    	if (memberIDs == null) {
    		memberIDs = new ArrayList<String>();
    	}
    	this.memberIDs.add(mid);
    }


    /**
     * Gets the value of the membersAccessControlPolicyIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the membersAccessControlPolicyIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMembersAccessControlPolicyIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMembersAccessControlPolicyIDs() {
//    	if (membersAccessControlPolicyIDs == null) {
//    		membersAccessControlPolicyIDs = new ArrayList<String>();
//    	}
    	return this.membersAccessControlPolicyIDs;
    }
    
    public void addMembersAccessControlPolicyIDs(String macp) {
    	if (membersAccessControlPolicyIDs == null) {
    		membersAccessControlPolicyIDs = new ArrayList<String>();
    	}
    	this.membersAccessControlPolicyIDs.add(macp);
    }


    /**
     * Gets the value of the memberTypeValidated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMemberTypeValidated() {
        return memberTypeValidated;
    }

    /**
     * Sets the value of the memberTypeValidated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMemberTypeValidated(Boolean value) {
        this.memberTypeValidated = value;
    }

    /**
     * Gets the value of the consistencyStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsistencyStrategy() {
        return consistencyStrategy;
    }

    /**
     * Sets the value of the consistencyStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsistencyStrategy(Integer value) {
        this.consistencyStrategy = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
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
     *
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
    } */
    
    /**
     * Gets the value of the subscriptionOrSemanticDescriptorOrSemanticDescriptorAnnc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptionOrSemanticDescriptorOrSemanticDescriptorAnnc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionOrSemanticDescriptorOrSemanticDescriptorAnnc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subscription }
     * {@link SemanticDescriptor }
     * {@link SemanticDescriptorAnnc }
     * 
     * 
     */
    public List<Resource> getSubscriptionOrSemanticDescriptorOrSemanticDescriptorAnnc() {
      //  if (subscriptionOrSemanticDescriptorOrSemanticDescriptorAnnc == null) {
      //      subscriptionOrSemanticDescriptorOrSemanticDescriptorAnnc = new ArrayList<Resource>();
      //  }
        return this.subscriptionOrSemanticDescriptorOrSemanticDescriptorAnnc;
    }
    
    public void addSubscriptionOrSemanticDescriptorOrSemanticDescriptorAnnc(Resource sub) {
    	if (subscriptionOrSemanticDescriptorOrSemanticDescriptorAnnc == null) {
    		subscriptionOrSemanticDescriptorOrSemanticDescriptorAnnc = new ArrayList<Resource>();
    	}
    	this.subscriptionOrSemanticDescriptorOrSemanticDescriptorAnnc.add(sub);
    }

}
