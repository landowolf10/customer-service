package com.digitalwallet.customerservice.domain;

public class CustomerEmail {
    public String value;

    public CustomerEmail(String value) {
        this.value = value;
        this.ensureIsValidEmail(value);
    }

    private void ensureIsValidEmail(String value) {
        String validEmailRegex = "[a-zA-Z0-9._%+-]+@(?:hotmail\\.com|gmail\\.com)";
        if (!value.matches(validEmailRegex)) {
            throw new RuntimeException("Email value is invalid");
        }
    }
}
