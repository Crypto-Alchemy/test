package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import java.io.IOException;
import java.util.UUID;

public class UUIDSerializer extends StdScalarSerializer<UUID> implements ls0 {
    public static final char[] HEX_CHARS = "0123456789abcdef".toCharArray();
    public final Boolean _asBinary;

    public UUIDSerializer() {
        this((Boolean) null);
    }

    /* renamed from: a */
    public static final void m14321a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >> 24);
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >> 16);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >> 8);
        bArr[i4 + 1] = (byte) i;
    }

    /* renamed from: b */
    public static void m14322b(int i, char[] cArr, int i2) {
        m14323c(i >> 16, cArr, i2);
        m14323c(i, cArr, i2 + 4);
    }

    /* renamed from: c */
    public static void m14323c(int i, char[] cArr, int i2) {
        char[] cArr2 = HEX_CHARS;
        cArr[i2] = cArr2[(i >> 12) & 15];
        int i3 = i2 + 1;
        cArr[i3] = cArr2[(i >> 8) & 15];
        int i4 = i3 + 1;
        cArr[i4] = cArr2[(i >> 4) & 15];
        cArr[i4 + 1] = cArr2[i & 15];
    }

    /* renamed from: d */
    public static final byte[] m14324d(UUID uuid) {
        byte[] bArr = new byte[16];
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        m14321a((int) (mostSignificantBits >> 32), bArr, 0);
        m14321a((int) mostSignificantBits, bArr, 4);
        m14321a((int) (leastSignificantBits >> 32), bArr, 8);
        m14321a((int) leastSignificantBits, bArr, 12);
        return bArr;
    }

    public boolean _writeAsBinary(JsonGenerator jsonGenerator) {
        Boolean bool = this._asBinary;
        if (bool != null) {
            return bool.booleanValue();
        }
        if ((jsonGenerator instanceof fr6) || !jsonGenerator.mo13873f()) {
            return false;
        }
        return true;
    }

    public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
        visitStringFormat(t43, javaType, JsonValueFormat.UUID);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.y63<?> createContextual(p000.zw5 r2, com.fasterxml.jackson.databind.BeanProperty r3) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r1 = this;
            java.lang.Class r0 = r1.handledType()
            com.fasterxml.jackson.annotation.JsonFormat$Value r2 = r1.findFormatOverrides(r2, r3, r0)
            if (r2 == 0) goto L_0x001c
            com.fasterxml.jackson.annotation.JsonFormat$Shape r2 = r2.getShape()
            com.fasterxml.jackson.annotation.JsonFormat$Shape r3 = com.fasterxml.jackson.annotation.JsonFormat.Shape.BINARY
            if (r2 != r3) goto L_0x0015
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            goto L_0x001d
        L_0x0015:
            com.fasterxml.jackson.annotation.JsonFormat$Shape r3 = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING
            if (r2 != r3) goto L_0x001c
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L_0x001d
        L_0x001c:
            r2 = 0
        L_0x001d:
            java.lang.Boolean r3 = r1._asBinary
            boolean r3 = java.util.Objects.equals(r2, r3)
            if (r3 != 0) goto L_0x002b
            com.fasterxml.jackson.databind.ser.std.UUIDSerializer r3 = new com.fasterxml.jackson.databind.ser.std.UUIDSerializer
            r3.<init>(r2)
            return r3
        L_0x002b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.UUIDSerializer.createContextual(zw5, com.fasterxml.jackson.databind.BeanProperty):y63");
    }

    public UUIDSerializer(Boolean bool) {
        super(UUID.class);
        this._asBinary = bool;
    }

    public boolean isEmpty(zw5 zw5, UUID uuid) {
        return uuid.getLeastSignificantBits() == 0 && uuid.getMostSignificantBits() == 0;
    }

    public void serialize(UUID uuid, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        if (_writeAsBinary(jsonGenerator)) {
            jsonGenerator.mo13845N(m14324d(uuid));
            return;
        }
        char[] cArr = new char[36];
        long mostSignificantBits = uuid.getMostSignificantBits();
        m14322b((int) (mostSignificantBits >> 32), cArr, 0);
        cArr[8] = '-';
        int i = (int) mostSignificantBits;
        m14323c(i >>> 16, cArr, 9);
        cArr[13] = '-';
        m14323c(i, cArr, 14);
        cArr[18] = '-';
        long leastSignificantBits = uuid.getLeastSignificantBits();
        m14323c((int) (leastSignificantBits >>> 48), cArr, 19);
        cArr[23] = '-';
        m14323c((int) (leastSignificantBits >>> 32), cArr, 24);
        m14322b((int) leastSignificantBits, cArr, 28);
        jsonGenerator.mo13862a1(cArr, 0, 36);
    }
}
