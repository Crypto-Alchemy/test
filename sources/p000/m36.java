package p000;

import android.net.Uri;
import androidx.media3.common.C0798k;
import androidx.media3.common.C0831s;

/* renamed from: m36 */
/* compiled from: SinglePeriodTimeline */
public final class m36 extends C0831s {

    /* renamed from: M */
    public static final Object f14792M = new Object();

    /* renamed from: P */
    public static final C0798k f14793P = new C0798k.C0801c().mo6756d("SinglePeriodTimeline").mo6759g(Uri.EMPTY).mo6753a();

    /* renamed from: A */
    public final boolean f14794A;

    /* renamed from: B */
    public final boolean f14795B;

    /* renamed from: C */
    public final boolean f14796C;

    /* renamed from: H */
    public final Object f14797H;

    /* renamed from: I */
    public final C0798k f14798I;

    /* renamed from: L */
    public final C0798k.C0807g f14799L;

    /* renamed from: e */
    public final long f14800e;

    /* renamed from: g */
    public final long f14801g;

    /* renamed from: k */
    public final long f14802k;

    /* renamed from: r */
    public final long f14803r;

    /* renamed from: s */
    public final long f14804s;

    /* renamed from: x */
    public final long f14805x;

    /* renamed from: y */
    public final long f14806y;

    public m36(long j, boolean z, boolean z2, boolean z3, Object obj, C0798k kVar) {
        this(j, j, 0, 0, z, z2, z3, obj, kVar);
    }

    /* renamed from: f */
    public int mo6867f(Object obj) {
        if (f14792M.equals(obj)) {
            return 0;
        }
        return -1;
    }

    /* renamed from: k */
    public C0831s.C0833b mo6873k(int i, C0831s.C0833b bVar, boolean z) {
        Object obj;
        C2725kr.m20983c(i, 0, 1);
        if (z) {
            obj = f14792M;
        } else {
            obj = null;
        }
        return bVar.mo6905v((Object) null, obj, 0, this.f14803r, -this.f14805x);
    }

    /* renamed from: m */
    public int mo6875m() {
        return 1;
    }

    /* renamed from: q */
    public Object mo6879q(int i) {
        C2725kr.m20983c(i, 0, 1);
        return f14792M;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r1 > r5) goto L_0x0024;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.media3.common.C0831s.C0835d mo6881s(int r25, androidx.media3.common.C0831s.C0835d r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            p000.C2725kr.m20983c(r3, r1, r2)
            long r1 = r0.f14806y
            boolean r14 = r0.f14795B
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 == 0) goto L_0x002e
            boolean r5 = r0.f14796C
            if (r5 != 0) goto L_0x002e
            r5 = 0
            int r5 = (r27 > r5 ? 1 : (r27 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x002e
            long r5 = r0.f14804s
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0027
        L_0x0024:
            r16 = r3
            goto L_0x0030
        L_0x0027:
            long r1 = r1 + r27
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x002e
            goto L_0x0024
        L_0x002e:
            r16 = r1
        L_0x0030:
            java.lang.Object r4 = androidx.media3.common.C0831s.C0835d.f4447Q
            androidx.media3.common.k r5 = r0.f14798I
            java.lang.Object r6 = r0.f14797H
            long r7 = r0.f14800e
            long r9 = r0.f14801g
            long r11 = r0.f14802k
            boolean r13 = r0.f14794A
            androidx.media3.common.k$g r15 = r0.f14799L
            long r1 = r0.f14804s
            r18 = r1
            r20 = 0
            r21 = 0
            long r1 = r0.f14805x
            r22 = r1
            r3 = r26
            androidx.media3.common.s$d r1 = r3.mo6915k(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.m36.mo6881s(int, androidx.media3.common.s$d, long):androidx.media3.common.s$d");
    }

    /* renamed from: t */
    public int mo6882t() {
        return 1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public m36(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, Object obj, C0798k kVar) {
        this(CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, j, j2, j3, j4, z, z2, false, obj, kVar, z3 ? kVar.f4246g : null);
    }

    public m36(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, C0798k kVar, C0798k.C0807g gVar) {
        this.f14800e = j;
        this.f14801g = j2;
        this.f14802k = j3;
        this.f14803r = j4;
        this.f14804s = j5;
        this.f14805x = j6;
        this.f14806y = j7;
        this.f14794A = z;
        this.f14795B = z2;
        this.f14796C = z3;
        this.f14797H = obj;
        this.f14798I = (C0798k) C2725kr.m20985e(kVar);
        this.f14799L = gVar;
    }
}
