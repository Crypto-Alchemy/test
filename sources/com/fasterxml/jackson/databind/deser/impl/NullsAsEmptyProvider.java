package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.Serializable;

public class NullsAsEmptyProvider implements bc4, Serializable {
    private static final long serialVersionUID = 1;
    public final o43<?> _deserializer;

    public NullsAsEmptyProvider(o43<?> o43) {
        this._deserializer = o43;
    }

    public /* bridge */ /* synthetic */ Object getAbsentValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return ac4.m182a(this, deserializationContext);
    }

    public AccessPattern getNullAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    public Object getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return this._deserializer.getEmptyValue(deserializationContext);
    }
}
