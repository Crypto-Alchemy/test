package p000;

import android.content.Context;

/* renamed from: yv0 */
/* compiled from: CreationContextFactory_Factory */
public final class yv0 implements sy1<xv0> {

    /* renamed from: a */
    public final ky4<Context> f35931a;

    /* renamed from: b */
    public final ky4<ah0> f35932b;

    /* renamed from: c */
    public final ky4<ah0> f35933c;

    public yv0(ky4<Context> ky4, ky4<ah0> ky42, ky4<ah0> ky43) {
        this.f35931a = ky4;
        this.f35932b = ky42;
        this.f35933c = ky43;
    }

    /* renamed from: a */
    public static yv0 m54875a(ky4<Context> ky4, ky4<ah0> ky42, ky4<ah0> ky43) {
        return new yv0(ky4, ky42, ky43);
    }

    /* renamed from: c */
    public static xv0 m54876c(Context context, ah0 ah0, ah0 ah02) {
        return new xv0(context, ah0, ah02);
    }

    /* renamed from: b */
    public xv0 get() {
        return m54876c(this.f35931a.get(), this.f35932b.get(), this.f35933c.get());
    }
}
