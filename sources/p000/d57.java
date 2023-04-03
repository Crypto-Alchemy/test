package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: d57 */
/* compiled from: Uploader */
public class d57 {

    /* renamed from: a */
    public final Context f28031a;

    /* renamed from: b */
    public final C6584uw f28032b;

    /* renamed from: c */
    public final du1 f28033c;

    /* renamed from: d */
    public final ym7 f28034d;

    /* renamed from: e */
    public final Executor f28035e;

    /* renamed from: f */
    public final ak6 f28036f;

    /* renamed from: g */
    public final ah0 f28037g;

    public d57(Context context, C6584uw uwVar, du1 du1, ym7 ym7, Executor executor, ak6 ak6, ah0 ah0) {
        this.f28031a = context;
        this.f28032b = uwVar;
        this.f28033c = du1;
        this.f28034d = ym7;
        this.f28035e = executor;
        this.f28036f = ak6;
        this.f28037g = ah0;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ Iterable m43351f(hx6 hx6) {
        return this.f28033c.mo42053E(hx6);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ Object m43352g(BackendResponse backendResponse, Iterable iterable, hx6 hx6, int i) {
        if (backendResponse.mo30142c() == BackendResponse.Status.TRANSIENT_ERROR) {
            this.f28033c.mo42060t0(iterable);
            this.f28034d.mo29439a(hx6, i + 1);
            return null;
        }
        this.f28033c.mo42052D(iterable);
        if (backendResponse.mo30142c() == BackendResponse.Status.OK) {
            this.f28033c.mo42057i1(hx6, this.f28037g.mo28970a() + backendResponse.mo30141b());
        }
        if (!this.f28033c.mo42058n0(hx6)) {
            return null;
        }
        this.f28034d.mo29440b(hx6, 1, true);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ Object m43353h(hx6 hx6, int i) {
        this.f28034d.mo29439a(hx6, i + 1);
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        r6.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r3.f28034d.mo29439a(r4, r5 + 1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0026 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m43354i(p000.hx6 r4, int r5, java.lang.Runnable r6) {
        /*
            r3 = this;
            ak6 r0 = r3.f28036f     // Catch:{ SynchronizationException -> 0x0026 }
            du1 r1 = r3.f28033c     // Catch:{ SynchronizationException -> 0x0026 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ SynchronizationException -> 0x0026 }
            z47 r2 = new z47     // Catch:{ SynchronizationException -> 0x0026 }
            r2.<init>(r1)     // Catch:{ SynchronizationException -> 0x0026 }
            r0.mo29005a(r2)     // Catch:{ SynchronizationException -> 0x0026 }
            boolean r0 = r3.mo41849e()     // Catch:{ SynchronizationException -> 0x0026 }
            if (r0 != 0) goto L_0x0020
            ak6 r0 = r3.f28036f     // Catch:{ SynchronizationException -> 0x0026 }
            a57 r1 = new a57     // Catch:{ SynchronizationException -> 0x0026 }
            r1.<init>(r3, r4, r5)     // Catch:{ SynchronizationException -> 0x0026 }
            r0.mo29005a(r1)     // Catch:{ SynchronizationException -> 0x0026 }
            goto L_0x002d
        L_0x0020:
            r3.mo41850j(r4, r5)     // Catch:{ SynchronizationException -> 0x0026 }
            goto L_0x002d
        L_0x0024:
            r4 = move-exception
            goto L_0x0031
        L_0x0026:
            ym7 r0 = r3.f28034d     // Catch:{ all -> 0x0024 }
            int r5 = r5 + 1
            r0.mo29439a(r4, r5)     // Catch:{ all -> 0x0024 }
        L_0x002d:
            r6.run()
            return
        L_0x0031:
            r6.run()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.d57.m43354i(hx6, int, java.lang.Runnable):void");
    }

    /* renamed from: e */
    public boolean mo41849e() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f28031a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public void mo41850j(hx6 hx6, int i) {
        BackendResponse b;
        gx6 gx6 = this.f28032b.get(hx6.mo43416b());
        Iterable<nn4> iterable = (Iterable) this.f28036f.mo29005a(new b57(this, hx6));
        if (iterable.iterator().hasNext()) {
            if (gx6 == null) {
                xk3.m54420a("Uploader", "Unknown backend for %s, deleting event batch for it...", hx6);
                b = BackendResponse.m33171a();
            } else {
                ArrayList arrayList = new ArrayList();
                for (nn4 b2 : iterable) {
                    arrayList.add(b2.mo43943b());
                }
                b = gx6.mo29924b(C6639vw.m53574a().mo29739b(arrayList).mo29740c(hx6.mo43417c()).mo29738a());
            }
            this.f28036f.mo29005a(new c57(this, b, iterable, hx6, i));
        }
    }

    /* renamed from: k */
    public void mo41851k(hx6 hx6, int i, Runnable runnable) {
        this.f28035e.execute(new y47(this, hx6, i, runnable));
    }
}
