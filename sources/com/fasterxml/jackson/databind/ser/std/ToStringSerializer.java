package com.fasterxml.jackson.databind.ser.std;

@zz2
public class ToStringSerializer extends ToStringSerializerBase {
    public static final ToStringSerializer instance = new ToStringSerializer();

    public ToStringSerializer() {
        super(Object.class);
    }

    public final String valueToString(Object obj) {
        return obj.toString();
    }

    public ToStringSerializer(Class<?> cls) {
        super(cls);
    }
}
