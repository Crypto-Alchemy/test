package p000;

/* renamed from: zu4 */
/* compiled from: PrimitiveArrayBuilder */
public abstract class zu4<T> {

    /* renamed from: a */
    public T f20682a;

    /* renamed from: b */
    public C3762a<T> f20683b;

    /* renamed from: c */
    public C3762a<T> f20684c;

    /* renamed from: d */
    public int f20685d;

    /* renamed from: zu4$a */
    /* compiled from: PrimitiveArrayBuilder */
    public static final class C3762a<T> {

        /* renamed from: a */
        public final T f20686a;

        /* renamed from: b */
        public final int f20687b;

        /* renamed from: c */
        public C3762a<T> f20688c;

        public C3762a(T t, int i) {
            this.f20686a = t;
            this.f20687b = i;
        }

        /* renamed from: a */
        public int mo28579a(T t, int i) {
            System.arraycopy(this.f20686a, 0, t, i, this.f20687b);
            return i + this.f20687b;
        }

        /* renamed from: b */
        public T mo28580b() {
            return this.f20686a;
        }

        /* renamed from: c */
        public void mo28581c(C3762a<T> aVar) {
            if (this.f20688c == null) {
                this.f20688c = aVar;
                return;
            }
            throw new IllegalStateException();
        }

        /* renamed from: d */
        public C3762a<T> mo28582d() {
            return this.f20688c;
        }
    }

    /* renamed from: a */
    public abstract T mo18223a(int i);

    /* renamed from: b */
    public void mo28574b() {
        C3762a<T> aVar = this.f20684c;
        if (aVar != null) {
            this.f20682a = aVar.mo28580b();
        }
        this.f20684c = null;
        this.f20683b = null;
        this.f20685d = 0;
    }

    /* renamed from: c */
    public final T mo28575c(T t, int i) {
        int i2;
        C3762a<T> aVar = new C3762a<>(t, i);
        if (this.f20683b == null) {
            this.f20684c = aVar;
            this.f20683b = aVar;
        } else {
            this.f20684c.mo28581c(aVar);
            this.f20684c = aVar;
        }
        this.f20685d += i;
        if (i < 16384) {
            i2 = i + i;
        } else {
            i2 = i + (i >> 2);
        }
        return mo18223a(i2);
    }

    /* renamed from: d */
    public int mo28576d() {
        return this.f20685d;
    }

    /* renamed from: e */
    public T mo28577e(T t, int i) {
        int i2 = this.f20685d + i;
        T a = mo18223a(i2);
        int i3 = 0;
        for (C3762a<T> aVar = this.f20683b; aVar != null; aVar = aVar.mo28582d()) {
            i3 = aVar.mo28579a(a, i3);
        }
        System.arraycopy(t, 0, a, i3, i);
        int i4 = i3 + i;
        if (i4 == i2) {
            return a;
        }
        throw new IllegalStateException("Should have gotten " + i2 + " entries, got " + i4);
    }

    /* renamed from: f */
    public T mo28578f() {
        mo28574b();
        T t = this.f20682a;
        if (t == null) {
            return mo18223a(12);
        }
        return t;
    }
}
