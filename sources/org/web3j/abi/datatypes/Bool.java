package org.web3j.abi.datatypes;

public class Bool implements fz6<Boolean> {
    public static final Bool DEFAULT = new Bool(false);
    public static final String TYPE_NAME = "bool";
    private boolean value;

    public Bool(boolean z) {
        this.value = z;
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this.value == ((Bool) obj).value) {
            return true;
        }
        return false;
    }

    public String getTypeAsString() {
        return TYPE_NAME;
    }

    public int hashCode() {
        return this.value ? 1 : 0;
    }

    public Boolean getValue() {
        return Boolean.valueOf(this.value);
    }

    public Bool(Boolean bool) {
        this.value = bool.booleanValue();
    }
}
