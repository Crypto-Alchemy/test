package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import p000.ax5;

public class SimpleSerializers extends ax5.C1597a implements Serializable {
    private static final long serialVersionUID = 3;
    public HashMap<ClassKey, y63<?>> _classMappings = null;
    public boolean _hasEnumSerializer = false;
    public HashMap<ClassKey, y63<?>> _interfaceMappings = null;

    public SimpleSerializers() {
    }

    public void _addSerializer(Class<?> cls, y63<?> y63) {
        ClassKey classKey = new ClassKey(cls);
        if (cls.isInterface()) {
            if (this._interfaceMappings == null) {
                this._interfaceMappings = new HashMap<>();
            }
            this._interfaceMappings.put(classKey, y63);
            return;
        }
        if (this._classMappings == null) {
            this._classMappings = new HashMap<>();
        }
        this._classMappings.put(classKey, y63);
        if (cls == Enum.class) {
            this._hasEnumSerializer = true;
        }
    }

    public y63<?> _findInterfaceMapping(Class<?> cls, ClassKey classKey) {
        for (Class cls2 : cls.getInterfaces()) {
            classKey.reset(cls2);
            y63<?> y63 = this._interfaceMappings.get(classKey);
            if (y63 != null) {
                return y63;
            }
            y63<?> _findInterfaceMapping = _findInterfaceMapping(cls2, classKey);
            if (_findInterfaceMapping != null) {
                return _findInterfaceMapping;
            }
        }
        return null;
    }

    public void addSerializer(y63<?> y63) {
        Class<?> handledType = y63.handledType();
        if (handledType == null || handledType == Object.class) {
            throw new IllegalArgumentException("JsonSerializer of type " + y63.getClass().getName() + " does not define valid handledType() -- must either register with method that takes type argument  or make serializer extend 'com.fasterxml.jackson.databind.ser.std.StdSerializer'");
        }
        _addSerializer(handledType, y63);
    }

    public void addSerializers(List<y63<?>> list) {
        for (y63<?> addSerializer : list) {
            addSerializer(addSerializer);
        }
    }

    public y63<?> findArraySerializer(SerializationConfig serializationConfig, ArrayType arrayType, n00 n00, m17 m17, y63<Object> y63) {
        return findSerializer(serializationConfig, arrayType, n00);
    }

    public y63<?> findCollectionLikeSerializer(SerializationConfig serializationConfig, CollectionLikeType collectionLikeType, n00 n00, m17 m17, y63<Object> y63) {
        return findSerializer(serializationConfig, collectionLikeType, n00);
    }

    public y63<?> findCollectionSerializer(SerializationConfig serializationConfig, CollectionType collectionType, n00 n00, m17 m17, y63<Object> y63) {
        return findSerializer(serializationConfig, collectionType, n00);
    }

    public y63<?> findMapLikeSerializer(SerializationConfig serializationConfig, MapLikeType mapLikeType, n00 n00, y63<Object> y63, m17 m17, y63<Object> y632) {
        return findSerializer(serializationConfig, mapLikeType, n00);
    }

    public y63<?> findMapSerializer(SerializationConfig serializationConfig, MapType mapType, n00 n00, y63<Object> y63, m17 m17, y63<Object> y632) {
        return findSerializer(serializationConfig, mapType, n00);
    }

    public y63<?> findSerializer(SerializationConfig serializationConfig, JavaType javaType, n00 n00) {
        y63<?> _findInterfaceMapping;
        y63<?> y63;
        Class rawClass = javaType.getRawClass();
        ClassKey classKey = new ClassKey(rawClass);
        if (rawClass.isInterface()) {
            HashMap<ClassKey, y63<?>> hashMap = this._interfaceMappings;
            if (!(hashMap == null || (y63 = hashMap.get(classKey)) == null)) {
                return y63;
            }
        } else {
            HashMap<ClassKey, y63<?>> hashMap2 = this._classMappings;
            if (hashMap2 != null) {
                y63<?> y632 = hashMap2.get(classKey);
                if (y632 != null) {
                    return y632;
                }
                if (this._hasEnumSerializer && javaType.isEnumType()) {
                    classKey.reset(Enum.class);
                    y63<?> y633 = this._classMappings.get(classKey);
                    if (y633 != null) {
                        return y633;
                    }
                }
                for (Class cls = rawClass; cls != null; cls = cls.getSuperclass()) {
                    classKey.reset(cls);
                    y63<?> y634 = this._classMappings.get(classKey);
                    if (y634 != null) {
                        return y634;
                    }
                }
            }
        }
        if (this._interfaceMappings == null) {
            return null;
        }
        y63<?> _findInterfaceMapping2 = _findInterfaceMapping(rawClass, classKey);
        if (_findInterfaceMapping2 != null) {
            return _findInterfaceMapping2;
        }
        if (rawClass.isInterface()) {
            return null;
        }
        do {
            rawClass = rawClass.getSuperclass();
            if (rawClass == null) {
                return null;
            }
            _findInterfaceMapping = _findInterfaceMapping(rawClass, classKey);
        } while (_findInterfaceMapping == null);
        return _findInterfaceMapping;
    }

    public SimpleSerializers(List<y63<?>> list) {
        addSerializers(list);
    }

    public <T> void addSerializer(Class<? extends T> cls, y63<T> y63) {
        _addSerializer(cls, y63);
    }
}
