package p000;

import androidx.media3.common.C0792h;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.drm.C0909b;
import androidx.media3.exoplayer.drm.C0912c;
import androidx.media3.exoplayer.source.C0977j;
import androidx.media3.exoplayer.source.C0997p;
import androidx.media3.exoplayer.source.C1002q;
import androidx.media3.exoplayer.upstream.C1019b;
import androidx.media3.exoplayer.upstream.Loader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.ve0;

/* renamed from: ue0 */
/* compiled from: ChunkSampleStream */
public class ue0<T extends ve0> implements yk5, C1002q, Loader.C1012b<pe0>, Loader.C1016f {

    /* renamed from: A */
    public final re0 f18439A;

    /* renamed from: B */
    public final ArrayList<C3515vy> f18440B;

    /* renamed from: C */
    public final List<C3515vy> f18441C;

    /* renamed from: H */
    public final C0997p f18442H;

    /* renamed from: I */
    public final C0997p[] f18443I;

    /* renamed from: L */
    public final C3648xy f18444L;

    /* renamed from: M */
    public pe0 f18445M;

    /* renamed from: P */
    public C0792h f18446P;

    /* renamed from: Q */
    public C3405b<T> f18447Q;

    /* renamed from: U */
    public long f18448U;

    /* renamed from: X */
    public long f18449X;

    /* renamed from: Y */
    public int f18450Y;

    /* renamed from: Z */
    public C3515vy f18451Z;

    /* renamed from: a */
    public final int f18452a;

    /* renamed from: d */
    public final int[] f18453d;

    /* renamed from: e */
    public final C0792h[] f18454e;

    /* renamed from: e0 */
    public boolean f18455e0;

    /* renamed from: g */
    public final boolean[] f18456g;

    /* renamed from: k */
    public final T f18457k;

    /* renamed from: r */
    public final C1002q.C1003a<ue0<T>> f18458r;

    /* renamed from: s */
    public final C0977j.C0978a f18459s;

    /* renamed from: x */
    public final C1019b f18460x;

    /* renamed from: y */
    public final Loader f18461y;

    /* renamed from: ue0$a */
    /* compiled from: ChunkSampleStream */
    public final class C3404a implements yk5 {

        /* renamed from: a */
        public final ue0<T> f18462a;

        /* renamed from: d */
        public final C0997p f18463d;

        /* renamed from: e */
        public final int f18464e;

        /* renamed from: g */
        public boolean f18465g;

        public C3404a(ue0<T> ue0, C0997p pVar, int i) {
            this.f18462a = ue0;
            this.f18463d = pVar;
            this.f18464e = i;
        }

        /* renamed from: a */
        public final void mo26757a() {
            if (!this.f18465g) {
                ue0.this.f18459s.mo7648i(ue0.this.f18453d[this.f18464e], ue0.this.f18454e[this.f18464e], 0, (Object) null, ue0.this.f18449X);
                this.f18465g = true;
            }
        }

        /* renamed from: b */
        public void mo7593b() {
        }

        /* renamed from: c */
        public void mo26758c() {
            C2725kr.m20987g(ue0.this.f18456g[this.f18464e]);
            ue0.this.f18456g[this.f18464e] = false;
        }

        /* renamed from: f */
        public int mo7594f(long j) {
            if (ue0.this.mo26744I()) {
                return 0;
            }
            int E = this.f18463d.mo7756E(j, ue0.this.f18455e0);
            if (ue0.this.f18451Z != null) {
                E = Math.min(E, ue0.this.f18451Z.mo27374h(this.f18464e + 1) - this.f18463d.mo7754C());
            }
            this.f18463d.mo7780d0(E);
            if (E > 0) {
                mo26757a();
            }
            return E;
        }

        /* renamed from: g */
        public boolean mo7595g() {
            if (ue0.this.mo26744I() || !this.f18463d.mo7762K(ue0.this.f18455e0)) {
                return false;
            }
            return true;
        }

        /* renamed from: p */
        public int mo7596p(c82 c82, DecoderInputBuffer decoderInputBuffer, int i) {
            if (ue0.this.mo26744I()) {
                return -3;
            }
            if (ue0.this.f18451Z != null && ue0.this.f18451Z.mo27374h(this.f18464e + 1) <= this.f18463d.mo7754C()) {
                return -3;
            }
            mo26757a();
            return this.f18463d.mo7768R(c82, decoderInputBuffer, i, ue0.this.f18455e0);
        }
    }

    /* renamed from: ue0$b */
    /* compiled from: ChunkSampleStream */
    public interface C3405b<T extends ve0> {
        /* renamed from: b */
        void mo7242b(ue0<T> ue0);
    }

    public ue0(int i, int[] iArr, C0792h[] hVarArr, T t, C1002q.C1003a<ue0<T>> aVar, C2891nf nfVar, long j, C0912c cVar, C0909b.C0910a aVar2, C1019b bVar, C0977j.C0978a aVar3) {
        this.f18452a = i;
        int i2 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f18453d = iArr;
        this.f18454e = hVarArr == null ? new C0792h[0] : hVarArr;
        this.f18457k = t;
        this.f18458r = aVar;
        this.f18459s = aVar3;
        this.f18460x = bVar;
        this.f18461y = new Loader("ChunkSampleStream");
        this.f18439A = new re0();
        ArrayList<C3515vy> arrayList = new ArrayList<>();
        this.f18440B = arrayList;
        this.f18441C = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f18443I = new C0997p[length];
        this.f18456g = new boolean[length];
        int i3 = length + 1;
        int[] iArr2 = new int[i3];
        C0997p[] pVarArr = new C0997p[i3];
        C0997p k = C0997p.m7426k(nfVar, cVar, aVar2);
        this.f18442H = k;
        iArr2[0] = i;
        pVarArr[0] = k;
        while (i2 < length) {
            C0997p l = C0997p.m7427l(nfVar);
            this.f18443I[i2] = l;
            int i4 = i2 + 1;
            pVarArr[i4] = l;
            iArr2[i4] = this.f18453d[i2];
            i2 = i4;
        }
        this.f18444L = new C3648xy(iArr2, pVarArr);
        this.f18448U = j;
        this.f18449X = j;
    }

    /* renamed from: B */
    public final void mo26737B(int i) {
        int min = Math.min(mo26750O(i, 0), this.f18450Y);
        if (min > 0) {
            w67.m29311I0(this.f18440B, 0, min);
            this.f18450Y -= min;
        }
    }

    /* renamed from: C */
    public final void mo26738C(int i) {
        C2725kr.m20987g(!this.f18461y.mo7809j());
        int size = this.f18440B.size();
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (!mo26742G(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            long j = mo26741F().f16399h;
            C3515vy D = mo26739D(i);
            if (this.f18440B.isEmpty()) {
                this.f18448U = this.f18449X;
            }
            this.f18455e0 = false;
            this.f18459s.mo7643D(this.f18452a, D.f16398g, j);
        }
    }

    /* renamed from: D */
    public final C3515vy mo26739D(int i) {
        C3515vy vyVar = this.f18440B.get(i);
        ArrayList<C3515vy> arrayList = this.f18440B;
        w67.m29311I0(arrayList, i, arrayList.size());
        this.f18450Y = Math.max(this.f18450Y, this.f18440B.size());
        int i2 = 0;
        this.f18442H.mo7792u(vyVar.mo27374h(0));
        while (true) {
            C0997p[] pVarArr = this.f18443I;
            if (i2 >= pVarArr.length) {
                return vyVar;
            }
            C0997p pVar = pVarArr[i2];
            i2++;
            pVar.mo7792u(vyVar.mo27374h(i2));
        }
    }

    /* renamed from: E */
    public T mo26740E() {
        return this.f18457k;
    }

    /* renamed from: F */
    public final C3515vy mo26741F() {
        ArrayList<C3515vy> arrayList = this.f18440B;
        return arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: G */
    public final boolean mo26742G(int i) {
        int C;
        C3515vy vyVar = this.f18440B.get(i);
        if (this.f18442H.mo7754C() > vyVar.mo27374h(0)) {
            return true;
        }
        int i2 = 0;
        do {
            C0997p[] pVarArr = this.f18443I;
            if (i2 >= pVarArr.length) {
                return false;
            }
            C = pVarArr[i2].mo7754C();
            i2++;
        } while (C <= vyVar.mo27374h(i2));
        return true;
    }

    /* renamed from: H */
    public final boolean mo26743H(pe0 pe0) {
        return pe0 instanceof C3515vy;
    }

    /* renamed from: I */
    public boolean mo26744I() {
        if (this.f18448U != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public final void mo26745J() {
        int O = mo26750O(this.f18442H.mo7754C(), this.f18450Y - 1);
        while (true) {
            int i = this.f18450Y;
            if (i <= O) {
                this.f18450Y = i + 1;
                mo26746K(i);
            } else {
                return;
            }
        }
    }

    /* renamed from: K */
    public final void mo26746K(int i) {
        C3515vy vyVar = this.f18440B.get(i);
        C0792h hVar = vyVar.f16395d;
        if (!hVar.equals(this.f18446P)) {
            this.f18459s.mo7648i(this.f18452a, hVar, vyVar.f16396e, vyVar.f16397f, vyVar.f16398g);
        }
        this.f18446P = hVar;
    }

    /* renamed from: L */
    public void mo7224u(pe0 pe0, long j, long j2, boolean z) {
        pe0 pe02 = pe0;
        this.f18445M = null;
        this.f18451Z = null;
        vi3 vi3 = new vi3(pe02.f16392a, pe02.f16393b, pe0.mo24536e(), pe0.mo24535d(), j, j2, pe0.mo24534b());
        this.f18460x.mo7826c(pe02.f16392a);
        this.f18459s.mo7651r(vi3, pe02.f16394c, this.f18452a, pe02.f16395d, pe02.f16396e, pe02.f16397f, pe02.f16398g, pe02.f16399h);
        if (!z) {
            if (mo26744I()) {
                mo26752Q();
            } else if (mo26743H(pe0)) {
                mo26739D(this.f18440B.size() - 1);
                if (this.f18440B.isEmpty()) {
                    this.f18448U = this.f18449X;
                }
            }
            this.f18458r.mo7246g(this);
        }
    }

    /* renamed from: M */
    public void mo7223s(pe0 pe0, long j, long j2) {
        pe0 pe02 = pe0;
        this.f18445M = null;
        this.f18457k.mo7261d(pe02);
        vi3 vi3 = new vi3(pe02.f16392a, pe02.f16393b, pe0.mo24536e(), pe0.mo24535d(), j, j2, pe0.mo24534b());
        this.f18460x.mo7826c(pe02.f16392a);
        this.f18459s.mo7654u(vi3, pe02.f16394c, this.f18452a, pe02.f16395d, pe02.f16396e, pe02.f16397f, pe02.f16398g, pe02.f16399h);
        this.f18458r.mo7246g(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f1  */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.media3.exoplayer.upstream.Loader.C1013c mo7222k(p000.pe0 r31, long r32, long r34, java.io.IOException r36, int r37) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            long r12 = r31.mo24534b()
            boolean r14 = r30.mo26743H(r31)
            java.util.ArrayList<vy> r2 = r0.f18440B
            int r2 = r2.size()
            r15 = 1
            int r10 = r2 + -1
            r2 = 0
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            r11 = 0
            if (r2 == 0) goto L_0x0027
            if (r14 == 0) goto L_0x0027
            boolean r2 = r0.mo26742G(r10)
            if (r2 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r8 = r11
            goto L_0x0028
        L_0x0027:
            r8 = r15
        L_0x0028:
            vi3 r9 = new vi3
            long r3 = r1.f16392a
            d21 r5 = r1.f16393b
            android.net.Uri r6 = r31.mo24536e()
            java.util.Map r7 = r31.mo24535d()
            r2 = r9
            r15 = r8
            r17 = r14
            r14 = r9
            r8 = r32
            r29 = r10
            r10 = r34
            r2.<init>(r3, r5, r6, r7, r8, r10, r12)
            jr3 r2 = new jr3
            int r3 = r1.f16394c
            int r4 = r0.f18452a
            androidx.media3.common.h r5 = r1.f16395d
            int r6 = r1.f16396e
            java.lang.Object r7 = r1.f16397f
            long r8 = r1.f16398g
            long r24 = p000.w67.m29335U0(r8)
            long r8 = r1.f16399h
            long r26 = p000.w67.m29335U0(r8)
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r18.<init>(r19, r20, r21, r22, r23, r24, r26)
            androidx.media3.exoplayer.upstream.b$c r3 = new androidx.media3.exoplayer.upstream.b$c
            r4 = r36
            r5 = r37
            r3.<init>(r14, r2, r4, r5)
            T r2 = r0.f18457k
            androidx.media3.exoplayer.upstream.b r5 = r0.f18460x
            boolean r2 = r2.mo7264h(r1, r15, r3, r5)
            if (r2 == 0) goto L_0x00a6
            if (r15 == 0) goto L_0x009f
            androidx.media3.exoplayer.upstream.Loader$c r2 = androidx.media3.exoplayer.upstream.Loader.f5449f
            if (r17 == 0) goto L_0x00a7
            r6 = r29
            vy r6 = r0.mo26739D(r6)
            if (r6 != r1) goto L_0x008e
            r11 = 1
            goto L_0x008f
        L_0x008e:
            r11 = 0
        L_0x008f:
            p000.C2725kr.m20987g(r11)
            java.util.ArrayList<vy> r6 = r0.f18440B
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x00a7
            long r6 = r0.f18449X
            r0.f18448U = r6
            goto L_0x00a7
        L_0x009f:
            java.lang.String r2 = "ChunkSampleStream"
            java.lang.String r6 = "Ignoring attempt to cancel non-cancelable load."
            p000.gk3.m18132i(r2, r6)
        L_0x00a6:
            r2 = 0
        L_0x00a7:
            if (r2 != 0) goto L_0x00c0
            androidx.media3.exoplayer.upstream.b r2 = r0.f18460x
            long r2 = r2.mo7824a(r3)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x00be
            r6 = 0
            androidx.media3.exoplayer.upstream.Loader$c r2 = androidx.media3.exoplayer.upstream.Loader.m7530h(r6, r2)
            goto L_0x00c0
        L_0x00be:
            androidx.media3.exoplayer.upstream.Loader$c r2 = androidx.media3.exoplayer.upstream.Loader.f5450g
        L_0x00c0:
            boolean r3 = r2.mo7814c()
            r6 = 1
            r3 = r3 ^ r6
            androidx.media3.exoplayer.source.j$a r6 = r0.f18459s
            int r7 = r1.f16394c
            int r8 = r0.f18452a
            androidx.media3.common.h r9 = r1.f16395d
            int r10 = r1.f16396e
            java.lang.Object r11 = r1.f16397f
            long r12 = r1.f16398g
            long r4 = r1.f16399h
            r16 = r6
            r17 = r14
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r11
            r23 = r12
            r25 = r4
            r27 = r36
            r28 = r3
            r16.mo7656w(r17, r18, r19, r20, r21, r22, r23, r25, r27, r28)
            if (r3 == 0) goto L_0x0100
            r3 = 0
            r0.f18445M = r3
            androidx.media3.exoplayer.upstream.b r3 = r0.f18460x
            long r4 = r1.f16392a
            r3.mo7826c(r4)
            androidx.media3.exoplayer.source.q$a<ue0<T>> r1 = r0.f18458r
            r1.mo7246g(r0)
        L_0x0100:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ue0.mo7222k(pe0, long, long, java.io.IOException, int):androidx.media3.exoplayer.upstream.Loader$c");
    }

    /* renamed from: O */
    public final int mo26750O(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.f18440B.size()) {
                return this.f18440B.size() - 1;
            }
        } while (this.f18440B.get(i2).mo27374h(0) <= i);
        return i2 - 1;
    }

    /* renamed from: P */
    public void mo26751P(C3405b<T> bVar) {
        this.f18447Q = bVar;
        this.f18442H.mo7767Q();
        for (C0997p Q : this.f18443I) {
            Q.mo7767Q();
        }
        this.f18461y.mo7812m(this);
    }

    /* renamed from: Q */
    public final void mo26752Q() {
        this.f18442H.mo7771U();
        for (C0997p U : this.f18443I) {
            U.mo7771U();
        }
    }

    /* renamed from: R */
    public void mo26753R(long j) {
        boolean z;
        boolean z2;
        this.f18449X = j;
        if (mo26744I()) {
            this.f18448U = j;
            return;
        }
        C3515vy vyVar = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f18440B.size()) {
                break;
            }
            C3515vy vyVar2 = this.f18440B.get(i2);
            int i3 = (vyVar2.f16398g > j ? 1 : (vyVar2.f16398g == j ? 0 : -1));
            if (i3 == 0 && vyVar2.f18926k == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                vyVar = vyVar2;
                break;
            } else if (i3 > 0) {
                break;
            } else {
                i2++;
            }
        }
        if (vyVar != null) {
            z = this.f18442H.mo7774X(vyVar.mo27374h(0));
        } else {
            C0997p pVar = this.f18442H;
            if (j < mo7241a()) {
                z2 = true;
            } else {
                z2 = false;
            }
            z = pVar.mo7775Y(j, z2);
        }
        if (z) {
            this.f18450Y = mo26750O(this.f18442H.mo7754C(), 0);
            C0997p[] pVarArr = this.f18443I;
            int length = pVarArr.length;
            while (i < length) {
                pVarArr[i].mo7775Y(j, true);
                i++;
            }
            return;
        }
        this.f18448U = j;
        this.f18455e0 = false;
        this.f18440B.clear();
        this.f18450Y = 0;
        if (this.f18461y.mo7809j()) {
            this.f18442H.mo7789r();
            C0997p[] pVarArr2 = this.f18443I;
            int length2 = pVarArr2.length;
            while (i < length2) {
                pVarArr2[i].mo7789r();
                i++;
            }
            this.f18461y.mo7806f();
            return;
        }
        this.f18461y.mo7807g();
        mo26752Q();
    }

    /* renamed from: S */
    public ue0<T>.C6784a mo26754S(long j, int i) {
        for (int i2 = 0; i2 < this.f18443I.length; i2++) {
            if (this.f18453d[i2] == i) {
                C2725kr.m20987g(!this.f18456g[i2]);
                this.f18456g[i2] = true;
                this.f18443I[i2].mo7775Y(j, true);
                return new C3404a(this, this.f18443I[i2], i2);
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public long mo7241a() {
        if (mo26744I()) {
            return this.f18448U;
        }
        if (this.f18455e0) {
            return Long.MIN_VALUE;
        }
        return mo26741F().f16399h;
    }

    /* renamed from: b */
    public void mo7593b() throws IOException {
        this.f18461y.mo7226b();
        this.f18442H.mo7764N();
        if (!this.f18461y.mo7809j()) {
            this.f18457k.mo7259b();
        }
    }

    /* renamed from: c */
    public long mo26755c(long j, ys5 ys5) {
        return this.f18457k.mo7260c(j, ys5);
    }

    /* renamed from: d */
    public boolean mo7244d() {
        return this.f18461y.mo7809j();
    }

    /* renamed from: e */
    public boolean mo7245e(long j) {
        long j2;
        List<C3515vy> list;
        if (this.f18455e0 || this.f18461y.mo7809j() || this.f18461y.mo7808i()) {
            return false;
        }
        boolean I = mo26744I();
        if (I) {
            list = Collections.emptyList();
            j2 = this.f18448U;
        } else {
            list = this.f18441C;
            j2 = mo26741F().f16399h;
        }
        this.f18457k.mo7263g(j, j2, list, this.f18439A);
        re0 re0 = this.f18439A;
        boolean z = re0.f17226b;
        pe0 pe0 = re0.f17225a;
        re0.mo25359a();
        if (z) {
            this.f18448U = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
            this.f18455e0 = true;
            return true;
        } else if (pe0 == null) {
            return false;
        } else {
            this.f18445M = pe0;
            if (mo26743H(pe0)) {
                C3515vy vyVar = (C3515vy) pe0;
                if (I) {
                    long j3 = vyVar.f16398g;
                    long j4 = this.f18448U;
                    if (j3 != j4) {
                        this.f18442H.mo7777a0(j4);
                        for (C0997p a0 : this.f18443I) {
                            a0.mo7777a0(this.f18448U);
                        }
                    }
                    this.f18448U = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
                }
                vyVar.mo27376j(this.f18444L);
                this.f18440B.add(vyVar);
            } else if (pe0 instanceof du2) {
                ((du2) pe0).mo18944f(this.f18444L);
            }
            this.f18459s.mo7640A(new vi3(pe0.f16392a, pe0.f16393b, this.f18461y.mo7813n(pe0, this, this.f18460x.mo7825b(pe0.f16394c))), pe0.f16394c, this.f18452a, pe0.f16395d, pe0.f16396e, pe0.f16397f, pe0.f16398g, pe0.f16399h);
            return true;
        }
    }

    /* renamed from: f */
    public int mo7594f(long j) {
        if (mo26744I()) {
            return 0;
        }
        int E = this.f18442H.mo7756E(j, this.f18455e0);
        C3515vy vyVar = this.f18451Z;
        if (vyVar != null) {
            E = Math.min(E, vyVar.mo27374h(0) - this.f18442H.mo7754C());
        }
        this.f18442H.mo7780d0(E);
        mo26745J();
        return E;
    }

    /* renamed from: g */
    public boolean mo7595g() {
        if (mo26744I() || !this.f18442H.mo7762K(this.f18455e0)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public long mo7247h() {
        if (this.f18455e0) {
            return Long.MIN_VALUE;
        }
        if (mo26744I()) {
            return this.f18448U;
        }
        long j = this.f18449X;
        C3515vy F = mo26741F();
        if (!F.mo23490g()) {
            if (this.f18440B.size() > 1) {
                ArrayList<C3515vy> arrayList = this.f18440B;
                F = arrayList.get(arrayList.size() - 2);
            } else {
                F = null;
            }
        }
        if (F != null) {
            j = Math.max(j, F.f16399h);
        }
        return Math.max(j, this.f18442H.mo7797z());
    }

    /* renamed from: i */
    public void mo7248i(long j) {
        if (!this.f18461y.mo7808i() && !mo26744I()) {
            if (this.f18461y.mo7809j()) {
                pe0 pe0 = (pe0) C2725kr.m20985e(this.f18445M);
                if ((!mo26743H(pe0) || !mo26742G(this.f18440B.size() - 1)) && this.f18457k.mo7262e(j, pe0, this.f18441C)) {
                    this.f18461y.mo7806f();
                    if (mo26743H(pe0)) {
                        this.f18451Z = (C3515vy) pe0;
                        return;
                    }
                    return;
                }
                return;
            }
            int j2 = this.f18457k.mo7265j(j, this.f18441C);
            if (j2 < this.f18440B.size()) {
                mo26738C(j2);
            }
        }
    }

    /* renamed from: n */
    public void mo7721n() {
        this.f18442H.mo7769S();
        for (C0997p S : this.f18443I) {
            S.mo7769S();
        }
        this.f18457k.mo7258a();
        C3405b<T> bVar = this.f18447Q;
        if (bVar != null) {
            bVar.mo7242b(this);
        }
    }

    /* renamed from: p */
    public int mo7596p(c82 c82, DecoderInputBuffer decoderInputBuffer, int i) {
        if (mo26744I()) {
            return -3;
        }
        C3515vy vyVar = this.f18451Z;
        if (vyVar != null && vyVar.mo27374h(0) <= this.f18442H.mo7754C()) {
            return -3;
        }
        mo26745J();
        return this.f18442H.mo7768R(c82, decoderInputBuffer, i, this.f18455e0);
    }

    /* renamed from: t */
    public void mo26756t(long j, boolean z) {
        if (!mo26744I()) {
            int x = this.f18442H.mo7795x();
            this.f18442H.mo7788q(j, z, true);
            int x2 = this.f18442H.mo7795x();
            if (x2 > x) {
                long y = this.f18442H.mo7796y();
                int i = 0;
                while (true) {
                    C0997p[] pVarArr = this.f18443I;
                    if (i >= pVarArr.length) {
                        break;
                    }
                    pVarArr[i].mo7788q(y, z, this.f18456g[i]);
                    i++;
                }
            }
            mo26737B(x2);
        }
    }
}
