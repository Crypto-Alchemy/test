package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

public final class AnnotatedConstructor extends AnnotatedWithParams {
    private static final long serialVersionUID = 1;
    public final Constructor<?> _constructor;
    public Serialization _serialization;

    public static final class Serialization implements Serializable {
        private static final long serialVersionUID = 1;
        public Class<?>[] args;
        public Class<?> clazz;

        public Serialization(Constructor<?> constructor) {
            this.clazz = constructor.getDeclaringClass();
            this.args = constructor.getParameterTypes();
        }
    }

    public AnnotatedConstructor(C2033i iVar, Constructor<?> constructor, C3742zl zlVar, C3742zl[] zlVarArr) {
        super(iVar, zlVar, zlVarArr);
        if (constructor != null) {
            this._constructor = constructor;
            return;
        }
        throw new IllegalArgumentException("Null constructor not allowed");
    }

    public final Object call() throws Exception {
        return this._constructor.newInstance((Object[]) null);
    }

    public final Object call1(Object obj) throws Exception {
        return this._constructor.newInstance(new Object[]{obj});
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!wf0.m29481H(obj, AnnotatedConstructor.class)) {
            return false;
        }
        Constructor<?> constructor = ((AnnotatedConstructor) obj)._constructor;
        if (constructor != null) {
            return constructor.equals(this._constructor);
        }
        if (this._constructor == null) {
            return true;
        }
        return false;
    }

    public Class<?> getDeclaringClass() {
        return this._constructor.getDeclaringClass();
    }

    @Deprecated
    public Type getGenericParameterType(int i) {
        Type[] genericParameterTypes = this._constructor.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return genericParameterTypes[i];
    }

    public Member getMember() {
        return this._constructor;
    }

    public int getModifiers() {
        return this._constructor.getModifiers();
    }

    public String getName() {
        return this._constructor.getName();
    }

    public int getParameterCount() {
        return this._constructor.getParameterTypes().length;
    }

    public JavaType getParameterType(int i) {
        Type[] genericParameterTypes = this._constructor.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return this._typeContext.mo16038a(genericParameterTypes[i]);
    }

    public Class<?> getRawParameterType(int i) {
        Class<?>[] parameterTypes = this._constructor.getParameterTypes();
        if (i >= parameterTypes.length) {
            return null;
        }
        return parameterTypes[i];
    }

    public Class<?> getRawType() {
        return this._constructor.getDeclaringClass();
    }

    public JavaType getType() {
        return this._typeContext.mo16038a(getRawType());
    }

    public Object getValue(Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor of " + getDeclaringClass().getName());
    }

    public int hashCode() {
        return this._constructor.getName().hashCode();
    }

    public Object readResolve() {
        Serialization serialization = this._serialization;
        Class<?> cls = serialization.clazz;
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(serialization.args);
            if (!declaredConstructor.isAccessible()) {
                wf0.m29512g(declaredConstructor, false);
            }
            return new AnnotatedConstructor((C2033i) null, declaredConstructor, (C3742zl) null, (C3742zl[]) null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find constructor with " + this._serialization.args.length + " args from Class '" + cls.getName());
        }
    }

    public void setValue(Object obj, Object obj2) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call setValue() on constructor of " + getDeclaringClass().getName());
    }

    public String toString() {
        String str;
        int length = this._constructor.getParameterTypes().length;
        Object[] objArr = new Object[4];
        objArr[0] = wf0.m29497X(this._constructor.getDeclaringClass());
        objArr[1] = Integer.valueOf(length);
        if (length == 1) {
            str = "";
        } else {
            str = "s";
        }
        objArr[2] = str;
        objArr[3] = this._annotations;
        return String.format("[constructor for %s (%d arg%s), annotations: %s", objArr);
    }

    public Object writeReplace() {
        return new AnnotatedConstructor(new Serialization(this._constructor));
    }

    public final Object call(Object[] objArr) throws Exception {
        return this._constructor.newInstance(objArr);
    }

    public Constructor<?> getAnnotated() {
        return this._constructor;
    }

    public AnnotatedConstructor withAnnotations(C3742zl zlVar) {
        return new AnnotatedConstructor(this._typeContext, this._constructor, zlVar, this._paramAnnotations);
    }

    public AnnotatedConstructor(Serialization serialization) {
        super((C2033i) null, (C3742zl) null, (C3742zl[]) null);
        this._constructor = null;
        this._serialization = serialization;
    }
}
