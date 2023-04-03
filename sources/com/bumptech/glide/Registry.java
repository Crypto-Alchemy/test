package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C1735a;
import com.bumptech.glide.load.data.C1737b;
import com.bumptech.glide.load.engine.C1759e;
import com.bumptech.glide.load.engine.C1776i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Registry {

    /* renamed from: a */
    public final ow3 f8655a;

    /* renamed from: b */
    public final pp1 f8656b;

    /* renamed from: c */
    public final hf5 f8657c;

    /* renamed from: d */
    public final kf5 f8658d;

    /* renamed from: e */
    public final C1737b f8659e;

    /* renamed from: f */
    public final du6 f8660f;

    /* renamed from: g */
    public final uq2 f8661g;

    /* renamed from: h */
    public final qw3 f8662h = new qw3();

    /* renamed from: i */
    public final wi3 f8663i = new wi3();

    /* renamed from: j */
    public final ys4<List<Throwable>> f8664j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> NoModelLoaderAvailableException(M m, List<mw3<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }

        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        ys4<List<Throwable>> e = uy1.m28527e();
        this.f8664j = e;
        this.f8655a = new ow3(e);
        this.f8656b = new pp1();
        this.f8657c = new hf5();
        this.f8658d = new kf5();
        this.f8659e = new C1737b();
        this.f8660f = new du6();
        this.f8661g = new uq2();
        mo12356s(Arrays.asList(new String[]{"Animation", "Bitmap", "BitmapDrawable"}));
    }

    /* renamed from: a */
    public <Data> Registry mo12338a(Class<Data> cls, np1<Data> np1) {
        this.f8656b.mo24754a(cls, np1);
        return this;
    }

    /* renamed from: b */
    public <TResource> Registry mo12339b(Class<TResource> cls, jf5<TResource> jf5) {
        this.f8658d.mo22286a(cls, jf5);
        return this;
    }

    /* renamed from: c */
    public <Model, Data> Registry mo12340c(Class<Model> cls, Class<Data> cls2, nw3<Model, Data> nw3) {
        this.f8655a.mo24192a(cls, cls2, nw3);
        return this;
    }

    /* renamed from: d */
    public <Data, TResource> Registry mo12341d(Class<Data> cls, Class<TResource> cls2, gf5<Data, TResource> gf5) {
        mo12342e("legacy_append", cls, cls2, gf5);
        return this;
    }

    /* renamed from: e */
    public <Data, TResource> Registry mo12342e(String str, Class<Data> cls, Class<TResource> cls2, gf5<Data, TResource> gf5) {
        this.f8657c.mo21163a(str, gf5, cls, cls2);
        return this;
    }

    /* renamed from: f */
    public final <Data, TResource, Transcode> List<C1759e<Data, TResource, Transcode>> mo12343f(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class next : this.f8657c.mo21166d(cls, cls2)) {
            for (Class next2 : this.f8660f.mo18946b(next, cls3)) {
                arrayList.add(new C1759e(cls, next, next2, this.f8657c.mo21164b(cls, next), this.f8660f.mo18945a(next, next2), this.f8664j));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public List<ImageHeaderParser> mo12344g() {
        List<ImageHeaderParser> b = this.f8661g.mo26844b();
        if (!b.isEmpty()) {
            return b;
        }
        throw new NoImageHeaderParserException();
    }

    /* renamed from: h */
    public <Data, TResource, Transcode> C1776i<Data, TResource, Transcode> mo12345h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C1776i<Data, TResource, Transcode> a = this.f8663i.mo27545a(cls, cls2, cls3);
        if (this.f8663i.mo27547c(a)) {
            return null;
        }
        if (a == null) {
            List<C1759e<Data, TResource, Transcode>> f = mo12343f(cls, cls2, cls3);
            if (f.isEmpty()) {
                a = null;
            } else {
                a = new C1776i<>(cls, cls2, cls3, f, this.f8664j);
            }
            this.f8663i.mo27548d(cls, cls2, cls3, a);
        }
        return a;
    }

    /* renamed from: i */
    public <Model> List<mw3<Model, ?>> mo12346i(Model model) {
        return this.f8655a.mo24194d(model);
    }

    /* renamed from: j */
    public <Model, TResource, Transcode> List<Class<?>> mo12347j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a = this.f8662h.mo25277a(cls, cls2, cls3);
        if (a == null) {
            a = new ArrayList<>();
            for (Class<?> d : this.f8655a.mo24193c(cls)) {
                for (Class next : this.f8657c.mo21166d(d, cls2)) {
                    if (!this.f8660f.mo18946b(next, cls3).isEmpty() && !a.contains(next)) {
                        a.add(next);
                    }
                }
            }
            this.f8662h.mo25278b(cls, cls2, cls3, Collections.unmodifiableList(a));
        }
        return a;
    }

    /* renamed from: k */
    public <X> jf5<X> mo12348k(bf5<X> bf5) throws NoResultEncoderAvailableException {
        jf5<X> b = this.f8658d.mo22287b(bf5.mo11635c());
        if (b != null) {
            return b;
        }
        throw new NoResultEncoderAvailableException(bf5.mo11635c());
    }

    /* renamed from: l */
    public <X> C1735a<X> mo12349l(X x) {
        return this.f8659e.mo12404a(x);
    }

    /* renamed from: m */
    public <X> np1<X> mo12350m(X x) throws NoSourceEncoderAvailableException {
        np1<X> b = this.f8656b.mo24755b(x.getClass());
        if (b != null) {
            return b;
        }
        throw new NoSourceEncoderAvailableException(x.getClass());
    }

    /* renamed from: n */
    public boolean mo12351n(bf5<?> bf5) {
        if (this.f8658d.mo22287b(bf5.mo11635c()) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public Registry mo12352o(ImageHeaderParser imageHeaderParser) {
        this.f8661g.mo26843a(imageHeaderParser);
        return this;
    }

    /* renamed from: p */
    public Registry mo12353p(C1735a.C1736a<?> aVar) {
        this.f8659e.mo12405b(aVar);
        return this;
    }

    /* renamed from: q */
    public <TResource, Transcode> Registry mo12354q(Class<TResource> cls, Class<Transcode> cls2, sf5<TResource, Transcode> sf5) {
        this.f8660f.mo18947c(cls, cls2, sf5);
        return this;
    }

    /* renamed from: r */
    public <Model, Data> Registry mo12355r(Class<Model> cls, Class<Data> cls2, nw3<? extends Model, ? extends Data> nw3) {
        this.f8655a.mo24196f(cls, cls2, nw3);
        return this;
    }

    /* renamed from: s */
    public final Registry mo12356s(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        for (String add : list) {
            arrayList.add(add);
        }
        arrayList.add("legacy_append");
        this.f8657c.mo21167e(arrayList);
        return this;
    }
}
