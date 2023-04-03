package p000;

import android.content.ContentResolver;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import java.util.Map;

/* renamed from: dw4 */
/* compiled from: ProducerSequenceFactory */
public class dw4 {

    /* renamed from: A */
    public Map<vv4<nh0<kh0>>, vv4<nh0<kh0>>> f10906A = new HashMap();

    /* renamed from: a */
    public final ContentResolver f10907a;

    /* renamed from: b */
    public final zv4 f10908b;

    /* renamed from: c */
    public final q54 f10909c;

    /* renamed from: d */
    public final boolean f10910d;

    /* renamed from: e */
    public final boolean f10911e;

    /* renamed from: f */
    public final boolean f10912f;

    /* renamed from: g */
    public final fp6 f10913g;

    /* renamed from: h */
    public final boolean f10914h;

    /* renamed from: i */
    public final boolean f10915i;

    /* renamed from: j */
    public final boolean f10916j;

    /* renamed from: k */
    public final zr2 f10917k;

    /* renamed from: l */
    public final boolean f10918l;

    /* renamed from: m */
    public final boolean f10919m;

    /* renamed from: n */
    public final boolean f10920n;

    /* renamed from: o */
    public vv4<nh0<kh0>> f10921o;

    /* renamed from: p */
    public vv4<gp1> f10922p;

    /* renamed from: q */
    public vv4<nh0<kh0>> f10923q;

    /* renamed from: r */
    public vv4<nh0<kh0>> f10924r;

    /* renamed from: s */
    public vv4<nh0<kh0>> f10925s;

    /* renamed from: t */
    public vv4<nh0<kh0>> f10926t;

    /* renamed from: u */
    public vv4<nh0<kh0>> f10927u;

    /* renamed from: v */
    public vv4<nh0<kh0>> f10928v;

    /* renamed from: w */
    public vv4<nh0<kh0>> f10929w;

    /* renamed from: x */
    public vv4<nh0<kh0>> f10930x;

    /* renamed from: y */
    public Map<vv4<nh0<kh0>>, vv4<nh0<kh0>>> f10931y = new HashMap();

    /* renamed from: z */
    public Map<vv4<nh0<kh0>>, vv4<Void>> f10932z = new HashMap();

    public dw4(ContentResolver contentResolver, zv4 zv4, q54 q54, boolean z, boolean z2, fp6 fp6, boolean z3, boolean z4, boolean z5, boolean z6, zr2 zr2, boolean z7, boolean z8, boolean z9) {
        this.f10907a = contentResolver;
        this.f10908b = zv4;
        this.f10909c = q54;
        this.f10910d = z;
        this.f10911e = z2;
        this.f10913g = fp6;
        this.f10914h = z3;
        this.f10915i = z4;
        this.f10912f = z5;
        this.f10916j = z6;
        this.f10917k = zr2;
        this.f10918l = z7;
        this.f10919m = z8;
        this.f10920n = z9;
    }

    /* renamed from: p */
    public static String m15426p(Uri uri) {
        String valueOf = String.valueOf(uri);
        if (valueOf.length() <= 30) {
            return valueOf;
        }
        return valueOf.substring(0, 30) + "...";
    }

    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e6 A[FINALLY_INSNS] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.vv4<p000.nh0<p000.kh0>> mo18953a(com.facebook.imagepipeline.request.ImageRequest r4) {
        /*
            r3 = this;
            boolean r0 = p000.lc2.m21369d()     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "ProducerSequenceFactory#getBasicDecodedImageSequence"
            p000.lc2.m21366a(r0)     // Catch:{ all -> 0x00df }
        L_0x000b:
            p000.au4.m10792g(r4)     // Catch:{ all -> 0x00df }
            android.net.Uri r0 = r4.mo13458u()     // Catch:{ all -> 0x00df }
            java.lang.String r1 = "Uri is null."
            p000.au4.m10793h(r0, r1)     // Catch:{ all -> 0x00df }
            int r1 = r4.mo13459v()     // Catch:{ all -> 0x00df }
            if (r1 == 0) goto L_0x00d1
            switch(r1) {
                case 2: goto L_0x00c3;
                case 3: goto L_0x00b5;
                case 4: goto L_0x0073;
                case 5: goto L_0x0065;
                case 6: goto L_0x0057;
                case 7: goto L_0x0049;
                case 8: goto L_0x003b;
                default: goto L_0x0020;
            }     // Catch:{ all -> 0x00df }
        L_0x0020:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00df }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
            r1.<init>()     // Catch:{ all -> 0x00df }
            java.lang.String r2 = "Unsupported uri scheme! Uri is: "
            r1.append(r2)     // Catch:{ all -> 0x00df }
            java.lang.String r0 = m15426p(r0)     // Catch:{ all -> 0x00df }
            r1.append(r0)     // Catch:{ all -> 0x00df }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00df }
            r4.<init>(r0)     // Catch:{ all -> 0x00df }
            throw r4     // Catch:{ all -> 0x00df }
        L_0x003b:
            vv4 r4 = r3.mo18967o()     // Catch:{ all -> 0x00df }
            boolean r0 = p000.lc2.m21369d()
            if (r0 == 0) goto L_0x0048
            p000.lc2.m21367b()
        L_0x0048:
            return r4
        L_0x0049:
            vv4 r4 = r3.mo18956d()     // Catch:{ all -> 0x00df }
            boolean r0 = p000.lc2.m21369d()
            if (r0 == 0) goto L_0x0056
            p000.lc2.m21367b()
        L_0x0056:
            return r4
        L_0x0057:
            vv4 r4 = r3.mo18963k()     // Catch:{ all -> 0x00df }
            boolean r0 = p000.lc2.m21369d()
            if (r0 == 0) goto L_0x0064
            p000.lc2.m21367b()
        L_0x0064:
            return r4
        L_0x0065:
            vv4 r4 = r3.mo18959g()     // Catch:{ all -> 0x00df }
            boolean r0 = p000.lc2.m21369d()
            if (r0 == 0) goto L_0x0072
            p000.lc2.m21367b()
        L_0x0072:
            return r4
        L_0x0073:
            boolean r4 = r4.mo13443h()     // Catch:{ all -> 0x00df }
            if (r4 == 0) goto L_0x008d
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00df }
            r1 = 29
            if (r4 < r1) goto L_0x008d
            vv4 r4 = r3.mo18961i()     // Catch:{ all -> 0x00df }
            boolean r0 = p000.lc2.m21369d()
            if (r0 == 0) goto L_0x008c
            p000.lc2.m21367b()
        L_0x008c:
            return r4
        L_0x008d:
            android.content.ContentResolver r4 = r3.f10907a     // Catch:{ all -> 0x00df }
            java.lang.String r4 = r4.getType(r0)     // Catch:{ all -> 0x00df }
            boolean r4 = p000.ks3.m21027c(r4)     // Catch:{ all -> 0x00df }
            if (r4 == 0) goto L_0x00a7
            vv4 r4 = r3.mo18964l()     // Catch:{ all -> 0x00df }
            boolean r0 = p000.lc2.m21369d()
            if (r0 == 0) goto L_0x00a6
            p000.lc2.m21367b()
        L_0x00a6:
            return r4
        L_0x00a7:
            vv4 r4 = r3.mo18960h()     // Catch:{ all -> 0x00df }
            boolean r0 = p000.lc2.m21369d()
            if (r0 == 0) goto L_0x00b4
            p000.lc2.m21367b()
        L_0x00b4:
            return r4
        L_0x00b5:
            vv4 r4 = r3.mo18962j()     // Catch:{ all -> 0x00df }
            boolean r0 = p000.lc2.m21369d()
            if (r0 == 0) goto L_0x00c2
            p000.lc2.m21367b()
        L_0x00c2:
            return r4
        L_0x00c3:
            vv4 r4 = r3.mo18964l()     // Catch:{ all -> 0x00df }
            boolean r0 = p000.lc2.m21369d()
            if (r0 == 0) goto L_0x00d0
            p000.lc2.m21367b()
        L_0x00d0:
            return r4
        L_0x00d1:
            vv4 r4 = r3.mo18965m()     // Catch:{ all -> 0x00df }
            boolean r0 = p000.lc2.m21369d()
            if (r0 == 0) goto L_0x00de
            p000.lc2.m21367b()
        L_0x00de:
            return r4
        L_0x00df:
            r4 = move-exception
            boolean r0 = p000.lc2.m21369d()
            if (r0 == 0) goto L_0x00e9
            p000.lc2.m21367b()
        L_0x00e9:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dw4.mo18953a(com.facebook.imagepipeline.request.ImageRequest):vv4");
    }

    /* renamed from: b */
    public final synchronized vv4<nh0<kh0>> mo18954b(vv4<nh0<kh0>> vv4) {
        vv4<nh0<kh0>> vv42;
        vv42 = this.f10906A.get(vv4);
        if (vv42 == null) {
            vv42 = this.f10908b.mo28595f(vv4);
            this.f10906A.put(vv4, vv42);
        }
        return vv42;
    }

    /* renamed from: c */
    public final synchronized vv4<gp1> mo18955c() {
        boolean z;
        if (lc2.m21369d()) {
            lc2.m21366a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
        }
        if (this.f10922p == null) {
            if (lc2.m21369d()) {
                lc2.m21366a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence:init");
            }
            C2657kc a = zv4.m31522a((vv4) au4.m10792g(mo18973v(this.f10908b.mo28613y(this.f10909c))));
            this.f10922p = a;
            zv4 zv4 = this.f10908b;
            if (!this.f10910d || this.f10914h) {
                z = false;
            } else {
                z = true;
            }
            this.f10922p = zv4.mo28587D(a, z, this.f10917k);
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
        }
        if (lc2.m21369d()) {
            lc2.m21367b();
        }
        return this.f10922p;
    }

    /* renamed from: d */
    public final synchronized vv4<nh0<kh0>> mo18956d() {
        if (this.f10928v == null) {
            vv4 i = this.f10908b.mo28597i();
            if (fk7.f11898a && (!this.f10911e || fk7.f11901d == null)) {
                i = this.f10908b.mo28590G(i);
            }
            this.f10928v = mo18969r(this.f10908b.mo28587D(zv4.m31522a(i), true, this.f10917k));
        }
        return this.f10928v;
    }

    /* renamed from: e */
    public vv4<nh0<kh0>> mo18957e(ImageRequest imageRequest) {
        if (lc2.m21369d()) {
            lc2.m21366a("ProducerSequenceFactory#getDecodedImageProducerSequence");
        }
        vv4<nh0<kh0>> a = mo18953a(imageRequest);
        if (imageRequest.mo13447k() != null) {
            a = mo18966n(a);
        }
        if (this.f10915i) {
            a = mo18954b(a);
        }
        if (this.f10920n && imageRequest.mo13441f() > 0) {
            a = mo18958f(a);
        }
        if (lc2.m21369d()) {
            lc2.m21367b();
        }
        return a;
    }

    /* renamed from: f */
    public final synchronized vv4<nh0<kh0>> mo18958f(vv4<nh0<kh0>> vv4) {
        return this.f10908b.mo28599k(vv4);
    }

    /* renamed from: g */
    public final synchronized vv4<nh0<kh0>> mo18959g() {
        if (this.f10927u == null) {
            this.f10927u = mo18970s(this.f10908b.mo28605q());
        }
        return this.f10927u;
    }

    /* renamed from: h */
    public final synchronized vv4<nh0<kh0>> mo18960h() {
        if (this.f10925s == null) {
            this.f10925s = mo18971t(this.f10908b.mo28606r(), new wp6[]{this.f10908b.mo28607s(), this.f10908b.mo28608t()});
        }
        return this.f10925s;
    }

    /* renamed from: i */
    public final synchronized vv4<nh0<kh0>> mo18961i() {
        if (this.f10929w == null) {
            this.f10929w = mo18968q(this.f10908b.mo28611w());
        }
        return this.f10929w;
    }

    /* renamed from: j */
    public final synchronized vv4<nh0<kh0>> mo18962j() {
        if (this.f10923q == null) {
            this.f10923q = mo18970s(this.f10908b.mo28609u());
        }
        return this.f10923q;
    }

    /* renamed from: k */
    public final synchronized vv4<nh0<kh0>> mo18963k() {
        if (this.f10926t == null) {
            this.f10926t = mo18970s(this.f10908b.mo28610v());
        }
        return this.f10926t;
    }

    /* renamed from: l */
    public final synchronized vv4<nh0<kh0>> mo18964l() {
        if (this.f10924r == null) {
            this.f10924r = mo18968q(this.f10908b.mo28612x());
        }
        return this.f10924r;
    }

    /* renamed from: m */
    public final synchronized vv4<nh0<kh0>> mo18965m() {
        if (lc2.m21369d()) {
            lc2.m21366a("ProducerSequenceFactory#getNetworkFetchSequence");
        }
        if (this.f10921o == null) {
            if (lc2.m21369d()) {
                lc2.m21366a("ProducerSequenceFactory#getNetworkFetchSequence:init");
            }
            this.f10921o = mo18969r(mo18955c());
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
        }
        if (lc2.m21369d()) {
            lc2.m21367b();
        }
        return this.f10921o;
    }

    /* renamed from: n */
    public final synchronized vv4<nh0<kh0>> mo18966n(vv4<nh0<kh0>> vv4) {
        vv4<nh0<kh0>> vv42;
        vv42 = this.f10931y.get(vv4);
        if (vv42 == null) {
            vv42 = this.f10908b.mo28584A(this.f10908b.mo28585B(vv4));
            this.f10931y.put(vv4, vv42);
        }
        return vv42;
    }

    /* renamed from: o */
    public final synchronized vv4<nh0<kh0>> mo18967o() {
        if (this.f10930x == null) {
            this.f10930x = mo18970s(this.f10908b.mo28586C());
        }
        return this.f10930x;
    }

    /* renamed from: q */
    public final vv4<nh0<kh0>> mo18968q(vv4<nh0<kh0>> vv4) {
        vv4 b = this.f10908b.mo28591b(this.f10908b.mo28593d(this.f10908b.mo28594e(vv4)), this.f10913g);
        if (!this.f10918l && !this.f10919m) {
            return this.f10908b.mo28592c(b);
        }
        return this.f10908b.mo28596g(this.f10908b.mo28592c(b));
    }

    /* renamed from: r */
    public final vv4<nh0<kh0>> mo18969r(vv4<gp1> vv4) {
        if (lc2.m21369d()) {
            lc2.m21366a("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        }
        vv4<nh0<kh0>> q = mo18968q(this.f10908b.mo28598j(vv4));
        if (lc2.m21369d()) {
            lc2.m21367b();
        }
        return q;
    }

    /* renamed from: s */
    public final vv4<nh0<kh0>> mo18970s(vv4<gp1> vv4) {
        return mo18971t(vv4, new wp6[]{this.f10908b.mo28608t()});
    }

    /* renamed from: t */
    public final vv4<nh0<kh0>> mo18971t(vv4<gp1> vv4, wp6<gp1>[] wp6Arr) {
        return mo18969r(mo18975x(mo18973v(vv4), wp6Arr));
    }

    /* renamed from: u */
    public final vv4<gp1> mo18972u(vv4<gp1> vv4) {
        zg1 zg1;
        if (lc2.m21369d()) {
            lc2.m21366a("ProducerSequenceFactory#newDiskCacheSequence");
        }
        if (this.f10912f) {
            zg1 = this.f10908b.mo28601m(this.f10908b.mo28614z(vv4));
        } else {
            zg1 = this.f10908b.mo28601m(vv4);
        }
        wg1 l = this.f10908b.mo28600l(zg1);
        if (lc2.m21369d()) {
            lc2.m21367b();
        }
        return l;
    }

    /* renamed from: v */
    public final vv4<gp1> mo18973v(vv4<gp1> vv4) {
        if (fk7.f11898a && (!this.f10911e || fk7.f11901d == null)) {
            vv4 = this.f10908b.mo28590G(vv4);
        }
        if (this.f10916j) {
            vv4 = mo18972u(vv4);
        }
        ip1 o = this.f10908b.mo28603o(vv4);
        if (!this.f10919m) {
            return this.f10908b.mo28602n(o);
        }
        return this.f10908b.mo28602n(this.f10908b.mo28604p(o));
    }

    /* renamed from: w */
    public final vv4<gp1> mo18974w(wp6<gp1>[] wp6Arr) {
        return this.f10908b.mo28587D(this.f10908b.mo28589F(wp6Arr), true, this.f10917k);
    }

    /* renamed from: x */
    public final vv4<gp1> mo18975x(vv4<gp1> vv4, wp6<gp1>[] wp6Arr) {
        return zv4.m31523h(mo18974w(wp6Arr), this.f10908b.mo28588E(this.f10908b.mo28587D(zv4.m31522a(vv4), true, this.f10917k)));
    }
}
