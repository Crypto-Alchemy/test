package p000;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* renamed from: r91 */
/* compiled from: DefaultScheduler */
public class r91 implements mm5 {

    /* renamed from: f */
    public static final Logger f33358f = Logger.getLogger(ox6.class.getName());

    /* renamed from: a */
    public final ym7 f33359a;

    /* renamed from: b */
    public final Executor f33360b;

    /* renamed from: c */
    public final C6584uw f33361c;

    /* renamed from: d */
    public final du1 f33362d;

    /* renamed from: e */
    public final ak6 f33363e;

    public r91(Executor executor, C6584uw uwVar, ym7 ym7, du1 du1, ak6 ak6) {
        this.f33360b = executor;
        this.f33361c = uwVar;
        this.f33359a = ym7;
        this.f33362d = du1;
        this.f33363e = ak6;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m50995d(hx6 hx6, mt1 mt1) {
        this.f33362d.mo42056X0(hx6, mt1);
        this.f33359a.mo29439a(hx6, 1);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m50996e(hx6 hx6, rx6 rx6, mt1 mt1) {
        try {
            gx6 gx6 = this.f33361c.get(hx6.mo43416b());
            if (gx6 == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{hx6.mo43416b()});
                f33358f.warning(format);
                rx6.mo42707a(new IllegalArgumentException(format));
                return;
            }
            this.f33363e.mo29005a(new p91(this, hx6, gx6.mo29923a(mt1)));
            rx6.mo42707a((Exception) null);
        } catch (Exception e) {
            Logger logger = f33358f;
            logger.warning("Error scheduling event " + e.getMessage());
            rx6.mo42707a(e);
        }
    }

    /* renamed from: a */
    public void mo45819a(hx6 hx6, mt1 mt1, rx6 rx6) {
        this.f33360b.execute(new o91(this, hx6, rx6, mt1));
    }
}
