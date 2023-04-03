package com.google.android.gms.internal.clearcut;

import android.content.Context;
import com.google.android.gms.clearcut.C4003a;
import com.google.android.gms.internal.clearcut.C4073p;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.clearcut.r */
public final class C4078r implements C4003a.C4005b {

    /* renamed from: b */
    public static final Charset f22471b = Charset.forName("UTF-8");

    /* renamed from: c */
    public static final n88 f22472c;

    /* renamed from: d */
    public static final n88 f22473d = new n88(mo4.m48389a("com.google.android.gms.clearcut.public")).mo46032g("gms:playlog:service:sampling_").mo46033i("LogSampling__");

    /* renamed from: e */
    public static final ConcurrentHashMap<String, i68<C4073p>> f22474e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public static final HashMap<String, i68<String>> f22475f = new HashMap<>();

    /* renamed from: g */
    public static Boolean f22476g = null;

    /* renamed from: h */
    public static Long f22477h = null;

    /* renamed from: i */
    public static final i68<Boolean> f22478i;

    /* renamed from: a */
    public final Context f22479a;

    static {
        n88 i = new n88(mo4.m48389a("com.google.android.gms.clearcut.public")).mo46032g("gms:playlog:service:samplingrules_").mo46033i("LogSamplingRules__");
        f22472c = i;
        f22478i = i.mo46031f("enable_log_sampling_rules", false);
    }

    public C4078r(Context context) {
        this.f22479a = context;
        if (context != null) {
            i68.m45484b(context);
        }
    }

    /* renamed from: b */
    public static long m33940b(String str, long j) {
        if (str == null || str.isEmpty()) {
            return b49.m32352c(ByteBuffer.allocate(8).putLong(j).array());
        }
        byte[] bytes = str.getBytes(f22471b);
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 8);
        allocate.put(bytes);
        allocate.putLong(j);
        return b49.m32352c(allocate.array());
    }

    /* renamed from: c */
    public static C4073p.C4075b m33941c(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(44);
        int i = 0;
        if (indexOf >= 0) {
            String substring = str.substring(0, indexOf);
            i = indexOf + 1;
            str2 = substring;
        } else {
            str2 = "";
        }
        int indexOf2 = str.indexOf(47, i);
        if (indexOf2 <= 0) {
            if (str.length() != 0) {
                "Failed to parse the rule: ".concat(str);
            }
            return null;
        }
        try {
            long parseLong = Long.parseLong(str.substring(i, indexOf2));
            long parseLong2 = Long.parseLong(str.substring(indexOf2 + 1));
            if (parseLong >= 0 && parseLong2 >= 0) {
                return (C4073p.C4075b) C4073p.C4075b.m33923A().mo30799r(str2).mo30800t(parseLong).mo30801u(parseLong2).mo30782p();
            }
            StringBuilder sb = new StringBuilder(72);
            sb.append("negative values not supported: ");
            sb.append(parseLong);
            sb.append("/");
            sb.append(parseLong2);
            return null;
        } catch (NumberFormatException unused) {
            if (str.length() != 0) {
                "parseLong() failed while parsing: ".concat(str);
            }
            return null;
        }
    }

    /* renamed from: d */
    public static boolean m33942d(long j, long j2, long j3) {
        if (j2 < 0 || j3 <= 0) {
            return true;
        }
        return ((j > 0 ? 1 : (j == 0 ? 0 : -1)) >= 0 ? j % j3 : (((Long.MAX_VALUE % j3) + 1) + ((j & Long.MAX_VALUE) % j3)) % j3) < j2;
    }

    /* renamed from: e */
    public static boolean m33943e(Context context) {
        if (f22476g == null) {
            f22476g = Boolean.valueOf(tn7.m52384a(context).mo45807a("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return f22476g.booleanValue();
    }

    /* renamed from: f */
    public static long m33944f(Context context) {
        if (f22477h == null) {
            long j = 0;
            if (context == null) {
                return 0;
            }
            if (m33943e(context)) {
                j = gk9.m44741a(context.getContentResolver(), "android_id", 0);
            }
            f22477h = Long.valueOf(j);
        }
        return f22477h.longValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009d, code lost:
        r3 = f22472c.mo46029b(r1, com.google.android.gms.internal.clearcut.C4073p.m33918t(), p000.og9.f32375a);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo30422a(com.google.android.gms.clearcut.zze r13) {
        /*
            r12 = this;
            com.google.android.gms.internal.clearcut.zzr r0 = r13.f22126a
            java.lang.String r1 = r0.f22605s
            int r0 = r0.f22601e
            mv8 r13 = r13.f22134y
            r2 = 0
            if (r13 == 0) goto L_0x000e
            int r13 = r13.f31859s
            goto L_0x000f
        L_0x000e:
            r13 = r2
        L_0x000f:
            i68<java.lang.Boolean> r3 = f22478i
            java.lang.Object r3 = r3.mo43502a()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 0
            if (r3 != 0) goto L_0x0077
            if (r1 == 0) goto L_0x0027
            boolean r13 = r1.isEmpty()
            if (r13 != 0) goto L_0x0027
            goto L_0x002f
        L_0x0027:
            if (r0 < 0) goto L_0x002e
            java.lang.String r1 = java.lang.String.valueOf(r0)
            goto L_0x002f
        L_0x002e:
            r1 = r4
        L_0x002f:
            if (r1 == 0) goto L_0x00fb
            android.content.Context r13 = r12.f22479a
            if (r13 == 0) goto L_0x0056
            boolean r13 = m33943e(r13)
            if (r13 != 0) goto L_0x003c
            goto L_0x0056
        L_0x003c:
            java.util.HashMap<java.lang.String, i68<java.lang.String>> r13 = f22475f
            java.lang.Object r0 = r13.get(r1)
            i68 r0 = (p000.i68) r0
            if (r0 != 0) goto L_0x004f
            n88 r0 = f22473d
            i68 r0 = r0.mo46030c(r1, r4)
            r13.put(r1, r0)
        L_0x004f:
            java.lang.Object r13 = r0.mo43502a()
            r4 = r13
            java.lang.String r4 = (java.lang.String) r4
        L_0x0056:
            com.google.android.gms.internal.clearcut.p$b r13 = m33941c(r4)
            if (r13 == 0) goto L_0x00fb
            java.lang.String r0 = r13.mo30796x()
            android.content.Context r1 = r12.f22479a
            long r1 = m33944f(r1)
            long r3 = m33940b(r0, r1)
            long r5 = r13.mo30797y()
            long r7 = r13.mo30798z()
            boolean r13 = m33942d(r3, r5, r7)
            return r13
        L_0x0077:
            if (r1 == 0) goto L_0x0080
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L_0x0080
            goto L_0x0088
        L_0x0080:
            if (r0 < 0) goto L_0x0087
            java.lang.String r1 = java.lang.String.valueOf(r0)
            goto L_0x0088
        L_0x0087:
            r1 = r4
        L_0x0088:
            if (r1 == 0) goto L_0x00fb
            android.content.Context r0 = r12.f22479a
            if (r0 != 0) goto L_0x0093
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x00bc
        L_0x0093:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, i68<com.google.android.gms.internal.clearcut.p>> r0 = f22474e
            java.lang.Object r3 = r0.get(r1)
            i68 r3 = (p000.i68) r3
            if (r3 != 0) goto L_0x00b2
            n88 r3 = f22472c
            com.google.android.gms.internal.clearcut.p r4 = com.google.android.gms.internal.clearcut.C4073p.m33918t()
            k88 r5 = p000.og9.f32375a
            i68 r3 = r3.mo46029b(r1, r4, r5)
            java.lang.Object r0 = r0.putIfAbsent(r1, r3)
            i68 r0 = (p000.i68) r0
            if (r0 == 0) goto L_0x00b2
            r3 = r0
        L_0x00b2:
            java.lang.Object r0 = r3.mo43502a()
            com.google.android.gms.internal.clearcut.p r0 = (com.google.android.gms.internal.clearcut.C4073p) r0
            java.util.List r0 = r0.mo30790r()
        L_0x00bc:
            java.util.Iterator r0 = r0.iterator()
        L_0x00c0:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00fb
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.clearcut.p$b r1 = (com.google.android.gms.internal.clearcut.C4073p.C4075b) r1
            boolean r3 = r1.mo30795w()
            if (r3 == 0) goto L_0x00de
            int r3 = r1.mo30794r()
            if (r3 == 0) goto L_0x00de
            int r3 = r1.mo30794r()
            if (r3 != r13) goto L_0x00c0
        L_0x00de:
            java.lang.String r3 = r1.mo30796x()
            android.content.Context r4 = r12.f22479a
            long r4 = m33944f(r4)
            long r6 = m33940b(r3, r4)
            long r8 = r1.mo30797y()
            long r10 = r1.mo30798z()
            boolean r1 = m33942d(r6, r8, r10)
            if (r1 != 0) goto L_0x00c0
            return r2
        L_0x00fb:
            r13 = 1
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C4078r.mo30422a(com.google.android.gms.clearcut.zze):boolean");
    }
}
