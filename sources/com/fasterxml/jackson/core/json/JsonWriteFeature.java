package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonGenerator;

public enum JsonWriteFeature implements b82 {
    QUOTE_FIELD_NAMES(true, JsonGenerator.Feature.QUOTE_FIELD_NAMES),
    WRITE_NAN_AS_STRINGS(true, JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS),
    WRITE_NUMBERS_AS_STRINGS(false, JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS),
    ESCAPE_NON_ASCII(false, JsonGenerator.Feature.ESCAPE_NON_ASCII);
    
    private final boolean _defaultState;
    private final JsonGenerator.Feature _mappedFeature;
    private final int _mask;

    /* access modifiers changed from: public */
    JsonWriteFeature(boolean z, JsonGenerator.Feature feature) {
        this._defaultState = z;
        this._mask = 1 << ordinal();
        this._mappedFeature = feature;
    }

    public static int collectDefaults() {
        int i = 0;
        for (JsonWriteFeature jsonWriteFeature : values()) {
            if (jsonWriteFeature.enabledByDefault()) {
                i |= jsonWriteFeature.getMask();
            }
        }
        return i;
    }

    public boolean enabledByDefault() {
        return this._defaultState;
    }

    public boolean enabledIn(int i) {
        if ((i & this._mask) != 0) {
            return true;
        }
        return false;
    }

    public int getMask() {
        return this._mask;
    }

    public JsonGenerator.Feature mappedFeature() {
        return this._mappedFeature;
    }
}
