package p000;

import java.util.concurrent.Executor;

/* renamed from: km7 */
/* compiled from: WorkInitializer */
public class km7 {

    /* renamed from: a */
    public final Executor f30931a;

    /* renamed from: b */
    public final du1 f30932b;

    /* renamed from: c */
    public final ym7 f30933c;

    /* renamed from: d */
    public final ak6 f30934d;

    public km7(Executor executor, du1 du1, ym7 ym7, ak6 ak6) {
        this.f30931a = executor;
        this.f30932b = du1;
        this.f30933c = ym7;
        this.f30934d = ak6;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m47180d() {
        for (hx6 a : this.f30932b.mo42055R()) {
            this.f30933c.mo29439a(a, 1);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m47181e() {
        this.f30934d.mo29005a(new jm7(this));
    }

    /* renamed from: c */
    public void mo44843c() {
        this.f30931a.execute(new im7(this));
    }
}
