package org.web3j.protocol.core;

public enum DefaultBlockParameterName implements x61 {
    EARLIEST("earliest"),
    LATEST("latest"),
    PENDING("pending");
    
    private String name;

    private DefaultBlockParameterName(String str) {
        this.name = str;
    }

    public static DefaultBlockParameterName fromString(String str) {
        if (str != null) {
            for (DefaultBlockParameterName defaultBlockParameterName : values()) {
                if (str.equalsIgnoreCase(defaultBlockParameterName.name)) {
                    return defaultBlockParameterName;
                }
            }
        }
        return valueOf(str);
    }

    @k73
    public String getValue() {
        return this.name;
    }
}
