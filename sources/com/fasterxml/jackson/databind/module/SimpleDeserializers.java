package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import p000.be1;

public class SimpleDeserializers extends be1.C1623a implements Serializable {
    private static final long serialVersionUID = 1;
    public HashMap<ClassKey, o43<?>> _classMappings = null;
    public boolean _hasEnumDeserializer = false;

    public SimpleDeserializers() {
    }

    /* renamed from: a */
    public final o43<?> mo16175a(JavaType javaType) {
        HashMap<ClassKey, o43<?>> hashMap = this._classMappings;
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(new ClassKey(javaType.getRawClass()));
    }

    public <T> void addDeserializer(Class<T> cls, o43<? extends T> o43) {
        ClassKey classKey = new ClassKey(cls);
        if (this._classMappings == null) {
            this._classMappings = new HashMap<>();
        }
        this._classMappings.put(classKey, o43);
        if (cls == Enum.class) {
            this._hasEnumDeserializer = true;
        }
    }

    public void addDeserializers(Map<Class<?>, o43<?>> map) {
        for (Map.Entry next : map.entrySet()) {
            addDeserializer((Class) next.getKey(), (o43) next.getValue());
        }
    }

    public o43<?> findArrayDeserializer(ArrayType arrayType, DeserializationConfig deserializationConfig, n00 n00, j07 j07, o43<?> o43) throws JsonMappingException {
        return mo16175a(arrayType);
    }

    public o43<?> findBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, n00 n00) throws JsonMappingException {
        return mo16175a(javaType);
    }

    public o43<?> findCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, n00 n00, j07 j07, o43<?> o43) throws JsonMappingException {
        return mo16175a(collectionType);
    }

    public o43<?> findCollectionLikeDeserializer(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, n00 n00, j07 j07, o43<?> o43) throws JsonMappingException {
        return mo16175a(collectionLikeType);
    }

    public o43<?> findEnumDeserializer(Class<?> cls, DeserializationConfig deserializationConfig, n00 n00) throws JsonMappingException {
        HashMap<ClassKey, o43<?>> hashMap = this._classMappings;
        if (hashMap == null) {
            return null;
        }
        o43<?> o43 = hashMap.get(new ClassKey(cls));
        if (o43 != null || !this._hasEnumDeserializer || !cls.isEnum()) {
            return o43;
        }
        return this._classMappings.get(new ClassKey(Enum.class));
    }

    public o43<?> findMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, n00 n00, ha3 ha3, j07 j07, o43<?> o43) throws JsonMappingException {
        return mo16175a(mapType);
    }

    public o43<?> findMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, n00 n00, ha3 ha3, j07 j07, o43<?> o43) throws JsonMappingException {
        return mo16175a(mapLikeType);
    }

    public o43<?> findReferenceDeserializer(ReferenceType referenceType, DeserializationConfig deserializationConfig, n00 n00, j07 j07, o43<?> o43) throws JsonMappingException {
        return mo16175a(referenceType);
    }

    public o43<?> findTreeNodeDeserializer(Class<? extends g53> cls, DeserializationConfig deserializationConfig, n00 n00) throws JsonMappingException {
        HashMap<ClassKey, o43<?>> hashMap = this._classMappings;
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(new ClassKey(cls));
    }

    public boolean hasDeserializerFor(DeserializationConfig deserializationConfig, Class<?> cls) {
        HashMap<ClassKey, o43<?>> hashMap = this._classMappings;
        if (hashMap == null || !hashMap.containsKey(new ClassKey(cls))) {
            return false;
        }
        return true;
    }

    public SimpleDeserializers(Map<Class<?>, o43<?>> map) {
        addDeserializers(map);
    }
}
