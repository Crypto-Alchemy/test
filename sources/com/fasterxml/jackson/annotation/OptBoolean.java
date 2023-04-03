package com.fasterxml.jackson.annotation;

public enum OptBoolean {
    TRUE,
    FALSE,
    DEFAULT;

    public static boolean equals(Boolean bool, Boolean bool2) {
        if (bool != null) {
            return bool.equals(bool2);
        }
        if (bool2 == null) {
            return true;
        }
        return false;
    }

    public static OptBoolean fromBoolean(Boolean bool) {
        if (bool == null) {
            return DEFAULT;
        }
        if (bool.booleanValue()) {
            return TRUE;
        }
        return FALSE;
    }

    public Boolean asBoolean() {
        if (this == DEFAULT) {
            return null;
        }
        if (this == TRUE) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public boolean asPrimitive() {
        if (this == TRUE) {
            return true;
        }
        return false;
    }
}
