package p000;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: cs4 */
/* compiled from: PolymorphicJsonAdapterFactory */
public final class cs4<T> implements C5391d.C5395d {

    /* renamed from: a */
    public final Class<T> f27903a;

    /* renamed from: b */
    public final String f27904b;

    /* renamed from: c */
    public final List<String> f27905c;

    /* renamed from: d */
    public final List<Type> f27906d;

    /* renamed from: e */
    public final C5391d<Object> f27907e;

    /* renamed from: cs4$a */
    /* compiled from: PolymorphicJsonAdapterFactory */
    public static final class C5714a extends C5391d<Object> {

        /* renamed from: a */
        public final String f27908a;

        /* renamed from: b */
        public final List<String> f27909b;

        /* renamed from: c */
        public final List<Type> f27910c;

        /* renamed from: d */
        public final List<C5391d<Object>> f27911d;

        /* renamed from: e */
        public final C5391d<Object> f27912e;

        /* renamed from: f */
        public final JsonReader.C5372b f27913f;

        /* renamed from: g */
        public final JsonReader.C5372b f27914g;

        public C5714a(String str, List<String> list, List<Type> list2, List<C5391d<Object>> list3, C5391d<Object> dVar) {
            this.f27908a = str;
            this.f27909b = list;
            this.f27910c = list2;
            this.f27911d = list3;
            this.f27912e = dVar;
            this.f27913f = JsonReader.C5372b.m41530a(str);
            this.f27914g = JsonReader.C5372b.m41530a((String[]) list.toArray(new String[0]));
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: b */
        public Object mo39346b(JsonReader jsonReader) throws IOException {
            JsonReader s = jsonReader.mo39291s();
            s.mo39270C(false);
            try {
                int k = mo41645k(s);
                s.close();
                if (k == -1) {
                    return this.f27912e.mo39346b(jsonReader);
                }
                return this.f27911d.get(k).mo39346b(jsonReader);
            } catch (Throwable th) {
                s.close();
                throw th;
            }
        }

        /* renamed from: j */
        public void mo39347j(q73 q73, Object obj) throws IOException {
            C5391d<Object> dVar;
            int indexOf = this.f27910c.indexOf(obj.getClass());
            if (indexOf == -1) {
                dVar = this.f27912e;
                if (dVar == null) {
                    throw new IllegalArgumentException("Expected one of " + this.f27910c + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
                }
            } else {
                dVar = this.f27911d.get(indexOf);
            }
            q73.mo39394c();
            if (dVar != this.f27912e) {
                q73.mo39399j(this.f27908a).mo39389A(this.f27909b.get(indexOf));
            }
            int b = q73.mo46985b();
            dVar.mo39347j(q73, obj);
            q73.mo46987f(b);
            q73.mo39398g();
        }

        /* renamed from: k */
        public final int mo41645k(JsonReader jsonReader) throws IOException {
            jsonReader.mo39276b();
            while (jsonReader.mo39280f()) {
                if (jsonReader.mo39295z(this.f27913f) == -1) {
                    jsonReader.mo39272I();
                    jsonReader.mo39273J();
                } else {
                    int A = jsonReader.mo39269A(this.f27914g);
                    if (A != -1 || this.f27912e != null) {
                        return A;
                    }
                    throw new JsonDataException("Expected one of " + this.f27909b + " for key '" + this.f27908a + "' but found '" + jsonReader.mo39289n() + "'. Register a subtype for this label.");
                }
            }
            throw new JsonDataException("Missing label for " + this.f27908a);
        }

        public String toString() {
            return "PolymorphicJsonAdapter(" + this.f27908a + ")";
        }
    }

    public cs4(Class<T> cls, String str, List<String> list, List<Type> list2, C5391d<Object> dVar) {
        this.f27903a = cls;
        this.f27904b = str;
        this.f27905c = list;
        this.f27906d = list2;
        this.f27907e = dVar;
    }

    /* renamed from: b */
    public static <T> cs4<T> m43136b(Class<T> cls, String str) {
        if (cls == null) {
            throw new NullPointerException("baseType == null");
        } else if (str != null) {
            return new cs4(cls, str, Collections.emptyList(), Collections.emptyList(), (C5391d<Object>) null);
        } else {
            throw new NullPointerException("labelKey == null");
        }
    }

    /* renamed from: a */
    public C5391d<?> mo39349a(Type type, Set<? extends Annotation> set, C5401h hVar) {
        if (u27.m52591g(type) != this.f27903a || !set.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.f27906d.size());
        int size = this.f27906d.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(hVar.mo39409d(this.f27906d.get(i)));
        }
        return new C5714a(this.f27904b, this.f27905c, this.f27906d, arrayList, this.f27907e).mo39365f();
    }

    /* renamed from: c */
    public cs4<T> mo41644c(Class<? extends T> cls, String str) {
        if (cls == null) {
            throw new NullPointerException("subtype == null");
        } else if (str == null) {
            throw new NullPointerException("label == null");
        } else if (!this.f27905c.contains(str)) {
            ArrayList arrayList = new ArrayList(this.f27905c);
            arrayList.add(str);
            ArrayList arrayList2 = new ArrayList(this.f27906d);
            arrayList2.add(cls);
            return new cs4(this.f27903a, this.f27904b, arrayList, arrayList2, this.f27907e);
        } else {
            throw new IllegalArgumentException("Labels must be unique.");
        }
    }
}
