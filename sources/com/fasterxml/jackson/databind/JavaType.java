package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;

public abstract class JavaType extends af5 implements Serializable, Type {
    private static final long serialVersionUID = 1;
    public final boolean _asStatic;
    public final Class<?> _class;
    public final int _hash;
    public final Object _typeHandler;
    public final Object _valueHandler;

    public JavaType(Class<?> cls, int i, Object obj, Object obj2, boolean z) {
        this._class = cls;
        this._hash = cls.getName().hashCode() + i;
        this._valueHandler = obj;
        this._typeHandler = obj2;
        this._asStatic = z;
    }

    @Deprecated
    public abstract JavaType _narrow(Class<?> cls);

    public abstract JavaType containedType(int i);

    public abstract int containedTypeCount();

    @Deprecated
    public abstract String containedTypeName(int i);

    public JavaType containedTypeOrUnknown(int i) {
        JavaType containedType = containedType(i);
        if (containedType == null) {
            return TypeFactory.unknownType();
        }
        return containedType;
    }

    public abstract boolean equals(Object obj);

    public abstract JavaType findSuperType(Class<?> cls);

    public abstract JavaType[] findTypeParameters(Class<?> cls);

    @Deprecated
    public JavaType forcedNarrowBy(Class<?> cls) {
        if (cls == this._class) {
            return this;
        }
        return _narrow(cls);
    }

    public abstract TypeBindings getBindings();

    public JavaType getContentType() {
        return null;
    }

    public Object getContentTypeHandler() {
        return null;
    }

    public Object getContentValueHandler() {
        return null;
    }

    public String getErasedSignature() {
        StringBuilder sb = new StringBuilder(40);
        getErasedSignature(sb);
        return sb.toString();
    }

    public abstract StringBuilder getErasedSignature(StringBuilder sb);

    public String getGenericSignature() {
        StringBuilder sb = new StringBuilder(40);
        getGenericSignature(sb);
        return sb.toString();
    }

    public abstract StringBuilder getGenericSignature(StringBuilder sb);

    public abstract List<JavaType> getInterfaces();

    public JavaType getKeyType() {
        return null;
    }

    @Deprecated
    public Class<?> getParameterSource() {
        return null;
    }

    public final Class<?> getRawClass() {
        return this._class;
    }

    public JavaType getReferencedType() {
        return null;
    }

    public abstract JavaType getSuperClass();

    public <T> T getTypeHandler() {
        return this._typeHandler;
    }

    public <T> T getValueHandler() {
        return this._valueHandler;
    }

    public boolean hasContentType() {
        return true;
    }

    public boolean hasGenericTypes() {
        if (containedTypeCount() > 0) {
            return true;
        }
        return false;
    }

    public boolean hasHandlers() {
        if (this._typeHandler == null && this._valueHandler == null) {
            return false;
        }
        return true;
    }

    public final boolean hasRawClass(Class<?> cls) {
        if (this._class == cls) {
            return true;
        }
        return false;
    }

    public boolean hasValueHandler() {
        if (this._valueHandler != null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this._hash;
    }

    public boolean isAbstract() {
        return Modifier.isAbstract(this._class.getModifiers());
    }

    public boolean isArrayType() {
        return false;
    }

    public boolean isCollectionLikeType() {
        return false;
    }

    public boolean isConcrete() {
        if ((this._class.getModifiers() & 1536) == 0) {
            return true;
        }
        return this._class.isPrimitive();
    }

    public abstract boolean isContainerType();

    public final boolean isEnumImplType() {
        if (!wf0.m29485L(this._class) || this._class == Enum.class) {
            return false;
        }
        return true;
    }

    public final boolean isEnumType() {
        return wf0.m29485L(this._class);
    }

    public final boolean isFinal() {
        return Modifier.isFinal(this._class.getModifiers());
    }

    public final boolean isInterface() {
        return this._class.isInterface();
    }

    public final boolean isJavaLangObject() {
        if (this._class == Object.class) {
            return true;
        }
        return false;
    }

    public boolean isMapLikeType() {
        return false;
    }

    public final boolean isPrimitive() {
        return this._class.isPrimitive();
    }

    public final boolean isRecordType() {
        return wf0.m29493T(this._class);
    }

    public boolean isThrowable() {
        return Throwable.class.isAssignableFrom(this._class);
    }

    public final boolean isTypeOrSubTypeOf(Class<?> cls) {
        Class<?> cls2 = this._class;
        if (cls2 == cls || cls.isAssignableFrom(cls2)) {
            return true;
        }
        return false;
    }

    public final boolean isTypeOrSuperTypeOf(Class<?> cls) {
        Class<?> cls2 = this._class;
        if (cls2 == cls || cls2.isAssignableFrom(cls)) {
            return true;
        }
        return false;
    }

    public abstract JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr);

    public abstract String toString();

    public final boolean useStaticType() {
        return this._asStatic;
    }

    public abstract JavaType withContentType(JavaType javaType);

    public abstract JavaType withContentTypeHandler(Object obj);

    public abstract JavaType withContentValueHandler(Object obj);

    public JavaType withHandlersFrom(JavaType javaType) {
        JavaType javaType2;
        Object typeHandler = javaType.getTypeHandler();
        if (typeHandler != this._typeHandler) {
            javaType2 = withTypeHandler(typeHandler);
        } else {
            javaType2 = this;
        }
        Object valueHandler = javaType.getValueHandler();
        if (valueHandler != this._valueHandler) {
            return javaType2.withValueHandler(valueHandler);
        }
        return javaType2;
    }

    public abstract JavaType withStaticTyping();

    public abstract JavaType withTypeHandler(Object obj);

    public abstract JavaType withValueHandler(Object obj);

    public JavaType(JavaType javaType) {
        this._class = javaType._class;
        this._hash = javaType._hash;
        this._valueHandler = javaType._valueHandler;
        this._typeHandler = javaType._typeHandler;
        this._asStatic = javaType._asStatic;
    }
}
