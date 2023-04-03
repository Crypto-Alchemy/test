package p000;

/* renamed from: ii3 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class ii3<L> {

    /* renamed from: a */
    public volatile Object f29941a;

    /* renamed from: b */
    public volatile C5966a f29942b;

    /* renamed from: ii3$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static final class C5966a<L> {

        /* renamed from: a */
        public final Object f29943a;

        /* renamed from: b */
        public final String f29944b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5966a)) {
                return false;
            }
            C5966a aVar = (C5966a) obj;
            if (this.f29943a != aVar.f29943a || !this.f29944b.equals(aVar.f29944b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f29943a) * 31) + this.f29944b.hashCode();
        }
    }

    /* renamed from: a */
    public void mo43624a() {
        this.f29941a = null;
        this.f29942b = null;
    }
}
