package p000;

import android.app.Activity;
import android.os.Bundle;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: jz8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class jz8 extends qo8 {

    /* renamed from: c */
    public volatile ty8 f30673c;

    /* renamed from: d */
    public ty8 f30674d;

    /* renamed from: e */
    public ty8 f30675e;

    /* renamed from: f */
    public final Map<Activity, ty8> f30676f = new ConcurrentHashMap();

    /* renamed from: g */
    public Activity f30677g;

    /* renamed from: h */
    public volatile boolean f30678h;

    /* renamed from: i */
    public volatile ty8 f30679i;

    /* renamed from: j */
    public ty8 f30680j;

    /* renamed from: k */
    public boolean f30681k;

    /* renamed from: l */
    public final Object f30682l = new Object();

    /* renamed from: m */
    public ty8 f30683m;

    /* renamed from: n */
    public String f30684n;

    public jz8(kr8 kr8) {
        super(kr8);
    }

    /* renamed from: E */
    public static /* synthetic */ void m46822E(jz8 jz8, Bundle bundle, ty8 ty8, ty8 ty82, long j) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        jz8.mo44637m(ty8, ty82, j, true, jz8.f34342a.mo45243G().mo42826r((String) null, "screen_view", bundle, (List<String>) null, true));
    }

    /* renamed from: w */
    public static void m46827w(ty8 ty8, Bundle bundle, boolean z) {
        if (ty8 != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = ty8.f34422a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = ty8.f34423b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", ty8.f34424c);
                return;
            }
            z = false;
        }
        if (ty8 == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* renamed from: B */
    public final void mo44633B(Activity activity) {
        if (this.f34342a.mo45274y().mo45997v((String) null, rl8.f33523t0)) {
            synchronized (this.f30682l) {
                this.f30681k = false;
                this.f30678h = true;
            }
        }
        long b = this.f34342a.mo45256a().mo29581b();
        if (!this.f34342a.mo45274y().mo45997v((String) null, rl8.f33521s0) || this.f34342a.mo45274y().mo45978C()) {
            ty8 o = mo44639o(activity);
            this.f30674d = this.f30673c;
            this.f30673c = null;
            this.f34342a.mo45272s().mo41640o(new ez8(this, o, b));
            return;
        }
        this.f30673c = null;
        this.f34342a.mo45272s().mo41640o(new cz8(this, b));
    }

    /* renamed from: C */
    public final void mo44634C(Activity activity, Bundle bundle) {
        ty8 ty8;
        if (this.f34342a.mo45274y().mo45978C() && bundle != null && (ty8 = this.f30676f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", ty8.f34424c);
            bundle2.putString(PublicResolver.FUNC_NAME, ty8.f34422a);
            bundle2.putString("referrer_name", ty8.f34423b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    /* renamed from: D */
    public final void mo44635D(Activity activity) {
        synchronized (this.f30682l) {
            if (activity == this.f30677g) {
                this.f30677g = null;
            }
        }
        if (this.f34342a.mo45274y().mo45978C()) {
            this.f30676f.remove(activity);
        }
    }

    /* renamed from: j */
    public final boolean mo41976j() {
        return false;
    }

    /* renamed from: l */
    public final void mo44636l(Activity activity, ty8 ty8, boolean z) {
        ty8 ty82;
        ty8 ty83;
        String str;
        ty8 ty84 = ty8;
        if (this.f30673c == null) {
            ty82 = this.f30674d;
        } else {
            ty82 = this.f30673c;
        }
        ty8 ty85 = ty82;
        if (ty84.f34423b == null) {
            if (activity != null) {
                str = mo44641r(activity.getClass(), "Activity");
            } else {
                str = null;
            }
            ty83 = new ty8(ty84.f34422a, str, ty84.f34424c, ty84.f34426e, ty84.f34427f);
        } else {
            ty83 = ty84;
        }
        this.f30674d = this.f30673c;
        this.f30673c = ty83;
        this.f34342a.mo45272s().mo41640o(new xy8(this, ty83, ty85, this.f34342a.mo45256a().mo29581b(), z));
    }

    /* renamed from: m */
    public final void mo44637m(ty8 ty8, ty8 ty82, long j, boolean z, Bundle bundle) {
        long j2;
        ty8 ty83 = ty8;
        ty8 ty84 = ty82;
        long j3 = j;
        Bundle bundle2 = bundle;
        mo29006e();
        boolean z2 = false;
        if (z && this.f30675e != null) {
            z2 = true;
        }
        if (z2) {
            mo44638n(this.f30675e, true, j3);
        }
        if (ty84 == null || ty84.f34424c != ty83.f34424c || !g69.m44578G(ty84.f34423b, ty83.f34423b) || !g69.m44578G(ty84.f34422a, ty83.f34422a)) {
            Bundle bundle3 = new Bundle();
            n68 y = this.f34342a.mo45274y();
            uk8<Boolean> uk8 = rl8.f33523t0;
            if (y.mo45997v((String) null, uk8)) {
                if (bundle2 != null) {
                    bundle3 = new Bundle(bundle2);
                } else {
                    bundle3 = new Bundle();
                }
            }
            m46827w(ty83, bundle3, true);
            if (ty84 != null) {
                String str = ty84.f34422a;
                if (str != null) {
                    bundle3.putString("_pn", str);
                }
                String str2 = ty84.f34423b;
                if (str2 != null) {
                    bundle3.putString("_pc", str2);
                }
                bundle3.putLong("_pi", ty84.f34424c);
            }
            if (z2) {
                p39 p39 = this.f34342a.mo45239C().f34829e;
                long j4 = j3 - p39.f32549b;
                p39.f32549b = j3;
                if (j4 > 0) {
                    this.f34342a.mo45243G().mo42800Q(bundle3, j4);
                }
            }
            String str3 = "auto";
            if (this.f34342a.mo45274y().mo45997v((String) null, uk8)) {
                if (!this.f34342a.mo45274y().mo45978C()) {
                    bundle3.putLong("_mst", 1);
                }
                if (true == ty83.f34426e) {
                    str3 = "app";
                }
            }
            if (this.f34342a.mo45274y().mo45997v((String) null, uk8)) {
                long a = this.f34342a.mo45256a().mo29580a();
                if (ty83.f34426e) {
                    long j5 = ty83.f34427f;
                    if (j5 != 0) {
                        j2 = j5;
                        this.f34342a.mo45242F().mo47917Y(str3, "_vs", j2, bundle3);
                    }
                }
                j2 = a;
                this.f34342a.mo45242F().mo47917Y(str3, "_vs", j2, bundle3);
            } else {
                sx8 F = this.f34342a.mo45242F();
                kr8 kr8 = F.f34342a;
                F.mo29006e();
                F.mo47917Y(str3, "_vs", F.f34342a.mo45256a().mo29580a(), bundle3);
            }
        }
        this.f30675e = ty83;
        if (this.f34342a.mo45274y().mo45997v((String) null, rl8.f33523t0) && ty83.f34426e) {
            this.f30680j = ty83;
        }
        this.f34342a.mo45254R().mo42729W(ty83);
    }

    /* renamed from: n */
    public final void mo44638n(ty8 ty8, boolean z, long j) {
        boolean z2;
        this.f34342a.mo45259d().mo46409h(this.f34342a.mo45256a().mo29581b());
        if (ty8 == null || !ty8.f34425d) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.f34342a.mo45239C().f34829e.mo46626d(z2, z, j) && ty8 != null) {
            ty8.f34425d = false;
        }
    }

    /* renamed from: o */
    public final ty8 mo44639o(Activity activity) {
        cu4.m43221k(activity);
        ty8 ty8 = this.f30676f.get(activity);
        if (ty8 == null) {
            ty8 ty82 = new ty8((String) null, mo44641r(activity.getClass(), "Activity"), this.f34342a.mo45243G().mo42812h0());
            this.f30676f.put(activity, ty82);
            ty8 = ty82;
        }
        if (this.f34342a.mo45274y().mo45997v((String) null, rl8.f33523t0) && this.f30679i != null) {
            return this.f30679i;
        }
        return ty8;
    }

    /* renamed from: p */
    public final ty8 mo44640p(boolean z) {
        mo47219g();
        mo29006e();
        if (!this.f34342a.mo45274y().mo45997v((String) null, rl8.f33523t0) || !z) {
            return this.f30675e;
        }
        ty8 ty8 = this.f30675e;
        if (ty8 != null) {
            return ty8;
        }
        return this.f30680j;
    }

    /* renamed from: r */
    public final String mo44641r(Class<?> cls, String str) {
        String str2;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        if (length > 0) {
            str2 = split[length - 1];
        } else {
            str2 = "";
        }
        int length2 = str2.length();
        this.f34342a.mo45274y();
        if (length2 <= 100) {
            return str2;
        }
        this.f34342a.mo45274y();
        return str2.substring(0, 100);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        if (r2 > 100) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0082, code lost:
        if (r4 > 100) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e0, code lost:
        r0 = r12.f34342a.mo45237A().mo29678v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ea, code lost:
        if (r3 != null) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ec, code lost:
        r1 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ef, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f0, code lost:
        if (r4 != null) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f2, code lost:
        r2 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f5, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f6, code lost:
        r0.mo48771c("Logging screen view with name, class", r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fd, code lost:
        if (r12.f30673c != null) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ff, code lost:
        r0 = r12.f30674d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0102, code lost:
        r0 = r12.f30673c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0104, code lost:
        r2 = new p000.ty8(r3, r4, r12.f34342a.mo45243G().mo42812h0(), true, r14);
        r12.f30673c = r2;
        r12.f30674d = r0;
        r12.f30679i = r2;
        r12.f34342a.mo45272s().mo41640o(new p000.vy8(r12, r13, r2, r0, r12.f34342a.mo45256a().mo29581b()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0139, code lost:
        return;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44642t(android.os.Bundle r13, long r14) {
        /*
            r12 = this;
            kr8 r0 = r12.f34342a
            n68 r0 = r0.mo45274y()
            uk8<java.lang.Boolean> r1 = p000.rl8.f33523t0
            r2 = 0
            boolean r0 = r0.mo45997v(r2, r1)
            if (r0 != 0) goto L_0x001f
            kr8 r13 = r12.f34342a
            bn8 r13 = r13.mo45237A()
            vm8 r13 = r13.mo29675r()
            java.lang.String r14 = "Manual screen reporting is disabled."
            r13.mo48769a(r14)
            return
        L_0x001f:
            java.lang.Object r0 = r12.f30682l
            monitor-enter(r0)
            boolean r1 = r12.f30681k     // Catch:{ all -> 0x013a }
            if (r1 != 0) goto L_0x0037
            kr8 r13 = r12.f34342a     // Catch:{ all -> 0x013a }
            bn8 r13 = r13.mo45237A()     // Catch:{ all -> 0x013a }
            vm8 r13 = r13.mo29675r()     // Catch:{ all -> 0x013a }
            java.lang.String r14 = "Cannot log screen view event when the app is in the background."
            r13.mo48769a(r14)     // Catch:{ all -> 0x013a }
            monitor-exit(r0)     // Catch:{ all -> 0x013a }
            return
        L_0x0037:
            java.lang.String r1 = "screen_name"
            java.lang.String r3 = r13.getString(r1)     // Catch:{ all -> 0x013a }
            r1 = 100
            if (r3 == 0) goto L_0x006b
            int r2 = r3.length()     // Catch:{ all -> 0x013a }
            if (r2 <= 0) goto L_0x0052
            int r2 = r3.length()     // Catch:{ all -> 0x013a }
            kr8 r4 = r12.f34342a     // Catch:{ all -> 0x013a }
            r4.mo45274y()     // Catch:{ all -> 0x013a }
            if (r2 <= r1) goto L_0x006b
        L_0x0052:
            kr8 r13 = r12.f34342a     // Catch:{ all -> 0x013a }
            bn8 r13 = r13.mo45237A()     // Catch:{ all -> 0x013a }
            vm8 r13 = r13.mo29675r()     // Catch:{ all -> 0x013a }
            java.lang.String r14 = "Invalid screen name length for screen view. Length"
            int r15 = r3.length()     // Catch:{ all -> 0x013a }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x013a }
            r13.mo48770b(r14, r15)     // Catch:{ all -> 0x013a }
            monitor-exit(r0)     // Catch:{ all -> 0x013a }
            return
        L_0x006b:
            java.lang.String r2 = "screen_class"
            java.lang.String r2 = r13.getString(r2)     // Catch:{ all -> 0x013a }
            if (r2 == 0) goto L_0x009d
            int r4 = r2.length()     // Catch:{ all -> 0x013a }
            if (r4 <= 0) goto L_0x0084
            int r4 = r2.length()     // Catch:{ all -> 0x013a }
            kr8 r5 = r12.f34342a     // Catch:{ all -> 0x013a }
            r5.mo45274y()     // Catch:{ all -> 0x013a }
            if (r4 <= r1) goto L_0x009d
        L_0x0084:
            kr8 r13 = r12.f34342a     // Catch:{ all -> 0x013a }
            bn8 r13 = r13.mo45237A()     // Catch:{ all -> 0x013a }
            vm8 r13 = r13.mo29675r()     // Catch:{ all -> 0x013a }
            java.lang.String r14 = "Invalid screen class length for screen view. Length"
            int r15 = r2.length()     // Catch:{ all -> 0x013a }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x013a }
            r13.mo48770b(r14, r15)     // Catch:{ all -> 0x013a }
            monitor-exit(r0)     // Catch:{ all -> 0x013a }
            return
        L_0x009d:
            if (r2 != 0) goto L_0x00b2
            android.app.Activity r1 = r12.f30677g     // Catch:{ all -> 0x013a }
            if (r1 == 0) goto L_0x00ae
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x013a }
            java.lang.String r2 = "Activity"
            java.lang.String r1 = r12.mo44641r(r1, r2)     // Catch:{ all -> 0x013a }
            goto L_0x00b0
        L_0x00ae:
            java.lang.String r1 = "Activity"
        L_0x00b0:
            r4 = r1
            goto L_0x00b3
        L_0x00b2:
            r4 = r2
        L_0x00b3:
            ty8 r1 = r12.f30673c     // Catch:{ all -> 0x013a }
            boolean r2 = r12.f30678h     // Catch:{ all -> 0x013a }
            if (r2 == 0) goto L_0x00df
            if (r1 == 0) goto L_0x00df
            r2 = 0
            r12.f30678h = r2     // Catch:{ all -> 0x013a }
            java.lang.String r2 = r1.f34423b     // Catch:{ all -> 0x013a }
            boolean r2 = p000.g69.m44578G(r2, r4)     // Catch:{ all -> 0x013a }
            java.lang.String r1 = r1.f34422a     // Catch:{ all -> 0x013a }
            boolean r1 = p000.g69.m44578G(r1, r3)     // Catch:{ all -> 0x013a }
            if (r2 == 0) goto L_0x00df
            if (r1 == 0) goto L_0x00df
            kr8 r13 = r12.f34342a     // Catch:{ all -> 0x013a }
            bn8 r13 = r13.mo45237A()     // Catch:{ all -> 0x013a }
            vm8 r13 = r13.mo29675r()     // Catch:{ all -> 0x013a }
            java.lang.String r14 = "Ignoring call to log screen view event with duplicate parameters."
            r13.mo48769a(r14)     // Catch:{ all -> 0x013a }
            monitor-exit(r0)     // Catch:{ all -> 0x013a }
            return
        L_0x00df:
            monitor-exit(r0)     // Catch:{ all -> 0x013a }
            kr8 r0 = r12.f34342a
            bn8 r0 = r0.mo45237A()
            vm8 r0 = r0.mo29678v()
            if (r3 != 0) goto L_0x00ef
            java.lang.String r1 = "null"
            goto L_0x00f0
        L_0x00ef:
            r1 = r3
        L_0x00f0:
            if (r4 != 0) goto L_0x00f5
            java.lang.String r2 = "null"
            goto L_0x00f6
        L_0x00f5:
            r2 = r4
        L_0x00f6:
            java.lang.String r5 = "Logging screen view with name, class"
            r0.mo48771c(r5, r1, r2)
            ty8 r0 = r12.f30673c
            if (r0 != 0) goto L_0x0102
            ty8 r0 = r12.f30674d
            goto L_0x0104
        L_0x0102:
            ty8 r0 = r12.f30673c
        L_0x0104:
            ty8 r1 = new ty8
            kr8 r2 = r12.f34342a
            g69 r2 = r2.mo45243G()
            long r5 = r2.mo42812h0()
            r7 = 1
            r2 = r1
            r8 = r14
            r2.<init>(r3, r4, r5, r7, r8)
            r12.f30673c = r1
            r12.f30674d = r0
            r12.f30679i = r1
            kr8 r14 = r12.f34342a
            bh0 r14 = r14.mo45256a()
            long r10 = r14.mo29581b()
            kr8 r14 = r12.f34342a
            cr8 r14 = r14.mo45272s()
            vy8 r15 = new vy8
            r5 = r15
            r6 = r12
            r7 = r13
            r8 = r1
            r9 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            r14.mo41640o(r15)
            return
        L_0x013a:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x013a }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.jz8.mo44642t(android.os.Bundle, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        if (r1 <= 100) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b4, code lost:
        if (r1 <= 100) goto L_0x00cf;
     */
    @java.lang.Deprecated
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44643u(android.app.Activity r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            kr8 r0 = r3.f34342a
            n68 r0 = r0.mo45274y()
            boolean r0 = r0.mo45978C()
            if (r0 != 0) goto L_0x001c
            kr8 r4 = r3.f34342a
            bn8 r4 = r4.mo45237A()
            vm8 r4 = r4.mo29675r()
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.mo48769a(r5)
            return
        L_0x001c:
            ty8 r0 = r3.f30673c
            if (r0 != 0) goto L_0x0030
            kr8 r4 = r3.f34342a
            bn8 r4 = r4.mo45237A()
            vm8 r4 = r4.mo29675r()
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.mo48769a(r5)
            return
        L_0x0030:
            java.util.Map<android.app.Activity, ty8> r1 = r3.f30676f
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L_0x0048
            kr8 r4 = r3.f34342a
            bn8 r4 = r4.mo45237A()
            vm8 r4 = r4.mo29675r()
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.mo48769a(r5)
            return
        L_0x0048:
            if (r6 != 0) goto L_0x0054
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.mo44641r(r6, r1)
        L_0x0054:
            java.lang.String r1 = r0.f34423b
            boolean r1 = p000.g69.m44578G(r1, r6)
            java.lang.String r0 = r0.f34422a
            boolean r0 = p000.g69.m44578G(r0, r5)
            if (r1 == 0) goto L_0x0075
            if (r0 != 0) goto L_0x0065
            goto L_0x0075
        L_0x0065:
            kr8 r4 = r3.f34342a
            bn8 r4 = r4.mo45237A()
            vm8 r4 = r4.mo29675r()
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.mo48769a(r5)
            return
        L_0x0075:
            r0 = 100
            if (r5 == 0) goto L_0x00a3
            int r1 = r5.length()
            if (r1 <= 0) goto L_0x008b
            int r1 = r5.length()
            kr8 r2 = r3.f34342a
            r2.mo45274y()
            if (r1 > r0) goto L_0x008b
            goto L_0x00a3
        L_0x008b:
            kr8 r4 = r3.f34342a
            bn8 r4 = r4.mo45237A()
            vm8 r4 = r4.mo29675r()
            int r5 = r5.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            r4.mo48770b(r6, r5)
            return
        L_0x00a3:
            if (r6 == 0) goto L_0x00cf
            int r1 = r6.length()
            if (r1 <= 0) goto L_0x00b7
            int r1 = r6.length()
            kr8 r2 = r3.f34342a
            r2.mo45274y()
            if (r1 > r0) goto L_0x00b7
            goto L_0x00cf
        L_0x00b7:
            kr8 r4 = r3.f34342a
            bn8 r4 = r4.mo45237A()
            vm8 r4 = r4.mo29675r()
            int r5 = r6.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            r4.mo48770b(r6, r5)
            return
        L_0x00cf:
            kr8 r0 = r3.f34342a
            bn8 r0 = r0.mo45237A()
            vm8 r0 = r0.mo29678v()
            if (r5 != 0) goto L_0x00de
            java.lang.String r1 = "null"
            goto L_0x00df
        L_0x00de:
            r1 = r5
        L_0x00df:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.mo48771c(r2, r1, r6)
            ty8 r0 = new ty8
            kr8 r1 = r3.f34342a
            g69 r1 = r1.mo45243G()
            long r1 = r1.mo42812h0()
            r0.<init>(r5, r6, r1)
            java.util.Map<android.app.Activity, ty8> r5 = r3.f30676f
            r5.put(r4, r0)
            r5 = 1
            r3.mo44636l(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.jz8.mo44643u(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* renamed from: v */
    public final ty8 mo44644v() {
        return this.f30673c;
    }

    /* renamed from: x */
    public final void mo44645x(String str, ty8 ty8) {
        mo29006e();
        synchronized (this) {
            String str2 = this.f30684n;
            if (str2 == null || str2.equals(str) || ty8 != null) {
                this.f30684n = str;
                this.f30683m = ty8;
            }
        }
    }

    /* renamed from: y */
    public final void mo44646y(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (this.f34342a.mo45274y().mo45978C() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f30676f.put(activity, new ty8(bundle2.getString(PublicResolver.FUNC_NAME), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    /* renamed from: z */
    public final void mo44647z(Activity activity) {
        if (this.f34342a.mo45274y().mo45997v((String) null, rl8.f33523t0)) {
            synchronized (this.f30682l) {
                this.f30681k = true;
                if (activity != this.f30677g) {
                    synchronized (this.f30682l) {
                        this.f30677g = activity;
                        this.f30678h = false;
                    }
                    if (this.f34342a.mo45274y().mo45997v((String) null, rl8.f33521s0) && this.f34342a.mo45274y().mo45978C()) {
                        this.f30679i = null;
                        this.f34342a.mo45272s().mo41640o(new gz8(this));
                    }
                }
            }
        }
        if (!this.f34342a.mo45274y().mo45997v((String) null, rl8.f33521s0) || this.f34342a.mo45274y().mo45978C()) {
            mo44636l(activity, mo44639o(activity), false);
            oh8 d = this.f34342a.mo45259d();
            d.f34342a.mo45272s().mo41640o(new de8(d, d.f34342a.mo45256a().mo29581b()));
            return;
        }
        this.f30673c = this.f30679i;
        this.f34342a.mo45272s().mo41640o(new zy8(this));
    }
}
