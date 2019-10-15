/**
 * HelloWorld.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.clientasmtoi1510.service;

public interface HelloWorld extends java.rmi.Remote {
    public com.example.clientasmtoi1510.service.District findDistrictByID(long arg0) throws java.rmi.RemoteException;
    public java.lang.String updatePlace(com.example.clientasmtoi1510.service.Place arg0) throws java.rmi.RemoteException;
    public com.example.clientasmtoi1510.service.City[] getAllCity() throws java.rmi.RemoteException;
    public com.example.clientasmtoi1510.service.District[] getAllDistrict() throws java.rmi.RemoteException;
    public java.lang.String savePlace(com.example.clientasmtoi1510.service.Place arg0) throws java.rmi.RemoteException;
    public void deletePlace(long arg0) throws java.rmi.RemoteException;
    public com.example.clientasmtoi1510.service.Place[] getAllPlace() throws java.rmi.RemoteException;
    public java.lang.String sayHelloWorldFrom(java.lang.String arg0) throws java.rmi.RemoteException;
    public com.example.clientasmtoi1510.service.Member findMemberByUsername(java.lang.String arg0) throws java.rmi.RemoteException;
    public com.example.clientasmtoi1510.service.Place findPlaceByID(long arg0) throws java.rmi.RemoteException;
    public com.example.clientasmtoi1510.service.City findCityByID(long arg0) throws java.rmi.RemoteException;
    public java.lang.String addMember(com.example.clientasmtoi1510.service.Member arg0) throws java.rmi.RemoteException;
}
