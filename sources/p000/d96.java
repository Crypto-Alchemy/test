package p000;

/* renamed from: d96 */
/* compiled from: StateVerifier */
public abstract class d96 {

    /* renamed from: d96$b */
    /* compiled from: StateVerifier */
    public static class C2143b extends d96 {

        /* renamed from: a */
        public volatile boolean f10577a;

        public C2143b() {
            super();
        }

        /* renamed from: b */
        public void mo18593b(boolean z) {
            this.f10577a = z;
        }

        /* renamed from: c */
        public void mo18594c() {
            if (this.f10577a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public d96() {
    }

    /* renamed from: a */
    public static d96 m14869a() {
        return new C2143b();
    }

    /* renamed from: b */
    public abstract void mo18593b(boolean z);

    /* renamed from: c */
    public abstract void mo18594c();
}
