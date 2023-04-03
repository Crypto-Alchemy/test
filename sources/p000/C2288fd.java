package p000;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p000.iy6;
import p000.xs5;

/* renamed from: fd */
/* compiled from: AdtsExtractor */
public final class C2288fd implements hy1 {

    /* renamed from: m */
    public static final ny1 f11775m = new C2221ed();

    /* renamed from: a */
    public final int f11776a;

    /* renamed from: b */
    public final C2382gd f11777b;

    /* renamed from: c */
    public final gm4 f11778c;

    /* renamed from: d */
    public final gm4 f11779d;

    /* renamed from: e */
    public final fm4 f11780e;

    /* renamed from: f */
    public jy1 f11781f;

    /* renamed from: g */
    public long f11782g;

    /* renamed from: h */
    public long f11783h;

    /* renamed from: i */
    public int f11784i;

    /* renamed from: j */
    public boolean f11785j;

    /* renamed from: k */
    public boolean f11786k;

    /* renamed from: l */
    public boolean f11787l;

    public C2288fd() {
        this(0);
    }

    /* renamed from: g */
    public static int m16901g(int i, long j) {
        return (int) (((((long) i) * 8) * 1000000) / j);
    }

    /* renamed from: i */
    public static /* synthetic */ hy1[] m16902i() {
        return new hy1[]{new C2288fd()};
    }

    /* renamed from: a */
    public void mo151a() {
    }

    /* renamed from: b */
    public void mo152b(long j, long j2) {
        this.f11786k = false;
        this.f11777b.mo18799c();
        this.f11782g = j2;
    }

    /* renamed from: d */
    public int mo154d(iy1 iy1, mt4 mt4) throws IOException {
        boolean z;
        boolean z2;
        C2725kr.m20989i(this.f11781f);
        long length = iy1.getLength();
        int i = this.f11776a;
        if ((i & 2) == 0 && ((i & 1) == 0 || length == -1)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            mo19883f(iy1);
        }
        int read = iy1.read(this.f11778c.mo20679d(), 0, 2048);
        if (read == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        mo19885k(length, z2);
        if (z2) {
            return -1;
        }
        this.f11778c.mo20674P(0);
        this.f11778c.mo20673O(read);
        if (!this.f11786k) {
            this.f11777b.mo18802f(this.f11782g, 4);
            this.f11786k = true;
        }
        this.f11777b.mo18798a(this.f11778c);
        return 0;
    }

    /* renamed from: e */
    public boolean mo155e(iy1 iy1) throws IOException {
        int l = mo19886l(iy1);
        int i = l;
        int i2 = 0;
        int i3 = 0;
        do {
            iy1.mo94n(this.f11779d.mo20679d(), 0, 2);
            this.f11779d.mo20674P(0);
            if (!C2382gd.m17987m(this.f11779d.mo20668J())) {
                i++;
                iy1.mo85e();
                iy1.mo90i(i);
            } else {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                iy1.mo94n(this.f11779d.mo20679d(), 0, 4);
                this.f11780e.mo20012p(14);
                int h = this.f11780e.mo20004h(13);
                if (h <= 6) {
                    i++;
                    iy1.mo85e();
                    iy1.mo90i(i);
                } else {
                    iy1.mo90i(h - 6);
                    i3 += h;
                }
            }
            i2 = 0;
            i3 = 0;
        } while (i - l < 8192);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19883f(p000.iy1 r10) throws java.io.IOException {
        /*
            r9 = this;
            boolean r0 = r9.f11785j
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = -1
            r9.f11784i = r0
            r10.mo85e()
            long r1 = r10.getPosition()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0018
            r9.mo19886l(r10)
        L_0x0018:
            r1 = 0
            r2 = r1
        L_0x001a:
            r5 = 1
            gm4 r6 = r9.f11779d     // Catch:{ EOFException -> 0x0076 }
            byte[] r6 = r6.mo20679d()     // Catch:{ EOFException -> 0x0076 }
            r7 = 2
            boolean r6 = r10.mo84c(r6, r1, r7, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 == 0) goto L_0x0076
            gm4 r6 = r9.f11779d     // Catch:{ EOFException -> 0x0076 }
            r6.mo20674P(r1)     // Catch:{ EOFException -> 0x0076 }
            gm4 r6 = r9.f11779d     // Catch:{ EOFException -> 0x0076 }
            int r6 = r6.mo20668J()     // Catch:{ EOFException -> 0x0076 }
            boolean r6 = p000.C2382gd.m17987m(r6)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x003a
            goto L_0x0077
        L_0x003a:
            gm4 r6 = r9.f11779d     // Catch:{ EOFException -> 0x0076 }
            byte[] r6 = r6.mo20679d()     // Catch:{ EOFException -> 0x0076 }
            r7 = 4
            boolean r6 = r10.mo84c(r6, r1, r7, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x0048
            goto L_0x0076
        L_0x0048:
            fm4 r6 = r9.f11780e     // Catch:{ EOFException -> 0x0076 }
            r7 = 14
            r6.mo20012p(r7)     // Catch:{ EOFException -> 0x0076 }
            fm4 r6 = r9.f11780e     // Catch:{ EOFException -> 0x0076 }
            r7 = 13
            int r6 = r6.mo20004h(r7)     // Catch:{ EOFException -> 0x0076 }
            r7 = 6
            if (r6 <= r7) goto L_0x006c
            long r7 = (long) r6     // Catch:{ EOFException -> 0x0076 }
            long r3 = r3 + r7
            int r2 = r2 + 1
            r7 = 1000(0x3e8, float:1.401E-42)
            if (r2 != r7) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            int r6 = r6 + -6
            boolean r6 = r10.mo93l(r6, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x001a
        L_0x006b:
            goto L_0x0076
        L_0x006c:
            r9.f11785j = r5     // Catch:{ EOFException -> 0x0076 }
            java.lang.String r1 = "Malformed ADTS stream"
            r6 = 0
            androidx.media3.common.ParserException r1 = androidx.media3.common.ParserException.createForMalformedContainer(r1, r6)     // Catch:{ EOFException -> 0x0076 }
            throw r1     // Catch:{ EOFException -> 0x0076 }
        L_0x0076:
            r1 = r2
        L_0x0077:
            r10.mo85e()
            if (r1 <= 0) goto L_0x0082
            long r0 = (long) r1
            long r3 = r3 / r0
            int r10 = (int) r3
            r9.f11784i = r10
            goto L_0x0084
        L_0x0082:
            r9.f11784i = r0
        L_0x0084:
            r9.f11785j = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2288fd.mo19883f(iy1):void");
    }

    /* renamed from: h */
    public final xs5 mo19884h(long j, boolean z) {
        return new dq0(j, this.f11783h, m16901g(this.f11784i, this.f11777b.mo20527k()), this.f11784i, z);
    }

    /* renamed from: j */
    public void mo159j(jy1 jy1) {
        this.f11781f = jy1;
        this.f11777b.mo18800d(jy1, new iy6.C2579d(0, 1));
        jy1.mo7722p();
    }

    @RequiresNonNull({"extractorOutput"})
    /* renamed from: k */
    public final void mo19885k(long j, boolean z) {
        boolean z2;
        if (!this.f11787l) {
            boolean z3 = false;
            if ((this.f11776a & 1) == 0 || this.f11784i <= 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2 || this.f11777b.mo20527k() != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED || z) {
                if (!z2 || this.f11777b.mo20527k() == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                    this.f11781f.mo7715g(new xs5.C3642b(CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED));
                } else {
                    jy1 jy1 = this.f11781f;
                    if ((this.f11776a & 2) != 0) {
                        z3 = true;
                    }
                    jy1.mo7715g(mo19884h(j, z3));
                }
                this.f11787l = true;
            }
        }
    }

    /* renamed from: l */
    public final int mo19886l(iy1 iy1) throws IOException {
        int i = 0;
        while (true) {
            iy1.mo94n(this.f11779d.mo20679d(), 0, 10);
            this.f11779d.mo20674P(0);
            if (this.f11779d.mo20665G() != 4801587) {
                break;
            }
            this.f11779d.mo20675Q(3);
            int C = this.f11779d.mo20661C();
            i += C + 10;
            iy1.mo90i(C);
        }
        iy1.mo85e();
        iy1.mo90i(i);
        if (this.f11783h == -1) {
            this.f11783h = (long) i;
        }
        return i;
    }

    public C2288fd(int i) {
        this.f11776a = (i & 2) != 0 ? i | 1 : i;
        this.f11777b = new C2382gd(true);
        this.f11778c = new gm4(2048);
        this.f11784i = -1;
        this.f11783h = -1;
        gm4 gm4 = new gm4(10);
        this.f11779d = gm4;
        this.f11780e = new fm4(gm4.mo20679d());
    }
}
