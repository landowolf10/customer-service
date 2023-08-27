package com.digitalwallet.customerservice.domain;

import java.util.Arrays;
import java.util.List;

public class CustomerTypeDocument {
    public String value;

    public CustomerTypeDocument(String value) {
        this.value = value;
        this.ensureIsTypeDocument(value);
    }

    private void ensureIsTypeDocument(String value) {
        List<String> typeDocumentList = Arrays.asList("DNI", "RUC");
        if (!typeDocumentList.contains(this.value)) {
            throw new RuntimeException();
        }
    }
}
