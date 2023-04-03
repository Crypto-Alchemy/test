package org.web3j.abi.datatypes;

public class Utf8String implements fz6<String> {
    public static final Utf8String DEFAULT = new Utf8String("");
    public static final String TYPE_NAME = "string";
    private String value;

    public Utf8String(String str) {
        this.value = str;
    }

    public int bytes32PaddedLength() {
        if (this.value.isEmpty()) {
            return 32;
        }
        return 64;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.value;
        String str2 = ((Utf8String) obj).value;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public String getTypeAsString() {
        return TYPE_NAME;
    }

    public int hashCode() {
        String str = this.value;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return this.value;
    }

    public String getValue() {
        return this.value;
    }
}
