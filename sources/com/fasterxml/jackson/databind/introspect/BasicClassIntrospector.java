package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.C2029f;
import com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy;
import com.fasterxml.jackson.databind.type.SimpleType;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

public class BasicClassIntrospector extends C2029f implements Serializable {
    public static final C3563wz BOOLEAN_DESC;
    public static final C3563wz INT_DESC;
    public static final C3563wz LONG_DESC;
    public static final C3563wz OBJECT_DESC;
    public static final C3563wz STRING_DESC;

    /* renamed from: a */
    public static final Class<?> f9987a;

    /* renamed from: d */
    public static final Class<?> f9988d;

    /* renamed from: e */
    public static final Class<?> f9989e = g53.class;
    private static final long serialVersionUID = 2;

    static {
        Class<String> cls = String.class;
        Class<Object> cls2 = Object.class;
        f9987a = cls2;
        f9988d = cls;
        STRING_DESC = C3563wz.m29757K((MapperConfig<?>) null, SimpleType.constructUnsafe(cls), C2023b.m14188h(cls));
        Class cls3 = Boolean.TYPE;
        BOOLEAN_DESC = C3563wz.m29757K((MapperConfig<?>) null, SimpleType.constructUnsafe(cls3), C2023b.m14188h(cls3));
        Class cls4 = Integer.TYPE;
        INT_DESC = C3563wz.m29757K((MapperConfig<?>) null, SimpleType.constructUnsafe(cls4), C2023b.m14188h(cls4));
        Class cls5 = Long.TYPE;
        LONG_DESC = C3563wz.m29757K((MapperConfig<?>) null, SimpleType.constructUnsafe(cls5), C2023b.m14188h(cls5));
        OBJECT_DESC = C3563wz.m29757K((MapperConfig<?>) null, SimpleType.constructUnsafe(cls2), C2023b.m14188h(cls2));
    }

    public C3563wz _findStdJdkCollectionDesc(MapperConfig<?> mapperConfig, JavaType javaType) {
        if (_isStdJDKCollection(javaType)) {
            return C3563wz.m29757K(mapperConfig, javaType, _resolveAnnotatedClass(mapperConfig, javaType, mapperConfig));
        }
        return null;
    }

    public C3563wz _findStdTypeDesc(MapperConfig<?> mapperConfig, JavaType javaType) {
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass.isPrimitive()) {
            if (rawClass == Integer.TYPE) {
                return INT_DESC;
            }
            if (rawClass == Long.TYPE) {
                return LONG_DESC;
            }
            if (rawClass == Boolean.TYPE) {
                return BOOLEAN_DESC;
            }
            return null;
        } else if (wf0.m29486M(rawClass)) {
            if (rawClass == f9987a) {
                return OBJECT_DESC;
            }
            if (rawClass == f9988d) {
                return STRING_DESC;
            }
            if (rawClass == Integer.class) {
                return INT_DESC;
            }
            if (rawClass == Long.class) {
                return LONG_DESC;
            }
            if (rawClass == Boolean.class) {
                return BOOLEAN_DESC;
            }
            return null;
        } else if (f9989e.isAssignableFrom(rawClass)) {
            return C3563wz.m29757K(mapperConfig, javaType, C2023b.m14188h(rawClass));
        } else {
            return null;
        }
    }

    public boolean _isStdJDKCollection(JavaType javaType) {
        if (javaType.isContainerType() && !javaType.isArrayType()) {
            Class<?> rawClass = javaType.getRawClass();
            if (!wf0.m29486M(rawClass) || (!Collection.class.isAssignableFrom(rawClass) && !Map.class.isAssignableFrom(rawClass))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C2021a _resolveAnnotatedClass(MapperConfig<?> mapperConfig, JavaType javaType, C2029f.C2030a aVar) {
        return C2023b.m14189i(mapperConfig, javaType, aVar);
    }

    public C2021a _resolveAnnotatedWithoutSuperTypes(MapperConfig<?> mapperConfig, JavaType javaType, C2029f.C2030a aVar) {
        return C2023b.m14190m(mapperConfig, javaType, aVar);
    }

    public C2032h collectProperties(MapperConfig<?> mapperConfig, JavaType javaType, C2029f.C2030a aVar, boolean z) {
        AccessorNamingStrategy accessorNamingStrategy;
        C2021a _resolveAnnotatedClass = _resolveAnnotatedClass(mapperConfig, javaType, aVar);
        if (javaType.isRecordType()) {
            accessorNamingStrategy = mapperConfig.getAccessorNaming().forRecord(mapperConfig, _resolveAnnotatedClass);
        } else {
            accessorNamingStrategy = mapperConfig.getAccessorNaming().forPOJO(mapperConfig, _resolveAnnotatedClass);
        }
        return constructPropertyCollector(mapperConfig, _resolveAnnotatedClass, javaType, z, accessorNamingStrategy);
    }

    public C2032h collectPropertiesWithBuilder(MapperConfig<?> mapperConfig, JavaType javaType, C2029f.C2030a aVar, n00 n00, boolean z) {
        C2021a _resolveAnnotatedClass = _resolveAnnotatedClass(mapperConfig, javaType, aVar);
        return constructPropertyCollector(mapperConfig, _resolveAnnotatedClass, javaType, z, mapperConfig.getAccessorNaming().forBuilder(mapperConfig, _resolveAnnotatedClass, n00));
    }

    public C2032h constructPropertyCollector(MapperConfig<?> mapperConfig, C2021a aVar, JavaType javaType, boolean z, AccessorNamingStrategy accessorNamingStrategy) {
        return new C2032h(mapperConfig, z, javaType, aVar, accessorNamingStrategy);
    }

    public C2029f copy() {
        return new BasicClassIntrospector();
    }

    @Deprecated
    public C2032h constructPropertyCollector(MapperConfig<?> mapperConfig, C2021a aVar, JavaType javaType, boolean z, String str) {
        return new C2032h(mapperConfig, z, javaType, aVar, str);
    }

    public C3563wz forClassAnnotations(MapperConfig<?> mapperConfig, JavaType javaType, C2029f.C2030a aVar) {
        C3563wz _findStdTypeDesc = _findStdTypeDesc(mapperConfig, javaType);
        return _findStdTypeDesc == null ? C3563wz.m29757K(mapperConfig, javaType, _resolveAnnotatedClass(mapperConfig, javaType, aVar)) : _findStdTypeDesc;
    }

    public C3563wz forCreation(DeserializationConfig deserializationConfig, JavaType javaType, C2029f.C2030a aVar) {
        C3563wz _findStdTypeDesc = _findStdTypeDesc(deserializationConfig, javaType);
        if (_findStdTypeDesc != null) {
            return _findStdTypeDesc;
        }
        C3563wz _findStdJdkCollectionDesc = _findStdJdkCollectionDesc(deserializationConfig, javaType);
        return _findStdJdkCollectionDesc == null ? C3563wz.m29756J(collectProperties(deserializationConfig, javaType, aVar, false)) : _findStdJdkCollectionDesc;
    }

    public C3563wz forDeserialization(DeserializationConfig deserializationConfig, JavaType javaType, C2029f.C2030a aVar) {
        C3563wz _findStdTypeDesc = _findStdTypeDesc(deserializationConfig, javaType);
        if (_findStdTypeDesc != null) {
            return _findStdTypeDesc;
        }
        C3563wz _findStdJdkCollectionDesc = _findStdJdkCollectionDesc(deserializationConfig, javaType);
        return _findStdJdkCollectionDesc == null ? C3563wz.m29756J(collectProperties(deserializationConfig, javaType, aVar, false)) : _findStdJdkCollectionDesc;
    }

    public C3563wz forDirectClassAnnotations(MapperConfig<?> mapperConfig, JavaType javaType, C2029f.C2030a aVar) {
        C3563wz _findStdTypeDesc = _findStdTypeDesc(mapperConfig, javaType);
        return _findStdTypeDesc == null ? C3563wz.m29757K(mapperConfig, javaType, _resolveAnnotatedWithoutSuperTypes(mapperConfig, javaType, aVar)) : _findStdTypeDesc;
    }

    public C3563wz forSerialization(SerializationConfig serializationConfig, JavaType javaType, C2029f.C2030a aVar) {
        C3563wz _findStdTypeDesc = _findStdTypeDesc(serializationConfig, javaType);
        if (_findStdTypeDesc != null) {
            return _findStdTypeDesc;
        }
        C3563wz _findStdJdkCollectionDesc = _findStdJdkCollectionDesc(serializationConfig, javaType);
        return _findStdJdkCollectionDesc == null ? C3563wz.m29758L(collectProperties(serializationConfig, javaType, aVar, true)) : _findStdJdkCollectionDesc;
    }

    public C3563wz forDeserializationWithBuilder(DeserializationConfig deserializationConfig, JavaType javaType, C2029f.C2030a aVar, n00 n00) {
        return C3563wz.m29756J(collectPropertiesWithBuilder(deserializationConfig, javaType, aVar, n00, false));
    }

    @Deprecated
    public C3563wz forDeserializationWithBuilder(DeserializationConfig deserializationConfig, JavaType javaType, C2029f.C2030a aVar) {
        return C3563wz.m29756J(collectPropertiesWithBuilder(deserializationConfig, javaType, aVar, (n00) null, false));
    }

    @Deprecated
    public C2032h collectPropertiesWithBuilder(MapperConfig<?> mapperConfig, JavaType javaType, C2029f.C2030a aVar, boolean z) {
        return collectPropertiesWithBuilder(mapperConfig, javaType, aVar, (n00) null, z);
    }

    @Deprecated
    public C2032h collectProperties(MapperConfig<?> mapperConfig, JavaType javaType, C2029f.C2030a aVar, boolean z, String str) {
        C2021a _resolveAnnotatedClass = _resolveAnnotatedClass(mapperConfig, javaType, aVar);
        return constructPropertyCollector(mapperConfig, _resolveAnnotatedClass, javaType, z, new DefaultAccessorNamingStrategy.Provider().withSetterPrefix(str).forPOJO(mapperConfig, _resolveAnnotatedClass));
    }
}
