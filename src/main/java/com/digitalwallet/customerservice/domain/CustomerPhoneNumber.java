package com.digitalwallet.customerservice.domain;

public class CustomerPhoneNumber {
    public String value;

    public CustomerPhoneNumber(String value) {
        this.value = value;
        this.ensureIsValidPhoneNumber(value);
    }

    private void ensureIsValidPhoneNumber(String value) {
        if (!value.matches("9[0-9]{8}")) {
            throw new RuntimeException();
        }
    }
}
