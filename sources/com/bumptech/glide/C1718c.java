package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.C1710a;
import com.bumptech.glide.load.engine.C1761f;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.c */
/* compiled from: GlideContext */
public class C1718c extends ContextWrapper {

    /* renamed from: k */
    public static final yw6<?, ?> f8696k = new lf2();

    /* renamed from: a */
    public final C2982oq f8697a;

    /* renamed from: b */
    public final Registry f8698b;

    /* renamed from: c */
    public final fs2 f8699c;

    /* renamed from: d */
    public final C1710a.C1711a f8700d;

    /* renamed from: e */
    public final List<le5<Object>> f8701e;

    /* renamed from: f */
    public final Map<Class<?>, yw6<?, ?>> f8702f;

    /* renamed from: g */
    public final C1761f f8703g;

    /* renamed from: h */
    public final C1719d f8704h;

    /* renamed from: i */
    public final int f8705i;

    /* renamed from: j */
    public qe5 f8706j;

    public C1718c(Context context, C2982oq oqVar, Registry registry, fs2 fs2, C1710a.C1711a aVar, Map<Class<?>, yw6<?, ?>> map, List<le5<Object>> list, C1761f fVar, C1719d dVar, int i) {
        super(context.getApplicationContext());
        this.f8697a = oqVar;
        this.f8698b = registry;
        this.f8699c = fs2;
        this.f8700d = aVar;
        this.f8701e = list;
        this.f8702f = map;
        this.f8703g = fVar;
        this.f8704h = dVar;
        this.f8705i = i;
    }

    /* renamed from: a */
    public <X> he7<ImageView, X> mo12375a(ImageView imageView, Class<X> cls) {
        return this.f8699c.mo20138a(imageView, cls);
    }

    /* renamed from: b */
    public C2982oq mo12376b() {
        return this.f8697a;
    }

    /* renamed from: c */
    public List<le5<Object>> mo12377c() {
        return this.f8701e;
    }

    /* renamed from: d */
    public synchronized qe5 mo12378d() {
        if (this.f8706j == null) {
            this.f8706j = (qe5) this.f8700d.build().mo22570Z();
        }
        return this.f8706j;
    }

    /* renamed from: e */
    public <T> yw6<?, T> mo12379e(Class<T> cls) {
        yw6<?, T> yw6 = this.f8702f.get(cls);
        if (yw6 == null) {
            for (Map.Entry next : this.f8702f.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    yw6 = (yw6) next.getValue();
                }
            }
        }
        if (yw6 == null) {
            return f8696k;
        }
        return yw6;
    }

    /* renamed from: f */
    public C1761f mo12380f() {
        return this.f8703g;
    }

    /* renamed from: g */
    public C1719d mo12381g() {
        return this.f8704h;
    }

    /* renamed from: h */
    public int mo12382h() {
        return this.f8705i;
    }

    /* renamed from: i */
    public Registry mo12383i() {
        return this.f8698b;
    }
}
