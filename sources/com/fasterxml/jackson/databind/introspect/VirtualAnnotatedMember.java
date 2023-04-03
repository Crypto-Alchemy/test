package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Field;
import java.lang.reflect.Member;

public class VirtualAnnotatedMember extends AnnotatedMember {
    private static final long serialVersionUID = 1;
    public final Class<?> _declaringClass;
    public final String _name;
    public final JavaType _type;

    public VirtualAnnotatedMember(C2033i iVar, Class<?> cls, String str, JavaType javaType) {
        super(iVar, (C3742zl) null);
        this._declaringClass = cls;
        this._type = javaType;
        this._name = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!wf0.m29481H(obj, getClass())) {
            return false;
        }
        VirtualAnnotatedMember virtualAnnotatedMember = (VirtualAnnotatedMember) obj;
        if (virtualAnnotatedMember._declaringClass != this._declaringClass || !virtualAnnotatedMember._name.equals(this._name)) {
            return false;
        }
        return true;
    }

    public Field getAnnotated() {
        return null;
    }

    public int getAnnotationCount() {
        return 0;
    }

    public Class<?> getDeclaringClass() {
        return this._declaringClass;
    }

    public Member getMember() {
        return null;
    }

    public int getModifiers() {
        return 0;
    }

    public String getName() {
        return this._name;
    }

    public Class<?> getRawType() {
        return this._type.getRawClass();
    }

    public JavaType getType() {
        return this._type;
    }

    public Object getValue(Object obj) throws IllegalArgumentException {
        throw new IllegalArgumentException("Cannot get virtual property '" + this._name + "'");
    }

    public int hashCode() {
        return this._name.hashCode();
    }

    public void setValue(Object obj, Object obj2) throws IllegalArgumentException {
        throw new IllegalArgumentException("Cannot set virtual property '" + this._name + "'");
    }

    public String toString() {
        return "[virtual " + getFullName() + "]";
    }

    public C2911nl withAnnotations(C3742zl zlVar) {
        return this;
    }
}
