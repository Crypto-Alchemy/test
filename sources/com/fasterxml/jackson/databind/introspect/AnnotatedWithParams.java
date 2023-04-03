package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public abstract class AnnotatedWithParams extends AnnotatedMember {
    private static final long serialVersionUID = 1;
    public final C3742zl[] _paramAnnotations;

    public AnnotatedWithParams(C2033i iVar, C3742zl zlVar, C3742zl[] zlVarArr) {
        super(iVar, zlVar);
        this._paramAnnotations = zlVarArr;
    }

    public final void addOrOverrideParam(int i, Annotation annotation) {
        C3742zl zlVar = this._paramAnnotations[i];
        if (zlVar == null) {
            zlVar = new C3742zl();
            this._paramAnnotations[i] = zlVar;
        }
        zlVar.mo28520b(annotation);
    }

    public abstract Object call() throws Exception;

    public abstract Object call(Object[] objArr) throws Exception;

    public abstract Object call1(Object obj) throws Exception;

    public final int getAnnotationCount() {
        return this._annotations.size();
    }

    @Deprecated
    public abstract Type getGenericParameterType(int i);

    public final AnnotatedParameter getParameter(int i) {
        return new AnnotatedParameter(this, getParameterType(i), this._typeContext, getParameterAnnotations(i), i);
    }

    public final C3742zl getParameterAnnotations(int i) {
        C3742zl[] zlVarArr = this._paramAnnotations;
        if (zlVarArr == null || i < 0 || i >= zlVarArr.length) {
            return null;
        }
        return zlVarArr[i];
    }

    public abstract int getParameterCount();

    public abstract JavaType getParameterType(int i);

    public abstract Class<?> getRawParameterType(int i);

    public AnnotatedParameter replaceParameterAnnotations(int i, C3742zl zlVar) {
        this._paramAnnotations[i] = zlVar;
        return getParameter(i);
    }

    public AnnotatedWithParams(AnnotatedWithParams annotatedWithParams, C3742zl[] zlVarArr) {
        super(annotatedWithParams);
        this._paramAnnotations = zlVarArr;
    }
}
