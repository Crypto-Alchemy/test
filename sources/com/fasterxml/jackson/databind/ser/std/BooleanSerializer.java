package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.lang.reflect.Type;

@zz2
public final class BooleanSerializer extends StdScalarSerializer<Object> implements ls0 {
    private static final long serialVersionUID = 1;
    public final boolean _forPrimitive;

    public static final class AsNumber extends StdScalarSerializer<Object> implements ls0 {
        private static final long serialVersionUID = 1;
        public final boolean _forPrimitive;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public AsNumber(boolean r3) {
            /*
                r2 = this;
                if (r3 == 0) goto L_0x0005
                java.lang.Class r0 = java.lang.Boolean.TYPE
                goto L_0x0007
            L_0x0005:
                java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            L_0x0007:
                r1 = 0
                r2.<init>(r0, r1)
                r2._forPrimitive = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.BooleanSerializer.AsNumber.<init>(boolean):void");
        }

        public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
            visitIntFormat(t43, javaType, JsonParser.NumberType.INT);
        }

        public y63<?> createContextual(zw5 zw5, BeanProperty beanProperty) throws JsonMappingException {
            JsonFormat.Value findFormatOverrides = findFormatOverrides(zw5, beanProperty, Boolean.class);
            if (findFormatOverrides == null || findFormatOverrides.getShape().isNumeric()) {
                return this;
            }
            return new BooleanSerializer(this._forPrimitive);
        }

        public void serialize(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
            jsonGenerator.mo13880h0(Boolean.FALSE.equals(obj) ^ true ? 1 : 0);
        }

        public final void serializeWithType(Object obj, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
            jsonGenerator.mo13849P(Boolean.TRUE.equals(obj));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BooleanSerializer(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0005
            java.lang.Class r0 = java.lang.Boolean.TYPE
            goto L_0x0007
        L_0x0005:
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
        L_0x0007:
            r1 = 0
            r2.<init>(r0, r1)
            r2._forPrimitive = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.BooleanSerializer.<init>(boolean):void");
    }

    public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
        t43.mo26060o(javaType);
    }

    public y63<?> createContextual(zw5 zw5, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value findFormatOverrides = findFormatOverrides(zw5, beanProperty, handledType());
        if (findFormatOverrides != null) {
            JsonFormat.Shape shape = findFormatOverrides.getShape();
            if (shape.isNumeric()) {
                return new AsNumber(this._forPrimitive);
            }
            if (shape == JsonFormat.Shape.STRING) {
                return new ToStringSerializer(this._handledType);
            }
        }
        return this;
    }

    public g53 getSchema(zw5 zw5, Type type) {
        return createSchemaNode("boolean", !this._forPrimitive);
    }

    public void serialize(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        jsonGenerator.mo13849P(Boolean.TRUE.equals(obj));
    }

    public final void serializeWithType(Object obj, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        jsonGenerator.mo13849P(Boolean.TRUE.equals(obj));
    }
}
