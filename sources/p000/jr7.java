package p000;

import java.util.List;

/* renamed from: jr7 */
public final class jr7 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ List f30570a;

    /* renamed from: d */
    public final /* synthetic */ qu7 f30571d;

    /* renamed from: e */
    public final /* synthetic */ lr7 f30572e;

    public jr7(lr7 lr7, List list, qu7 qu7) {
        this.f30572e = lr7;
        this.f30570a = list;
        this.f30571d = qu7;
    }

    public final void run() {
        try {
            if (this.f30572e.f31385c.mo46860c(this.f30570a)) {
                lr7.m47915c(this.f30572e, this.f30571d);
            } else {
                lr7.m47916d(this.f30572e, this.f30570a, this.f30571d);
            }
        } catch (Exception unused) {
            this.f30571d.mo47280c(-11);
        }
    }
}
