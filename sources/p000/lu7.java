package p000;

import android.content.Context;

/* renamed from: lu7 */
public final class lu7 {

    /* renamed from: c */
    public static final pq7 f31403c = new pq7("PackageStateCache");

    /* renamed from: a */
    public final Context f31404a;

    /* renamed from: b */
    public int f31405b = -1;

    public lu7(Context context) {
        this.f31404a = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo45535a() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.f31405b     // Catch:{ all -> 0x0029 }
            r1 = -1
            if (r0 != r1) goto L_0x0025
            r0 = 0
            android.content.Context r1 = r3.f31404a     // Catch:{ NameNotFoundException -> 0x001c }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x001c }
            android.content.Context r2 = r3.f31404a     // Catch:{ NameNotFoundException -> 0x001c }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001c }
            android.content.pm.PackageInfo r1 = r2.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x001c }
            int r1 = r1.versionCode     // Catch:{ NameNotFoundException -> 0x001c }
            r3.f31405b = r1     // Catch:{ NameNotFoundException -> 0x001c }
            goto L_0x0025
        L_0x001c:
            pq7 r1 = f31403c     // Catch:{ all -> 0x0029 }
            java.lang.String r2 = "The current version of the app could not be retrieved"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0029 }
            r1.mo46853b(r2, r0)     // Catch:{ all -> 0x0029 }
        L_0x0025:
            int r0 = r3.f31405b     // Catch:{ all -> 0x0029 }
            monitor-exit(r3)
            return r0
        L_0x0029:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lu7.mo45535a():int");
    }
}
