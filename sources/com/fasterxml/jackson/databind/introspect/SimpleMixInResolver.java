package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.introspect.C2029f;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class SimpleMixInResolver implements C2029f.C2030a, Serializable {
    private static final long serialVersionUID = 1;
    public Map<ClassKey, Class<?>> _localMixIns;
    public final C2029f.C2030a _overrides;

    public SimpleMixInResolver(C2029f.C2030a aVar) {
        this._overrides = aVar;
    }

    public void addLocalDefinition(Class<?> cls, Class<?> cls2) {
        if (this._localMixIns == null) {
            this._localMixIns = new HashMap();
        }
        this._localMixIns.put(new ClassKey(cls), cls2);
    }

    public Class<?> findMixInClassFor(Class<?> cls) {
        Class<?> cls2;
        Map<ClassKey, Class<?>> map;
        C2029f.C2030a aVar = this._overrides;
        if (aVar == null) {
            cls2 = null;
        } else {
            cls2 = aVar.findMixInClassFor(cls);
        }
        if (cls2 != null || (map = this._localMixIns) == null) {
            return cls2;
        }
        return map.get(new ClassKey(cls));
    }

    public boolean hasMixIns() {
        if (this._localMixIns != null) {
            return true;
        }
        C2029f.C2030a aVar = this._overrides;
        if (aVar == null) {
            return false;
        }
        if (aVar instanceof SimpleMixInResolver) {
            return ((SimpleMixInResolver) aVar).hasMixIns();
        }
        return true;
    }

    public int localSize() {
        Map<ClassKey, Class<?>> map = this._localMixIns;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public void setLocalDefinitions(Map<Class<?>, Class<?>> map) {
        if (map == null || map.isEmpty()) {
            this._localMixIns = null;
            return;
        }
        HashMap hashMap = new HashMap(map.size());
        for (Map.Entry next : map.entrySet()) {
            hashMap.put(new ClassKey((Class) next.getKey()), next.getValue());
        }
        this._localMixIns = hashMap;
    }

    public SimpleMixInResolver withOverrides(C2029f.C2030a aVar) {
        return new SimpleMixInResolver(aVar, this._localMixIns);
    }

    public SimpleMixInResolver withoutLocalDefinitions() {
        return new SimpleMixInResolver(this._overrides, (Map<ClassKey, Class<?>>) null);
    }

    public SimpleMixInResolver copy() {
        C2029f.C2030a aVar;
        C2029f.C2030a aVar2 = this._overrides;
        HashMap hashMap = null;
        if (aVar2 == null) {
            aVar = null;
        } else {
            aVar = aVar2.copy();
        }
        if (this._localMixIns != null) {
            hashMap = new HashMap(this._localMixIns);
        }
        return new SimpleMixInResolver(aVar, hashMap);
    }

    public SimpleMixInResolver(C2029f.C2030a aVar, Map<ClassKey, Class<?>> map) {
        this._overrides = aVar;
        this._localMixIns = map;
    }
}
