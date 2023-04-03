package com.google.protobuf;

import com.google.protobuf.C5032z;
import java.util.Map;

/* renamed from: com.google.protobuf.b0 */
/* compiled from: MapFieldSchemaLite */
public class C4954b0 implements C4952a0 {
    /* renamed from: i */
    public static <K, V> int m39112i(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        C5032z zVar = (C5032z) obj2;
        int i2 = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : mapFieldLite.entrySet()) {
            i2 += zVar.mo37578a(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    /* renamed from: j */
    public static <K, V> MapFieldLite<K, V> m39113j(Object obj, Object obj2) {
        MapFieldLite<K, V> mapFieldLite = (MapFieldLite) obj;
        MapFieldLite mapFieldLite2 = (MapFieldLite) obj2;
        if (!mapFieldLite2.isEmpty()) {
            if (!mapFieldLite.isMutable()) {
                mapFieldLite = mapFieldLite.mutableCopy();
            }
            mapFieldLite.mergeFrom(mapFieldLite2);
        }
        return mapFieldLite;
    }

    /* renamed from: a */
    public Object mo37061a(Object obj, Object obj2) {
        return m39113j(obj, obj2);
    }

    /* renamed from: b */
    public C5032z.C5033a<?, ?> mo37062b(Object obj) {
        return ((C5032z) obj).mo37579c();
    }

    /* renamed from: c */
    public Map<?, ?> mo37063c(Object obj) {
        return (MapFieldLite) obj;
    }

    /* renamed from: d */
    public Object mo37064d(Object obj) {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    /* renamed from: e */
    public Map<?, ?> mo37065e(Object obj) {
        return (MapFieldLite) obj;
    }

    /* renamed from: f */
    public Object mo37066f(Object obj) {
        ((MapFieldLite) obj).makeImmutable();
        return obj;
    }

    /* renamed from: g */
    public int mo37067g(int i, Object obj, Object obj2) {
        return m39112i(i, obj, obj2);
    }

    /* renamed from: h */
    public boolean mo37068h(Object obj) {
        return !((MapFieldLite) obj).isMutable();
    }
}
