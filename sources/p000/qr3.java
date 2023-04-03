package p000;

import android.os.Handler;
import androidx.media3.common.C0831s;
import androidx.media3.exoplayer.source.C0971h;
import androidx.media3.exoplayer.source.C0973i;
import com.google.common.collect.ImmutableList;

/* renamed from: qr3 */
/* compiled from: MediaPeriodQueue */
public final class qr3 {

    /* renamed from: a */
    public final C0831s.C0833b f17024a = new C0831s.C0833b();

    /* renamed from: b */
    public final C0831s.C0835d f17025b = new C0831s.C0835d();

    /* renamed from: c */
    public final C3142qf f17026c;

    /* renamed from: d */
    public final Handler f17027d;

    /* renamed from: e */
    public long f17028e;

    /* renamed from: f */
    public int f17029f;

    /* renamed from: g */
    public boolean f17030g;

    /* renamed from: h */
    public mr3 f17031h;

    /* renamed from: i */
    public mr3 f17032i;

    /* renamed from: j */
    public mr3 f17033j;

    /* renamed from: k */
    public int f17034k;

    /* renamed from: l */
    public Object f17035l;

    /* renamed from: m */
    public long f17036m;

    public qr3(C3142qf qfVar, Handler handler) {
        this.f17026c = qfVar;
        this.f17027d = handler;
    }

    /* renamed from: A */
    public static C0973i.C0975b m25861A(C0831s sVar, Object obj, long j, long j2, C0831s.C0835d dVar, C0831s.C0833b bVar) {
        sVar.mo6874l(obj, bVar);
        sVar.mo6880r(bVar.f4438e, dVar);
        int f = sVar.mo6867f(obj);
        Object obj2 = obj;
        while (bVar.f4439g == 0 && bVar.mo6889f() > 0 && bVar.mo6904t(bVar.mo6902r()) && bVar.mo6891h(0) == -1) {
            int i = f + 1;
            if (f >= dVar.f4457M) {
                break;
            }
            sVar.mo6873k(i, bVar, true);
            obj2 = C2725kr.m20985e(bVar.f4437d);
            f = i;
        }
        sVar.mo6874l(obj2, bVar);
        int h = bVar.mo6891h(j);
        if (h == -1) {
            return new C0973i.C0975b(obj2, j2, bVar.mo6890g(j));
        }
        return new C0973i.C0975b(obj2, h, bVar.mo6898n(h), j2);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m25863w(ImmutableList.C4534a aVar, C0973i.C0975b bVar) {
        this.f17026c.mo19132F(aVar.mo34692l(), bVar);
    }

    /* renamed from: B */
    public C0973i.C0975b mo25219B(C0831s sVar, Object obj, long j) {
        long C = mo25220C(sVar, obj);
        sVar.mo6874l(obj, this.f17024a);
        sVar.mo6880r(this.f17024a.f4438e, this.f17025b);
        boolean z = false;
        for (int f = sVar.mo6867f(obj); f >= this.f17025b.f4456L; f--) {
            boolean z2 = true;
            sVar.mo6873k(f, this.f17024a, true);
            if (this.f17024a.mo6889f() <= 0) {
                z2 = false;
            }
            z |= z2;
            C0831s.C0833b bVar = this.f17024a;
            if (bVar.mo6891h(bVar.f4439g) != -1) {
                obj = C2725kr.m20985e(this.f17024a.f4437d);
            }
            if (z && (!z2 || this.f17024a.f4439g != 0)) {
                break;
            }
        }
        return m25861A(sVar, obj, j, C, this.f17025b, this.f17024a);
    }

    /* renamed from: C */
    public final long mo25220C(C0831s sVar, Object obj) {
        int f;
        int i = sVar.mo6874l(obj, this.f17024a).f4438e;
        Object obj2 = this.f17035l;
        if (obj2 != null && (f = sVar.mo6867f(obj2)) != -1 && sVar.mo6872j(f, this.f17024a).f4438e == i) {
            return this.f17036m;
        }
        for (mr3 mr3 = this.f17031h; mr3 != null; mr3 = mr3.mo23363j()) {
            if (mr3.f15226b.equals(obj)) {
                return mr3.f15230f.f16038a.f15662d;
            }
        }
        for (mr3 mr32 = this.f17031h; mr32 != null; mr32 = mr32.mo23363j()) {
            int f2 = sVar.mo6867f(mr32.f15226b);
            if (f2 != -1 && sVar.mo6872j(f2, this.f17024a).f4438e == i) {
                return mr32.f15230f.f16038a.f15662d;
            }
        }
        long j = this.f17028e;
        this.f17028e = 1 + j;
        if (this.f17031h == null) {
            this.f17035l = obj;
            this.f17036m = j;
        }
        return j;
    }

    /* renamed from: D */
    public boolean mo25221D() {
        mr3 mr3 = this.f17033j;
        if (mr3 == null || (!mr3.f15230f.f16046i && mr3.mo23370q() && this.f17033j.f15230f.f16042e != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED && this.f17034k < 100)) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public final boolean mo25222E(C0831s sVar) {
        mr3 mr3 = this.f17031h;
        if (mr3 == null) {
            return true;
        }
        int f = sVar.mo6867f(mr3.f15226b);
        while (true) {
            f = sVar.mo6869h(f, this.f17024a, this.f17025b, this.f17029f, this.f17030g);
            while (mr3.mo23363j() != null && !mr3.f15230f.f16044g) {
                mr3 = mr3.mo23363j();
            }
            mr3 j = mr3.mo23363j();
            if (f == -1 || j == null || sVar.mo6867f(j.f15226b) != f) {
                boolean z = mo25249z(mr3);
                mr3.f15230f = mo25242r(sVar, mr3.f15230f);
            } else {
                mr3 = j;
            }
        }
        boolean z2 = mo25249z(mr3);
        mr3.f15230f = mo25242r(sVar, mr3.f15230f);
        return !z2;
    }

    /* renamed from: F */
    public boolean mo25223F(C0831s sVar, long j, long j2) {
        or3 or3;
        long j3;
        boolean z;
        mr3 mr3 = null;
        for (mr3 mr32 = this.f17031h; mr32 != null; mr32 = mr32.mo23363j()) {
            or3 or32 = mr32.f15230f;
            if (mr3 == null) {
                or3 = mo25242r(sVar, or32);
            } else {
                or3 i = mo25233i(sVar, mr3, j);
                if (i == null) {
                    return !mo25249z(mr3);
                }
                if (!mo25229e(or32, i)) {
                    return !mo25249z(mr3);
                }
                or3 = i;
            }
            mr32.f15230f = or3.mo24082a(or32.f16040c);
            if (!mo25228d(or32.f16042e, or3.f16042e)) {
                mr32.mo23354A();
                long j4 = or3.f16042e;
                if (j4 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                    j3 = Long.MAX_VALUE;
                } else {
                    j3 = mr32.mo23378z(j4);
                }
                if (mr32 != this.f17032i || mr32.f15230f.f16043f || (j2 != Long.MIN_VALUE && j2 < j3)) {
                    z = false;
                } else {
                    z = true;
                }
                if (mo25249z(mr32) || z) {
                    return false;
                }
                return true;
            }
            mr3 = mr32;
        }
        return true;
    }

    /* renamed from: G */
    public boolean mo25224G(C0831s sVar, int i) {
        this.f17029f = i;
        return mo25222E(sVar);
    }

    /* renamed from: H */
    public boolean mo25225H(C0831s sVar, boolean z) {
        this.f17030g = z;
        return mo25222E(sVar);
    }

    /* renamed from: b */
    public mr3 mo25226b() {
        mr3 mr3 = this.f17031h;
        if (mr3 == null) {
            return null;
        }
        if (mr3 == this.f17032i) {
            this.f17032i = mr3.mo23363j();
        }
        this.f17031h.mo23373t();
        int i = this.f17034k - 1;
        this.f17034k = i;
        if (i == 0) {
            this.f17033j = null;
            mr3 mr32 = this.f17031h;
            this.f17035l = mr32.f15226b;
            this.f17036m = mr32.f15230f.f16038a.f15662d;
        }
        this.f17031h = this.f17031h.mo23363j();
        mo25247x();
        return this.f17031h;
    }

    /* renamed from: c */
    public mr3 mo25227c() {
        boolean z;
        mr3 mr3 = this.f17032i;
        if (mr3 == null || mr3.mo23363j() == null) {
            z = false;
        } else {
            z = true;
        }
        C2725kr.m20987g(z);
        this.f17032i = this.f17032i.mo23363j();
        mo25247x();
        return this.f17032i;
    }

    /* renamed from: d */
    public final boolean mo25228d(long j, long j2) {
        return j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED || j == j2;
    }

    /* renamed from: e */
    public final boolean mo25229e(or3 or3, or3 or32) {
        if (or3.f16039b != or32.f16039b || !or3.f16038a.equals(or32.f16038a)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo25230f() {
        if (this.f17034k != 0) {
            mr3 mr3 = (mr3) C2725kr.m20989i(this.f17031h);
            this.f17035l = mr3.f15226b;
            this.f17036m = mr3.f15230f.f16038a.f15662d;
            while (mr3 != null) {
                mr3.mo23373t();
                mr3 = mr3.mo23363j();
            }
            this.f17031h = null;
            this.f17033j = null;
            this.f17032i = null;
            this.f17034k = 0;
            mo25247x();
        }
    }

    /* renamed from: g */
    public mr3 mo25231g(od5[] od5Arr, ft6 ft6, C2891nf nfVar, fs3 fs3, or3 or3, gt6 gt6) {
        long j;
        mr3 mr3 = this.f17033j;
        if (mr3 == null) {
            j = 1000000000000L;
            or3 or32 = or3;
        } else {
            j = (mr3.mo23365l() + this.f17033j.f15230f.f16042e) - or3.f16039b;
        }
        mr3 mr32 = new mr3(od5Arr, j, ft6, nfVar, fs3, or3, gt6);
        mr3 mr33 = this.f17033j;
        if (mr33 != null) {
            mr33.mo23375w(mr32);
        } else {
            this.f17031h = mr32;
            this.f17032i = mr32;
        }
        this.f17035l = null;
        this.f17033j = mr32;
        this.f17034k++;
        mo25247x();
        return mr32;
    }

    /* renamed from: h */
    public final or3 mo25232h(zp4 zp4) {
        return mo25235k(zp4.f20628a, zp4.f20629b, zp4.f20630c, zp4.f20645r);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cc, code lost:
        if (r0.mo6904t(r0.mo6902r()) != false) goto L_0x00d0;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.or3 mo25233i(androidx.media3.common.C0831s r20, p000.mr3 r21, long r22) {
        /*
            r19 = this;
            r9 = r19
            r8 = r20
            r10 = r21
            or3 r11 = r10.f15230f
            long r0 = r21.mo23365l()
            long r2 = r11.f16042e
            long r0 = r0 + r2
            long r6 = r0 - r22
            boolean r0 = r11.f16044g
            r13 = -1
            r14 = 1
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r17 = 0
            if (r0 == 0) goto L_0x00ef
            androidx.media3.exoplayer.source.i$b r0 = r11.f16038a
            java.lang.Object r0 = r0.f15659a
            int r1 = r8.mo6867f(r0)
            androidx.media3.common.s$b r2 = r9.f17024a
            androidx.media3.common.s$d r3 = r9.f17025b
            int r0 = r9.f17029f
            boolean r5 = r9.f17030g
            r4 = r0
            r0 = r20
            int r0 = r0.mo6869h(r1, r2, r3, r4, r5)
            if (r0 != r13) goto L_0x0038
            return r17
        L_0x0038:
            androidx.media3.common.s$b r1 = r9.f17024a
            androidx.media3.common.s$b r1 = r8.mo6873k(r0, r1, r14)
            int r3 = r1.f4438e
            androidx.media3.common.s$b r1 = r9.f17024a
            java.lang.Object r1 = r1.f4437d
            java.lang.Object r1 = p000.C2725kr.m20985e(r1)
            androidx.media3.exoplayer.source.i$b r2 = r11.f16038a
            long r4 = r2.f15662d
            androidx.media3.common.s$d r2 = r9.f17025b
            androidx.media3.common.s$d r2 = r8.mo6880r(r3, r2)
            int r2 = r2.f4456L
            if (r2 != r0) goto L_0x0099
            androidx.media3.common.s$d r1 = r9.f17025b
            androidx.media3.common.s$b r2 = r9.f17024a
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = 0
            long r6 = java.lang.Math.max(r12, r6)
            r0 = r20
            android.util.Pair r0 = r0.mo6877o(r1, r2, r3, r4, r6)
            if (r0 != 0) goto L_0x006e
            return r17
        L_0x006e:
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            mr3 r0 = r21.mo23363j()
            if (r0 == 0) goto L_0x008d
            java.lang.Object r2 = r0.f15226b
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x008d
            or3 r0 = r0.f15230f
            androidx.media3.exoplayer.source.i$b r0 = r0.f16038a
            long r2 = r0.f15662d
            goto L_0x0094
        L_0x008d:
            long r2 = r9.f17028e
            r6 = 1
            long r6 = r6 + r2
            r9.f17028e = r6
        L_0x0094:
            r12 = r4
            r17 = r15
            r4 = r2
            goto L_0x009d
        L_0x0099:
            r12 = 0
            r17 = r12
        L_0x009d:
            androidx.media3.common.s$d r6 = r9.f17025b
            androidx.media3.common.s$b r7 = r9.f17024a
            r0 = r20
            r2 = r12
            androidx.media3.exoplayer.source.i$b r2 = m25861A(r0, r1, r2, r4, r6, r7)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x00e3
            long r0 = r11.f16040c
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x00e3
            androidx.media3.exoplayer.source.i$b r0 = r11.f16038a
            java.lang.Object r0 = r0.f15659a
            androidx.media3.common.s$b r1 = r9.f17024a
            androidx.media3.common.s$b r0 = r8.mo6874l(r0, r1)
            int r0 = r0.mo6889f()
            if (r0 <= 0) goto L_0x00cf
            androidx.media3.common.s$b r0 = r9.f17024a
            int r1 = r0.mo6902r()
            boolean r0 = r0.mo6904t(r1)
            if (r0 == 0) goto L_0x00cf
            goto L_0x00d0
        L_0x00cf:
            r14 = 0
        L_0x00d0:
            boolean r0 = r2.mo23781b()
            if (r0 == 0) goto L_0x00dd
            if (r14 == 0) goto L_0x00dd
            long r0 = r11.f16040c
            r3 = r0
            r5 = r12
            goto L_0x00e6
        L_0x00dd:
            if (r14 == 0) goto L_0x00e3
            long r0 = r11.f16040c
            r5 = r0
            goto L_0x00e4
        L_0x00e3:
            r5 = r12
        L_0x00e4:
            r3 = r17
        L_0x00e6:
            r0 = r19
            r1 = r20
            or3 r0 = r0.mo25235k(r1, r2, r3, r5)
            return r0
        L_0x00ef:
            r0 = r13
            r12 = 0
            androidx.media3.exoplayer.source.i$b r10 = r11.f16038a
            java.lang.Object r1 = r10.f15659a
            androidx.media3.common.s$b r2 = r9.f17024a
            r8.mo6874l(r1, r2)
            boolean r1 = r10.mo23781b()
            if (r1 == 0) goto L_0x016b
            int r3 = r10.f15660b
            androidx.media3.common.s$b r1 = r9.f17024a
            int r1 = r1.mo6886d(r3)
            if (r1 != r0) goto L_0x010c
            return r17
        L_0x010c:
            androidx.media3.common.s$b r0 = r9.f17024a
            int r2 = r10.f15661c
            int r4 = r0.mo6899o(r3, r2)
            if (r4 >= r1) goto L_0x0126
            java.lang.Object r2 = r10.f15659a
            long r5 = r11.f16040c
            long r10 = r10.f15662d
            r0 = r19
            r1 = r20
            r7 = r10
            or3 r0 = r0.mo25236l(r1, r2, r3, r4, r5, r7)
            return r0
        L_0x0126:
            long r0 = r11.f16040c
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r2 != 0) goto L_0x014c
            androidx.media3.common.s$d r1 = r9.f17025b
            androidx.media3.common.s$b r2 = r9.f17024a
            int r3 = r2.f4438e
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r6 = java.lang.Math.max(r12, r6)
            r0 = r20
            android.util.Pair r0 = r0.mo6877o(r1, r2, r3, r4, r6)
            if (r0 != 0) goto L_0x0144
            return r17
        L_0x0144:
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
        L_0x014c:
            java.lang.Object r2 = r10.f15659a
            int r3 = r10.f15660b
            long r2 = r9.mo25238n(r8, r2, r3)
            java.lang.Object r4 = r10.f15659a
            long r5 = java.lang.Math.max(r2, r0)
            long r11 = r11.f16040c
            long r13 = r10.f15662d
            r0 = r19
            r1 = r20
            r2 = r4
            r3 = r5
            r5 = r11
            r7 = r13
            or3 r0 = r0.mo25237m(r1, r2, r3, r5, r7)
            return r0
        L_0x016b:
            androidx.media3.common.s$b r0 = r9.f17024a
            int r1 = r10.f15663e
            int r4 = r0.mo6898n(r1)
            androidx.media3.common.s$b r0 = r9.f17024a
            int r1 = r10.f15663e
            boolean r0 = r0.mo6904t(r1)
            if (r0 == 0) goto L_0x018a
            androidx.media3.common.s$b r0 = r9.f17024a
            int r1 = r10.f15663e
            int r0 = r0.mo6895k(r1, r4)
            r1 = 3
            if (r0 != r1) goto L_0x018a
            r12 = r14
            goto L_0x018b
        L_0x018a:
            r12 = 0
        L_0x018b:
            androidx.media3.common.s$b r0 = r9.f17024a
            int r1 = r10.f15663e
            int r0 = r0.mo6886d(r1)
            if (r4 == r0) goto L_0x01aa
            if (r12 == 0) goto L_0x0198
            goto L_0x01aa
        L_0x0198:
            java.lang.Object r2 = r10.f15659a
            int r3 = r10.f15663e
            long r5 = r11.f16042e
            long r10 = r10.f15662d
            r0 = r19
            r1 = r20
            r7 = r10
            or3 r0 = r0.mo25236l(r1, r2, r3, r4, r5, r7)
            return r0
        L_0x01aa:
            java.lang.Object r0 = r10.f15659a
            int r1 = r10.f15663e
            long r3 = r9.mo25238n(r8, r0, r1)
            java.lang.Object r2 = r10.f15659a
            long r5 = r11.f16042e
            long r10 = r10.f15662d
            r0 = r19
            r1 = r20
            r7 = r10
            or3 r0 = r0.mo25237m(r1, r2, r3, r5, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.qr3.mo25233i(androidx.media3.common.s, mr3, long):or3");
    }

    /* renamed from: j */
    public mr3 mo25234j() {
        return this.f17033j;
    }

    /* renamed from: k */
    public final or3 mo25235k(C0831s sVar, C0973i.C0975b bVar, long j, long j2) {
        C0973i.C0975b bVar2 = bVar;
        C0831s sVar2 = sVar;
        sVar.mo6874l(bVar2.f15659a, this.f17024a);
        if (bVar.mo23781b()) {
            return mo25236l(sVar, bVar2.f15659a, bVar2.f15660b, bVar2.f15661c, j, bVar2.f15662d);
        }
        return mo25237m(sVar, bVar2.f15659a, j2, j, bVar2.f15662d);
    }

    /* renamed from: l */
    public final or3 mo25236l(C0831s sVar, Object obj, int i, int i2, long j, long j2) {
        long j3;
        long j4;
        int i3 = i2;
        C0973i.C0975b bVar = new C0973i.C0975b(obj, i, i3, j2);
        long e = sVar.mo6874l(bVar.f15659a, this.f17024a).mo6887e(bVar.f15660b, bVar.f15661c);
        if (i3 == this.f17024a.mo6898n(i)) {
            j3 = this.f17024a.mo6894j();
        } else {
            j3 = 0;
        }
        boolean t = this.f17024a.mo6904t(bVar.f15660b);
        if (e == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED || j3 < e) {
            j4 = j3;
        } else {
            j4 = Math.max(0, e - 1);
        }
        return new or3(bVar, j4, j, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, e, t, false, false, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.or3 mo25237m(androidx.media3.common.C0831s r25, java.lang.Object r26, long r27, long r29, long r31) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            androidx.media3.common.s$b r5 = r0.f17024a
            r1.mo6874l(r2, r5)
            androidx.media3.common.s$b r5 = r0.f17024a
            int r5 = r5.mo6890g(r3)
            r6 = 1
            r7 = -1
            r8 = 0
            if (r5 != r7) goto L_0x002e
            androidx.media3.common.s$b r9 = r0.f17024a
            int r9 = r9.mo6889f()
            if (r9 <= 0) goto L_0x004d
            androidx.media3.common.s$b r9 = r0.f17024a
            int r10 = r9.mo6902r()
            boolean r9 = r9.mo6904t(r10)
            if (r9 == 0) goto L_0x004d
            r9 = r6
            goto L_0x004e
        L_0x002e:
            androidx.media3.common.s$b r9 = r0.f17024a
            boolean r9 = r9.mo6904t(r5)
            if (r9 == 0) goto L_0x004d
            androidx.media3.common.s$b r9 = r0.f17024a
            long r9 = r9.mo6893i(r5)
            androidx.media3.common.s$b r11 = r0.f17024a
            long r12 = r11.f4439g
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L_0x004d
            boolean r9 = r11.mo6903s(r5)
            if (r9 == 0) goto L_0x004d
            r9 = r6
            r5 = r7
            goto L_0x004e
        L_0x004d:
            r9 = r8
        L_0x004e:
            androidx.media3.exoplayer.source.i$b r11 = new androidx.media3.exoplayer.source.i$b
            r12 = r31
            r11.<init>(r2, r12, r5)
            boolean r2 = r0.mo25243s(r11)
            boolean r22 = r0.mo25245u(r1, r11)
            boolean r23 = r0.mo25244t(r1, r11, r2)
            if (r5 == r7) goto L_0x006e
            androidx.media3.common.s$b r1 = r0.f17024a
            boolean r1 = r1.mo6904t(r5)
            if (r1 == 0) goto L_0x006e
            r20 = r6
            goto L_0x0070
        L_0x006e:
            r20 = r8
        L_0x0070:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 == r7) goto L_0x0080
            androidx.media3.common.s$b r1 = r0.f17024a
            long r14 = r1.mo6893i(r5)
        L_0x007d:
            r16 = r14
            goto L_0x0089
        L_0x0080:
            if (r9 == 0) goto L_0x0087
            androidx.media3.common.s$b r1 = r0.f17024a
            long r14 = r1.f4439g
            goto L_0x007d
        L_0x0087:
            r16 = r12
        L_0x0089:
            int r1 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x0097
            r14 = -9223372036854775808
            int r1 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r1 != 0) goto L_0x0094
            goto L_0x0097
        L_0x0094:
            r18 = r16
            goto L_0x009d
        L_0x0097:
            androidx.media3.common.s$b r1 = r0.f17024a
            long r14 = r1.f4439g
            r18 = r14
        L_0x009d:
            int r1 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x00b4
            int r1 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r1 < 0) goto L_0x00b4
            if (r23 != 0) goto L_0x00ab
            if (r9 != 0) goto L_0x00aa
            goto L_0x00ab
        L_0x00aa:
            r6 = r8
        L_0x00ab:
            r3 = 0
            long r5 = (long) r6
            long r5 = r18 - r5
            long r3 = java.lang.Math.max(r3, r5)
        L_0x00b4:
            r12 = r3
            or3 r1 = new or3
            r10 = r1
            r14 = r29
            r21 = r2
            r10.<init>(r11, r12, r14, r16, r18, r20, r21, r22, r23)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.qr3.mo25237m(androidx.media3.common.s, java.lang.Object, long, long, long):or3");
    }

    /* renamed from: n */
    public final long mo25238n(C0831s sVar, Object obj, int i) {
        sVar.mo6874l(obj, this.f17024a);
        long i2 = this.f17024a.mo6893i(i);
        if (i2 == Long.MIN_VALUE) {
            return this.f17024a.f4439g;
        }
        return i2 + this.f17024a.mo6896l(i);
    }

    /* renamed from: o */
    public or3 mo25239o(long j, zp4 zp4) {
        mr3 mr3 = this.f17033j;
        if (mr3 == null) {
            return mo25232h(zp4);
        }
        return mo25233i(zp4.f20628a, mr3, j);
    }

    /* renamed from: p */
    public mr3 mo25240p() {
        return this.f17031h;
    }

    /* renamed from: q */
    public mr3 mo25241q() {
        return this.f17032i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.or3 mo25242r(androidx.media3.common.C0831s r19, p000.or3 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            androidx.media3.exoplayer.source.i$b r3 = r2.f16038a
            boolean r12 = r0.mo25243s(r3)
            boolean r13 = r0.mo25245u(r1, r3)
            boolean r14 = r0.mo25244t(r1, r3, r12)
            androidx.media3.exoplayer.source.i$b r4 = r2.f16038a
            java.lang.Object r4 = r4.f15659a
            androidx.media3.common.s$b r5 = r0.f17024a
            r1.mo6874l(r4, r5)
            boolean r1 = r3.mo23781b()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0035
            int r1 = r3.f15663e
            if (r1 != r4) goto L_0x002e
            goto L_0x0035
        L_0x002e:
            androidx.media3.common.s$b r7 = r0.f17024a
            long r7 = r7.mo6893i(r1)
            goto L_0x0036
        L_0x0035:
            r7 = r5
        L_0x0036:
            boolean r1 = r3.mo23781b()
            if (r1 == 0) goto L_0x0048
            androidx.media3.common.s$b r1 = r0.f17024a
            int r5 = r3.f15660b
            int r6 = r3.f15661c
            long r5 = r1.mo6887e(r5, r6)
        L_0x0046:
            r9 = r5
            goto L_0x005c
        L_0x0048:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0055
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r9 = r7
            goto L_0x005c
        L_0x0055:
            androidx.media3.common.s$b r1 = r0.f17024a
            long r5 = r1.mo6897m()
            goto L_0x0046
        L_0x005c:
            boolean r1 = r3.mo23781b()
            if (r1 == 0) goto L_0x006c
            androidx.media3.common.s$b r1 = r0.f17024a
            int r4 = r3.f15660b
            boolean r1 = r1.mo6904t(r4)
        L_0x006a:
            r11 = r1
            goto L_0x007c
        L_0x006c:
            int r1 = r3.f15663e
            if (r1 == r4) goto L_0x007a
            androidx.media3.common.s$b r4 = r0.f17024a
            boolean r1 = r4.mo6904t(r1)
            if (r1 == 0) goto L_0x007a
            r1 = 1
            goto L_0x006a
        L_0x007a:
            r1 = 0
            goto L_0x006a
        L_0x007c:
            or3 r15 = new or3
            long r4 = r2.f16039b
            long r1 = r2.f16040c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.qr3.mo25242r(androidx.media3.common.s, or3):or3");
    }

    /* renamed from: s */
    public final boolean mo25243s(C0973i.C0975b bVar) {
        if (bVar.mo23781b() || bVar.f15663e != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public final boolean mo25244t(C0831s sVar, C0973i.C0975b bVar, boolean z) {
        int f = sVar.mo6867f(bVar.f15659a);
        if (!sVar.mo6880r(sVar.mo6872j(f, this.f17024a).f4438e, this.f17025b).f4467y) {
            if (!sVar.mo6884v(f, this.f17024a, this.f17025b, this.f17029f, this.f17030g) || !z) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final boolean mo25245u(C0831s sVar, C0973i.C0975b bVar) {
        if (!mo25243s(bVar)) {
            return false;
        }
        int i = sVar.mo6874l(bVar.f15659a, this.f17024a).f4438e;
        if (sVar.mo6880r(i, this.f17025b).f4457M == sVar.mo6867f(bVar.f15659a)) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public boolean mo25246v(C0971h hVar) {
        mr3 mr3 = this.f17033j;
        if (mr3 == null || mr3.f15225a != hVar) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public final void mo25247x() {
        C0973i.C0975b bVar;
        ImmutableList.C4534a builder = ImmutableList.builder();
        for (mr3 mr3 = this.f17031h; mr3 != null; mr3 = mr3.mo23363j()) {
            builder.mo34667a(mr3.f15230f.f16038a);
        }
        mr3 mr32 = this.f17032i;
        if (mr32 == null) {
            bVar = null;
        } else {
            bVar = mr32.f15230f.f16038a;
        }
        this.f17027d.post(new pr3(this, builder, bVar));
    }

    /* renamed from: y */
    public void mo25248y(long j) {
        mr3 mr3 = this.f17033j;
        if (mr3 != null) {
            mr3.mo23372s(j);
        }
    }

    /* renamed from: z */
    public boolean mo25249z(mr3 mr3) {
        boolean z;
        boolean z2 = false;
        if (mr3 != null) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        if (mr3.equals(this.f17033j)) {
            return false;
        }
        this.f17033j = mr3;
        while (mr3.mo23363j() != null) {
            mr3 = mr3.mo23363j();
            if (mr3 == this.f17032i) {
                this.f17032i = this.f17031h;
                z2 = true;
            }
            mr3.mo23373t();
            this.f17034k--;
        }
        this.f17033j.mo23375w((mr3) null);
        mo25247x();
        return z2;
    }
}
