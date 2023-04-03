package p000;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: e57 */
/* compiled from: Uploader_Factory */
public final class e57 implements sy1<d57> {

    /* renamed from: a */
    public final ky4<Context> f28399a;

    /* renamed from: b */
    public final ky4<C6584uw> f28400b;

    /* renamed from: c */
    public final ky4<du1> f28401c;

    /* renamed from: d */
    public final ky4<ym7> f28402d;

    /* renamed from: e */
    public final ky4<Executor> f28403e;

    /* renamed from: f */
    public final ky4<ak6> f28404f;

    /* renamed from: g */
    public final ky4<ah0> f28405g;

    public e57(ky4<Context> ky4, ky4<C6584uw> ky42, ky4<du1> ky43, ky4<ym7> ky44, ky4<Executor> ky45, ky4<ak6> ky46, ky4<ah0> ky47) {
        this.f28399a = ky4;
        this.f28400b = ky42;
        this.f28401c = ky43;
        this.f28402d = ky44;
        this.f28403e = ky45;
        this.f28404f = ky46;
        this.f28405g = ky47;
    }

    /* renamed from: a */
    public static e57 m43798a(ky4<Context> ky4, ky4<C6584uw> ky42, ky4<du1> ky43, ky4<ym7> ky44, ky4<Executor> ky45, ky4<ak6> ky46, ky4<ah0> ky47) {
        return new e57(ky4, ky42, ky43, ky44, ky45, ky46, ky47);
    }

    /* renamed from: c */
    public static d57 m43799c(Context context, C6584uw uwVar, du1 du1, ym7 ym7, Executor executor, ak6 ak6, ah0 ah0) {
        return new d57(context, uwVar, du1, ym7, executor, ak6, ah0);
    }

    /* renamed from: b */
    public d57 get() {
        return m43799c(this.f28399a.get(), this.f28400b.get(), this.f28401c.get(), this.f28402d.get(), this.f28403e.get(), this.f28404f.get(), this.f28405g.get());
    }
}
