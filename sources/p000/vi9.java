package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: vi9 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public abstract class vi9<T> {

    /* renamed from: a */
    public final Context f34955a;

    /* renamed from: b */
    public final Object f34956b = new Object();

    /* renamed from: c */
    public final String f34957c;

    /* renamed from: d */
    public final String f34958d;

    /* renamed from: e */
    public final String f34959e;

    /* renamed from: f */
    public boolean f34960f = false;

    /* renamed from: g */
    public boolean f34961g = false;

    /* renamed from: h */
    public T f34962h;

    public vi9(Context context, String str, String str2) {
        String str3;
        this.f34955a = context;
        this.f34957c = str;
        String valueOf = String.valueOf(str2);
        if (valueOf.length() != 0) {
            str3 = "com.google.android.gms.vision.dynamite.".concat(valueOf);
        } else {
            str3 = new String("com.google.android.gms.vision.dynamite.");
        }
        this.f34958d = str3;
        this.f34959e = str2;
    }

    /* renamed from: a */
    public abstract T mo43108a(DynamiteModule dynamiteModule, Context context) throws RemoteException, DynamiteModule.LoadingException;

    /* renamed from: b */
    public abstract void mo43109b() throws RemoteException;

    /* renamed from: c */
    public final boolean mo48751c() {
        if (mo48753e() != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x000c */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48752d() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f34956b
            monitor-enter(r0)
            T r1 = r2.f34962h     // Catch:{ all -> 0x000e }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            return
        L_0x0009:
            r2.mo43109b()     // Catch:{ RemoteException -> 0x000c }
        L_0x000c:
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            return
        L_0x000e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vi9.mo48752d():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:7|8|9|(2:23|24)|25|26|(1:(1:32))(1:30)|33|34|35) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x007c */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0084 A[Catch:{ LoadingException -> 0x0016 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087 A[Catch:{ LoadingException -> 0x0016 }] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"context", "thickFeatureName", "featureName"})
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo48753e() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f34956b
            monitor-enter(r0)
            T r1 = r8.f34962h     // Catch:{ all -> 0x008f }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x008f }
            return r1
        L_0x0009:
            r1 = 0
            r2 = 1
            android.content.Context r3 = r8.f34955a     // Catch:{ LoadingException -> 0x0016 }
            com.google.android.gms.dynamite.DynamiteModule$a r4 = com.google.android.gms.dynamite.DynamiteModule.f22425g     // Catch:{ LoadingException -> 0x0016 }
            java.lang.String r5 = r8.f34958d     // Catch:{ LoadingException -> 0x0016 }
            com.google.android.gms.dynamite.DynamiteModule r1 = com.google.android.gms.dynamite.DynamiteModule.m33818d(r3, r4, r5)     // Catch:{ LoadingException -> 0x0016 }
            goto L_0x0072
        L_0x0016:
            java.lang.String r3 = "%s.%s"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x008f }
            java.lang.String r5 = "com.google.android.gms.vision"
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x008f }
            java.lang.String r5 = r8.f34959e     // Catch:{ all -> 0x008f }
            r4[r2] = r5     // Catch:{ all -> 0x008f }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x008f }
            java.lang.String r4 = "Cannot load thick client module, fall back to load optional module %s"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x008f }
            r5[r6] = r3     // Catch:{ all -> 0x008f }
            p000.fd3.m44252a(r4, r5)     // Catch:{ all -> 0x008f }
            android.content.Context r4 = r8.f34955a     // Catch:{ LoadingException -> 0x003a }
            com.google.android.gms.dynamite.DynamiteModule$a r5 = com.google.android.gms.dynamite.DynamiteModule.f22420b     // Catch:{ LoadingException -> 0x003a }
            com.google.android.gms.dynamite.DynamiteModule r1 = com.google.android.gms.dynamite.DynamiteModule.m33818d(r4, r5, r3)     // Catch:{ LoadingException -> 0x003a }
            goto L_0x0072
        L_0x003a:
            r4 = move-exception
            java.lang.String r5 = "Error loading optional module %s"
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x008f }
            r7[r6] = r3     // Catch:{ all -> 0x008f }
            p000.fd3.m44254c(r4, r5, r7)     // Catch:{ all -> 0x008f }
            boolean r3 = r8.f34960f     // Catch:{ all -> 0x008f }
            if (r3 != 0) goto L_0x0072
            java.lang.String r3 = "Broadcasting download intent for dependency %s"
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x008f }
            java.lang.String r5 = r8.f34959e     // Catch:{ all -> 0x008f }
            r4[r6] = r5     // Catch:{ all -> 0x008f }
            p000.fd3.m44252a(r3, r4)     // Catch:{ all -> 0x008f }
            java.lang.String r3 = r8.f34959e     // Catch:{ all -> 0x008f }
            android.content.Intent r4 = new android.content.Intent     // Catch:{ all -> 0x008f }
            r4.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r5 = "com.google.android.gms"
            java.lang.String r6 = "com.google.android.gms.vision.DependencyBroadcastReceiverProxy"
            r4.setClassName(r5, r6)     // Catch:{ all -> 0x008f }
            java.lang.String r5 = "com.google.android.gms.vision.DEPENDENCIES"
            r4.putExtra(r5, r3)     // Catch:{ all -> 0x008f }
            java.lang.String r3 = "com.google.android.gms.vision.DEPENDENCY"
            r4.setAction(r3)     // Catch:{ all -> 0x008f }
            android.content.Context r3 = r8.f34955a     // Catch:{ all -> 0x008f }
            r3.sendBroadcast(r4)     // Catch:{ all -> 0x008f }
            r8.f34960f = r2     // Catch:{ all -> 0x008f }
        L_0x0072:
            if (r1 == 0) goto L_0x007c
            android.content.Context r3 = r8.f34955a     // Catch:{ RemoteException | LoadingException -> 0x007c }
            java.lang.Object r1 = r8.mo43108a(r1, r3)     // Catch:{ RemoteException | LoadingException -> 0x007c }
            r8.f34962h = r1     // Catch:{ RemoteException | LoadingException -> 0x007c }
        L_0x007c:
            boolean r1 = r8.f34961g     // Catch:{ all -> 0x008f }
            if (r1 != 0) goto L_0x0087
            T r3 = r8.f34962h     // Catch:{ all -> 0x008f }
            if (r3 != 0) goto L_0x0087
            r8.f34961g = r2     // Catch:{ all -> 0x008f }
            goto L_0x008b
        L_0x0087:
            if (r1 == 0) goto L_0x008b
            T r1 = r8.f34962h     // Catch:{ all -> 0x008f }
        L_0x008b:
            T r1 = r8.f34962h     // Catch:{ all -> 0x008f }
            monitor-exit(r0)     // Catch:{ all -> 0x008f }
            return r1
        L_0x008f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vi9.mo48753e():java.lang.Object");
    }
}
