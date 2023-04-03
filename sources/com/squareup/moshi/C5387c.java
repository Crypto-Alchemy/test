package com.squareup.moshi;

import com.squareup.moshi.C5391d;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.squareup.moshi.c */
/* compiled from: CollectionJsonAdapter */
public abstract class C5387c<C extends Collection<T>, T> extends C5391d<C> {

    /* renamed from: b */
    public static final C5391d.C5395d f26705b = new C5388a();

    /* renamed from: a */
    public final C5391d<T> f26706a;

    /* renamed from: com.squareup.moshi.c$a */
    /* compiled from: CollectionJsonAdapter */
    public class C5388a implements C5391d.C5395d {
        /* renamed from: a */
        public C5391d<?> mo39349a(Type type, Set<? extends Annotation> set, C5401h hVar) {
            Class<?> g = u27.m52591g(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (g == List.class || g == Collection.class) {
                return C5387c.m41559l(type, hVar).mo39365f();
            }
            if (g == Set.class) {
                return C5387c.m41560n(type, hVar).mo39365f();
            }
            return null;
        }
    }

    /* renamed from: com.squareup.moshi.c$b */
    /* compiled from: CollectionJsonAdapter */
    public class C5389b extends C5387c<Collection<T>, T> {
        public C5389b(C5391d dVar) {
            super(dVar, (C5388a) null);
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ Object mo39346b(JsonReader jsonReader) throws IOException {
            return C5387c.super.mo39356k(jsonReader);
        }

        /* renamed from: j */
        public /* bridge */ /* synthetic */ void mo39347j(q73 q73, Object obj) throws IOException {
            C5387c.super.mo39358o(q73, (Collection) obj);
        }

        /* renamed from: m */
        public Collection<T> mo39357m() {
            return new ArrayList();
        }
    }

    /* renamed from: com.squareup.moshi.c$c */
    /* compiled from: CollectionJsonAdapter */
    public class C5390c extends C5387c<Set<T>, T> {
        public C5390c(C5391d dVar) {
            super(dVar, (C5388a) null);
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ Object mo39346b(JsonReader jsonReader) throws IOException {
            return C5387c.super.mo39356k(jsonReader);
        }

        /* renamed from: j */
        public /* bridge */ /* synthetic */ void mo39347j(q73 q73, Object obj) throws IOException {
            C5387c.super.mo39358o(q73, (Collection) obj);
        }

        /* renamed from: p */
        public Set<T> mo39357m() {
            return new LinkedHashSet();
        }
    }

    public /* synthetic */ C5387c(C5391d dVar, C5388a aVar) {
        this(dVar);
    }

    /* renamed from: l */
    public static <T> C5391d<Collection<T>> m41559l(Type type, C5401h hVar) {
        return new C5389b(hVar.mo39409d(u27.m52587c(type, Collection.class)));
    }

    /* renamed from: n */
    public static <T> C5391d<Set<T>> m41560n(Type type, C5401h hVar) {
        return new C5390c(hVar.mo39409d(u27.m52587c(type, Collection.class)));
    }

    /* renamed from: k */
    public C mo39356k(JsonReader jsonReader) throws IOException {
        C m = mo39357m();
        jsonReader.mo39275a();
        while (jsonReader.mo39280f()) {
            m.add(this.f26706a.mo39346b(jsonReader));
        }
        jsonReader.mo39277c();
        return m;
    }

    /* renamed from: m */
    public abstract C mo39357m();

    /* renamed from: o */
    public void mo39358o(q73 q73, C c) throws IOException {
        q73.mo39393a();
        for (Object j : c) {
            this.f26706a.mo39347j(q73, j);
        }
        q73.mo39396e();
    }

    public String toString() {
        return this.f26706a + ".collection()";
    }

    public C5387c(C5391d<T> dVar) {
        this.f26706a = dVar;
    }
}
