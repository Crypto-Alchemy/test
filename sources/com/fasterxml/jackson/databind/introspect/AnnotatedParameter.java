package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

public final class AnnotatedParameter extends AnnotatedMember {
    private static final long serialVersionUID = 1;
    public final int _index;
    public final AnnotatedWithParams _owner;
    public final JavaType _type;

    public AnnotatedParameter(AnnotatedWithParams annotatedWithParams, JavaType javaType, C2033i iVar, C3742zl zlVar, int i) {
        super(iVar, zlVar);
        this._owner = annotatedWithParams;
        this._type = javaType;
        this._index = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!wf0.m29481H(obj, AnnotatedParameter.class)) {
            return false;
        }
        AnnotatedParameter annotatedParameter = (AnnotatedParameter) obj;
        if (!annotatedParameter._owner.equals(this._owner) || annotatedParameter._index != this._index) {
            return false;
        }
        return true;
    }

    public AnnotatedElement getAnnotated() {
        return null;
    }

    public Class<?> getDeclaringClass() {
        return this._owner.getDeclaringClass();
    }

    public int getIndex() {
        return this._index;
    }

    public Member getMember() {
        return this._owner.getMember();
    }

    public int getModifiers() {
        return this._owner.getModifiers();
    }

    public String getName() {
        return "";
    }

    public AnnotatedWithParams getOwner() {
        return this._owner;
    }

    public Type getParameterType() {
        return this._type;
    }

    public Class<?> getRawType() {
        return this._type.getRawClass();
    }

    public JavaType getType() {
        return this._type;
    }

    public Object getValue(Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor parameter of " + getDeclaringClass().getName());
    }

    public int hashCode() {
        return this._owner.hashCode() + this._index;
    }

    public void setValue(Object obj, Object obj2) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call setValue() on constructor parameter of " + getDeclaringClass().getName());
    }

    public String toString() {
        return "[parameter #" + getIndex() + ", annotations: " + this._annotations + "]";
    }

    public AnnotatedParameter withAnnotations(C3742zl zlVar) {
        if (zlVar == this._annotations) {
            return this;
        }
        return this._owner.replaceParameterAnnotations(this._index, zlVar);
    }
}
