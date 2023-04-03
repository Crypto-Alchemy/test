package p000;

import java.util.concurrent.Executor;

/* renamed from: lm7 */
/* compiled from: WorkInitializer_Factory */
public final class lm7 implements sy1<km7> {

    /* renamed from: a */
    public final ky4<Executor> f31339a;

    /* renamed from: b */
    public final ky4<du1> f31340b;

    /* renamed from: c */
    public final ky4<ym7> f31341c;

    /* renamed from: d */
    public final ky4<ak6> f31342d;

    public lm7(ky4<Executor> ky4, ky4<du1> ky42, ky4<ym7> ky43, ky4<ak6> ky44) {
        this.f31339a = ky4;
        this.f31340b = ky42;
        this.f31341c = ky43;
        this.f31342d = ky44;
    }

    /* renamed from: a */
    public static lm7 m47846a(ky4<Executor> ky4, ky4<du1> ky42, ky4<ym7> ky43, ky4<ak6> ky44) {
        return new lm7(ky4, ky42, ky43, ky44);
    }

    /* renamed from: c */
    public static km7 m47847c(Executor executor, du1 du1, ym7 ym7, ak6 ak6) {
        return new km7(executor, du1, ym7, ak6);
    }

    /* renamed from: b */
    public km7 get() {
        return m47847c(this.f31339a.get(), this.f31340b.get(), this.f31341c.get(), this.f31342d.get());
    }
}
