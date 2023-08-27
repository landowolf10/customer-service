package com.digitalwallet.customerservice.domain;

public class CustomerDocumentNumber {
    public String value;

    public CustomerDocumentNumber(String value) {
        this.value = value;
        this.ensureIsValidDocumentNumber(value);
    }

    private void ensureIsValidDocumentNumber(String value) {
        if (!value.matches("[0-9]{9}")) {
            throw new RuntimeException();
        }

        if (!value.matches("10[0-9]{9}")) {
            throw new RuntimeException();
        }
    }
}
