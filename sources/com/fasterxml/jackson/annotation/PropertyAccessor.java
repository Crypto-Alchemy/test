package com.fasterxml.jackson.annotation;

public enum PropertyAccessor {
    GETTER,
    SETTER,
    CREATOR,
    FIELD,
    IS_GETTER,
    NONE,
    ALL;

    public boolean creatorEnabled() {
        if (this == CREATOR || this == ALL) {
            return true;
        }
        return false;
    }

    public boolean fieldEnabled() {
        if (this == FIELD || this == ALL) {
            return true;
        }
        return false;
    }

    public boolean getterEnabled() {
        if (this == GETTER || this == ALL) {
            return true;
        }
        return false;
    }

    public boolean isGetterEnabled() {
        if (this == IS_GETTER || this == ALL) {
            return true;
        }
        return false;
    }

    public boolean setterEnabled() {
        if (this == SETTER || this == ALL) {
            return true;
        }
        return false;
    }
}
