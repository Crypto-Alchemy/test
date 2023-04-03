package com.google.crypto.tink.shaded.protobuf;

import com.github.mikephil.charting.utils.Utils;

public enum JavaType {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(Utils.FLOAT_EPSILON)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(Utils.DOUBLE_EPSILON)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(ByteString.class, ByteString.class, ByteString.EMPTY),
    ENUM(r1, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    /* access modifiers changed from: public */
    JavaType(Class<?> cls, Class<?> cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public Class<?> getBoxedType() {
        return this.boxedType;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }

    public Class<?> getType() {
        return this.type;
    }

    public boolean isValidType(Class<?> cls) {
        return this.type.isAssignableFrom(cls);
    }
}
