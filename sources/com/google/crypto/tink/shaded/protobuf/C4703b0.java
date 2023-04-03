package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C4779z;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.b0 */
/* compiled from: MapFieldSchemaLite */
public class C4703b0 implements C4701a0 {
    /* renamed from: i */
    public static <K, V> int m37525i(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        C4779z zVar = (C4779z) obj2;
        int i2 = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : mapFieldLite.entrySet()) {
            i2 += zVar.mo36093a(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    /* renamed from: j */
    public static <K, V> MapFieldLite<K, V> m37526j(Object obj, Object obj2) {
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
    public Object mo35608a(Object obj, Object obj2) {
        return m37526j(obj, obj2);
    }

    /* renamed from: b */
    public C4779z.C4780a<?, ?> mo35609b(Object obj) {
        ((C4779z) obj).mo36094c();
        return null;
    }

    /* renamed from: c */
    public Map<?, ?> mo35610c(Object obj) {
        return (MapFieldLite) obj;
    }

    /* renamed from: d */
    public Object mo35611d(Object obj) {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    /* renamed from: e */
    public Map<?, ?> mo35612e(Object obj) {
        return (MapFieldLite) obj;
    }

    /* renamed from: f */
    public Object mo35613f(Object obj) {
        ((MapFieldLite) obj).makeImmutable();
        return obj;
    }

    /* renamed from: g */
    public int mo35614g(int i, Object obj, Object obj2) {
        return m37525i(i, obj, obj2);
    }

    /* renamed from: h */
    public boolean mo35615h(Object obj) {
        return !((MapFieldLite) obj).isMutable();
    }
}
