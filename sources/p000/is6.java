package p000;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: is6 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class is6 {

    /* renamed from: j */
    public static final long f30106j = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a */
    public final Context f30107a;

    /* renamed from: b */
    public final zu3 f30108b;

    /* renamed from: c */
    public final oh2 f30109c;

    /* renamed from: d */
    public final FirebaseMessaging f30110d;

    /* renamed from: e */
    public final o22 f30111e;

    /* renamed from: f */
    public final Map<String, ArrayDeque<xl6<Void>>> f30112f = new C2781lq();

    /* renamed from: g */
    public final ScheduledExecutorService f30113g;

    /* renamed from: h */
    public boolean f30114h = false;

    /* renamed from: i */
    public final gs6 f30115i;

    public is6(FirebaseMessaging firebaseMessaging, o22 o22, zu3 zu3, gs6 gs6, oh2 oh2, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f30110d = firebaseMessaging;
        this.f30111e = o22;
        this.f30108b = zu3;
        this.f30115i = gs6;
        this.f30109c = oh2;
        this.f30107a = context;
        this.f30113g = scheduledExecutorService;
    }

    /* renamed from: a */
    public static <T> T m45934a(tl6<T> tl6) throws IOException {
        try {
            return jm6.m46616b(tl6, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException e2) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e2);
        }
    }

    /* renamed from: d */
    public static tl6<is6> m45935d(FirebaseMessaging firebaseMessaging, o22 o22, zu3 zu3, oh2 oh2, Context context, ScheduledExecutorService scheduledExecutorService) {
        return jm6.m46617c(scheduledExecutorService, new hs6(context, scheduledExecutorService, firebaseMessaging, o22, zu3, oh2));
    }

    /* renamed from: f */
    public static boolean m45936f() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static final /* synthetic */ is6 m45937h(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, o22 o22, zu3 zu3, oh2 oh2) throws Exception {
        return new is6(firebaseMessaging, o22, zu3, gs6.m44888a(context, scheduledExecutorService), oh2, context, scheduledExecutorService);
    }

    /* renamed from: b */
    public final void mo43905b(String str) throws IOException {
        m45934a(this.f30109c.mo46405k((String) m45934a(this.f30111e.getId()), this.f30110d.mo36209c(), str));
    }

    /* renamed from: c */
    public final void mo43906c(String str) throws IOException {
        m45934a(this.f30109c.mo46406l((String) m45934a(this.f30111e.getId()), this.f30110d.mo36209c(), str));
    }

    /* renamed from: e */
    public boolean mo43907e() {
        if (this.f30115i.mo42969b() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public synchronized boolean mo43908g() {
        return this.f30114h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43909i(p000.fs6 r5) {
        /*
            r4 = this;
            java.util.Map<java.lang.String, java.util.ArrayDeque<xl6<java.lang.Void>>> r0 = r4.f30112f
            monitor-enter(r0)
            java.lang.String r5 = r5.mo42654e()     // Catch:{ all -> 0x0032 }
            java.util.Map<java.lang.String, java.util.ArrayDeque<xl6<java.lang.Void>>> r1 = r4.f30112f     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.containsKey(r5)     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0011:
            java.util.Map<java.lang.String, java.util.ArrayDeque<xl6<java.lang.Void>>> r1 = r4.f30112f     // Catch:{ all -> 0x0032 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0032 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x0032 }
            java.lang.Object r2 = r1.poll()     // Catch:{ all -> 0x0032 }
            xl6 r2 = (p000.xl6) r2     // Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x0025
            r3 = 0
            r2.mo49505c(r3)     // Catch:{ all -> 0x0032 }
        L_0x0025:
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0030
            java.util.Map<java.lang.String, java.util.ArrayDeque<xl6<java.lang.Void>>> r1 = r4.f30112f     // Catch:{ all -> 0x0032 }
            r1.remove(r5)     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.is6.mo43909i(fs6):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007d A[Catch:{ IOException -> 0x00a9 }] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo43910j(p000.fs6 r6) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = r6.mo42652b()     // Catch:{ IOException -> 0x00a9 }
            int r2 = r1.hashCode()     // Catch:{ IOException -> 0x00a9 }
            r3 = 83
            r4 = 1
            if (r2 == r3) goto L_0x001d
            r3 = 85
            if (r2 == r3) goto L_0x0013
            goto L_0x0027
        L_0x0013:
            java.lang.String r2 = "U"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0027
            r1 = r4
            goto L_0x0028
        L_0x001d:
            java.lang.String r2 = "S"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0027
            r1 = r0
            goto L_0x0028
        L_0x0027:
            r1 = -1
        L_0x0028:
            java.lang.String r2 = " succeeded."
            if (r1 == 0) goto L_0x007d
            if (r1 == r4) goto L_0x0051
            boolean r1 = m45936f()     // Catch:{ IOException -> 0x00a9 }
            if (r1 == 0) goto L_0x00a8
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x00a9 }
            int r1 = r6.length()     // Catch:{ IOException -> 0x00a9 }
            int r1 = r1 + 24
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a9 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x00a9 }
            java.lang.String r1 = "Unknown topic operation"
            r2.append(r1)     // Catch:{ IOException -> 0x00a9 }
            r2.append(r6)     // Catch:{ IOException -> 0x00a9 }
            java.lang.String r6 = "."
            r2.append(r6)     // Catch:{ IOException -> 0x00a9 }
            goto L_0x00a8
        L_0x0051:
            java.lang.String r1 = r6.mo42653c()     // Catch:{ IOException -> 0x00a9 }
            r5.mo43906c(r1)     // Catch:{ IOException -> 0x00a9 }
            boolean r1 = m45936f()     // Catch:{ IOException -> 0x00a9 }
            if (r1 == 0) goto L_0x00a8
            java.lang.String r6 = r6.mo42653c()     // Catch:{ IOException -> 0x00a9 }
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x00a9 }
            int r1 = r1.length()     // Catch:{ IOException -> 0x00a9 }
            int r1 = r1 + 35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a9 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x00a9 }
            java.lang.String r1 = "Unsubscribe from topic: "
            r3.append(r1)     // Catch:{ IOException -> 0x00a9 }
            r3.append(r6)     // Catch:{ IOException -> 0x00a9 }
            r3.append(r2)     // Catch:{ IOException -> 0x00a9 }
            goto L_0x00a8
        L_0x007d:
            java.lang.String r1 = r6.mo42653c()     // Catch:{ IOException -> 0x00a9 }
            r5.mo43905b(r1)     // Catch:{ IOException -> 0x00a9 }
            boolean r1 = m45936f()     // Catch:{ IOException -> 0x00a9 }
            if (r1 == 0) goto L_0x00a8
            java.lang.String r6 = r6.mo42653c()     // Catch:{ IOException -> 0x00a9 }
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x00a9 }
            int r1 = r1.length()     // Catch:{ IOException -> 0x00a9 }
            int r1 = r1 + 31
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a9 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x00a9 }
            java.lang.String r1 = "Subscribe to topic: "
            r3.append(r1)     // Catch:{ IOException -> 0x00a9 }
            r3.append(r6)     // Catch:{ IOException -> 0x00a9 }
            r3.append(r2)     // Catch:{ IOException -> 0x00a9 }
        L_0x00a8:
            return r4
        L_0x00a9:
            r6 = move-exception
            java.lang.String r1 = r6.getMessage()
            java.lang.String r2 = "SERVICE_NOT_AVAILABLE"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x00cb
            java.lang.String r1 = r6.getMessage()
            java.lang.String r2 = "INTERNAL_SERVER_ERROR"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x00c3
            goto L_0x00cb
        L_0x00c3:
            java.lang.String r1 = r6.getMessage()
            if (r1 != 0) goto L_0x00ca
            return r0
        L_0x00ca:
            throw r6
        L_0x00cb:
            java.lang.String r6 = r6.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r6)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 53
            r2.<init>(r1)
            java.lang.String r1 = "Topic operation failed: "
            r2.append(r1)
            r2.append(r6)
            java.lang.String r6 = ". Will retry Topic operation."
            r2.append(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.is6.mo43910j(fs6):boolean");
    }

    /* renamed from: k */
    public void mo43911k(Runnable runnable, long j) {
        this.f30113g.schedule(runnable, j, TimeUnit.SECONDS);
    }

    /* renamed from: l */
    public synchronized void mo43912l(boolean z) {
        this.f30114h = z;
    }

    /* renamed from: m */
    public final void mo43913m() {
        if (!mo43908g()) {
            mo43916p(0);
        }
    }

    /* renamed from: n */
    public void mo43914n() {
        if (mo43907e()) {
            mo43913m();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (mo43910j(r0) != false) goto L_0x0019;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo43915o() throws java.io.IOException {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            gs6 r0 = r2.f30115i     // Catch:{ all -> 0x0022 }
            fs6 r0 = r0.mo42969b()     // Catch:{ all -> 0x0022 }
            if (r0 != 0) goto L_0x0010
            boolean r0 = m45936f()     // Catch:{ all -> 0x0022 }
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            r0 = 1
            return r0
        L_0x0010:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            boolean r1 = r2.mo43910j(r0)
            if (r1 != 0) goto L_0x0019
            r0 = 0
            return r0
        L_0x0019:
            gs6 r1 = r2.f30115i
            r1.mo42971d(r0)
            r2.mo43909i(r0)
            goto L_0x0000
        L_0x0022:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.is6.mo43915o():boolean");
    }

    /* renamed from: p */
    public void mo43916p(long j) {
        mo43911k(new js6(this, this.f30107a, this.f30108b, Math.min(Math.max(30, j + j), f30106j)), j);
        mo43912l(true);
    }
}
