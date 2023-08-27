package com.digitalwallet.customerservice.domain;

public class Customer {
    private CustomerDocumentNumber documentNumber;
    private CustomerPhoneNumber phoneNumber;
    private CustomerTypeDocument typeDocument;
    private  CustomerEmail email;
    private String name;
    private String sureName;

    public Customer(String documentNumber, String phoneNumber, String typeDocument, String email) {
        this.documentNumber = new CustomerDocumentNumber(documentNumber);
        this.phoneNumber = new CustomerPhoneNumber(phoneNumber);
        this.typeDocument = new CustomerTypeDocument(typeDocument);
        this.email = new CustomerEmail(email);
    }
}
