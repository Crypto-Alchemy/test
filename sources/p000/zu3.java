package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: zu3 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class zu3 {

    /* renamed from: a */
    public final Context f36277a;

    /* renamed from: b */
    public String f36278b;

    /* renamed from: c */
    public String f36279c;

    /* renamed from: d */
    public int f36280d;

    /* renamed from: e */
    public int f36281e = 0;

    public zu3(Context context) {
        this.f36277a = context;
    }

    /* renamed from: c */
    public static String m55265c(f22 f22) {
        String d = f22.mo42488k().mo29853d();
        if (d != null) {
            return d;
        }
        String c = f22.mo42488k().mo29852c();
        if (!c.startsWith("1:")) {
            return c;
        }
        String[] split = c.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public synchronized String mo49976a() {
        if (this.f36278b == null) {
            mo49982h();
        }
        return this.f36278b;
    }

    /* renamed from: b */
    public synchronized String mo49977b() {
        if (this.f36279c == null) {
            mo49982h();
        }
        return this.f36279c;
    }

    /* renamed from: d */
    public synchronized int mo49978d() {
        PackageInfo f;
        if (this.f36280d == 0 && (f = mo49980f("com.google.android.gms")) != null) {
            this.f36280d = f.versionCode;
        }
        return this.f36280d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006a, code lost:
        return r2;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int mo49979e() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f36281e     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)
            return r0
        L_0x0007:
            android.content.Context r0 = r5.f36277a     // Catch:{ all -> 0x006b }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x006b }
            java.lang.String r1 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r2 = "com.google.android.gms"
            int r1 = r0.checkPermission(r1, r2)     // Catch:{ all -> 0x006b }
            r2 = -1
            r3 = 0
            if (r1 != r2) goto L_0x001b
            monitor-exit(r5)
            return r3
        L_0x001b:
            boolean r1 = p000.xp4.m54483h()     // Catch:{ all -> 0x006b }
            r2 = 1
            if (r1 != 0) goto L_0x003f
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x006b }
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r1.<init>(r4)     // Catch:{ all -> 0x006b }
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch:{ all -> 0x006b }
            java.util.List r1 = r0.queryIntentServices(r1, r3)     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x003f
            int r1 = r1.size()     // Catch:{ all -> 0x006b }
            if (r1 > 0) goto L_0x003b
            goto L_0x003f
        L_0x003b:
            r5.f36281e = r2     // Catch:{ all -> 0x006b }
            monitor-exit(r5)
            return r2
        L_0x003f:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x006b }
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r1.<init>(r4)     // Catch:{ all -> 0x006b }
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch:{ all -> 0x006b }
            java.util.List r0 = r0.queryBroadcastReceivers(r1, r3)     // Catch:{ all -> 0x006b }
            r1 = 2
            if (r0 == 0) goto L_0x005d
            int r0 = r0.size()     // Catch:{ all -> 0x006b }
            if (r0 > 0) goto L_0x0059
            goto L_0x005d
        L_0x0059:
            r5.f36281e = r1     // Catch:{ all -> 0x006b }
            monitor-exit(r5)
            return r1
        L_0x005d:
            boolean r0 = p000.xp4.m54483h()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0067
            r5.f36281e = r1     // Catch:{ all -> 0x006b }
            r2 = r1
            goto L_0x0069
        L_0x0067:
            r5.f36281e = r2     // Catch:{ all -> 0x006b }
        L_0x0069:
            monitor-exit(r5)
            return r2
        L_0x006b:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zu3.mo49979e():int");
    }

    /* renamed from: f */
    public final PackageInfo mo49980f(String str) {
        try {
            return this.f36277a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            return null;
        }
    }

    /* renamed from: g */
    public boolean mo49981g() {
        if (mo49979e() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final synchronized void mo49982h() {
        PackageInfo f = mo49980f(this.f36277a.getPackageName());
        if (f != null) {
            this.f36278b = Integer.toString(f.versionCode);
            this.f36279c = f.versionName;
        }
    }
}
