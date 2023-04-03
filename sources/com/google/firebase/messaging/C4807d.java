package com.google.firebase.messaging;

import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.d */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class C4807d {

    /* renamed from: a */
    public final Executor f25450a;

    /* renamed from: b */
    public final Map<String, tl6<String>> f25451b = new C2781lq();

    /* renamed from: com.google.firebase.messaging.d$a */
    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    public interface C4808a {
        tl6<String> start();
    }

    public C4807d(Executor executor) {
        this.f25450a = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p000.tl6<java.lang.String> mo36272a(java.lang.String r4, com.google.firebase.messaging.C4807d.C4808a r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Map<java.lang.String, tl6<java.lang.String>> r0 = r3.f25451b     // Catch:{ all -> 0x0052 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0052 }
            tl6 r0 = (p000.tl6) r0     // Catch:{ all -> 0x0052 }
            r1 = 3
            if (r0 == 0) goto L_0x0025
            java.lang.String r5 = "FirebaseMessaging"
            boolean r5 = android.util.Log.isLoggable(r5, r1)     // Catch:{ all -> 0x0052 }
            if (r5 == 0) goto L_0x0023
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0052 }
            java.lang.String r5 = "Joining ongoing request for: "
            int r1 = r4.length()     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0023
            r5.concat(r4)     // Catch:{ all -> 0x0052 }
        L_0x0023:
            monitor-exit(r3)
            return r0
        L_0x0025:
            java.lang.String r0 = "FirebaseMessaging"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0052 }
            java.lang.String r1 = "Making new request for: "
            int r2 = r0.length()     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x003c
            r1.concat(r0)     // Catch:{ all -> 0x0052 }
        L_0x003c:
            tl6 r5 = r5.start()     // Catch:{ all -> 0x0052 }
            java.util.concurrent.Executor r0 = r3.f25450a     // Catch:{ all -> 0x0052 }
            de5 r1 = new de5     // Catch:{ all -> 0x0052 }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x0052 }
            tl6 r5 = r5.mo48139j(r0, r1)     // Catch:{ all -> 0x0052 }
            java.util.Map<java.lang.String, tl6<java.lang.String>> r0 = r3.f25451b     // Catch:{ all -> 0x0052 }
            r0.put(r4, r5)     // Catch:{ all -> 0x0052 }
            monitor-exit(r3)
            return r5
        L_0x0052:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C4807d.mo36272a(java.lang.String, com.google.firebase.messaging.d$a):tl6");
    }

    /* renamed from: b */
    public final /* synthetic */ tl6 mo36273b(String str, tl6 tl6) throws Exception {
        synchronized (this) {
            this.f25451b.remove(str);
        }
        return tl6;
    }
}
