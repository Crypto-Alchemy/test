package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p000.iq0;

/* renamed from: cm7 */
/* compiled from: WorkConstraintsTracker */
public class cm7 implements iq0.C2567a {

    /* renamed from: d */
    public static final String f8480d = qk3.m25728f("WorkConstraintsTracker");

    /* renamed from: a */
    public final bm7 f8481a;

    /* renamed from: b */
    public final iq0<?>[] f8482b;

    /* renamed from: c */
    public final Object f8483c = new Object();

    public cm7(Context context, bm6 bm6, bm7 bm7) {
        Context applicationContext = context.getApplicationContext();
        this.f8481a = bm7;
        this.f8482b = new iq0[]{new h00(applicationContext, bm6), new j00(applicationContext, bm6), new ea6(applicationContext, bm6), new o54(applicationContext, bm6), new b64(applicationContext, bm6), new s54(applicationContext, bm6), new r54(applicationContext, bm6)};
    }

    /* renamed from: a */
    public void mo12125a(List<String> list) {
        synchronized (this.f8483c) {
            ArrayList arrayList = new ArrayList();
            for (String next : list) {
                if (mo12127c(next)) {
                    qk3.m25726c().mo25135a(f8480d, String.format("Constraints met for %s", new Object[]{next}), new Throwable[0]);
                    arrayList.add(next);
                }
            }
            bm7 bm7 = this.f8481a;
            if (bm7 != null) {
                bm7.mo10985f(arrayList);
            }
        }
    }

    /* renamed from: b */
    public void mo12126b(List<String> list) {
        synchronized (this.f8483c) {
            bm7 bm7 = this.f8481a;
            if (bm7 != null) {
                bm7.mo10982b(list);
            }
        }
    }

    /* renamed from: c */
    public boolean mo12127c(String str) {
        synchronized (this.f8483c) {
            for (iq0<?> iq0 : this.f8482b) {
                if (iq0.mo21614d(str)) {
                    qk3.m25726c().mo25135a(f8480d, String.format("Work %s constrained by %s", new Object[]{str, iq0.getClass().getSimpleName()}), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: d */
    public void mo12128d(Iterable<an7> iterable) {
        synchronized (this.f8483c) {
            for (iq0<?> g : this.f8482b) {
                g.mo21617g((iq0.C2567a) null);
            }
            for (iq0<?> e : this.f8482b) {
                e.mo21615e(iterable);
            }
            for (iq0<?> g2 : this.f8482b) {
                g2.mo21617g(this);
            }
        }
    }

    /* renamed from: e */
    public void mo12129e() {
        synchronized (this.f8483c) {
            for (iq0<?> f : this.f8482b) {
                f.mo21616f();
            }
        }
    }
}
