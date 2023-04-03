package com.google.crypto.tink.shaded.protobuf;

import com.github.mikephil.charting.utils.Utils;

public final class WireFormat {

    /* renamed from: a */
    public static final int f25132a = m37461c(1, 3);

    /* renamed from: b */
    public static final int f25133b = m37461c(1, 4);

    /* renamed from: c */
    public static final int f25134c = m37461c(2, 0);

    /* renamed from: d */
    public static final int f25135d = m37461c(3, 2);

    public enum FieldType {
        DOUBLE(JavaType.DOUBLE, 1),
        FLOAT(JavaType.FLOAT, 5),
        INT64(r5, 0),
        UINT64(r5, 0),
        INT32(r11, 0),
        FIXED64(r5, 1),
        FIXED32(r11, 5),
        BOOL(JavaType.BOOLEAN, 0),
        STRING(JavaType.STRING, 2) {
            public boolean isPackable() {
                return false;
            }
        },
        GROUP(r13, 3) {
            public boolean isPackable() {
                return false;
            }
        },
        MESSAGE(r13, 2) {
            public boolean isPackable() {
                return false;
            }
        },
        BYTES(JavaType.BYTE_STRING, 2) {
            public boolean isPackable() {
                return false;
            }
        },
        UINT32(r11, 0),
        ENUM(JavaType.ENUM, 0),
        SFIXED32(r11, 5),
        SFIXED64(r5, 1),
        SINT32(r11, 0),
        SINT64(r5, 0);
        
        private final JavaType javaType;
        private final int wireType;

        public JavaType getJavaType() {
            return this.javaType;
        }

        public int getWireType() {
            return this.wireType;
        }

        public boolean isPackable() {
            return true;
        }

        /* access modifiers changed from: public */
        FieldType(JavaType javaType2, int i) {
            this.javaType = javaType2;
            this.wireType = i;
        }
    }

    public enum JavaType {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(Utils.FLOAT_EPSILON)),
        DOUBLE(Double.valueOf(Utils.DOUBLE_EPSILON)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(ByteString.EMPTY),
        ENUM((String) null),
        MESSAGE((String) null);
        
        private final Object defaultDefault;

        /* access modifiers changed from: public */
        JavaType(Object obj) {
            this.defaultDefault = obj;
        }

        public Object getDefaultDefault() {
            return this.defaultDefault;
        }
    }

    /* renamed from: a */
    public static int m37459a(int i) {
        return i >>> 3;
    }

    /* renamed from: b */
    public static int m37460b(int i) {
        return i & 7;
    }

    /* renamed from: c */
    public static int m37461c(int i, int i2) {
        return (i << 3) | i2;
    }
}
