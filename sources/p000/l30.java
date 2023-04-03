package p000;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: l30 */
/* compiled from: BlockingAnalyticsEventLogger */
public class l30 implements C6735yf, C6700xf {

    /* renamed from: a */
    public final yu0 f31169a;

    /* renamed from: b */
    public final int f31170b;

    /* renamed from: c */
    public final TimeUnit f31171c;

    /* renamed from: d */
    public final Object f31172d = new Object();

    /* renamed from: e */
    public CountDownLatch f31173e;

    /* renamed from: f */
    public boolean f31174f = false;

    public l30(yu0 yu0, int i, TimeUnit timeUnit) {
        this.f31169a = yu0;
        this.f31170b = i;
        this.f31171c = timeUnit;
    }

    /* renamed from: a */
    public void mo29868a(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f31173e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        p000.rk3.m51112f().mo47425d("Interrupted while awaiting app exception callback from Analytics listener.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x005f */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo45344b(java.lang.String r6, android.os.Bundle r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f31172d
            monitor-enter(r0)
            rk3 r1 = p000.rk3.m51112f()     // Catch:{ all -> 0x006d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r2.<init>()     // Catch:{ all -> 0x006d }
            java.lang.String r3 = "Logging event "
            r2.append(r3)     // Catch:{ all -> 0x006d }
            r2.append(r6)     // Catch:{ all -> 0x006d }
            java.lang.String r3 = " to Firebase Analytics with params "
            r2.append(r3)     // Catch:{ all -> 0x006d }
            r2.append(r7)     // Catch:{ all -> 0x006d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x006d }
            r1.mo47429i(r2)     // Catch:{ all -> 0x006d }
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x006d }
            r2 = 1
            r1.<init>(r2)     // Catch:{ all -> 0x006d }
            r5.f31173e = r1     // Catch:{ all -> 0x006d }
            r1 = 0
            r5.f31174f = r1     // Catch:{ all -> 0x006d }
            yu0 r1 = r5.f31169a     // Catch:{ all -> 0x006d }
            r1.mo45344b(r6, r7)     // Catch:{ all -> 0x006d }
            rk3 r6 = p000.rk3.m51112f()     // Catch:{ all -> 0x006d }
            java.lang.String r7 = "Awaiting app exception callback from Analytics..."
            r6.mo47429i(r7)     // Catch:{ all -> 0x006d }
            java.util.concurrent.CountDownLatch r6 = r5.f31173e     // Catch:{ InterruptedException -> 0x005f }
            int r7 = r5.f31170b     // Catch:{ InterruptedException -> 0x005f }
            long r3 = (long) r7     // Catch:{ InterruptedException -> 0x005f }
            java.util.concurrent.TimeUnit r7 = r5.f31171c     // Catch:{ InterruptedException -> 0x005f }
            boolean r6 = r6.await(r3, r7)     // Catch:{ InterruptedException -> 0x005f }
            if (r6 == 0) goto L_0x0055
            r5.f31174f = r2     // Catch:{ InterruptedException -> 0x005f }
            rk3 r6 = p000.rk3.m51112f()     // Catch:{ InterruptedException -> 0x005f }
            java.lang.String r7 = "App exception callback received from Analytics listener."
            r6.mo47429i(r7)     // Catch:{ InterruptedException -> 0x005f }
            goto L_0x0068
        L_0x0055:
            rk3 r6 = p000.rk3.m51112f()     // Catch:{ InterruptedException -> 0x005f }
            java.lang.String r7 = "Timeout exceeded while awaiting app exception callback from Analytics listener."
            r6.mo47431k(r7)     // Catch:{ InterruptedException -> 0x005f }
            goto L_0x0068
        L_0x005f:
            rk3 r6 = p000.rk3.m51112f()     // Catch:{ all -> 0x006d }
            java.lang.String r7 = "Interrupted while awaiting app exception callback from Analytics listener."
            r6.mo47425d(r7)     // Catch:{ all -> 0x006d }
        L_0x0068:
            r6 = 0
            r5.f31173e = r6     // Catch:{ all -> 0x006d }
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            return
        L_0x006d:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.l30.mo45344b(java.lang.String, android.os.Bundle):void");
    }
}
