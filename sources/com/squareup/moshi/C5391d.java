package com.squareup.moshi;

import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;

/* renamed from: com.squareup.moshi.d */
/* compiled from: JsonAdapter */
public abstract class C5391d<T> {

    /* renamed from: com.squareup.moshi.d$a */
    /* compiled from: JsonAdapter */
    public class C5392a extends C5391d<T> {

        /* renamed from: a */
        public final /* synthetic */ C5391d f26707a;

        public C5392a(C5391d dVar) {
            this.f26707a = dVar;
        }

        /* renamed from: b */
        public T mo39346b(JsonReader jsonReader) throws IOException {
            return this.f26707a.mo39346b(jsonReader);
        }

        /* renamed from: d */
        public boolean mo39363d() {
            return this.f26707a.mo39363d();
        }

        /* renamed from: j */
        public void mo39347j(q73 q73, T t) throws IOException {
            boolean h = q73.mo46989h();
            q73.mo46996v(true);
            try {
                this.f26707a.mo39347j(q73, t);
            } finally {
                q73.mo46996v(h);
            }
        }

        public String toString() {
            return this.f26707a + ".serializeNulls()";
        }
    }

    /* renamed from: com.squareup.moshi.d$b */
    /* compiled from: JsonAdapter */
    public class C5393b extends C5391d<T> {

        /* renamed from: a */
        public final /* synthetic */ C5391d f26709a;

        public C5393b(C5391d dVar) {
            this.f26709a = dVar;
        }

        /* renamed from: b */
        public T mo39346b(JsonReader jsonReader) throws IOException {
            boolean g = jsonReader.mo39281g();
            jsonReader.mo39271G(true);
            try {
                return this.f26709a.mo39346b(jsonReader);
            } finally {
                jsonReader.mo39271G(g);
            }
        }

        /* renamed from: d */
        public boolean mo39363d() {
            return true;
        }

        /* renamed from: j */
        public void mo39347j(q73 q73, T t) throws IOException {
            boolean i = q73.mo46990i();
            q73.mo46995s(true);
            try {
                this.f26709a.mo39347j(q73, t);
            } finally {
                q73.mo46995s(i);
            }
        }

        public String toString() {
            return this.f26709a + ".lenient()";
        }
    }

    /* renamed from: com.squareup.moshi.d$c */
    /* compiled from: JsonAdapter */
    public class C5394c extends C5391d<T> {

        /* renamed from: a */
        public final /* synthetic */ C5391d f26711a;

        public C5394c(C5391d dVar) {
            this.f26711a = dVar;
        }

        /* renamed from: b */
        public T mo39346b(JsonReader jsonReader) throws IOException {
            boolean e = jsonReader.mo39279e();
            jsonReader.mo39270C(true);
            try {
                return this.f26711a.mo39346b(jsonReader);
            } finally {
                jsonReader.mo39270C(e);
            }
        }

        /* renamed from: d */
        public boolean mo39363d() {
            return this.f26711a.mo39363d();
        }

        /* renamed from: j */
        public void mo39347j(q73 q73, T t) throws IOException {
            this.f26711a.mo39347j(q73, t);
        }

        public String toString() {
            return this.f26711a + ".failOnUnknown()";
        }
    }

    /* renamed from: com.squareup.moshi.d$d */
    /* compiled from: JsonAdapter */
    public interface C5395d {
        /* renamed from: a */
        C5391d<?> mo39349a(Type type, Set<? extends Annotation> set, C5401h hVar);
    }

    /* renamed from: a */
    public final C5391d<T> mo39361a() {
        return new C5394c(this);
    }

    /* renamed from: b */
    public abstract T mo39346b(JsonReader jsonReader) throws IOException;

    /* renamed from: c */
    public final T mo39362c(String str) throws IOException {
        JsonReader p = JsonReader.m41502p(new m40().mo56044Z(str));
        T b = mo39346b(p);
        if (mo39363d() || p.mo39290q() == JsonReader.Token.END_DOCUMENT) {
            return b;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    /* renamed from: d */
    public boolean mo39363d() {
        return false;
    }

    /* renamed from: e */
    public final C5391d<T> mo39364e() {
        return new C5393b(this);
    }

    /* renamed from: f */
    public final C5391d<T> mo39365f() {
        if (this instanceof xb4) {
            return this;
        }
        return new xb4(this);
    }

    /* renamed from: g */
    public final C5391d<T> mo39366g() {
        return new C5392a(this);
    }

    /* renamed from: h */
    public final String mo39367h(T t) {
        m40 m40 = new m40();
        try {
            mo39368i(m40, t);
            return m40.mo56048b1();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: i */
    public final void mo39368i(v40 v40, T t) throws IOException {
        mo39347j(q73.m50360l(v40), t);
    }

    /* renamed from: j */
    public abstract void mo39347j(q73 q73, T t) throws IOException;
}
