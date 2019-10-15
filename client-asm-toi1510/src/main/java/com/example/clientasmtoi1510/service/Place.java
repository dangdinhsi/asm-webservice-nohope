/**
 * Place.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.clientasmtoi1510.service;

public class Place  implements java.io.Serializable {
    private com.example.clientasmtoi1510.service.City city;

    private com.example.clientasmtoi1510.service.Comment[] comments;

    private com.example.clientasmtoi1510.service.District district;

    private long id;

    private java.lang.String images;

    private java.lang.String name;

    private com.example.clientasmtoi1510.service.Rate[] rates;

    public Place() {
    }

    public Place(
           com.example.clientasmtoi1510.service.City city,
           com.example.clientasmtoi1510.service.Comment[] comments,
           com.example.clientasmtoi1510.service.District district,
           long id,
           java.lang.String images,
           java.lang.String name,
           com.example.clientasmtoi1510.service.Rate[] rates) {
           this.city = city;
           this.comments = comments;
           this.district = district;
           this.id = id;
           this.images = images;
           this.name = name;
           this.rates = rates;
    }


    /**
     * Gets the city value for this Place.
     * 
     * @return city
     */
    public com.example.clientasmtoi1510.service.City getCity() {
        return city;
    }


    /**
     * Sets the city value for this Place.
     * 
     * @param city
     */
    public void setCity(com.example.clientasmtoi1510.service.City city) {
        this.city = city;
    }


    /**
     * Gets the comments value for this Place.
     * 
     * @return comments
     */
    public com.example.clientasmtoi1510.service.Comment[] getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this Place.
     * 
     * @param comments
     */
    public void setComments(com.example.clientasmtoi1510.service.Comment[] comments) {
        this.comments = comments;
    }

    public com.example.clientasmtoi1510.service.Comment getComments(int i) {
        return this.comments[i];
    }

    public void setComments(int i, com.example.clientasmtoi1510.service.Comment _value) {
        this.comments[i] = _value;
    }


    /**
     * Gets the district value for this Place.
     * 
     * @return district
     */
    public com.example.clientasmtoi1510.service.District getDistrict() {
        return district;
    }


    /**
     * Sets the district value for this Place.
     * 
     * @param district
     */
    public void setDistrict(com.example.clientasmtoi1510.service.District district) {
        this.district = district;
    }


    /**
     * Gets the id value for this Place.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this Place.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the images value for this Place.
     * 
     * @return images
     */
    public java.lang.String getImages() {
        return images;
    }


    /**
     * Sets the images value for this Place.
     * 
     * @param images
     */
    public void setImages(java.lang.String images) {
        this.images = images;
    }


    /**
     * Gets the name value for this Place.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Place.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the rates value for this Place.
     * 
     * @return rates
     */
    public com.example.clientasmtoi1510.service.Rate[] getRates() {
        return rates;
    }


    /**
     * Sets the rates value for this Place.
     * 
     * @param rates
     */
    public void setRates(com.example.clientasmtoi1510.service.Rate[] rates) {
        this.rates = rates;
    }

    public com.example.clientasmtoi1510.service.Rate getRates(int i) {
        return this.rates[i];
    }

    public void setRates(int i, com.example.clientasmtoi1510.service.Rate _value) {
        this.rates[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Place)) return false;
        Place other = (Place) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              java.util.Arrays.equals(this.comments, other.getComments()))) &&
            ((this.district==null && other.getDistrict()==null) || 
             (this.district!=null &&
              this.district.equals(other.getDistrict()))) &&
            this.id == other.getId() &&
            ((this.images==null && other.getImages()==null) || 
             (this.images!=null &&
              this.images.equals(other.getImages()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.rates==null && other.getRates()==null) || 
             (this.rates!=null &&
              java.util.Arrays.equals(this.rates, other.getRates())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getComments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDistrict() != null) {
            _hashCode += getDistrict().hashCode();
        }
        _hashCode += new Long(getId()).hashCode();
        if (getImages() != null) {
            _hashCode += getImages().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Place.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://example/", "place"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://example/", "city"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://example/", "comment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("district");
        elemField.setXmlName(new javax.xml.namespace.QName("", "district"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://example/", "district"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("images");
        elemField.setXmlName(new javax.xml.namespace.QName("", "images"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://example/", "rate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
