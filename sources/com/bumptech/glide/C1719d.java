package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.d */
/* compiled from: GlideExperiments */
public class C1719d {

    /* renamed from: a */
    public final Map<Class<?>, Object> f8707a;

    /* renamed from: com.bumptech.glide.d$a */
    /* compiled from: GlideExperiments */
    public static final class C1720a {

        /* renamed from: a */
        public final Map<Class<?>, Object> f8708a = new HashMap();

        /* renamed from: b */
        public C1719d mo12385b() {
            return new C1719d(this);
        }
    }

    public C1719d(C1720a aVar) {
        this.f8707a = Collections.unmodifiableMap(new HashMap(aVar.f8708a));
    }

    /* renamed from: a */
    public boolean mo12384a(Class<Object> cls) {
        return this.f8707a.containsKey(cls);
    }
}
