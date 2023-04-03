package p000;

import bolts.UnobservedTaskException;
import p000.sl6;

/* renamed from: h47 */
/* compiled from: UnobservedErrorNotifier */
public class h47 {

    /* renamed from: a */
    public sl6<?> f12739a;

    public h47(sl6<?> sl6) {
        this.f12739a = sl6;
    }

    /* renamed from: a */
    public void mo20952a() {
        this.f12739a = null;
    }

    public void finalize() throws Throwable {
        sl6.C3282d k;
        try {
            sl6<?> sl6 = this.f12739a;
            if (!(sl6 == null || (k = sl6.m26960k()) == null)) {
                k.mo25868a(sl6, new UnobservedTaskException(sl6.mo25856i()));
            }
        } finally {
            super.finalize();
        }
    }
}
