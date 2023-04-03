package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnumResolver implements Serializable {
    private static final long serialVersionUID = 1;
    public final Enum<?> _defaultValue;
    public final Class<Enum<?>> _enumClass;
    public final Enum<?>[] _enums;
    public final HashMap<String, Enum<?>> _enumsById;
    public final boolean _isFromIntValue;
    public final boolean _isIgnoreCase;

    public EnumResolver(Class<Enum<?>> cls, Enum<?>[] enumArr, HashMap<String, Enum<?>> hashMap, Enum<?> enumR, boolean z, boolean z2) {
        this._enumClass = cls;
        this._enums = enumArr;
        this._enumsById = hashMap;
        this._defaultValue = enumR;
        this._isIgnoreCase = z;
        this._isFromIntValue = z2;
    }

    public static EnumResolver _constructFor(Class<?> cls, AnnotationIntrospector annotationIntrospector, boolean z) {
        Class<Enum<?>> _enumClass2 = _enumClass(cls);
        Enum[] _enumConstants = _enumConstants(cls);
        String[] findEnumValues = annotationIntrospector.findEnumValues(_enumClass2, _enumConstants, new String[_enumConstants.length]);
        String[][] strArr = new String[findEnumValues.length][];
        annotationIntrospector.findEnumAliases(_enumClass2, _enumConstants, strArr);
        HashMap hashMap = new HashMap();
        int length = _enumConstants.length;
        for (int i = 0; i < length; i++) {
            Enum enumR = _enumConstants[i];
            String str = findEnumValues[i];
            if (str == null) {
                str = enumR.name();
            }
            hashMap.put(str, enumR);
            String[] strArr2 = strArr[i];
            if (strArr2 != null) {
                for (String str2 : strArr2) {
                    if (!hashMap.containsKey(str2)) {
                        hashMap.put(str2, enumR);
                    }
                }
            }
        }
        return new EnumResolver(_enumClass2, _enumConstants, hashMap, _enumDefault(annotationIntrospector, _enumClass2), z, false);
    }

    public static EnumResolver _constructUsingMethod(Class<?> cls, AnnotatedMember annotatedMember, AnnotationIntrospector annotationIntrospector, boolean z) {
        Class<Enum<?>> _enumClass2 = _enumClass(cls);
        Enum[] _enumConstants = _enumConstants(cls);
        HashMap hashMap = new HashMap();
        int length = _enumConstants.length;
        while (true) {
            length--;
            if (length >= 0) {
                Enum enumR = _enumConstants[length];
                try {
                    Object value = annotatedMember.getValue(enumR);
                    if (value != null) {
                        hashMap.put(value.toString(), enumR);
                    }
                } catch (Exception e) {
                    throw new IllegalArgumentException("Failed to access @JsonValue of Enum value " + enumR + ": " + e.getMessage());
                }
            } else {
                return new EnumResolver(_enumClass2, _enumConstants, hashMap, _enumDefault(annotationIntrospector, _enumClass2), z, _isIntType(annotatedMember.getRawType()));
            }
        }
    }

    public static EnumResolver _constructUsingToString(Class<?> cls, AnnotationIntrospector annotationIntrospector, boolean z) {
        Class<Enum<?>> _enumClass2 = _enumClass(cls);
        Enum[] _enumConstants = _enumConstants(cls);
        HashMap hashMap = new HashMap();
        String[][] strArr = new String[_enumConstants.length][];
        if (annotationIntrospector != null) {
            annotationIntrospector.findEnumAliases(_enumClass2, _enumConstants, strArr);
        }
        int length = _enumConstants.length;
        while (true) {
            length--;
            if (length < 0) {
                return new EnumResolver(_enumClass2, _enumConstants, hashMap, _enumDefault(annotationIntrospector, _enumClass2), z, false);
            }
            Enum enumR = _enumConstants[length];
            hashMap.put(enumR.toString(), enumR);
            String[] strArr2 = strArr[length];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    if (!hashMap.containsKey(str)) {
                        hashMap.put(str, enumR);
                    }
                }
            }
        }
    }

    public static Class<Enum<?>> _enumClass(Class<?> cls) {
        return cls;
    }

    public static Enum<?>[] _enumConstants(Class<?> cls) {
        Enum<?>[] enumArr = (Enum[]) _enumClass(cls).getEnumConstants();
        if (enumArr != null) {
            return enumArr;
        }
        throw new IllegalArgumentException("No enum constants for class " + cls.getName());
    }

    public static Enum<?> _enumDefault(AnnotationIntrospector annotationIntrospector, Class<?> cls) {
        if (annotationIntrospector != null) {
            return annotationIntrospector.findDefaultEnumValue(_enumClass(cls));
        }
        return null;
    }

    public static boolean _isIntType(Class<?> cls) {
        if (cls.isPrimitive()) {
            cls = wf0.m29529o0(cls);
        }
        if (cls == Long.class || cls == Integer.class || cls == Short.class || cls == Byte.class) {
            return true;
        }
        return false;
    }

    public static EnumResolver constructFor(DeserializationConfig deserializationConfig, Class<?> cls) {
        return _constructFor(cls, deserializationConfig.getAnnotationIntrospector(), deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS));
    }

    @Deprecated
    public static EnumResolver constructUnsafe(Class<?> cls, AnnotationIntrospector annotationIntrospector) {
        return _constructFor(cls, annotationIntrospector, false);
    }

    @Deprecated
    public static EnumResolver constructUnsafeUsingMethod(Class<?> cls, AnnotatedMember annotatedMember, AnnotationIntrospector annotationIntrospector) {
        return _constructUsingMethod(cls, annotatedMember, annotationIntrospector, false);
    }

    @Deprecated
    public static EnumResolver constructUnsafeUsingToString(Class<?> cls, AnnotationIntrospector annotationIntrospector) {
        return _constructUsingToString(cls, annotationIntrospector, false);
    }

    public static EnumResolver constructUsingMethod(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMember annotatedMember) {
        return _constructUsingMethod(cls, annotatedMember, deserializationConfig.getAnnotationIntrospector(), deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS));
    }

    public static EnumResolver constructUsingToString(DeserializationConfig deserializationConfig, Class<?> cls) {
        return _constructUsingToString(cls, deserializationConfig.getAnnotationIntrospector(), deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS));
    }

    public Enum<?> _findEnumCaseInsensitive(String str) {
        for (Map.Entry next : this._enumsById.entrySet()) {
            if (str.equalsIgnoreCase((String) next.getKey())) {
                return (Enum) next.getValue();
            }
        }
        return null;
    }

    public CompactStringObjectMap constructLookup() {
        return CompactStringObjectMap.construct(this._enumsById);
    }

    public Enum<?> findEnum(String str) {
        Enum<?> enumR = this._enumsById.get(str);
        if (enumR != null || !this._isIgnoreCase) {
            return enumR;
        }
        return _findEnumCaseInsensitive(str);
    }

    public Enum<?> getDefaultValue() {
        return this._defaultValue;
    }

    public Enum<?> getEnum(int i) {
        if (i < 0) {
            return null;
        }
        Enum<?>[] enumArr = this._enums;
        if (i >= enumArr.length) {
            return null;
        }
        return enumArr[i];
    }

    public Class<Enum<?>> getEnumClass() {
        return this._enumClass;
    }

    public Collection<String> getEnumIds() {
        return this._enumsById.keySet();
    }

    public List<Enum<?>> getEnums() {
        ArrayList arrayList = new ArrayList(this._enums.length);
        for (Enum<?> add : this._enums) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public Enum<?>[] getRawEnums() {
        return this._enums;
    }

    public boolean isFromIntValue() {
        return this._isFromIntValue;
    }

    public int lastValidIndex() {
        return this._enums.length - 1;
    }

    @Deprecated
    public static EnumResolver constructFor(Class<Enum<?>> cls, AnnotationIntrospector annotationIntrospector) {
        return _constructFor(cls, annotationIntrospector, false);
    }

    @Deprecated
    public static EnumResolver constructUsingMethod(Class<Enum<?>> cls, AnnotatedMember annotatedMember, AnnotationIntrospector annotationIntrospector) {
        return _constructUsingMethod(cls, annotatedMember, annotationIntrospector, false);
    }

    @Deprecated
    public static EnumResolver constructUsingToString(Class<Enum<?>> cls, AnnotationIntrospector annotationIntrospector) {
        return _constructUsingToString(cls, annotationIntrospector, false);
    }

    @Deprecated
    public static EnumResolver constructUsingToString(Class<Enum<?>> cls) {
        return _constructUsingToString(cls, (AnnotationIntrospector) null, false);
    }

    @Deprecated
    public EnumResolver(Class<Enum<?>> cls, Enum<?>[] enumArr, HashMap<String, Enum<?>> hashMap, Enum<?> enumR, boolean z) {
        this(cls, enumArr, hashMap, enumR, z, false);
    }

    @Deprecated
    public EnumResolver(Class<Enum<?>> cls, Enum<?>[] enumArr, HashMap<String, Enum<?>> hashMap, Enum<?> enumR) {
        this(cls, enumArr, hashMap, enumR, false, false);
    }
}
