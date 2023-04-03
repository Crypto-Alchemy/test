package p000;

import p000.ya1;

/* renamed from: vi4 */
/* compiled from: OptionalProvider */
public class vi4<T> implements ly4<T>, ya1<T> {

    /* renamed from: c */
    public static final ya1.C6728a<Object> f34950c = new si4();

    /* renamed from: d */
    public static final ly4<Object> f34951d = new ti4();

    /* renamed from: a */
    public ya1.C6728a<T> f34952a;

    /* renamed from: b */
    public volatile ly4<T> f34953b;

    public vi4(ya1.C6728a<T> aVar, ly4<T> ly4) {
        this.f34952a = aVar;
        this.f34953b = ly4;
    }

    /* renamed from: e */
    public static <T> vi4<T> m53398e() {
        return new vi4<>(f34950c, f34951d);
    }

    /* renamed from: f */
    public static /* synthetic */ void m53399f(ly4 ly4) {
    }

    /* renamed from: g */
    public static /* synthetic */ Object m53400g() {
        return null;
    }

    /* renamed from: h */
    public static /* synthetic */ void m53401h(ya1.C6728a aVar, ya1.C6728a aVar2, ly4 ly4) {
        aVar.mo47801a(ly4);
        aVar2.mo47801a(ly4);
    }

    /* renamed from: i */
    public static <T> vi4<T> m53402i(ly4<T> ly4) {
        return new vi4<>((ya1.C6728a) null, ly4);
    }

    /* renamed from: a */
    public void mo48748a(ya1.C6728a<T> aVar) {
        ly4<T> ly4;
        ly4<T> ly42 = this.f34953b;
        ly4<Object> ly43 = f34951d;
        if (ly42 != ly43) {
            aVar.mo47801a(ly42);
            return;
        }
        ly4<T> ly44 = null;
        synchronized (this) {
            ly4 = this.f34953b;
            if (ly4 != ly43) {
                ly44 = ly4;
            } else {
                this.f34952a = new ui4(this.f34952a, aVar);
            }
        }
        if (ly44 != null) {
            aVar.mo47801a(ly4);
        }
    }

    public T get() {
        return this.f34953b.get();
    }

    /* renamed from: j */
    public void mo48749j(ly4<T> ly4) {
        ya1.C6728a<T> aVar;
        if (this.f34953b == f34951d) {
            synchronized (this) {
                aVar = this.f34952a;
                this.f34952a = null;
                this.f34953b = ly4;
            }
            aVar.mo47801a(ly4);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }
}
