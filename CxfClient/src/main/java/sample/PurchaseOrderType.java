//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.02 at 11:37:05 AM BST 
//


package sample;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PurchaseOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseOrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShipTo" type="{http://tempuri.org/PurchaseOrderSchema.xsd}USAddress" maxOccurs="2"/>
 *         &lt;element name="BillTo" type="{http://tempuri.org/PurchaseOrderSchema.xsd}USAddress"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseOrderType", propOrder = {
    "shipTo",
    "billTo"
})
public class PurchaseOrderType {

    @XmlElement(name = "ShipTo", required = true)
    protected List<USAddress> shipTo;
    @XmlElement(name = "BillTo", required = true)
    protected USAddress billTo;
    @XmlAttribute(name = "OrderDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orderDate;

    /**
     * Gets the value of the shipTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link USAddress }
     * 
     * 
     */
    public List<USAddress> getShipTo() {
        if (shipTo == null) {
            shipTo = new ArrayList<USAddress>();
        }
        return this.shipTo;
    }

    /**
     * Gets the value of the billTo property.
     * 
     * @return
     *     possible object is
     *     {@link USAddress }
     *     
     */
    public USAddress getBillTo() {
        return billTo;
    }

    /**
     * Sets the value of the billTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link USAddress }
     *     
     */
    public void setBillTo(USAddress value) {
        this.billTo = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

}
