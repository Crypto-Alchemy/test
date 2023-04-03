package p000;

/* renamed from: kk5 */
/* compiled from: SQLiteEventStore_Factory */
public final class kk5 implements sy1<jk5> {

    /* renamed from: a */
    public final ky4<ah0> f30906a;

    /* renamed from: b */
    public final ky4<ah0> f30907b;

    /* renamed from: c */
    public final ky4<eu1> f30908c;

    /* renamed from: d */
    public final ky4<fn5> f30909d;

    public kk5(ky4<ah0> ky4, ky4<ah0> ky42, ky4<eu1> ky43, ky4<fn5> ky44) {
        this.f30906a = ky4;
        this.f30907b = ky42;
        this.f30908c = ky43;
        this.f30909d = ky44;
    }

    /* renamed from: a */
    public static kk5 m47154a(ky4<ah0> ky4, ky4<ah0> ky42, ky4<eu1> ky43, ky4<fn5> ky44) {
        return new kk5(ky4, ky42, ky43, ky44);
    }

    /* renamed from: c */
    public static jk5 m47155c(ah0 ah0, ah0 ah02, Object obj, Object obj2) {
        return new jk5(ah0, ah02, (eu1) obj, (fn5) obj2);
    }

    /* renamed from: b */
    public jk5 get() {
        return m47155c(this.f30906a.get(), this.f30907b.get(), this.f30908c.get(), this.f30909d.get());
    }
}
