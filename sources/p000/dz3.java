package p000;

import androidx.media3.common.C0792h;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p000.kz3;
import p000.vp2;
import p000.zs6;

/* renamed from: dz3 */
/* compiled from: Mp3Extractor */
public final class dz3 implements hy1 {

    /* renamed from: u */
    public static final ny1 f10989u = new bz3();

    /* renamed from: v */
    public static final vp2.C3504a f10990v = new cz3();

    /* renamed from: a */
    public final int f10991a;

    /* renamed from: b */
    public final long f10992b;

    /* renamed from: c */
    public final gm4 f10993c;

    /* renamed from: d */
    public final kz3.C2735a f10994d;

    /* renamed from: e */
    public final we2 f10995e;

    /* renamed from: f */
    public final wp2 f10996f;

    /* renamed from: g */
    public final zs6 f10997g;

    /* renamed from: h */
    public jy1 f10998h;

    /* renamed from: i */
    public zs6 f10999i;

    /* renamed from: j */
    public zs6 f11000j;

    /* renamed from: k */
    public int f11001k;

    /* renamed from: l */
    public Metadata f11002l;

    /* renamed from: m */
    public long f11003m;

    /* renamed from: n */
    public long f11004n;

    /* renamed from: o */
    public long f11005o;

    /* renamed from: p */
    public int f11006p;

    /* renamed from: q */
    public at5 f11007q;

    /* renamed from: r */
    public boolean f11008r;

    /* renamed from: s */
    public boolean f11009s;

    /* renamed from: t */
    public long f11010t;

    public dz3() {
        this(0);
    }

    /* renamed from: m */
    public static long m15531m(Metadata metadata) {
        if (metadata == null) {
            return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        int d = metadata.mo6545d();
        for (int i = 0; i < d; i++) {
            Metadata.Entry c = metadata.mo6544c(i);
            if (c instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) c;
                if (textInformationFrame.f5609a.equals("TLEN")) {
                    return w67.m29391y0(Long.parseLong(textInformationFrame.f5621e));
                }
            }
        }
        return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    /* renamed from: n */
    public static int m15532n(gm4 gm4, int i) {
        if (gm4.mo20681f() >= i + 4) {
            gm4.mo20674P(i);
            int n = gm4.mo20689n();
            if (n == 1483304551 || n == 1231971951) {
                return n;
            }
        }
        if (gm4.mo20681f() < 40) {
            return 0;
        }
        gm4.mo20674P(36);
        if (gm4.mo20689n() == 1447187017) {
            return 1447187017;
        }
        return 0;
    }

    /* renamed from: o */
    public static boolean m15533o(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    /* renamed from: p */
    public static /* synthetic */ hy1[] m15534p() {
        return new hy1[]{new dz3()};
    }

    /* renamed from: q */
    public static /* synthetic */ boolean m15535q(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    /* renamed from: r */
    public static dw3 m15536r(Metadata metadata, long j) {
        if (metadata == null) {
            return null;
        }
        int d = metadata.mo6545d();
        for (int i = 0; i < d; i++) {
            Metadata.Entry c = metadata.mo6544c(i);
            if (c instanceof MlltFrame) {
                return dw3.m15419a(j, (MlltFrame) c, m15531m(metadata));
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo151a() {
    }

    /* renamed from: b */
    public void mo152b(long j, long j2) {
        this.f11001k = 0;
        this.f11003m = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f11004n = 0;
        this.f11006p = 0;
        this.f11010t = j2;
        at5 at5 = this.f11007q;
        if ((at5 instanceof ut2) && !((ut2) at5).mo26867a(j2)) {
            this.f11009s = true;
            this.f11000j = this.f10997g;
        }
    }

    /* renamed from: d */
    public int mo154d(iy1 iy1, mt4 mt4) throws IOException {
        mo19016g();
        int u = mo19023u(iy1);
        if (u == -1 && (this.f11007q instanceof ut2)) {
            long i = mo19018i(this.f11004n);
            if (this.f11007q.mo11157i() != i) {
                ((ut2) this.f11007q).mo26869d(i);
                this.f10998h.mo7715g(this.f11007q);
            }
        }
        return u;
    }

    /* renamed from: e */
    public boolean mo155e(iy1 iy1) throws IOException {
        return mo19025w(iy1, true);
    }

    @EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    /* renamed from: g */
    public final void mo19016g() {
        C2725kr.m20989i(this.f10999i);
        w67.m29360j(this.f10998h);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: at5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: dw3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: ut2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: ut2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: ut2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: ut2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: ut2} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r0 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        r0 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.at5 mo19017h(p000.iy1 r12) throws java.io.IOException {
        /*
            r11 = this;
            at5 r0 = r11.mo19021s(r12)
            androidx.media3.common.Metadata r1 = r11.f11002l
            long r2 = r12.getPosition()
            dw3 r1 = m15536r(r1, r2)
            boolean r2 = r11.f11008r
            if (r2 == 0) goto L_0x0018
            at5$a r12 = new at5$a
            r12.<init>()
            return r12
        L_0x0018:
            r2 = 0
            int r3 = r11.f10991a
            r3 = r3 & 4
            if (r3 == 0) goto L_0x004c
            r2 = -1
            if (r1 == 0) goto L_0x002e
            long r2 = r1.mo11157i()
            long r0 = r1.mo11142g()
        L_0x002b:
            r9 = r0
            r5 = r2
            goto L_0x0041
        L_0x002e:
            if (r0 == 0) goto L_0x0039
            long r2 = r0.mo11157i()
            long r0 = r0.mo11142g()
            goto L_0x002b
        L_0x0039:
            androidx.media3.common.Metadata r0 = r11.f11002l
            long r0 = m15531m(r0)
            r5 = r0
            r9 = r2
        L_0x0041:
            ut2 r0 = new ut2
            long r7 = r12.getPosition()
            r4 = r0
            r4.<init>(r5, r7, r9)
            goto L_0x0054
        L_0x004c:
            if (r1 == 0) goto L_0x0050
            r0 = r1
            goto L_0x0054
        L_0x0050:
            if (r0 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            r1 = 1
            if (r0 == 0) goto L_0x0062
            boolean r2 = r0.mo11156h()
            if (r2 != 0) goto L_0x006e
            int r2 = r11.f10991a
            r2 = r2 & r1
            if (r2 == 0) goto L_0x006e
        L_0x0062:
            int r0 = r11.f10991a
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r1 = 0
        L_0x006a:
            at5 r0 = r11.mo19020l(r12, r1)
        L_0x006e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dz3.mo19017h(iy1):at5");
    }

    /* renamed from: i */
    public final long mo19018i(long j) {
        return this.f11003m + ((j * 1000000) / ((long) this.f10994d.f14390d));
    }

    /* renamed from: j */
    public void mo159j(jy1 jy1) {
        this.f10998h = jy1;
        zs6 f = jy1.mo7713f(0, 1);
        this.f10999i = f;
        this.f11000j = f;
        this.f10998h.mo7722p();
    }

    /* renamed from: k */
    public void mo19019k() {
        this.f11008r = true;
    }

    /* renamed from: l */
    public final at5 mo19020l(iy1 iy1, boolean z) throws IOException {
        iy1.mo94n(this.f10993c.mo20679d(), 0, 4);
        this.f10993c.mo20674P(0);
        this.f10994d.mo22612a(this.f10993c.mo20689n());
        return new eq0(iy1.getLength(), iy1.getPosition(), this.f10994d, z);
    }

    /* renamed from: s */
    public final at5 mo19021s(iy1 iy1) throws IOException {
        gm4 gm4 = new gm4(this.f10994d.f14389c);
        iy1.mo94n(gm4.mo20679d(), 0, this.f10994d.f14389c);
        kz3.C2735a aVar = this.f10994d;
        int i = 21;
        if ((aVar.f14387a & 1) != 0) {
            if (aVar.f14391e != 1) {
                i = 36;
            }
        } else if (aVar.f14391e == 1) {
            i = 13;
        }
        int i2 = i;
        int n = m15532n(gm4, i2);
        if (n == 1483304551 || n == 1231971951) {
            ep7 a = ep7.m16286a(iy1.getLength(), iy1.getPosition(), this.f10994d, gm4);
            if (a != null && !this.f10995e.mo27485a()) {
                iy1.mo85e();
                iy1.mo90i(i2 + 141);
                iy1.mo94n(this.f10993c.mo20679d(), 0, 3);
                this.f10993c.mo20674P(0);
                this.f10995e.mo27488d(this.f10993c.mo20665G());
            }
            iy1.mo92k(this.f10994d.f14389c);
            if (a == null || a.mo11156h() || n != 1231971951) {
                return a;
            }
            return mo19020l(iy1, false);
        } else if (n == 1447187017) {
            r87 a2 = r87.m26127a(iy1.getLength(), iy1.getPosition(), this.f10994d, gm4);
            iy1.mo92k(this.f10994d.f14389c);
            return a2;
        } else {
            iy1.mo85e();
            return null;
        }
    }

    /* renamed from: t */
    public final boolean mo19022t(iy1 iy1) throws IOException {
        at5 at5 = this.f11007q;
        if (at5 != null) {
            long g = at5.mo11142g();
            if (g != -1 && iy1.mo89h() > g - 4) {
                return true;
            }
        }
        try {
            return !iy1.mo84c(this.f10993c.mo20679d(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /* renamed from: u */
    public final int mo19023u(iy1 iy1) throws IOException {
        Metadata metadata;
        if (this.f11001k == 0) {
            try {
                mo19025w(iy1, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f11007q == null) {
            at5 h = mo19017h(iy1);
            this.f11007q = h;
            this.f10998h.mo7715g(h);
            zs6 zs6 = this.f11000j;
            C0792h.C0794b O = new C0792h.C0794b().mo6670e0(this.f10994d.f14388b).mo6662W(4096).mo6647H(this.f10994d.f14391e).mo6671f0(this.f10994d.f14390d).mo6653N(this.f10995e.f19072a).mo6654O(this.f10995e.f19073b);
            if ((this.f10991a & 8) != 0) {
                metadata = null;
            } else {
                metadata = this.f11002l;
            }
            zs6.mo7303d(O.mo6663X(metadata).mo6644E());
            this.f11005o = iy1.getPosition();
        } else if (this.f11005o != 0) {
            long position = iy1.getPosition();
            long j = this.f11005o;
            if (position < j) {
                iy1.mo92k((int) (j - position));
            }
        }
        return mo19024v(iy1);
    }

    @RequiresNonNull({"realTrackOutput", "seeker"})
    /* renamed from: v */
    public final int mo19024v(iy1 iy1) throws IOException {
        if (this.f11006p == 0) {
            iy1.mo85e();
            if (mo19022t(iy1)) {
                return -1;
            }
            this.f10993c.mo20674P(0);
            int n = this.f10993c.mo20689n();
            if (!m15533o(n, (long) this.f11001k) || kz3.m21177j(n) == -1) {
                iy1.mo92k(1);
                this.f11001k = 0;
                return 0;
            }
            this.f10994d.mo22612a(n);
            if (this.f11003m == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                this.f11003m = this.f11007q.mo11141c(iy1.getPosition());
                if (this.f10992b != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                    this.f11003m += this.f10992b - this.f11007q.mo11141c(0);
                }
            }
            kz3.C2735a aVar = this.f10994d;
            this.f11006p = aVar.f14389c;
            at5 at5 = this.f11007q;
            if (at5 instanceof ut2) {
                ut2 ut2 = (ut2) at5;
                ut2.mo26868b(mo19018i(this.f11004n + ((long) aVar.f14393g)), iy1.getPosition() + ((long) this.f10994d.f14389c));
                if (this.f11009s && ut2.mo26867a(this.f11010t)) {
                    this.f11009s = false;
                    this.f11000j = this.f10999i;
                }
            }
        }
        int e = this.f11000j.mo7304e(iy1, this.f11006p, true);
        if (e == -1) {
            return -1;
        }
        int i = this.f11006p - e;
        this.f11006p = i;
        if (i > 0) {
            return 0;
        }
        this.f11000j.mo7301b(mo19018i(this.f11004n), 1, this.f10994d.f14389c, 0, (zs6.C3758a) null);
        this.f11004n += (long) this.f10994d.f14393g;
        this.f11006p = 0;
        return 0;
    }

    /* renamed from: w */
    public final boolean mo19025w(iy1 iy1, boolean z) throws IOException {
        int i;
        int i2;
        int i3;
        int j;
        boolean z2;
        vp2.C3504a aVar;
        if (z) {
            i = 32768;
        } else {
            i = 131072;
        }
        iy1.mo85e();
        if (iy1.getPosition() == 0) {
            if ((this.f10991a & 8) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                aVar = null;
            } else {
                aVar = f10990v;
            }
            Metadata a = this.f10996f.mo27591a(iy1, aVar);
            this.f11002l = a;
            if (a != null) {
                this.f10995e.mo27487c(a);
            }
            i3 = (int) iy1.mo89h();
            if (!z) {
                iy1.mo92k(i3);
            }
            i2 = 0;
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i4 = i2;
        int i5 = i4;
        while (true) {
            if (!mo19022t(iy1)) {
                this.f10993c.mo20674P(0);
                int n = this.f10993c.mo20689n();
                if ((i2 == 0 || m15533o(n, (long) i2)) && (j = kz3.m21177j(n)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.f10994d.mo22612a(n);
                        i2 = n;
                    }
                    iy1.mo90i(j - 4);
                } else {
                    int i6 = i5 + 1;
                    if (i5 != i) {
                        if (z) {
                            iy1.mo85e();
                            iy1.mo90i(i3 + i6);
                        } else {
                            iy1.mo92k(1);
                        }
                        i4 = 0;
                        i5 = i6;
                        i2 = 0;
                    } else if (z) {
                        return false;
                    } else {
                        throw ParserException.createForMalformedContainer("Searched too many bytes.", (Throwable) null);
                    }
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            iy1.mo92k(i3 + i5);
        } else {
            iy1.mo85e();
        }
        this.f11001k = i2;
        return true;
    }

    public dz3(int i) {
        this(i, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
    }

    public dz3(int i, long j) {
        this.f10991a = (i & 2) != 0 ? i | 1 : i;
        this.f10992b = j;
        this.f10993c = new gm4(10);
        this.f10994d = new kz3.C2735a();
        this.f10995e = new we2();
        this.f11003m = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f10996f = new wp2();
        cl1 cl1 = new cl1();
        this.f10997g = cl1;
        this.f11000j = cl1;
    }
}
