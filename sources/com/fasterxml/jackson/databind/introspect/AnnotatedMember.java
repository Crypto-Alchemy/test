package com.fasterxml.jackson.databind.introspect;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.util.Collections;

public abstract class AnnotatedMember extends C2911nl implements Serializable {
    private static final long serialVersionUID = 1;
    public final transient C3742zl _annotations;
    public final transient C2033i _typeContext;

    public AnnotatedMember(C2033i iVar, C3742zl zlVar) {
        this._typeContext = iVar;
        this._annotations = zlVar;
    }

    @Deprecated
    public Iterable<Annotation> annotations() {
        C3742zl zlVar = this._annotations;
        if (zlVar == null) {
            return Collections.emptyList();
        }
        return zlVar.mo28521c();
    }

    public final void fixAccess(boolean z) {
        Member member = getMember();
        if (member != null) {
            wf0.m29512g(member, z);
        }
    }

    public C3742zl getAllAnnotations() {
        return this._annotations;
    }

    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        C3742zl zlVar = this._annotations;
        if (zlVar == null) {
            return null;
        }
        return zlVar.get(cls);
    }

    public abstract Class<?> getDeclaringClass();

    public String getFullName() {
        return getDeclaringClass().getName() + "#" + getName();
    }

    public abstract Member getMember();

    @Deprecated
    public C2033i getTypeContext() {
        return this._typeContext;
    }

    public abstract Object getValue(Object obj) throws UnsupportedOperationException, IllegalArgumentException;

    public final boolean hasAnnotation(Class<?> cls) {
        C3742zl zlVar = this._annotations;
        if (zlVar == null) {
            return false;
        }
        return zlVar.has(cls);
    }

    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        C3742zl zlVar = this._annotations;
        if (zlVar == null) {
            return false;
        }
        return zlVar.hasOneOf(clsArr);
    }

    public abstract void setValue(Object obj, Object obj2) throws UnsupportedOperationException, IllegalArgumentException;

    public abstract C2911nl withAnnotations(C3742zl zlVar);

    public AnnotatedMember(AnnotatedMember annotatedMember) {
        this._typeContext = annotatedMember._typeContext;
        this._annotations = annotatedMember._annotations;
    }
}
