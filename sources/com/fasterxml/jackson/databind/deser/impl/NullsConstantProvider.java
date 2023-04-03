package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.Serializable;

public class NullsConstantProvider implements bc4, Serializable {

    /* renamed from: a */
    public static final NullsConstantProvider f9937a = new NullsConstantProvider((Object) null);

    /* renamed from: d */
    public static final NullsConstantProvider f9938d = new NullsConstantProvider((Object) null);
    private static final long serialVersionUID = 1;
    public final AccessPattern _access;
    public final Object _nullValue;

    public NullsConstantProvider(Object obj) {
        AccessPattern accessPattern;
        this._nullValue = obj;
        if (obj == null) {
            accessPattern = AccessPattern.ALWAYS_NULL;
        } else {
            accessPattern = AccessPattern.CONSTANT;
        }
        this._access = accessPattern;
    }

    public static NullsConstantProvider forValue(Object obj) {
        if (obj == null) {
            return f9938d;
        }
        return new NullsConstantProvider(obj);
    }

    public static boolean isNuller(bc4 bc4) {
        if (bc4 == f9938d) {
            return true;
        }
        return false;
    }

    public static boolean isSkipper(bc4 bc4) {
        if (bc4 == f9937a) {
            return true;
        }
        return false;
    }

    public static NullsConstantProvider nuller() {
        return f9938d;
    }

    public static NullsConstantProvider skipper() {
        return f9937a;
    }

    public /* bridge */ /* synthetic */ Object getAbsentValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return ac4.m182a(this, deserializationContext);
    }

    public AccessPattern getNullAccessPattern() {
        return this._access;
    }

    public Object getNullValue(DeserializationContext deserializationContext) {
        return this._nullValue;
    }
}
