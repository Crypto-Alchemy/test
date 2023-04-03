package p000;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzkn;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: qq8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class qq8 extends t49 implements f68 {

    /* renamed from: d */
    public final Map<String, Map<String, String>> f33243d = new C2781lq();

    /* renamed from: e */
    public final Map<String, Map<String, Boolean>> f33244e = new C2781lq();

    /* renamed from: f */
    public final Map<String, Map<String, Boolean>> f33245f = new C2781lq();

    /* renamed from: g */
    public final Map<String, np8> f33246g = new C2781lq();

    /* renamed from: h */
    public final Map<String, Map<String, Integer>> f33247h = new C2781lq();

    /* renamed from: i */
    public final em3<String, be8> f33248i = new iq8(this, 20);

    /* renamed from: j */
    public final zh9 f33249j = new kq8(this);

    /* renamed from: k */
    public final Map<String, String> f33250k = new C2781lq();

    public qq8(s59 s59) {
        super(s59);
    }

    /* renamed from: E */
    public static final Map<String, String> m50826E(np8 np8) {
        C2781lq lqVar = new C2781lq();
        if (np8 != null) {
            for (up8 next : np8.mo46123C()) {
                lqVar.put(next.mo48484x(), next.mo48485y());
            }
        }
        return lqVar;
    }

    /* renamed from: x */
    public static /* synthetic */ be8 m50827x(qq8 qq8, String str) {
        qq8.mo47982g();
        cu4.m43217g(str);
        zf9.m55099a();
        if (!qq8.f34342a.mo45274y().mo45997v((String) null, rl8.f33461F0) || !qq8.mo47254o(str)) {
            return null;
        }
        if (!qq8.f33246g.containsKey(str) || qq8.f33246g.get(str) == null) {
            qq8.mo47261z(str);
        } else {
            qq8.mo47247C(str, qq8.f33246g.get(str));
        }
        return qq8.f33248i.mo19377h().get(str);
    }

    /* renamed from: B */
    public final void mo47246B(String str, kp8 kp8) {
        C2781lq lqVar = new C2781lq();
        C2781lq lqVar2 = new C2781lq();
        C2781lq lqVar3 = new C2781lq();
        if (kp8 != null) {
            for (int i = 0; i < kp8.mo45226w(); i++) {
                ko8 ko8 = (ko8) kp8.mo45227x(i).mo47634s();
                if (TextUtils.isEmpty(ko8.mo44870w())) {
                    this.f34342a.mo45237A().mo29673o().mo48769a("EventConfig contained null event name");
                } else {
                    String w = ko8.mo44870w();
                    String b = cu8.m43238b(ko8.mo44870w());
                    if (!TextUtils.isEmpty(b)) {
                        ko8.mo44871x(b);
                        kp8.mo45228y(i, ko8);
                    }
                    lqVar.put(w, Boolean.valueOf(ko8.mo44872y()));
                    lqVar2.put(ko8.mo44870w(), Boolean.valueOf(ko8.mo44873z()));
                    if (ko8.mo44868B()) {
                        if (ko8.mo44869C() < 2 || ko8.mo44869C() > 65535) {
                            this.f34342a.mo45237A().mo29673o().mo48771c("Invalid sampling rate. Event name, sample rate", ko8.mo44870w(), Integer.valueOf(ko8.mo44869C()));
                        } else {
                            lqVar3.put(ko8.mo44870w(), Integer.valueOf(ko8.mo44869C()));
                        }
                    }
                }
            }
        }
        this.f33244e.put(str, lqVar);
        this.f33245f.put(str, lqVar2);
        this.f33247h.put(str, lqVar3);
    }

    /* renamed from: C */
    public final void mo47247C(String str, np8 np8) {
        if (np8.mo46129I() != 0) {
            this.f34342a.mo45237A().mo29678v().mo48770b("EES programs found", Integer.valueOf(np8.mo46129I()));
            wt8 wt8 = np8.mo46128H().get(0);
            try {
                be8 be8 = new be8();
                be8.mo29561a("internal.remoteConfig", new dq8(this, str));
                be8.mo29561a("internal.logger", new gq8(this));
                be8.mo29566f(wt8);
                this.f33248i.mo19373d(str, be8);
                this.f34342a.mo45237A().mo29678v().mo48771c("EES program loaded for appId, activities", str, Integer.valueOf(wt8.mo49271y().mo46538y()));
                for (st8 x : wt8.mo49271y().mo46537x()) {
                    this.f34342a.mo45237A().mo29678v().mo48770b("EES program activity", x.mo47867x());
                }
            } catch (zzd unused) {
                this.f34342a.mo45237A().mo29670l().mo48770b("Failed to load EES program. appId", str);
            }
        } else {
            this.f33248i.mo19374e(str);
        }
    }

    /* renamed from: D */
    public final np8 mo47248D(String str, byte[] bArr) {
        Long l;
        if (bArr == null) {
            return np8.m48904K();
        }
        try {
            np8 np8 = (np8) ((kp8) w59.m53712J(np8.m48903J(), bArr)).mo48885o();
            vm8 v = this.f34342a.mo45237A().mo29678v();
            String str2 = null;
            if (np8.mo46130x()) {
                l = Long.valueOf(np8.mo46131y());
            } else {
                l = null;
            }
            if (np8.mo46132z()) {
                str2 = np8.mo46122B();
            }
            v.mo48771c("Parsed config. version, gmp_app_id", l, str2);
            return np8;
        } catch (zzkn e) {
            this.f34342a.mo45237A().mo29673o().mo48771c("Unable to merge remote config. appId", bn8.m32664w(str), e);
            return np8.m48904K();
        } catch (RuntimeException e2) {
            this.f34342a.mo45237A().mo29673o().mo48771c("Unable to merge remote config. appId", bn8.m32664w(str), e2);
            return np8.m48904K();
        }
    }

    /* renamed from: c */
    public final String mo42530c(String str, String str2) {
        mo29006e();
        mo47261z(str);
        Map map = this.f33243d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* renamed from: h */
    public final boolean mo43450h() {
        return false;
    }

    /* renamed from: j */
    public final np8 mo47249j(String str) {
        mo47982g();
        mo29006e();
        cu4.m43217g(str);
        mo47261z(str);
        return this.f33246g.get(str);
    }

    /* renamed from: k */
    public final String mo47250k(String str) {
        mo29006e();
        return this.f33250k.get(str);
    }

    /* renamed from: l */
    public final void mo47251l(String str) {
        mo29006e();
        this.f33250k.put(str, (Object) null);
    }

    /* renamed from: m */
    public final void mo47252m(String str) {
        mo29006e();
        this.f33246g.remove(str);
    }

    /* renamed from: n */
    public final boolean mo47253n(String str) {
        mo29006e();
        np8 j = mo47249j(str);
        if (j == null) {
            return false;
        }
        return j.mo46127G();
    }

    /* renamed from: o */
    public final boolean mo47254o(String str) {
        np8 np8;
        zf9.m55099a();
        if (!this.f34342a.mo45274y().mo45997v((String) null, rl8.f33461F0) || TextUtils.isEmpty(str) || (np8 = this.f33246g.get(str)) == null || np8.mo46129I() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public final boolean mo47255p(String str, byte[] bArr, String str2) {
        mo47982g();
        mo29006e();
        cu4.m43217g(str);
        kp8 kp8 = (kp8) mo47248D(str, bArr).mo47634s();
        if (kp8 == null) {
            return false;
        }
        mo47246B(str, kp8);
        zf9.m55099a();
        if (this.f34342a.mo45274y().mo45997v((String) null, rl8.f33461F0)) {
            mo47247C(str, (np8) kp8.mo48885o());
        }
        this.f33246g.put(str, (np8) kp8.mo48885o());
        this.f33250k.put(str, str2);
        this.f33243d.put(str, m50826E((np8) kp8.mo48885o()));
        this.f33321b.mo47651V().mo45692w(str, new ArrayList(kp8.mo45229z()));
        try {
            kp8.mo45225B();
            bArr = ((np8) kp8.mo48885o()).mo30879c();
        } catch (RuntimeException e) {
            this.f34342a.mo45237A().mo29673o().mo48771c("Unable to serialize reduced-size config. Storing full config instead. appId", bn8.m32664w(str), e);
        }
        sf9.m51760a();
        if (this.f34342a.mo45274y().mo45997v((String) null, rl8.f33457D0)) {
            this.f33321b.mo47651V().mo45677g0(str, bArr, str2);
        } else {
            this.f33321b.mo47651V().mo45677g0(str, bArr, (String) null);
        }
        this.f33246g.put(str, (np8) kp8.mo48885o());
        return true;
    }

    /* renamed from: r */
    public final boolean mo47256r(String str, String str2) {
        Boolean bool;
        mo29006e();
        mo47261z(str);
        if (mo47259v(str) && g69.m44577F(str2)) {
            return true;
        }
        if (mo47260w(str) && g69.m44586j0(str2)) {
            return true;
        }
        Map map = this.f33244e.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: t */
    public final boolean mo47257t(String str, String str2) {
        Boolean bool;
        mo29006e();
        mo47261z(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = this.f33245f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: u */
    public final int mo47258u(String str, String str2) {
        Integer num;
        mo29006e();
        mo47261z(str);
        Map map = this.f33247h.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* renamed from: v */
    public final boolean mo47259v(String str) {
        return "1".equals(mo42530c(str, "measurement.upload.blacklist_internal"));
    }

    /* renamed from: w */
    public final boolean mo47260w(String str) {
        return "1".equals(mo42530c(str, "measurement.upload.blacklist_public"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008d, code lost:
        if (r2 != null) goto L_0x008f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011e  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47261z(java.lang.String r13) {
        /*
            r12 = this;
            r12.mo47982g()
            r12.mo29006e()
            p000.cu4.m43217g(r13)
            java.util.Map<java.lang.String, np8> r0 = r12.f33246g
            java.lang.Object r0 = r0.get(r13)
            if (r0 != 0) goto L_0x0122
            s59 r0 = r12.f33321b
            m78 r0 = r0.mo47651V()
            p000.cu4.m43217g(r13)
            r0.mo29006e()
            r0.mo47982g()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r0.mo45660P()     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String[] r4 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            r10 = 1
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            r11 = 0
            r6[r11] = r13     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            java.lang.String r3 = "apps"
            java.lang.String r5 = "app_id=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0072 }
            if (r3 != 0) goto L_0x0045
            goto L_0x008f
        L_0x0045:
            byte[] r3 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.String r4 = r2.getString(r10)     // Catch:{ SQLiteException -> 0x0072 }
            boolean r5 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0072 }
            if (r5 == 0) goto L_0x0066
            kr8 r5 = r0.f34342a     // Catch:{ SQLiteException -> 0x0072 }
            bn8 r5 = r5.mo45237A()     // Catch:{ SQLiteException -> 0x0072 }
            vm8 r5 = r5.mo29670l()     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = p000.bn8.m32664w(r13)     // Catch:{ SQLiteException -> 0x0072 }
            r5.mo48770b(r6, r7)     // Catch:{ SQLiteException -> 0x0072 }
        L_0x0066:
            if (r3 != 0) goto L_0x0069
            goto L_0x008f
        L_0x0069:
            android.util.Pair r5 = new android.util.Pair     // Catch:{ SQLiteException -> 0x0072 }
            r5.<init>(r3, r4)     // Catch:{ SQLiteException -> 0x0072 }
            r2.close()
            goto L_0x0093
        L_0x0072:
            r3 = move-exception
            goto L_0x007a
        L_0x0074:
            r13 = move-exception
            goto L_0x011c
        L_0x0077:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x007a:
            kr8 r0 = r0.f34342a     // Catch:{ all -> 0x011a }
            bn8 r0 = r0.mo45237A()     // Catch:{ all -> 0x011a }
            vm8 r0 = r0.mo29670l()     // Catch:{ all -> 0x011a }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r5 = p000.bn8.m32664w(r13)     // Catch:{ all -> 0x011a }
            r0.mo48771c(r4, r5, r3)     // Catch:{ all -> 0x011a }
            if (r2 == 0) goto L_0x0092
        L_0x008f:
            r2.close()
        L_0x0092:
            r5 = r1
        L_0x0093:
            if (r5 != 0) goto L_0x00b4
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = r12.f33243d
            r0.put(r13, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> r0 = r12.f33244e
            r0.put(r13, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> r0 = r12.f33245f
            r0.put(r13, r1)
            java.util.Map<java.lang.String, np8> r0 = r12.f33246g
            r0.put(r13, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r12.f33250k
            r0.put(r13, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r0 = r12.f33247h
            r0.put(r13, r1)
            return
        L_0x00b4:
            java.lang.Object r0 = r5.first
            byte[] r0 = (byte[]) r0
            np8 r0 = r12.mo47248D(r13, r0)
            w39 r0 = r0.mo47634s()
            kp8 r0 = (p000.kp8) r0
            r12.mo47246B(r13, r0)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r2 = r12.f33243d
            s49 r3 = r0.mo48885o()
            np8 r3 = (p000.np8) r3
            java.util.Map r3 = m50826E(r3)
            r2.put(r13, r3)
            java.util.Map<java.lang.String, np8> r2 = r12.f33246g
            s49 r3 = r0.mo48885o()
            np8 r3 = (p000.np8) r3
            r2.put(r13, r3)
            p000.zf9.m55099a()
            kr8 r2 = r12.f34342a
            n68 r2 = r2.mo45274y()
            uk8<java.lang.Boolean> r3 = p000.rl8.f33461F0
            boolean r2 = r2.mo45997v(r1, r3)
            if (r2 == 0) goto L_0x00f9
            s49 r0 = r0.mo48885o()
            np8 r0 = (p000.np8) r0
            r12.mo47247C(r13, r0)
        L_0x00f9:
            p000.sf9.m51760a()
            kr8 r0 = r12.f34342a
            n68 r0 = r0.mo45274y()
            uk8<java.lang.Boolean> r2 = p000.rl8.f33457D0
            boolean r0 = r0.mo45997v(r1, r2)
            if (r0 == 0) goto L_0x0114
            java.util.Map<java.lang.String, java.lang.String> r0 = r12.f33250k
            java.lang.Object r1 = r5.second
            java.lang.String r1 = (java.lang.String) r1
            r0.put(r13, r1)
            return
        L_0x0114:
            java.util.Map<java.lang.String, java.lang.String> r0 = r12.f33250k
            r0.put(r13, r1)
            return
        L_0x011a:
            r13 = move-exception
            r1 = r2
        L_0x011c:
            if (r1 == 0) goto L_0x0121
            r1.close()
        L_0x0121:
            throw r13
        L_0x0122:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.qq8.mo47261z(java.lang.String):void");
    }
}
