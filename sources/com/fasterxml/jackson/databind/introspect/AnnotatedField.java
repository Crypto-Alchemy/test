package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

public final class AnnotatedField extends AnnotatedMember {
    private static final long serialVersionUID = 1;
    public final transient Field _field;
    public Serialization _serialization;

    public static final class Serialization implements Serializable {
        private static final long serialVersionUID = 1;
        public Class<?> clazz;
        public String name;

        public Serialization(Field field) {
            this.clazz = field.getDeclaringClass();
            this.name = field.getName();
        }
    }

    public AnnotatedField(C2033i iVar, Field field, C3742zl zlVar) {
        super(iVar, zlVar);
        this._field = field;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!wf0.m29481H(obj, AnnotatedField.class)) {
            return false;
        }
        Field field = ((AnnotatedField) obj)._field;
        if (field != null) {
            return field.equals(this._field);
        }
        if (this._field == null) {
            return true;
        }
        return false;
    }

    public int getAnnotationCount() {
        return this._annotations.size();
    }

    public Class<?> getDeclaringClass() {
        return this._field.getDeclaringClass();
    }

    public Member getMember() {
        return this._field;
    }

    public int getModifiers() {
        return this._field.getModifiers();
    }

    public String getName() {
        return this._field.getName();
    }

    public Class<?> getRawType() {
        return this._field.getType();
    }

    public JavaType getType() {
        return this._typeContext.mo16038a(this._field.getGenericType());
    }

    public Object getValue(Object obj) throws IllegalArgumentException {
        try {
            return this._field.get(obj);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Failed to getValue() for field " + getFullName() + ": " + e.getMessage(), e);
        }
    }

    public int hashCode() {
        return this._field.getName().hashCode();
    }

    public boolean isTransient() {
        return Modifier.isTransient(getModifiers());
    }

    public Object readResolve() {
        Serialization serialization = this._serialization;
        Class<?> cls = serialization.clazz;
        try {
            Field declaredField = cls.getDeclaredField(serialization.name);
            if (!declaredField.isAccessible()) {
                wf0.m29512g(declaredField, false);
            }
            return new AnnotatedField((C2033i) null, declaredField, (C3742zl) null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find method '" + this._serialization.name + "' from Class '" + cls.getName());
        }
    }

    public void setValue(Object obj, Object obj2) throws IllegalArgumentException {
        try {
            this._field.set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Failed to setValue() for field " + getFullName() + ": " + e.getMessage(), e);
        }
    }

    public String toString() {
        return "[field " + getFullName() + "]";
    }

    public Object writeReplace() {
        return new AnnotatedField(new Serialization(this._field));
    }

    public Field getAnnotated() {
        return this._field;
    }

    public AnnotatedField withAnnotations(C3742zl zlVar) {
        return new AnnotatedField(this._typeContext, this._field, zlVar);
    }

    public AnnotatedField(Serialization serialization) {
        super((C2033i) null, (C3742zl) null);
        this._field = null;
        this._serialization = serialization;
    }
}
