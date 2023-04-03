package p000;

import java.util.concurrent.Executor;

/* renamed from: s91 */
/* compiled from: DefaultScheduler_Factory */
public final class s91 implements sy1<r91> {

    /* renamed from: a */
    public final ky4<Executor> f33789a;

    /* renamed from: b */
    public final ky4<C6584uw> f33790b;

    /* renamed from: c */
    public final ky4<ym7> f33791c;

    /* renamed from: d */
    public final ky4<du1> f33792d;

    /* renamed from: e */
    public final ky4<ak6> f33793e;

    public s91(ky4<Executor> ky4, ky4<C6584uw> ky42, ky4<ym7> ky43, ky4<du1> ky44, ky4<ak6> ky45) {
        this.f33789a = ky4;
        this.f33790b = ky42;
        this.f33791c = ky43;
        this.f33792d = ky44;
        this.f33793e = ky45;
    }

    /* renamed from: a */
    public static s91 m51629a(ky4<Executor> ky4, ky4<C6584uw> ky42, ky4<ym7> ky43, ky4<du1> ky44, ky4<ak6> ky45) {
        return new s91(ky4, ky42, ky43, ky44, ky45);
    }

    /* renamed from: c */
    public static r91 m51630c(Executor executor, C6584uw uwVar, ym7 ym7, du1 du1, ak6 ak6) {
        return new r91(executor, uwVar, ym7, du1, ak6);
    }

    /* renamed from: b */
    public r91 get() {
        return m51630c(this.f33789a.get(), this.f33790b.get(), this.f33791c.get(), this.f33792d.get(), this.f33793e.get());
    }
}
