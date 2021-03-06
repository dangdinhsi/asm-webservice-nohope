/**
 * City.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.clientasmtoi1510.service;

public class City  implements java.io.Serializable {
    private com.example.clientasmtoi1510.service.District[] districts;

    private long id;

    private java.lang.String name;

    public City() {
    }

    public City(
           com.example.clientasmtoi1510.service.District[] districts,
           long id,
           java.lang.String name) {
           this.districts = districts;
           this.id = id;
           this.name = name;
    }


    /**
     * Gets the districts value for this City.
     * 
     * @return districts
     */
    public com.example.clientasmtoi1510.service.District[] getDistricts() {
        return districts;
    }


    /**
     * Sets the districts value for this City.
     * 
     * @param districts
     */
    public void setDistricts(com.example.clientasmtoi1510.service.District[] districts) {
        this.districts = districts;
    }

    public com.example.clientasmtoi1510.service.District getDistricts(int i) {
        return this.districts[i];
    }

    public void setDistricts(int i, com.example.clientasmtoi1510.service.District _value) {
        this.districts[i] = _value;
    }


    /**
     * Gets the id value for this City.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this City.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this City.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this City.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof City)) return false;
        City other = (City) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.districts==null && other.getDistricts()==null) || 
             (this.districts!=null &&
              java.util.Arrays.equals(this.districts, other.getDistricts()))) &&
            this.id == other.getId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getDistricts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDistricts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDistricts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getId()).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(City.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://example/", "city"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("districts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "districts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://example/", "district"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
