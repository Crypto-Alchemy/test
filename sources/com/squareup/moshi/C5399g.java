package com.squareup.moshi;

import com.squareup.moshi.C5391d;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

/* renamed from: com.squareup.moshi.g */
/* compiled from: MapJsonAdapter */
public final class C5399g<K, V> extends C5391d<Map<K, V>> {

    /* renamed from: c */
    public static final C5391d.C5395d f26728c = new C5400a();

    /* renamed from: a */
    public final C5391d<K> f26729a;

    /* renamed from: b */
    public final C5391d<V> f26730b;

    /* renamed from: com.squareup.moshi.g$a */
    /* compiled from: MapJsonAdapter */
    public class C5400a implements C5391d.C5395d {
        /* renamed from: a */
        public C5391d<?> mo39349a(Type type, Set<? extends Annotation> set, C5401h hVar) {
            Class<?> g;
            if (!set.isEmpty() || (g = u27.m52591g(type)) != Map.class) {
                return null;
            }
            Type[] i = u27.m52593i(type, g);
            return new C5399g(hVar, i[0], i[1]).mo39365f();
        }
    }

    public C5399g(C5401h hVar, Type type, Type type2) {
        this.f26729a = hVar.mo39409d(type);
        this.f26730b = hVar.mo39409d(type2);
    }

    /* renamed from: k */
    public Map<K, V> mo39346b(JsonReader jsonReader) throws IOException {
        LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
        jsonReader.mo39276b();
        while (jsonReader.mo39280f()) {
            jsonReader.mo39292v();
            K b = this.f26729a.mo39346b(jsonReader);
            V b2 = this.f26730b.mo39346b(jsonReader);
            Object put = linkedHashTreeMap.put(b, b2);
            if (put != null) {
                throw new JsonDataException("Map key '" + b + "' has multiple values at path " + jsonReader.getPath() + ": " + put + " and " + b2);
            }
        }
        jsonReader.mo39278d();
        return linkedHashTreeMap;
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, Map<K, V> map) throws IOException {
        q73.mo39394c();
        for (Map.Entry next : map.entrySet()) {
            if (next.getKey() != null) {
                q73.mo46992n();
                this.f26729a.mo39347j(q73, next.getKey());
                this.f26730b.mo39347j(q73, next.getValue());
            } else {
                throw new JsonDataException("Map key is null at " + q73.getPath());
            }
        }
        q73.mo39398g();
    }

    public String toString() {
        return "JsonAdapter(" + this.f26729a + "=" + this.f26730b + ")";
    }
}
