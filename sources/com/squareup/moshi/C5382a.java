package com.squareup.moshi;

import com.squareup.moshi.C5391d;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.squareup.moshi.a */
/* compiled from: ArrayJsonAdapter */
public final class C5382a extends C5391d<Object> {

    /* renamed from: c */
    public static final C5391d.C5395d f26695c = new C5383a();

    /* renamed from: a */
    public final Class<?> f26696a;

    /* renamed from: b */
    public final C5391d<Object> f26697b;

    /* renamed from: com.squareup.moshi.a$a */
    /* compiled from: ArrayJsonAdapter */
    public class C5383a implements C5391d.C5395d {
        /* renamed from: a */
        public C5391d<?> mo39349a(Type type, Set<? extends Annotation> set, C5401h hVar) {
            Type a = u27.m52585a(type);
            if (a != null && set.isEmpty()) {
                return new C5382a(u27.m52591g(a), hVar.mo39409d(a)).mo39365f();
            }
            return null;
        }
    }

    public C5382a(Class<?> cls, C5391d<Object> dVar) {
        this.f26696a = cls;
        this.f26697b = dVar;
    }

    /* renamed from: b */
    public Object mo39346b(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.mo39275a();
        while (jsonReader.mo39280f()) {
            arrayList.add(this.f26697b.mo39346b(jsonReader));
        }
        jsonReader.mo39277c();
        Object newInstance = Array.newInstance(this.f26696a, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* renamed from: j */
    public void mo39347j(q73 q73, Object obj) throws IOException {
        q73.mo39393a();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f26697b.mo39347j(q73, Array.get(obj, i));
        }
        q73.mo39396e();
    }

    public String toString() {
        return this.f26697b + ".array()";
    }
}
