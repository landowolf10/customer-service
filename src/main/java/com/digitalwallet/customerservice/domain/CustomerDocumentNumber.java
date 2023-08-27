package com.digitalwallet.customerservice.domain;

public class CustomerDocumentNumber {
    public String value;

    public CustomerDocumentNumber(String value) {
        this.value = value;
        this.ensureIsValidDocumentNumber(value);
    }

    private void ensureIsValidDocumentNumber(String value) {


        if (!value.matches(validEmailRegex)) {
            throw new RuntimeException("Email value is invalid");
        }
    }
}
