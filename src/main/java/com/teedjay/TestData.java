package com.teedjay;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TestData {

    String name = "teedjay";

    public String getName() {
        return name;
    }

}
