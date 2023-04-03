package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;

public final class EnumValues implements Serializable {
    private static final long serialVersionUID = 1;
    private final Class<Enum<?>> _enumClass;
    private final qw5[] _textual;
    private final Enum<?>[] _values;

    /* renamed from: a */
    public transient EnumMap<?, qw5> f10165a;

    public EnumValues(Class<Enum<?>> cls, qw5[] qw5Arr) {
        this._enumClass = cls;
        this._values = (Enum[]) cls.getEnumConstants();
        this._textual = qw5Arr;
    }

    public static EnumValues construct(SerializationConfig serializationConfig, Class<Enum<?>> cls) {
        if (serializationConfig.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
            return constructFromToString(serializationConfig, cls);
        }
        return constructFromName(serializationConfig, cls);
    }

    public static EnumValues constructFromName(MapperConfig<?> mapperConfig, Class<Enum<?>> cls) {
        Class<? extends Enum<?>> r = wf0.m29532r(cls);
        Enum[] enumArr = (Enum[]) r.getEnumConstants();
        if (enumArr != null) {
            String[] findEnumValues = mapperConfig.getAnnotationIntrospector().findEnumValues(r, enumArr, new String[enumArr.length]);
            qw5[] qw5Arr = new qw5[enumArr.length];
            int length = enumArr.length;
            for (int i = 0; i < length; i++) {
                Enum enumR = enumArr[i];
                String str = findEnumValues[i];
                if (str == null) {
                    str = enumR.name();
                }
                qw5Arr[enumR.ordinal()] = mapperConfig.compileString(str);
            }
            return construct(cls, qw5Arr);
        }
        throw new IllegalArgumentException("Cannot determine enum constants for Class " + cls.getName());
    }

    public static EnumValues constructFromToString(MapperConfig<?> mapperConfig, Class<Enum<?>> cls) {
        Enum[] enumArr = (Enum[]) wf0.m29532r(cls).getEnumConstants();
        if (enumArr != null) {
            ArrayList arrayList = new ArrayList(enumArr.length);
            for (Enum enumR : enumArr) {
                arrayList.add(enumR.toString());
            }
            return construct(mapperConfig, cls, arrayList);
        }
        throw new IllegalArgumentException("Cannot determine enum constants for Class " + cls.getName());
    }

    public List<Enum<?>> enums() {
        return Arrays.asList(this._values);
    }

    public Class<Enum<?>> getEnumClass() {
        return this._enumClass;
    }

    public EnumMap<?, qw5> internalMap() {
        EnumMap<?, qw5> enumMap = this.f10165a;
        if (enumMap != null) {
            return enumMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Enum<?> enumR : this._values) {
            linkedHashMap.put(enumR, this._textual[enumR.ordinal()]);
        }
        return new EnumMap<>(linkedHashMap);
    }

    public qw5 serializedValueFor(Enum<?> enumR) {
        return this._textual[enumR.ordinal()];
    }

    public Collection<qw5> values() {
        return Arrays.asList(this._textual);
    }

    public static EnumValues construct(MapperConfig<?> mapperConfig, Class<Enum<?>> cls, List<String> list) {
        int size = list.size();
        qw5[] qw5Arr = new qw5[size];
        for (int i = 0; i < size; i++) {
            qw5Arr[i] = mapperConfig.compileString(list.get(i));
        }
        return construct(cls, qw5Arr);
    }

    public static EnumValues construct(Class<Enum<?>> cls, qw5[] qw5Arr) {
        return new EnumValues(cls, qw5Arr);
    }
}
