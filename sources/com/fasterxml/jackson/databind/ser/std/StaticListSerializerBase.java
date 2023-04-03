package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

public abstract class StaticListSerializerBase<T extends Collection<?>> extends StdSerializer<T> implements ls0 {
    public final Boolean _unwrapSingle;

    public StaticListSerializerBase(Class<?> cls) {
        super(cls, false);
        this._unwrapSingle = null;
    }

    public abstract y63<?> _withResolved(BeanProperty beanProperty, Boolean bool);

    public abstract void acceptContentVisitor(e43 e43) throws JsonMappingException;

    public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
        e43 m = t43.mo26059m(javaType);
        if (m != null) {
            acceptContentVisitor(m);
        }
    }

    public abstract g53 contentSchema();

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.y63<?> createContextual(p000.zw5 r6, com.fasterxml.jackson.databind.BeanProperty r7) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r5 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1 = 0
            if (r7 == 0) goto L_0x001a
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r6.getAnnotationIntrospector()
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r3 = r7.getMember()
            if (r3 == 0) goto L_0x001a
            java.lang.Object r2 = r2.findContentSerializer(r3)
            if (r2 == 0) goto L_0x001a
            y63 r2 = r6.serializerInstance(r3, r2)
            goto L_0x001b
        L_0x001a:
            r2 = r1
        L_0x001b:
            java.lang.Class r3 = r5.handledType()
            com.fasterxml.jackson.annotation.JsonFormat$Value r3 = r5.findFormatOverrides(r6, r7, r3)
            if (r3 == 0) goto L_0x002c
            com.fasterxml.jackson.annotation.JsonFormat$Feature r4 = com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r3 = r3.getFeature(r4)
            goto L_0x002d
        L_0x002c:
            r3 = r1
        L_0x002d:
            y63 r2 = r5.findContextualConvertingSerializer(r6, r7, r2)
            if (r2 != 0) goto L_0x0037
            y63 r2 = r6.findContentValueSerializer((java.lang.Class<?>) r0, (com.fasterxml.jackson.databind.BeanProperty) r7)
        L_0x0037:
            boolean r4 = r5.isDefaultSerializer(r2)
            if (r4 == 0) goto L_0x004b
            java.lang.Boolean r6 = r5._unwrapSingle
            boolean r6 = java.util.Objects.equals(r3, r6)
            if (r6 == 0) goto L_0x0046
            return r5
        L_0x0046:
            y63 r6 = r5._withResolved(r7, r3)
            return r6
        L_0x004b:
            com.fasterxml.jackson.databind.ser.std.CollectionSerializer r7 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer
            com.fasterxml.jackson.databind.JavaType r6 = r6.constructType(r0)
            r0 = 1
            r7.<init>(r6, r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase.createContextual(zw5, com.fasterxml.jackson.databind.BeanProperty):y63");
    }

    public g53 getSchema(zw5 zw5, Type type) {
        return createSchemaNode("array", true).set("items", contentSchema());
    }

    public abstract void serializeWithType(T t, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException;

    public boolean isEmpty(zw5 zw5, T t) {
        return t == null || t.size() == 0;
    }

    public StaticListSerializerBase(StaticListSerializerBase<?> staticListSerializerBase, Boolean bool) {
        super((StdSerializer<?>) staticListSerializerBase);
        this._unwrapSingle = bool;
    }
}
