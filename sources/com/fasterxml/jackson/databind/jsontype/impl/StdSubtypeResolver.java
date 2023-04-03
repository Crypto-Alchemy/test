package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.C2021a;
import com.fasterxml.jackson.databind.introspect.C2023b;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StdSubtypeResolver extends jd6 implements Serializable {
    private static final long serialVersionUID = 1;
    public LinkedHashSet<NamedType> _registeredSubtypes;

    public StdSubtypeResolver() {
    }

    public void _collectAndResolve(C2021a aVar, NamedType namedType, MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, HashMap<NamedType, NamedType> hashMap) {
        String findTypeName;
        if (!namedType.hasName() && (findTypeName = annotationIntrospector.findTypeName(aVar)) != null) {
            namedType = new NamedType(namedType.getType(), findTypeName);
        }
        NamedType namedType2 = new NamedType(namedType.getType());
        if (!hashMap.containsKey(namedType2)) {
            hashMap.put(namedType2, namedType);
            List<NamedType> findSubtypes = annotationIntrospector.findSubtypes(aVar);
            if (findSubtypes != null && !findSubtypes.isEmpty()) {
                for (NamedType next : findSubtypes) {
                    _collectAndResolve(C2023b.m14191n(mapperConfig, next.getType()), next, mapperConfig, annotationIntrospector, hashMap);
                }
            }
        } else if (namedType.hasName() && !hashMap.get(namedType2).hasName()) {
            hashMap.put(namedType2, namedType);
        }
    }

    public void _collectAndResolveByTypeId(C2021a aVar, NamedType namedType, MapperConfig<?> mapperConfig, Set<Class<?>> set, Map<String, NamedType> map) {
        List<NamedType> findSubtypes;
        String findTypeName;
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        if (!namedType.hasName() && (findTypeName = annotationIntrospector.findTypeName(aVar)) != null) {
            namedType = new NamedType(namedType.getType(), findTypeName);
        }
        if (namedType.hasName()) {
            map.put(namedType.getName(), namedType);
        }
        if (set.add(namedType.getType()) && (findSubtypes = annotationIntrospector.findSubtypes(aVar)) != null && !findSubtypes.isEmpty()) {
            for (NamedType next : findSubtypes) {
                _collectAndResolveByTypeId(C2023b.m14191n(mapperConfig, next.getType()), next, mapperConfig, set, map);
            }
        }
    }

    public Collection<NamedType> _combineNamedAndUnnamed(Class<?> cls, Set<Class<?>> set, Map<String, NamedType> map) {
        ArrayList arrayList = new ArrayList(map.values());
        for (NamedType type : map.values()) {
            set.remove(type.getType());
        }
        for (Class<?> next : set) {
            if (next != cls || !Modifier.isAbstract(next.getModifiers())) {
                arrayList.add(new NamedType(next));
            }
        }
        return arrayList;
    }

    public Collection<NamedType> collectAndResolveSubtypesByClass(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        Class<?> cls;
        List<NamedType> findSubtypes;
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        if (javaType != null) {
            cls = javaType.getRawClass();
        } else if (annotatedMember != null) {
            cls = annotatedMember.getRawType();
        } else {
            throw new IllegalArgumentException("Both property and base type are nulls");
        }
        HashMap hashMap = new HashMap();
        LinkedHashSet<NamedType> linkedHashSet = this._registeredSubtypes;
        if (linkedHashSet != null) {
            Iterator<NamedType> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                NamedType next = it.next();
                if (cls.isAssignableFrom(next.getType())) {
                    _collectAndResolve(C2023b.m14191n(mapperConfig, next.getType()), next, mapperConfig, annotationIntrospector, hashMap);
                }
            }
        }
        if (!(annotatedMember == null || (findSubtypes = annotationIntrospector.findSubtypes(annotatedMember)) == null)) {
            for (NamedType next2 : findSubtypes) {
                _collectAndResolve(C2023b.m14191n(mapperConfig, next2.getType()), next2, mapperConfig, annotationIntrospector, hashMap);
            }
        }
        _collectAndResolve(C2023b.m14191n(mapperConfig, cls), new NamedType(cls, (String) null), mapperConfig, annotationIntrospector, hashMap);
        return new ArrayList(hashMap.values());
    }

    public Collection<NamedType> collectAndResolveSubtypesByTypeId(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        List<NamedType> findSubtypes;
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        Class<?> rawClass = javaType.getRawClass();
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        _collectAndResolveByTypeId(C2023b.m14191n(mapperConfig, rawClass), new NamedType(rawClass, (String) null), mapperConfig, hashSet, linkedHashMap);
        if (!(annotatedMember == null || (findSubtypes = annotationIntrospector.findSubtypes(annotatedMember)) == null)) {
            for (NamedType next : findSubtypes) {
                _collectAndResolveByTypeId(C2023b.m14191n(mapperConfig, next.getType()), next, mapperConfig, hashSet, linkedHashMap);
            }
        }
        LinkedHashSet<NamedType> linkedHashSet = this._registeredSubtypes;
        if (linkedHashSet != null) {
            Iterator<NamedType> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                NamedType next2 = it.next();
                if (rawClass.isAssignableFrom(next2.getType())) {
                    _collectAndResolveByTypeId(C2023b.m14191n(mapperConfig, next2.getType()), next2, mapperConfig, hashSet, linkedHashMap);
                }
            }
        }
        return _combineNamedAndUnnamed(rawClass, hashSet, linkedHashMap);
    }

    public jd6 copy() {
        return new StdSubtypeResolver(this);
    }

    public void registerSubtypes(NamedType... namedTypeArr) {
        if (this._registeredSubtypes == null) {
            this._registeredSubtypes = new LinkedHashSet<>();
        }
        for (NamedType add : namedTypeArr) {
            this._registeredSubtypes.add(add);
        }
    }

    public StdSubtypeResolver(StdSubtypeResolver stdSubtypeResolver) {
        LinkedHashSet<NamedType> linkedHashSet;
        LinkedHashSet<NamedType> linkedHashSet2 = stdSubtypeResolver._registeredSubtypes;
        if (linkedHashSet2 == null) {
            linkedHashSet = null;
        } else {
            linkedHashSet = new LinkedHashSet<>(linkedHashSet2);
        }
        this._registeredSubtypes = linkedHashSet;
    }

    public void registerSubtypes(Class<?>... clsArr) {
        NamedType[] namedTypeArr = new NamedType[clsArr.length];
        int length = clsArr.length;
        for (int i = 0; i < length; i++) {
            namedTypeArr[i] = new NamedType(clsArr[i]);
        }
        registerSubtypes(namedTypeArr);
    }

    public void registerSubtypes(Collection<Class<?>> collection) {
        NamedType[] namedTypeArr = new NamedType[collection.size()];
        int i = 0;
        for (Class<?> namedType : collection) {
            namedTypeArr[i] = new NamedType(namedType);
            i++;
        }
        registerSubtypes(namedTypeArr);
    }

    public Collection<NamedType> collectAndResolveSubtypesByTypeId(MapperConfig<?> mapperConfig, C2021a aVar) {
        Class<?> rawType = aVar.getRawType();
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        _collectAndResolveByTypeId(aVar, new NamedType(rawType, (String) null), mapperConfig, hashSet, linkedHashMap);
        LinkedHashSet<NamedType> linkedHashSet = this._registeredSubtypes;
        if (linkedHashSet != null) {
            Iterator<NamedType> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                NamedType next = it.next();
                if (rawType.isAssignableFrom(next.getType())) {
                    _collectAndResolveByTypeId(C2023b.m14191n(mapperConfig, next.getType()), next, mapperConfig, hashSet, linkedHashMap);
                }
            }
        }
        return _combineNamedAndUnnamed(rawType, hashSet, linkedHashMap);
    }

    public Collection<NamedType> collectAndResolveSubtypesByClass(MapperConfig<?> mapperConfig, C2021a aVar) {
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        HashMap hashMap = new HashMap();
        if (this._registeredSubtypes != null) {
            Class<?> rawType = aVar.getRawType();
            Iterator<NamedType> it = this._registeredSubtypes.iterator();
            while (it.hasNext()) {
                NamedType next = it.next();
                if (rawType.isAssignableFrom(next.getType())) {
                    _collectAndResolve(C2023b.m14191n(mapperConfig, next.getType()), next, mapperConfig, annotationIntrospector, hashMap);
                }
            }
        }
        _collectAndResolve(aVar, new NamedType(aVar.getRawType(), (String) null), mapperConfig, annotationIntrospector, hashMap);
        return new ArrayList(hashMap.values());
    }
}
