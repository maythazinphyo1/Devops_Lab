package com.napier.sem;

public class Country {
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * country code
     */
    private String code;

    /**
     * country name
     */
    private String name;

    private String continent; //country continent

    private String region;  // country region

    private String population; //country's population

    private String capital; //country capital
}
