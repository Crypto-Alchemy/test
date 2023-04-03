package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceSerializer extends ReferenceTypeSerializer<AtomicReference<?>> {
    private static final long serialVersionUID = 1;

    public AtomicReferenceSerializer(ReferenceType referenceType, boolean z, m17 m17, y63<Object> y63) {
        super(referenceType, z, m17, y63);
    }

    public ReferenceTypeSerializer<AtomicReference<?>> withContentInclusion(Object obj, boolean z) {
        return new AtomicReferenceSerializer(this, this._property, this._valueTypeSerializer, this._valueSerializer, this._unwrapper, obj, z);
    }

    public ReferenceTypeSerializer<AtomicReference<?>> withResolved(BeanProperty beanProperty, m17 m17, y63<?> y63, NameTransformer nameTransformer) {
        return new AtomicReferenceSerializer(this, beanProperty, m17, y63, nameTransformer, this._suppressableValue, this._suppressNulls);
    }

    public AtomicReferenceSerializer(AtomicReferenceSerializer atomicReferenceSerializer, BeanProperty beanProperty, m17 m17, y63<?> y63, NameTransformer nameTransformer, Object obj, boolean z) {
        super(atomicReferenceSerializer, beanProperty, m17, y63, nameTransformer, obj, z);
    }

    public Object _getReferenced(AtomicReference<?> atomicReference) {
        return atomicReference.get();
    }

    public Object _getReferencedIfPresent(AtomicReference<?> atomicReference) {
        return atomicReference.get();
    }

    public boolean _isValuePresent(AtomicReference<?> atomicReference) {
        return atomicReference.get() != null;
    }
}
