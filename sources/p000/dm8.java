package p000;

import java.util.List;

/* renamed from: dm8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class dm8 extends qo8 {

    /* renamed from: c */
    public String f28253c;

    /* renamed from: d */
    public String f28254d;

    /* renamed from: e */
    public int f28255e;

    /* renamed from: f */
    public String f28256f;

    /* renamed from: g */
    public String f28257g;

    /* renamed from: h */
    public long f28258h;

    /* renamed from: i */
    public final long f28259i;

    /* renamed from: j */
    public List<String> f28260j;

    /* renamed from: k */
    public int f28261k;

    /* renamed from: l */
    public String f28262l;

    /* renamed from: m */
    public String f28263m;

    /* renamed from: n */
    public String f28264n;

    public dm8(kr8 kr8, long j) {
        super(kr8);
        this.f28259i = j;
    }

    /* renamed from: j */
    public final boolean mo41976j() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x018e A[Catch:{ IllegalStateException -> 0x0231 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0190 A[Catch:{ IllegalStateException -> 0x0231 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01a6 A[SYNTHETIC, Splitter:B:56:0x01a6] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01e6 A[Catch:{ IllegalStateException -> 0x0231 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0212 A[Catch:{ IllegalStateException -> 0x0231 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02a1  */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41977k() {
        /*
            r13 = this;
            kr8 r0 = r13.f34342a
            android.content.Context r0 = r0.mo45271q()
            java.lang.String r0 = r0.getPackageName()
            kr8 r1 = r13.f34342a
            android.content.Context r1 = r1.mo45271q()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "Unknown"
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 0
            java.lang.String r5 = ""
            java.lang.String r6 = "unknown"
            if (r1 != 0) goto L_0x0035
            kr8 r7 = r13.f34342a
            bn8 r7 = r7.mo45237A()
            vm8 r7 = r7.mo29670l()
            java.lang.Object r8 = p000.bn8.m32664w(r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.mo48770b(r9, r8)
        L_0x0032:
            r8 = r2
            goto L_0x009b
        L_0x0035:
            java.lang.String r6 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x003a }
            goto L_0x004d
        L_0x003a:
            kr8 r7 = r13.f34342a
            bn8 r7 = r7.mo45237A()
            vm8 r7 = r7.mo29670l()
            java.lang.Object r8 = p000.bn8.m32664w(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.mo48770b(r9, r8)
        L_0x004d:
            if (r6 != 0) goto L_0x0052
            java.lang.String r6 = "manual_install"
            goto L_0x005b
        L_0x0052:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x005b
            r6 = r5
        L_0x005b:
            kr8 r7 = r13.f34342a     // Catch:{ NameNotFoundException -> 0x0085 }
            android.content.Context r7 = r7.mo45271q()     // Catch:{ NameNotFoundException -> 0x0085 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0085 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x0085 }
            if (r7 == 0) goto L_0x0032
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0085 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0085 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0085 }
            if (r9 != 0) goto L_0x007c
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0085 }
            goto L_0x007d
        L_0x007c:
            r8 = r2
        L_0x007d:
            java.lang.String r2 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0082 }
            int r3 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0082 }
            goto L_0x009b
        L_0x0082:
            r7 = r2
            r2 = r8
            goto L_0x0086
        L_0x0085:
            r7 = r2
        L_0x0086:
            kr8 r8 = r13.f34342a
            bn8 r8 = r8.mo45237A()
            vm8 r8 = r8.mo29670l()
            java.lang.Object r9 = p000.bn8.m32664w(r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.mo48771c(r10, r9, r2)
            r8 = r2
            r2 = r7
        L_0x009b:
            r13.f28253c = r0
            r13.f28256f = r6
            r13.f28254d = r2
            r13.f28255e = r3
            r13.f28257g = r8
            r2 = 0
            r13.f28258h = r2
            kr8 r2 = r13.f34342a
            java.lang.String r2 = r2.mo45248L()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 1
            if (r2 != 0) goto L_0x00c6
            kr8 r2 = r13.f34342a
            java.lang.String r2 = r2.mo45249M()
            java.lang.String r6 = "am"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x00c6
            r2 = r3
            goto L_0x00c7
        L_0x00c6:
            r2 = r4
        L_0x00c7:
            kr8 r6 = r13.f34342a
            int r6 = r6.mo45263i()
            switch(r6) {
                case 0: goto L_0x0151;
                case 1: goto L_0x0141;
                case 2: goto L_0x0131;
                case 3: goto L_0x0121;
                case 4: goto L_0x0111;
                case 5: goto L_0x0101;
                case 6: goto L_0x00f1;
                case 7: goto L_0x00e1;
                default: goto L_0x00d0;
            }
        L_0x00d0:
            kr8 r7 = r13.f34342a
            bn8 r7 = r7.mo45237A()
            vm8 r7 = r7.mo29676t()
            java.lang.String r8 = "App measurement disabled due to denied storage consent"
            r7.mo48769a(r8)
            goto L_0x0160
        L_0x00e1:
            kr8 r7 = r13.f34342a
            bn8 r7 = r7.mo45237A()
            vm8 r7 = r7.mo29676t()
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            r7.mo48769a(r8)
            goto L_0x0160
        L_0x00f1:
            kr8 r7 = r13.f34342a
            bn8 r7 = r7.mo45237A()
            vm8 r7 = r7.mo29675r()
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            r7.mo48769a(r8)
            goto L_0x0160
        L_0x0101:
            kr8 r7 = r13.f34342a
            bn8 r7 = r7.mo45237A()
            vm8 r7 = r7.mo29678v()
            java.lang.String r8 = "App measurement disabled via the init parameters"
            r7.mo48769a(r8)
            goto L_0x0160
        L_0x0111:
            kr8 r7 = r13.f34342a
            bn8 r7 = r7.mo45237A()
            vm8 r7 = r7.mo29676t()
            java.lang.String r8 = "App measurement disabled via the manifest"
            r7.mo48769a(r8)
            goto L_0x0160
        L_0x0121:
            kr8 r7 = r13.f34342a
            bn8 r7 = r7.mo45237A()
            vm8 r7 = r7.mo29676t()
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            r7.mo48769a(r8)
            goto L_0x0160
        L_0x0131:
            kr8 r7 = r13.f34342a
            bn8 r7 = r7.mo45237A()
            vm8 r7 = r7.mo29678v()
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            r7.mo48769a(r8)
            goto L_0x0160
        L_0x0141:
            kr8 r7 = r13.f34342a
            bn8 r7 = r7.mo45237A()
            vm8 r7 = r7.mo29676t()
            java.lang.String r8 = "App measurement deactivated via the manifest"
            r7.mo48769a(r8)
            goto L_0x0160
        L_0x0151:
            kr8 r7 = r13.f34342a
            bn8 r7 = r7.mo45237A()
            vm8 r7 = r7.mo29678v()
            java.lang.String r8 = "App measurement collection enabled"
            r7.mo48769a(r8)
        L_0x0160:
            r13.f28262l = r5
            r13.f28263m = r5
            r13.f28264n = r5
            kr8 r7 = r13.f34342a
            r7.mo45257b()
            if (r2 == 0) goto L_0x0175
            kr8 r2 = r13.f34342a
            java.lang.String r2 = r2.mo45248L()
            r13.f28263m = r2
        L_0x0175:
            r2 = 0
            kr8 r7 = r13.f34342a     // Catch:{ IllegalStateException -> 0x0231 }
            android.content.Context r7 = r7.mo45271q()     // Catch:{ IllegalStateException -> 0x0231 }
            kr8 r8 = r13.f34342a     // Catch:{ IllegalStateException -> 0x0231 }
            java.lang.String r8 = r8.mo45252P()     // Catch:{ IllegalStateException -> 0x0231 }
            java.lang.String r9 = "google_app_id"
            java.lang.String r7 = p000.ry8.m51436a(r7, r9, r8)     // Catch:{ IllegalStateException -> 0x0231 }
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x0231 }
            if (r3 == r8) goto L_0x0190
            r8 = r7
            goto L_0x0191
        L_0x0190:
            r8 = r5
        L_0x0191:
            r13.f28262l = r8     // Catch:{ IllegalStateException -> 0x0231 }
            p000.le9.m47797a()     // Catch:{ IllegalStateException -> 0x0231 }
            kr8 r8 = r13.f34342a     // Catch:{ IllegalStateException -> 0x0231 }
            n68 r8 = r8.mo45274y()     // Catch:{ IllegalStateException -> 0x0231 }
            uk8<java.lang.Boolean> r9 = p000.rl8.f33501i0     // Catch:{ IllegalStateException -> 0x0231 }
            boolean r8 = r8.mo45997v(r2, r9)     // Catch:{ IllegalStateException -> 0x0231 }
            java.lang.String r9 = "admob_app_id"
            if (r8 == 0) goto L_0x01e6
            kr8 r8 = r13.f34342a     // Catch:{ IllegalStateException -> 0x0231 }
            android.content.Context r8 = r8.mo45271q()     // Catch:{ IllegalStateException -> 0x0231 }
            kr8 r10 = r13.f34342a     // Catch:{ IllegalStateException -> 0x0231 }
            java.lang.String r10 = r10.mo45252P()     // Catch:{ IllegalStateException -> 0x0231 }
            p000.cu4.m43221k(r8)     // Catch:{ IllegalStateException -> 0x0231 }
            android.content.res.Resources r11 = r8.getResources()     // Catch:{ IllegalStateException -> 0x0231 }
            boolean r12 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IllegalStateException -> 0x0231 }
            if (r12 != 0) goto L_0x01c0
            goto L_0x01c4
        L_0x01c0:
            java.lang.String r10 = p000.sq8.m51887a(r8)     // Catch:{ IllegalStateException -> 0x0231 }
        L_0x01c4:
            java.lang.String r8 = "ga_app_id"
            java.lang.String r8 = p000.sq8.m51888b(r8, r11, r10)     // Catch:{ IllegalStateException -> 0x0231 }
            boolean r12 = android.text.TextUtils.isEmpty(r8)     // Catch:{ IllegalStateException -> 0x0231 }
            if (r3 == r12) goto L_0x01d1
            r5 = r8
        L_0x01d1:
            r13.f28264n = r5     // Catch:{ IllegalStateException -> 0x0231 }
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x0231 }
            if (r3 == 0) goto L_0x01df
            boolean r3 = android.text.TextUtils.isEmpty(r8)     // Catch:{ IllegalStateException -> 0x0231 }
            if (r3 != 0) goto L_0x0210
        L_0x01df:
            java.lang.String r3 = p000.sq8.m51888b(r9, r11, r10)     // Catch:{ IllegalStateException -> 0x0231 }
            r13.f28263m = r3     // Catch:{ IllegalStateException -> 0x0231 }
            goto L_0x0210
        L_0x01e6:
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x0231 }
            if (r3 != 0) goto L_0x0210
            kr8 r3 = r13.f34342a     // Catch:{ IllegalStateException -> 0x0231 }
            android.content.Context r3 = r3.mo45271q()     // Catch:{ IllegalStateException -> 0x0231 }
            kr8 r5 = r13.f34342a     // Catch:{ IllegalStateException -> 0x0231 }
            java.lang.String r5 = r5.mo45252P()     // Catch:{ IllegalStateException -> 0x0231 }
            p000.cu4.m43221k(r3)     // Catch:{ IllegalStateException -> 0x0231 }
            android.content.res.Resources r7 = r3.getResources()     // Catch:{ IllegalStateException -> 0x0231 }
            boolean r8 = android.text.TextUtils.isEmpty(r5)     // Catch:{ IllegalStateException -> 0x0231 }
            if (r8 != 0) goto L_0x0206
            goto L_0x020a
        L_0x0206:
            java.lang.String r5 = p000.sq8.m51887a(r3)     // Catch:{ IllegalStateException -> 0x0231 }
        L_0x020a:
            java.lang.String r3 = p000.sq8.m51888b(r9, r7, r5)     // Catch:{ IllegalStateException -> 0x0231 }
            r13.f28263m = r3     // Catch:{ IllegalStateException -> 0x0231 }
        L_0x0210:
            if (r6 != 0) goto L_0x0245
            kr8 r3 = r13.f34342a     // Catch:{ IllegalStateException -> 0x0231 }
            bn8 r3 = r3.mo45237A()     // Catch:{ IllegalStateException -> 0x0231 }
            vm8 r3 = r3.mo29678v()     // Catch:{ IllegalStateException -> 0x0231 }
            java.lang.String r5 = "App measurement enabled for app package, google app id"
            java.lang.String r6 = r13.f28253c     // Catch:{ IllegalStateException -> 0x0231 }
            java.lang.String r7 = r13.f28262l     // Catch:{ IllegalStateException -> 0x0231 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x0231 }
            if (r7 == 0) goto L_0x022b
            java.lang.String r7 = r13.f28263m     // Catch:{ IllegalStateException -> 0x0231 }
            goto L_0x022d
        L_0x022b:
            java.lang.String r7 = r13.f28262l     // Catch:{ IllegalStateException -> 0x0231 }
        L_0x022d:
            r3.mo48771c(r5, r6, r7)     // Catch:{ IllegalStateException -> 0x0231 }
            goto L_0x0245
        L_0x0231:
            r3 = move-exception
            kr8 r5 = r13.f34342a
            bn8 r5 = r5.mo45237A()
            vm8 r5 = r5.mo29670l()
            java.lang.Object r0 = p000.bn8.m32664w(r0)
            java.lang.String r6 = "Fetching Google App Id failed with exception. appId"
            r5.mo48771c(r6, r0, r3)
        L_0x0245:
            r13.f28260j = r2
            kr8 r0 = r13.f34342a
            r0.mo45257b()
            kr8 r0 = r13.f34342a
            n68 r0 = r0.mo45274y()
            java.lang.String r2 = "analytics.safelisted_events"
            java.util.List r0 = r0.mo46000y(r2)
            if (r0 != 0) goto L_0x025b
            goto L_0x0290
        L_0x025b:
            int r2 = r0.size()
            if (r2 != 0) goto L_0x0271
            kr8 r0 = r13.f34342a
            bn8 r0 = r0.mo45237A()
            vm8 r0 = r0.mo29675r()
            java.lang.String r2 = "Safelisted event list is empty. Ignoring"
            r0.mo48769a(r2)
            goto L_0x0292
        L_0x0271:
            java.util.Iterator r2 = r0.iterator()
        L_0x0275:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0290
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            kr8 r5 = r13.f34342a
            g69 r5 = r5.mo45243G()
            java.lang.String r6 = "safelisted event"
            boolean r3 = r5.mo42818m0(r6, r3)
            if (r3 != 0) goto L_0x0275
            goto L_0x0292
        L_0x0290:
            r13.f28260j = r0
        L_0x0292:
            if (r1 == 0) goto L_0x02a1
            kr8 r0 = r13.f34342a
            android.content.Context r0 = r0.mo45271q()
            boolean r0 = p000.dw2.m43717a(r0)
            r13.f28261k = r0
            return
        L_0x02a1:
            r13.f28261k = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dm8.mo41977k():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0201  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzp mo41978l(java.lang.String r35) {
        /*
            r34 = this;
            r1 = r34
            r34.mo29006e()
            com.google.android.gms.measurement.internal.zzp r31 = new com.google.android.gms.measurement.internal.zzp
            java.lang.String r3 = r34.mo41979m()
            java.lang.String r4 = r34.mo41980n()
            r34.mo47219g()
            java.lang.String r5 = r1.f28254d
            r34.mo47219g()
            int r0 = r1.f28255e
            long r6 = (long) r0
            r34.mo47219g()
            java.lang.String r0 = r1.f28256f
            p000.cu4.m43221k(r0)
            java.lang.String r8 = r1.f28256f
            kr8 r0 = r1.f34342a
            n68 r0 = r0.mo45274y()
            r0.mo45990m()
            r34.mo47219g()
            r34.mo29006e()
            long r9 = r1.f28258h
            r11 = 0
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r2 = 0
            if (r0 != 0) goto L_0x00d0
            kr8 r0 = r1.f34342a
            g69 r9 = r0.mo45243G()
            kr8 r0 = r1.f34342a
            android.content.Context r0 = r0.mo45271q()
            kr8 r10 = r1.f34342a
            android.content.Context r10 = r10.mo45271q()
            java.lang.String r10 = r10.getPackageName()
            r9.mo29006e()
            p000.cu4.m43221k(r0)
            p000.cu4.m43217g(r10)
            android.content.pm.PackageManager r13 = r0.getPackageManager()
            java.security.MessageDigest r14 = p000.g69.m44574B()
            r15 = -1
            if (r14 != 0) goto L_0x0078
            kr8 r0 = r9.f34342a
            bn8 r0 = r0.mo45237A()
            vm8 r0 = r0.mo29670l()
            java.lang.String r9 = "Could not get MD5 instance"
            r0.mo48769a(r9)
        L_0x0076:
            r9 = r15
            goto L_0x00ce
        L_0x0078:
            if (r13 == 0) goto L_0x00cd
            boolean r10 = r9.mo42795K(r0, r10)     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r10 != 0) goto L_0x00bb
            mk4 r0 = p000.tn7.m52384a(r0)     // Catch:{ NameNotFoundException -> 0x00bd }
            kr8 r10 = r9.f34342a     // Catch:{ NameNotFoundException -> 0x00bd }
            android.content.Context r10 = r10.mo45271q()     // Catch:{ NameNotFoundException -> 0x00bd }
            java.lang.String r10 = r10.getPackageName()     // Catch:{ NameNotFoundException -> 0x00bd }
            r13 = 64
            android.content.pm.PackageInfo r0 = r0.mo45811e(r10, r13)     // Catch:{ NameNotFoundException -> 0x00bd }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r0 == 0) goto L_0x00ab
            int r10 = r0.length     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r10 <= 0) goto L_0x00ab
            r0 = r0[r2]     // Catch:{ NameNotFoundException -> 0x00bd }
            byte[] r0 = r0.toByteArray()     // Catch:{ NameNotFoundException -> 0x00bd }
            byte[] r0 = r14.digest(r0)     // Catch:{ NameNotFoundException -> 0x00bd }
            long r9 = p000.g69.m44575C(r0)     // Catch:{ NameNotFoundException -> 0x00bd }
            r15 = r9
            goto L_0x0076
        L_0x00ab:
            kr8 r0 = r9.f34342a     // Catch:{ NameNotFoundException -> 0x00bd }
            bn8 r0 = r0.mo45237A()     // Catch:{ NameNotFoundException -> 0x00bd }
            vm8 r0 = r0.mo29673o()     // Catch:{ NameNotFoundException -> 0x00bd }
            java.lang.String r10 = "Could not get signatures"
            r0.mo48769a(r10)     // Catch:{ NameNotFoundException -> 0x00bd }
            goto L_0x0076
        L_0x00bb:
            r15 = r11
            goto L_0x0076
        L_0x00bd:
            r0 = move-exception
            kr8 r9 = r9.f34342a
            bn8 r9 = r9.mo45237A()
            vm8 r9 = r9.mo29670l()
            java.lang.String r10 = "Package name not found"
            r9.mo48770b(r10, r0)
        L_0x00cd:
            r9 = r11
        L_0x00ce:
            r1.f28258h = r9
        L_0x00d0:
            r13 = r9
            kr8 r0 = r1.f34342a
            boolean r0 = r0.mo45262h()
            kr8 r9 = r1.f34342a
            lp8 r9 = r9.mo45275z()
            boolean r9 = r9.f31367p
            r10 = 1
            r15 = r9 ^ 1
            r34.mo29006e()
            kr8 r9 = r1.f34342a
            boolean r9 = r9.mo45262h()
            r11 = 0
            if (r9 != 0) goto L_0x00f2
        L_0x00ee:
            r20 = r11
            goto L_0x0178
        L_0x00f2:
            p000.hh9.m45258a()
            kr8 r9 = r1.f34342a
            n68 r9 = r9.mo45274y()
            uk8<java.lang.Boolean> r12 = p000.rl8.f33505k0
            boolean r9 = r9.mo45997v(r11, r12)
            if (r9 == 0) goto L_0x0113
            kr8 r9 = r1.f34342a
            bn8 r9 = r9.mo45237A()
            vm8 r9 = r9.mo29678v()
            java.lang.String r12 = "Disabled IID for tests."
            r9.mo48769a(r12)
            goto L_0x00ee
        L_0x0113:
            kr8 r9 = r1.f34342a     // Catch:{ ClassNotFoundException -> 0x0176 }
            android.content.Context r9 = r9.mo45271q()     // Catch:{ ClassNotFoundException -> 0x0176 }
            java.lang.ClassLoader r9 = r9.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0176 }
            java.lang.String r12 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r9 = r9.loadClass(r12)     // Catch:{ ClassNotFoundException -> 0x0176 }
            if (r9 != 0) goto L_0x0126
            goto L_0x00ee
        L_0x0126:
            java.lang.Class[] r12 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0167 }
            java.lang.Class<android.content.Context> r18 = android.content.Context.class
            r12[r2] = r18     // Catch:{ Exception -> 0x0167 }
            java.lang.String r11 = "getInstance"
            java.lang.reflect.Method r11 = r9.getDeclaredMethod(r11, r12)     // Catch:{ Exception -> 0x0167 }
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0167 }
            kr8 r10 = r1.f34342a     // Catch:{ Exception -> 0x0167 }
            android.content.Context r10 = r10.mo45271q()     // Catch:{ Exception -> 0x0167 }
            r12[r2] = r10     // Catch:{ Exception -> 0x0167 }
            r10 = 0
            java.lang.Object r11 = r11.invoke(r10, r12)     // Catch:{ Exception -> 0x0167 }
            if (r11 != 0) goto L_0x0144
            goto L_0x0176
        L_0x0144:
            java.lang.String r10 = "getFirebaseInstanceId"
            java.lang.Class[] r12 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0157 }
            java.lang.reflect.Method r9 = r9.getDeclaredMethod(r10, r12)     // Catch:{ Exception -> 0x0157 }
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0157 }
            java.lang.Object r9 = r9.invoke(r11, r10)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0157 }
            r20 = r9
            goto L_0x0178
        L_0x0157:
            kr8 r9 = r1.f34342a
            bn8 r9 = r9.mo45237A()
            vm8 r9 = r9.mo29675r()
            java.lang.String r10 = "Failed to retrieve Firebase Instance Id"
            r9.mo48769a(r10)
            goto L_0x0176
        L_0x0167:
            kr8 r9 = r1.f34342a
            bn8 r9 = r9.mo45237A()
            vm8 r9 = r9.mo29674p()
            java.lang.String r10 = "Failed to obtain Firebase Analytics instance"
            r9.mo48769a(r10)
        L_0x0176:
            r20 = 0
        L_0x0178:
            kr8 r9 = r1.f34342a
            lp8 r10 = r9.mo45275z()
            io8 r10 = r10.f31356e
            long r10 = r10.mo43882a()
            r16 = 0
            int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r12 != 0) goto L_0x0190
            long r9 = r9.f31021H
            r12 = r3
            r21 = r9
            goto L_0x0199
        L_0x0190:
            r12 = r3
            long r2 = r9.f31021H
            long r2 = java.lang.Math.min(r2, r10)
            r21 = r2
        L_0x0199:
            r34.mo47219g()
            int r11 = r1.f28261k
            kr8 r2 = r1.f34342a
            n68 r2 = r2.mo45274y()
            boolean r23 = r2.mo45977B()
            kr8 r2 = r1.f34342a
            lp8 r2 = r2.mo45275z()
            r2.mo29006e()
            android.content.SharedPreferences r2 = r2.mo45479m()
            java.lang.String r3 = "deferred_analytics_collection"
            r9 = 0
            boolean r24 = r2.getBoolean(r3, r9)
            r34.mo47219g()
            java.lang.String r3 = r1.f28263m
            kr8 r2 = r1.f34342a
            n68 r2 = r2.mo45274y()
            java.lang.String r9 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r2 = r2.mo45999x(r9)
            if (r2 != 0) goto L_0x01d2
            r25 = 0
            goto L_0x01de
        L_0x01d2:
            boolean r2 = r2.booleanValue()
            r9 = 1
            r2 = r2 ^ r9
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r25 = r2
        L_0x01de:
            long r9 = r1.f28259i
            java.util.List<java.lang.String> r2 = r1.f28260j
            p000.le9.m47797a()
            r16 = r2
            kr8 r2 = r1.f34342a
            n68 r2 = r2.mo45274y()
            r19 = r3
            uk8<java.lang.Boolean> r3 = p000.rl8.f33501i0
            r26 = r9
            r9 = 0
            boolean r2 = r2.mo45997v(r9, r3)
            if (r2 == 0) goto L_0x0201
            java.lang.String r2 = r34.mo41982p()
            r29 = r2
            goto L_0x0203
        L_0x0201:
            r29 = r9
        L_0x0203:
            r9 = 42004(0xa414, double:2.07527E-319)
            r17 = 0
            kr8 r2 = r1.f34342a
            lp8 r2 = r2.mo45275z()
            u68 r2 = r2.mo45483r()
            java.lang.String r30 = r2.mo48326d()
            r28 = r16
            r2 = r31
            r32 = r19
            r3 = r12
            r33 = r11
            r11 = r13
            r13 = r35
            r14 = r0
            r16 = r20
            r19 = r21
            r21 = r33
            r22 = r23
            r23 = r24
            r24 = r32
            r2.<init>((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (long) r6, (java.lang.String) r8, (long) r9, (long) r11, (java.lang.String) r13, (boolean) r14, (boolean) r15, (java.lang.String) r16, (long) r17, (long) r19, (int) r21, (boolean) r22, (boolean) r23, (java.lang.String) r24, (java.lang.Boolean) r25, (long) r26, (java.util.List<java.lang.String>) r28, (java.lang.String) r29, (java.lang.String) r30)
            return r31
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dm8.mo41978l(java.lang.String):com.google.android.gms.measurement.internal.zzp");
    }

    /* renamed from: m */
    public final String mo41979m() {
        mo47219g();
        cu4.m43221k(this.f28253c);
        return this.f28253c;
    }

    /* renamed from: n */
    public final String mo41980n() {
        mo47219g();
        cu4.m43221k(this.f28262l);
        return this.f28262l;
    }

    /* renamed from: o */
    public final String mo41981o() {
        mo47219g();
        return this.f28263m;
    }

    /* renamed from: p */
    public final String mo41982p() {
        mo47219g();
        cu4.m43221k(this.f28264n);
        return this.f28264n;
    }

    /* renamed from: r */
    public final int mo41983r() {
        mo47219g();
        return this.f28255e;
    }

    /* renamed from: t */
    public final int mo41984t() {
        mo47219g();
        return this.f28261k;
    }

    /* renamed from: u */
    public final List<String> mo41985u() {
        return this.f28260j;
    }
}
