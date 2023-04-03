package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

public class PlaceholderForType extends TypeBase {
    private static final long serialVersionUID = 1;
    public JavaType _actualType;
    public final int _ordinal;

    public PlaceholderForType(int i) {
        super(Object.class, TypeBindings.emptyBindings(), TypeFactory.unknownType(), (JavaType[]) null, 1, (Object) null, (Object) null, false);
        this._ordinal = i;
    }

    @Deprecated
    public JavaType _narrow(Class<?> cls) {
        return (JavaType) mo16842a();
    }

    /* renamed from: a */
    public final <T> T mo16842a() {
        throw new UnsupportedOperationException("Operation should not be attempted on " + getClass().getName());
    }

    public JavaType actualType() {
        return this._actualType;
    }

    public String buildCanonicalName() {
        return toString();
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public StringBuilder getErasedSignature(StringBuilder sb) {
        sb.append(DecodedChar.FNC1);
        sb.append(this._ordinal + 1);
        return sb;
    }

    public StringBuilder getGenericSignature(StringBuilder sb) {
        return getErasedSignature(sb);
    }

    public boolean isContainerType() {
        return false;
    }

    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return (JavaType) mo16842a();
    }

    public String toString() {
        return getErasedSignature(new StringBuilder()).toString();
    }

    public JavaType withContentType(JavaType javaType) {
        return (JavaType) mo16842a();
    }

    public JavaType withContentTypeHandler(Object obj) {
        return (JavaType) mo16842a();
    }

    public JavaType withContentValueHandler(Object obj) {
        return (JavaType) mo16842a();
    }

    public JavaType withStaticTyping() {
        return (JavaType) mo16842a();
    }

    public JavaType withTypeHandler(Object obj) {
        return (JavaType) mo16842a();
    }

    public JavaType withValueHandler(Object obj) {
        return (JavaType) mo16842a();
    }

    public void actualType(JavaType javaType) {
        this._actualType = javaType;
    }
}
