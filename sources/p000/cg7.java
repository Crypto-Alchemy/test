package p000;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* renamed from: cg7 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class cg7 {

    /* renamed from: a */
    public static final long f21746a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    public static final Object f21747b = new Object();

    /* renamed from: c */
    public static bg7 f21748c;

    /* renamed from: a */
    public static void m32985a(Context context) {
        if (f21748c == null) {
            bg7 bg7 = new bg7(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f21748c = bg7;
            bg7.mo29573c(true);
        }
    }

    /* renamed from: b */
    public static void m32986b(Intent intent) {
        synchronized (f21747b) {
            if (f21748c != null && m32987c(intent)) {
                m32988d(intent, false);
                f21748c.mo29572b();
            }
        }
    }

    /* renamed from: c */
    public static boolean m32987c(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* renamed from: d */
    public static void m32988d(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        return r3;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ComponentName m32989e(android.content.Context r3, android.content.Intent r4) {
        /*
            java.lang.Object r0 = f21747b
            monitor-enter(r0)
            m32985a(r3)     // Catch:{ all -> 0x0022 }
            boolean r1 = m32987c(r4)     // Catch:{ all -> 0x0022 }
            r2 = 1
            m32988d(r4, r2)     // Catch:{ all -> 0x0022 }
            android.content.ComponentName r3 = r3.startService(r4)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x0017
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            r3 = 0
            return r3
        L_0x0017:
            if (r1 != 0) goto L_0x0020
            bg7 r4 = f21748c     // Catch:{ all -> 0x0022 }
            long r1 = f21746a     // Catch:{ all -> 0x0022 }
            r4.mo29571a(r1)     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r3
        L_0x0022:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cg7.m32989e(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
