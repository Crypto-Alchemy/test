package com.fasterxml.jackson.core.type;

import com.fasterxml.jackson.core.JsonToken;

public class WritableTypeId {

    /* renamed from: a */
    public Object f9859a;

    /* renamed from: b */
    public Class<?> f9860b;

    /* renamed from: c */
    public Object f9861c;

    /* renamed from: d */
    public String f9862d;

    /* renamed from: e */
    public Inclusion f9863e;

    /* renamed from: f */
    public JsonToken f9864f;

    /* renamed from: g */
    public boolean f9865g;

    public enum Inclusion {
        WRAPPER_ARRAY,
        WRAPPER_OBJECT,
        METADATA_PROPERTY,
        PAYLOAD_PROPERTY,
        PARENT_PROPERTY;

        public boolean requiresObjectContext() {
            if (this == METADATA_PROPERTY || this == PAYLOAD_PROPERTY) {
                return true;
            }
            return false;
        }
    }

    public WritableTypeId(Object obj, JsonToken jsonToken) {
        this(obj, jsonToken, (Object) null);
    }

    public WritableTypeId(Object obj, JsonToken jsonToken, Object obj2) {
        this.f9859a = obj;
        this.f9861c = obj2;
        this.f9864f = jsonToken;
    }
}
