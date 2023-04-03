package p000;

/* renamed from: qx6 */
/* compiled from: TransportRuntime_Factory */
public final class qx6 implements sy1<ox6> {

    /* renamed from: a */
    public final ky4<ah0> f33291a;

    /* renamed from: b */
    public final ky4<ah0> f33292b;

    /* renamed from: c */
    public final ky4<mm5> f33293c;

    /* renamed from: d */
    public final ky4<d57> f33294d;

    /* renamed from: e */
    public final ky4<km7> f33295e;

    public qx6(ky4<ah0> ky4, ky4<ah0> ky42, ky4<mm5> ky43, ky4<d57> ky44, ky4<km7> ky45) {
        this.f33291a = ky4;
        this.f33292b = ky42;
        this.f33293c = ky43;
        this.f33294d = ky44;
        this.f33295e = ky45;
    }

    /* renamed from: a */
    public static qx6 m50901a(ky4<ah0> ky4, ky4<ah0> ky42, ky4<mm5> ky43, ky4<d57> ky44, ky4<km7> ky45) {
        return new qx6(ky4, ky42, ky43, ky44, ky45);
    }

    /* renamed from: c */
    public static ox6 m50902c(ah0 ah0, ah0 ah02, mm5 mm5, d57 d57, km7 km7) {
        return new ox6(ah0, ah02, mm5, d57, km7);
    }

    /* renamed from: b */
    public ox6 get() {
        return m50902c(this.f33291a.get(), this.f33292b.get(), this.f33293c.get(), this.f33294d.get(), this.f33295e.get());
    }
}
