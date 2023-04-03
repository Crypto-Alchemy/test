package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;
import java.util.HashMap;
import p000.l87;

public class SimpleValueInstantiators extends l87.C2749a implements Serializable {
    private static final long serialVersionUID = -8929386427526115130L;
    public HashMap<ClassKey, ValueInstantiator> _classMappings = new HashMap<>();

    public SimpleValueInstantiators addValueInstantiator(Class<?> cls, ValueInstantiator valueInstantiator) {
        this._classMappings.put(new ClassKey(cls), valueInstantiator);
        return this;
    }

    public ValueInstantiator findValueInstantiator(DeserializationConfig deserializationConfig, n00 n00, ValueInstantiator valueInstantiator) {
        ValueInstantiator valueInstantiator2 = this._classMappings.get(new ClassKey(n00.mo23460r()));
        if (valueInstantiator2 == null) {
            return valueInstantiator;
        }
        return valueInstantiator2;
    }
}
