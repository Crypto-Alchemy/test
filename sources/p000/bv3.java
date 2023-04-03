package p000;

import android.content.Context;

/* renamed from: bv3 */
/* compiled from: MetadataBackendRegistry_Factory */
public final class bv3 implements sy1<av3> {

    /* renamed from: a */
    public final ky4<Context> f21501a;

    /* renamed from: b */
    public final ky4<xv0> f21502b;

    public bv3(ky4<Context> ky4, ky4<xv0> ky42) {
        this.f21501a = ky4;
        this.f21502b = ky42;
    }

    /* renamed from: a */
    public static bv3 m32780a(ky4<Context> ky4, ky4<xv0> ky42) {
        return new bv3(ky4, ky42);
    }

    /* renamed from: c */
    public static av3 m32781c(Context context, Object obj) {
        return new av3(context, (xv0) obj);
    }

    /* renamed from: b */
    public av3 get() {
        return m32781c(this.f21501a.get(), this.f21502b.get());
    }
}
