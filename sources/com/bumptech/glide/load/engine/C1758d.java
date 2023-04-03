package com.bumptech.glide.load.engine;

import com.bumptech.glide.C1718c;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.data.C1735a;
import com.bumptech.glide.load.engine.DecodeJob;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.mw3;

/* renamed from: com.bumptech.glide.load.engine.d */
/* compiled from: DecodeHelper */
public final class C1758d<Transcode> {

    /* renamed from: a */
    public final List<mw3.C2853a<?>> f8804a = new ArrayList();

    /* renamed from: b */
    public final List<z93> f8805b = new ArrayList();

    /* renamed from: c */
    public C1718c f8806c;

    /* renamed from: d */
    public Object f8807d;

    /* renamed from: e */
    public int f8808e;

    /* renamed from: f */
    public int f8809f;

    /* renamed from: g */
    public Class<?> f8810g;

    /* renamed from: h */
    public DecodeJob.C1746e f8811h;

    /* renamed from: i */
    public xi4 f8812i;

    /* renamed from: j */
    public Map<Class<?>, mw6<?>> f8813j;

    /* renamed from: k */
    public Class<Transcode> f8814k;

    /* renamed from: l */
    public boolean f8815l;

    /* renamed from: m */
    public boolean f8816m;

    /* renamed from: n */
    public z93 f8817n;

    /* renamed from: o */
    public Priority f8818o;

    /* renamed from: p */
    public xg1 f8819p;

    /* renamed from: q */
    public boolean f8820q;

    /* renamed from: r */
    public boolean f8821r;

    /* renamed from: a */
    public void mo12488a() {
        this.f8806c = null;
        this.f8807d = null;
        this.f8817n = null;
        this.f8810g = null;
        this.f8814k = null;
        this.f8812i = null;
        this.f8818o = null;
        this.f8813j = null;
        this.f8819p = null;
        this.f8804a.clear();
        this.f8815l = false;
        this.f8805b.clear();
        this.f8816m = false;
    }

    /* renamed from: b */
    public C2982oq mo12489b() {
        return this.f8806c.mo12376b();
    }

    /* renamed from: c */
    public List<z93> mo12490c() {
        if (!this.f8816m) {
            this.f8816m = true;
            this.f8805b.clear();
            List<mw3.C2853a<?>> g = mo12494g();
            int size = g.size();
            for (int i = 0; i < size; i++) {
                mw3.C2853a aVar = g.get(i);
                if (!this.f8805b.contains(aVar.f15260a)) {
                    this.f8805b.add(aVar.f15260a);
                }
                for (int i2 = 0; i2 < aVar.f15261b.size(); i2++) {
                    if (!this.f8805b.contains(aVar.f15261b.get(i2))) {
                        this.f8805b.add(aVar.f15261b.get(i2));
                    }
                }
            }
        }
        return this.f8805b;
    }

    /* renamed from: d */
    public tg1 mo12491d() {
        return this.f8811h.mo12448a();
    }

    /* renamed from: e */
    public xg1 mo12492e() {
        return this.f8819p;
    }

    /* renamed from: f */
    public int mo12493f() {
        return this.f8809f;
    }

    /* renamed from: g */
    public List<mw3.C2853a<?>> mo12494g() {
        if (!this.f8815l) {
            this.f8815l = true;
            this.f8804a.clear();
            List i = this.f8806c.mo12383i().mo12346i(this.f8807d);
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                mw3.C2853a b = ((mw3) i.get(i2)).mo11934b(this.f8807d, this.f8808e, this.f8809f, this.f8812i);
                if (b != null) {
                    this.f8804a.add(b);
                }
            }
        }
        return this.f8804a;
    }

    /* renamed from: h */
    public <Data> C1776i<Data, ?, Transcode> mo12495h(Class<Data> cls) {
        return this.f8806c.mo12383i().mo12345h(cls, this.f8810g, this.f8814k);
    }

    /* renamed from: i */
    public Class<?> mo12496i() {
        return this.f8807d.getClass();
    }

    /* renamed from: j */
    public List<mw3<File, ?>> mo12497j(File file) throws Registry.NoModelLoaderAvailableException {
        return this.f8806c.mo12383i().mo12346i(file);
    }

    /* renamed from: k */
    public xi4 mo12498k() {
        return this.f8812i;
    }

    /* renamed from: l */
    public Priority mo12499l() {
        return this.f8818o;
    }

    /* renamed from: m */
    public List<Class<?>> mo12500m() {
        return this.f8806c.mo12383i().mo12347j(this.f8807d.getClass(), this.f8810g, this.f8814k);
    }

    /* renamed from: n */
    public <Z> jf5<Z> mo12501n(bf5<Z> bf5) {
        return this.f8806c.mo12383i().mo12348k(bf5);
    }

    /* renamed from: o */
    public <T> C1735a<T> mo12502o(T t) {
        return this.f8806c.mo12383i().mo12349l(t);
    }

    /* renamed from: p */
    public z93 mo12503p() {
        return this.f8817n;
    }

    /* renamed from: q */
    public <X> np1<X> mo12504q(X x) throws Registry.NoSourceEncoderAvailableException {
        return this.f8806c.mo12383i().mo12350m(x);
    }

    /* renamed from: r */
    public Class<?> mo12505r() {
        return this.f8814k;
    }

    /* renamed from: s */
    public <Z> mw6<Z> mo12506s(Class<Z> cls) {
        mw6<Z> mw6 = this.f8813j.get(cls);
        if (mw6 == null) {
            Iterator<Map.Entry<Class<?>, mw6<?>>> it = this.f8813j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    mw6 = (mw6) next.getValue();
                    break;
                }
            }
        }
        if (mw6 != null) {
            return mw6;
        }
        if (!this.f8813j.isEmpty() || !this.f8820q) {
            return w37.m29260c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* renamed from: t */
    public int mo12507t() {
        return this.f8808e;
    }

    /* renamed from: u */
    public boolean mo12508u(Class<?> cls) {
        if (mo12495h(cls) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public <R> void mo12509v(C1718c cVar, Object obj, z93 z93, int i, int i2, xg1 xg1, Class<?> cls, Class<R> cls2, Priority priority, xi4 xi4, Map<Class<?>, mw6<?>> map, boolean z, boolean z2, DecodeJob.C1746e eVar) {
        this.f8806c = cVar;
        this.f8807d = obj;
        this.f8817n = z93;
        this.f8808e = i;
        this.f8809f = i2;
        this.f8819p = xg1;
        this.f8810g = cls;
        this.f8811h = eVar;
        this.f8814k = cls2;
        this.f8818o = priority;
        this.f8812i = xi4;
        this.f8813j = map;
        this.f8820q = z;
        this.f8821r = z2;
    }

    /* renamed from: w */
    public boolean mo12510w(bf5<?> bf5) {
        return this.f8806c.mo12383i().mo12351n(bf5);
    }

    /* renamed from: x */
    public boolean mo12511x() {
        return this.f8821r;
    }

    /* renamed from: y */
    public boolean mo12512y(z93 z93) {
        List<mw3.C2853a<?>> g = mo12494g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            if (g.get(i).f15260a.equals(z93)) {
                return true;
            }
        }
        return false;
    }
}
