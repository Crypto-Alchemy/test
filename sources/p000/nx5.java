package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: nx5 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class nx5 {

    /* renamed from: e */
    public static nx5 f32211e;

    /* renamed from: a */
    public String f32212a = null;

    /* renamed from: b */
    public Boolean f32213b = null;

    /* renamed from: c */
    public Boolean f32214c = null;

    /* renamed from: d */
    public final Queue<Intent> f32215d = new ArrayDeque();

    /* renamed from: b */
    public static synchronized nx5 m49067b() {
        nx5 nx5;
        synchronized (nx5.class) {
            if (f32211e == null) {
                f32211e = new nx5();
            }
            nx5 = f32211e;
        }
        return nx5;
    }

    /* renamed from: a */
    public final int mo46245a(Context context, Intent intent) {
        ComponentName componentName;
        String f = mo46249f(context, intent);
        if (f != null) {
            if (Log.isLoggable("FirebaseMessaging", 3) && f.length() != 0) {
                "Restricting intent to a specific service: ".concat(f);
            }
            intent.setClassName(context.getPackageName(), f);
        }
        try {
            if (mo46248e(context)) {
                componentName = cg7.m32989e(context, intent);
            } else {
                componentName = context.startService(intent);
            }
            if (componentName == null) {
                return 404;
            }
            return -1;
        } catch (SecurityException unused) {
            return 401;
        } catch (IllegalStateException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 45);
            sb.append("Failed to start service while in background: ");
            sb.append(valueOf);
            return 402;
        }
    }

    /* renamed from: c */
    public Intent mo46246c() {
        return this.f32215d.poll();
    }

    /* renamed from: d */
    public boolean mo46247d(Context context) {
        boolean z;
        if (this.f32214c == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f32214c = Boolean.valueOf(z);
        }
        boolean booleanValue = this.f32213b.booleanValue();
        return this.f32214c.booleanValue();
    }

    /* renamed from: e */
    public boolean mo46248e(Context context) {
        boolean z;
        if (this.f32213b == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f32213b = Boolean.valueOf(z);
        }
        boolean booleanValue = this.f32213b.booleanValue();
        return this.f32213b.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008b, code lost:
        return null;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String mo46249f(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = r4.f32212a     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)
            return r0
        L_0x0007:
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch:{ all -> 0x008c }
            r1 = 0
            android.content.pm.ResolveInfo r6 = r0.resolveService(r6, r1)     // Catch:{ all -> 0x008c }
            r0 = 0
            if (r6 == 0) goto L_0x008a
            android.content.pm.ServiceInfo r6 = r6.serviceInfo     // Catch:{ all -> 0x008c }
            if (r6 != 0) goto L_0x0019
            goto L_0x008a
        L_0x0019:
            java.lang.String r1 = r5.getPackageName()     // Catch:{ all -> 0x008c }
            java.lang.String r2 = r6.packageName     // Catch:{ all -> 0x008c }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x008c }
            if (r1 == 0) goto L_0x005c
            java.lang.String r1 = r6.name     // Catch:{ all -> 0x008c }
            if (r1 != 0) goto L_0x002a
            goto L_0x005c
        L_0x002a:
            java.lang.String r0 = "."
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x0054
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x008c }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x008c }
            java.lang.String r6 = r6.name     // Catch:{ all -> 0x008c }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x008c }
            int r0 = r6.length()     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x004b
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x008c }
            goto L_0x0051
        L_0x004b:
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x008c }
            r6.<init>(r5)     // Catch:{ all -> 0x008c }
            r5 = r6
        L_0x0051:
            r4.f32212a = r5     // Catch:{ all -> 0x008c }
            goto L_0x0058
        L_0x0054:
            java.lang.String r5 = r6.name     // Catch:{ all -> 0x008c }
            r4.f32212a = r5     // Catch:{ all -> 0x008c }
        L_0x0058:
            java.lang.String r5 = r4.f32212a     // Catch:{ all -> 0x008c }
            monitor-exit(r4)
            return r5
        L_0x005c:
            java.lang.String r5 = r6.packageName     // Catch:{ all -> 0x008c }
            java.lang.String r6 = r6.name     // Catch:{ all -> 0x008c }
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x008c }
            int r1 = r1.length()     // Catch:{ all -> 0x008c }
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x008c }
            int r2 = r2.length()     // Catch:{ all -> 0x008c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x008c }
            int r1 = r1 + 94
            int r1 = r1 + r2
            r3.<init>(r1)     // Catch:{ all -> 0x008c }
            java.lang.String r1 = "Error resolving target intent service, skipping classname enforcement. Resolved service was: "
            r3.append(r1)     // Catch:{ all -> 0x008c }
            r3.append(r5)     // Catch:{ all -> 0x008c }
            java.lang.String r5 = "/"
            r3.append(r5)     // Catch:{ all -> 0x008c }
            r3.append(r6)     // Catch:{ all -> 0x008c }
            monitor-exit(r4)
            return r0
        L_0x008a:
            monitor-exit(r4)
            return r0
        L_0x008c:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.nx5.mo46249f(android.content.Context, android.content.Intent):java.lang.String");
    }

    /* renamed from: g */
    public int mo46250g(Context context, Intent intent) {
        this.f32215d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return mo46245a(context, intent2);
    }
}
