package p000;

/* renamed from: i36 */
/* compiled from: SingleCheck */
public final class i36<T> implements ky4<T> {

    /* renamed from: c */
    public static final Object f29799c = new Object();

    /* renamed from: a */
    public volatile ky4<T> f29800a;

    /* renamed from: b */
    public volatile Object f29801b = f29799c;

    public i36(ky4<T> ky4) {
        this.f29800a = ky4;
    }

    /* renamed from: a */
    public static <P extends ky4<T>, T> ky4<T> m45457a(P p) {
        if ((p instanceof i36) || (p instanceof li1)) {
            return p;
        }
        return new i36((ky4) fu4.m44411b(p));
    }

    public T get() {
        T t = this.f29801b;
        if (t != f29799c) {
            return t;
        }
        ky4<T> ky4 = this.f29800a;
        if (ky4 == null) {
            return this.f29801b;
        }
        T t2 = ky4.get();
        this.f29801b = t2;
        this.f29800a = null;
        return t2;
    }
}
