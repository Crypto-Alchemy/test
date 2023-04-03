package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: du6 */
/* compiled from: TranscoderRegistry */
public class du6 {

    /* renamed from: a */
    public final List<C2202a<?, ?>> f10894a = new ArrayList();

    /* renamed from: du6$a */
    /* compiled from: TranscoderRegistry */
    public static final class C2202a<Z, R> {

        /* renamed from: a */
        public final Class<Z> f10895a;

        /* renamed from: b */
        public final Class<R> f10896b;

        /* renamed from: c */
        public final sf5<Z, R> f10897c;

        public C2202a(Class<Z> cls, Class<R> cls2, sf5<Z, R> sf5) {
            this.f10895a = cls;
            this.f10896b = cls2;
            this.f10897c = sf5;
        }

        /* renamed from: a */
        public boolean mo18948a(Class<?> cls, Class<?> cls2) {
            if (!this.f10895a.isAssignableFrom(cls) || !cls2.isAssignableFrom(this.f10896b)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public synchronized <Z, R> sf5<Z, R> mo18945a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return v37.m28612b();
        }
        for (C2202a next : this.f10894a) {
            if (next.mo18948a(cls, cls2)) {
                return next.f10897c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    /* renamed from: b */
    public synchronized <Z, R> List<Class<R>> mo18946b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C2202a next : this.f10894a) {
            if (next.mo18948a(cls, cls2) && !arrayList.contains(next.f10896b)) {
                arrayList.add(next.f10896b);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized <Z, R> void mo18947c(Class<Z> cls, Class<R> cls2, sf5<Z, R> sf5) {
        this.f10894a.add(new C2202a(cls, cls2, sf5));
    }
}
