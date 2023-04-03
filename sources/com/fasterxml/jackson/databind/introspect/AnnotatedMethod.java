package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public final class AnnotatedMethod extends AnnotatedWithParams {
    private static final long serialVersionUID = 1;
    public final transient Method _method;
    public Class<?>[] _paramClasses;
    public Serialization _serialization;

    public static final class Serialization implements Serializable {
        private static final long serialVersionUID = 1;
        public Class<?>[] args;
        public Class<?> clazz;
        public String name;

        public Serialization(Method method) {
            this.clazz = method.getDeclaringClass();
            this.name = method.getName();
            this.args = method.getParameterTypes();
        }
    }

    public AnnotatedMethod(C2033i iVar, Method method, C3742zl zlVar, C3742zl[] zlVarArr) {
        super(iVar, zlVar, zlVarArr);
        if (method != null) {
            this._method = method;
            return;
        }
        throw new IllegalArgumentException("Cannot construct AnnotatedMethod with null Method");
    }

    public final Object call() throws Exception {
        return this._method.invoke((Object) null, new Object[0]);
    }

    public final Object call1(Object obj) throws Exception {
        return this._method.invoke((Object) null, new Object[]{obj});
    }

    public final Object callOn(Object obj) throws Exception {
        return this._method.invoke(obj, (Object[]) null);
    }

    public final Object callOnWith(Object obj, Object... objArr) throws Exception {
        return this._method.invoke(obj, objArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!wf0.m29481H(obj, AnnotatedMethod.class)) {
            return false;
        }
        Method method = ((AnnotatedMethod) obj)._method;
        if (method != null) {
            return method.equals(this._method);
        }
        if (this._method == null) {
            return true;
        }
        return false;
    }

    public Class<?> getDeclaringClass() {
        return this._method.getDeclaringClass();
    }

    public String getFullName() {
        String fullName = super.getFullName();
        int parameterCount = getParameterCount();
        if (parameterCount == 0) {
            return fullName + "()";
        } else if (parameterCount != 1) {
            return String.format("%s(%d params)", new Object[]{super.getFullName(), Integer.valueOf(getParameterCount())});
        } else {
            return fullName + "(" + getRawParameterType(0).getName() + ")";
        }
    }

    @Deprecated
    public Type getGenericParameterType(int i) {
        Type[] genericParameterTypes = getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return genericParameterTypes[i];
    }

    @Deprecated
    public Type[] getGenericParameterTypes() {
        return this._method.getGenericParameterTypes();
    }

    public int getModifiers() {
        return this._method.getModifiers();
    }

    public String getName() {
        return this._method.getName();
    }

    public int getParameterCount() {
        return getRawParameterTypes().length;
    }

    public JavaType getParameterType(int i) {
        Type[] genericParameterTypes = this._method.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return this._typeContext.mo16038a(genericParameterTypes[i]);
    }

    public Class<?> getRawParameterType(int i) {
        Class<?>[] rawParameterTypes = getRawParameterTypes();
        if (i >= rawParameterTypes.length) {
            return null;
        }
        return rawParameterTypes[i];
    }

    public Class<?>[] getRawParameterTypes() {
        if (this._paramClasses == null) {
            this._paramClasses = this._method.getParameterTypes();
        }
        return this._paramClasses;
    }

    public Class<?> getRawReturnType() {
        return this._method.getReturnType();
    }

    public Class<?> getRawType() {
        return this._method.getReturnType();
    }

    public JavaType getType() {
        return this._typeContext.mo16038a(this._method.getGenericReturnType());
    }

    public Object getValue(Object obj) throws IllegalArgumentException {
        try {
            return this._method.invoke(obj, (Object[]) null);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new IllegalArgumentException("Failed to getValue() with method " + getFullName() + ": " + wf0.m29528o(e), e);
        }
    }

    @Deprecated
    public boolean hasReturnType() {
        if (getRawReturnType() != Void.TYPE) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this._method.getName().hashCode();
    }

    public Object readResolve() {
        Serialization serialization = this._serialization;
        Class<?> cls = serialization.clazz;
        try {
            Method declaredMethod = cls.getDeclaredMethod(serialization.name, serialization.args);
            if (!declaredMethod.isAccessible()) {
                wf0.m29512g(declaredMethod, false);
            }
            return new AnnotatedMethod((C2033i) null, declaredMethod, (C3742zl) null, (C3742zl[]) null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find method '" + this._serialization.name + "' from Class '" + cls.getName());
        }
    }

    public void setValue(Object obj, Object obj2) throws IllegalArgumentException {
        try {
            this._method.invoke(obj, new Object[]{obj2});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new IllegalArgumentException("Failed to setValue() with method " + getFullName() + ": " + wf0.m29528o(e), e);
        }
    }

    public String toString() {
        return "[method " + getFullName() + "]";
    }

    public Object writeReplace() {
        return new AnnotatedMethod(new Serialization(this._method));
    }

    public final Object call(Object[] objArr) throws Exception {
        return this._method.invoke((Object) null, objArr);
    }

    public Method getAnnotated() {
        return this._method;
    }

    public Method getMember() {
        return this._method;
    }

    public AnnotatedMethod withAnnotations(C3742zl zlVar) {
        return new AnnotatedMethod(this._typeContext, this._method, zlVar, this._paramAnnotations);
    }

    public AnnotatedMethod(Serialization serialization) {
        super((C2033i) null, (C3742zl) null, (C3742zl[]) null);
        this._method = null;
        this._serialization = serialization;
    }
}
