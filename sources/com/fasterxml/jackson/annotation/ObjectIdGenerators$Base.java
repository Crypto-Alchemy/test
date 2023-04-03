package com.fasterxml.jackson.annotation;

abstract class ObjectIdGenerators$Base<T> extends ObjectIdGenerator<T> {
    public final Class<?> _scope;

    public ObjectIdGenerators$Base(Class<?> cls) {
        this._scope = cls;
    }

    public boolean canUseFor(ObjectIdGenerator<?> objectIdGenerator) {
        if (objectIdGenerator.getClass() == getClass() && objectIdGenerator.getScope() == this._scope) {
            return true;
        }
        return false;
    }

    public abstract T generateId(Object obj);

    public Class<?> getScope() {
        return this._scope;
    }
}
