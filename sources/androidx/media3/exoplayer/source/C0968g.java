package androidx.media3.exoplayer.source;

import androidx.media3.common.C0776a;
import androidx.media3.common.C0798k;
import androidx.media3.common.C0831s;
import androidx.media3.exoplayer.source.C0973i;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: androidx.media3.exoplayer.source.g */
/* compiled from: MaskingMediaSource */
public final class C0968g extends C0958c<Void> {

    /* renamed from: k */
    public final C0973i f5247k;

    /* renamed from: l */
    public final boolean f5248l;

    /* renamed from: m */
    public final C0831s.C0835d f5249m;

    /* renamed from: n */
    public final C0831s.C0833b f5250n;

    /* renamed from: o */
    public C0969a f5251o;

    /* renamed from: p */
    public C0966f f5252p;

    /* renamed from: q */
    public boolean f5253q;

    /* renamed from: r */
    public boolean f5254r;

    /* renamed from: s */
    public boolean f5255s;

    /* renamed from: androidx.media3.exoplayer.source.g$a */
    /* compiled from: MaskingMediaSource */
    public static final class C0969a extends r82 {

        /* renamed from: r */
        public static final Object f5256r = new Object();

        /* renamed from: g */
        public final Object f5257g;

        /* renamed from: k */
        public final Object f5258k;

        public C0969a(C0831s sVar, Object obj, Object obj2) {
            super(sVar);
            this.f5257g = obj;
            this.f5258k = obj2;
        }

        /* renamed from: A */
        public static C0969a m7154A(C0798k kVar) {
            return new C0969a(new C0970b(kVar), C0831s.C0835d.f4447Q, f5256r);
        }

        /* renamed from: B */
        public static C0969a m7155B(C0831s sVar, Object obj, Object obj2) {
            return new C0969a(sVar, obj, obj2);
        }

        /* renamed from: f */
        public int mo6867f(Object obj) {
            Object obj2;
            C0831s sVar = this.f17209e;
            if (f5256r.equals(obj) && (obj2 = this.f5258k) != null) {
                obj = obj2;
            }
            return sVar.mo6867f(obj);
        }

        /* renamed from: k */
        public C0831s.C0833b mo6873k(int i, C0831s.C0833b bVar, boolean z) {
            this.f17209e.mo6873k(i, bVar, z);
            if (w67.m29346c(bVar.f4437d, this.f5258k) && z) {
                bVar.f4437d = f5256r;
            }
            return bVar;
        }

        /* renamed from: q */
        public Object mo6879q(int i) {
            Object q = this.f17209e.mo6879q(i);
            if (w67.m29346c(q, this.f5258k)) {
                return f5256r;
            }
            return q;
        }

        /* renamed from: s */
        public C0831s.C0835d mo6881s(int i, C0831s.C0835d dVar, long j) {
            this.f17209e.mo6881s(i, dVar, j);
            if (w67.m29346c(dVar.f4459a, this.f5257g)) {
                dVar.f4459a = C0831s.C0835d.f4447Q;
            }
            return dVar;
        }

        /* renamed from: z */
        public C0969a mo7637z(C0831s sVar) {
            return new C0969a(sVar, this.f5257g, this.f5258k);
        }
    }

    /* renamed from: androidx.media3.exoplayer.source.g$b */
    /* compiled from: MaskingMediaSource */
    public static final class C0970b extends C0831s {

        /* renamed from: e */
        public final C0798k f5259e;

        public C0970b(C0798k kVar) {
            this.f5259e = kVar;
        }

        /* renamed from: f */
        public int mo6867f(Object obj) {
            if (obj == C0969a.f5256r) {
                return 0;
            }
            return -1;
        }

        /* renamed from: k */
        public C0831s.C0833b mo6873k(int i, C0831s.C0833b bVar, boolean z) {
            Integer num;
            Object obj = null;
            if (z) {
                num = 0;
            } else {
                num = null;
            }
            if (z) {
                obj = C0969a.f5256r;
            }
            bVar.mo6906w(num, obj, 0, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, 0, C0776a.f4125s, true);
            return bVar;
        }

        /* renamed from: m */
        public int mo6875m() {
            return 1;
        }

        /* renamed from: q */
        public Object mo6879q(int i) {
            return C0969a.f5256r;
        }

        /* renamed from: s */
        public C0831s.C0835d mo6881s(int i, C0831s.C0835d dVar, long j) {
            C0831s.C0835d dVar2 = dVar;
            dVar.mo6915k(C0831s.C0835d.f4447Q, this.f5259e, (Object) null, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, false, true, (C0798k.C0807g) null, 0, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, 0, 0, 0);
            C0831s.C0835d dVar3 = dVar;
            dVar3.f4453C = true;
            return dVar3;
        }

        /* renamed from: t */
        public int mo6882t() {
            return 1;
        }
    }

    public C0968g(C0973i iVar, boolean z) {
        boolean z2;
        this.f5247k = iVar;
        if (!z || !iVar.mo7574n()) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f5248l = z2;
        this.f5249m = new C0831s.C0835d();
        this.f5250n = new C0831s.C0833b();
        C0831s o = iVar.mo7575o();
        if (o != null) {
            this.f5251o = C0969a.m7155B(o, (Object) null, (Object) null);
            this.f5255s = true;
            return;
        }
        this.f5251o = C0969a.m7154A(iVar.mo7199d());
    }

    /* renamed from: A */
    public void mo7181A() {
        this.f5254r = false;
        this.f5253q = false;
        super.mo7181A();
    }

    /* renamed from: I */
    public C0966f mo7197c(C0973i.C0975b bVar, C2891nf nfVar, long j) {
        C0966f fVar = new C0966f(bVar, nfVar, j);
        fVar.mo7627w(this.f5247k);
        if (this.f5254r) {
            fVar.mo7620b(bVar.mo7638c(mo7632K(bVar.f15659a)));
        } else {
            this.f5252p = fVar;
            if (!this.f5253q) {
                this.f5253q = true;
                mo7599H(null, this.f5247k);
            }
        }
        return fVar;
    }

    /* renamed from: J */
    public final Object mo7631J(Object obj) {
        if (this.f5251o.f5258k == null || !this.f5251o.f5258k.equals(obj)) {
            return obj;
        }
        return C0969a.f5256r;
    }

    /* renamed from: K */
    public final Object mo7632K(Object obj) {
        if (this.f5251o.f5258k == null || !obj.equals(C0969a.f5256r)) {
            return obj;
        }
        return this.f5251o.f5258k;
    }

    /* renamed from: L */
    public C0973i.C0975b mo7561C(Void voidR, C0973i.C0975b bVar) {
        return bVar.mo7638c(mo7631J(bVar.f15659a));
    }

    /* renamed from: M */
    public C0831s mo7634M() {
        return this.f5251o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7558G(java.lang.Void r13, androidx.media3.exoplayer.source.C0973i r14, androidx.media3.common.C0831s r15) {
        /*
            r12 = this;
            boolean r13 = r12.f5254r
            if (r13 == 0) goto L_0x0019
            androidx.media3.exoplayer.source.g$a r13 = r12.f5251o
            androidx.media3.exoplayer.source.g$a r13 = r13.mo7637z(r15)
            r12.f5251o = r13
            androidx.media3.exoplayer.source.f r13 = r12.f5252p
            if (r13 == 0) goto L_0x00ae
            long r13 = r13.mo7621k()
            r12.mo7636O(r13)
            goto L_0x00ae
        L_0x0019:
            boolean r13 = r15.mo6883u()
            if (r13 == 0) goto L_0x0036
            boolean r13 = r12.f5255s
            if (r13 == 0) goto L_0x002a
            androidx.media3.exoplayer.source.g$a r13 = r12.f5251o
            androidx.media3.exoplayer.source.g$a r13 = r13.mo7637z(r15)
            goto L_0x0032
        L_0x002a:
            java.lang.Object r13 = androidx.media3.common.C0831s.C0835d.f4447Q
            java.lang.Object r14 = androidx.media3.exoplayer.source.C0968g.C0969a.f5256r
            androidx.media3.exoplayer.source.g$a r13 = androidx.media3.exoplayer.source.C0968g.C0969a.m7155B(r15, r13, r14)
        L_0x0032:
            r12.f5251o = r13
            goto L_0x00ae
        L_0x0036:
            androidx.media3.common.s$d r13 = r12.f5249m
            r14 = 0
            r15.mo6880r(r14, r13)
            androidx.media3.common.s$d r13 = r12.f5249m
            long r0 = r13.mo6910f()
            androidx.media3.common.s$d r13 = r12.f5249m
            java.lang.Object r13 = r13.f4459a
            androidx.media3.exoplayer.source.f r2 = r12.f5252p
            if (r2 == 0) goto L_0x0074
            long r2 = r2.mo7622n()
            androidx.media3.exoplayer.source.g$a r4 = r12.f5251o
            androidx.media3.exoplayer.source.f r5 = r12.f5252p
            androidx.media3.exoplayer.source.i$b r5 = r5.f5238a
            java.lang.Object r5 = r5.f15659a
            androidx.media3.common.s$b r6 = r12.f5250n
            r4.mo6874l(r5, r6)
            androidx.media3.common.s$b r4 = r12.f5250n
            long r4 = r4.mo6901q()
            long r4 = r4 + r2
            androidx.media3.exoplayer.source.g$a r2 = r12.f5251o
            androidx.media3.common.s$d r3 = r12.f5249m
            androidx.media3.common.s$d r14 = r2.mo6880r(r14, r3)
            long r2 = r14.mo6910f()
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 == 0) goto L_0x0074
            r10 = r4
            goto L_0x0075
        L_0x0074:
            r10 = r0
        L_0x0075:
            androidx.media3.common.s$d r7 = r12.f5249m
            androidx.media3.common.s$b r8 = r12.f5250n
            r9 = 0
            r6 = r15
            android.util.Pair r14 = r6.mo6876n(r7, r8, r9, r10)
            java.lang.Object r0 = r14.first
            java.lang.Object r14 = r14.second
            java.lang.Long r14 = (java.lang.Long) r14
            long r1 = r14.longValue()
            boolean r14 = r12.f5255s
            if (r14 == 0) goto L_0x0094
            androidx.media3.exoplayer.source.g$a r13 = r12.f5251o
            androidx.media3.exoplayer.source.g$a r13 = r13.mo7637z(r15)
            goto L_0x0098
        L_0x0094:
            androidx.media3.exoplayer.source.g$a r13 = androidx.media3.exoplayer.source.C0968g.C0969a.m7155B(r15, r13, r0)
        L_0x0098:
            r12.f5251o = r13
            androidx.media3.exoplayer.source.f r13 = r12.f5252p
            if (r13 == 0) goto L_0x00ae
            r12.mo7636O(r1)
            androidx.media3.exoplayer.source.i$b r13 = r13.f5238a
            java.lang.Object r14 = r13.f15659a
            java.lang.Object r14 = r12.mo7632K(r14)
            androidx.media3.exoplayer.source.i$b r13 = r13.mo7638c(r14)
            goto L_0x00af
        L_0x00ae:
            r13 = 0
        L_0x00af:
            r14 = 1
            r12.f5255s = r14
            r12.f5254r = r14
            androidx.media3.exoplayer.source.g$a r14 = r12.f5251o
            r12.mo7585z(r14)
            if (r13 == 0) goto L_0x00c6
            androidx.media3.exoplayer.source.f r14 = r12.f5252p
            java.lang.Object r14 = p000.C2725kr.m20985e(r14)
            androidx.media3.exoplayer.source.f r14 = (androidx.media3.exoplayer.source.C0966f) r14
            r14.mo7620b(r13)
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.C0968g.mo7558G(java.lang.Void, androidx.media3.exoplayer.source.i, androidx.media3.common.s):void");
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    /* renamed from: O */
    public final void mo7636O(long j) {
        C0966f fVar = this.f5252p;
        int f = this.f5251o.mo6867f(fVar.f5238a.f15659a);
        if (f != -1) {
            long j2 = this.f5251o.mo6872j(f, this.f5250n).f4439g;
            if (j2 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            fVar.mo7625u(j);
        }
    }

    /* renamed from: d */
    public C0798k mo7199d() {
        return this.f5247k.mo7199d();
    }

    /* renamed from: g */
    public void mo7203g(C0971h hVar) {
        ((C0966f) hVar).mo7626v();
        if (hVar == this.f5252p) {
            this.f5252p = null;
        }
    }

    /* renamed from: m */
    public void mo7204m() {
    }

    /* renamed from: y */
    public void mo7205y(ov6 ov6) {
        super.mo7205y(ov6);
        if (!this.f5248l) {
            this.f5253q = true;
            mo7599H(null, this.f5247k);
        }
    }
}
