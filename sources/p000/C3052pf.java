package p000;

import androidx.media3.common.C0792h;
import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p000.xs5;
import p000.zs6;

/* renamed from: pf */
/* compiled from: AmrExtractor */
public final class C3052pf implements hy1 {

    /* renamed from: p */
    public static final ny1 f16401p = new C2948of();

    /* renamed from: q */
    public static final int[] f16402q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: r */
    public static final int[] f16403r;

    /* renamed from: s */
    public static final byte[] f16404s = w67.m29361j0("#!AMR\n");

    /* renamed from: t */
    public static final byte[] f16405t = w67.m29361j0("#!AMR-WB\n");

    /* renamed from: u */
    public static final int f16406u;

    /* renamed from: a */
    public final byte[] f16407a;

    /* renamed from: b */
    public final int f16408b;

    /* renamed from: c */
    public boolean f16409c;

    /* renamed from: d */
    public long f16410d;

    /* renamed from: e */
    public int f16411e;

    /* renamed from: f */
    public int f16412f;

    /* renamed from: g */
    public boolean f16413g;

    /* renamed from: h */
    public long f16414h;

    /* renamed from: i */
    public int f16415i;

    /* renamed from: j */
    public int f16416j;

    /* renamed from: k */
    public long f16417k;

    /* renamed from: l */
    public jy1 f16418l;

    /* renamed from: m */
    public zs6 f16419m;

    /* renamed from: n */
    public xs5 f16420n;

    /* renamed from: o */
    public boolean f16421o;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f16403r = iArr;
        f16406u = iArr[8];
    }

    public C3052pf() {
        this(0);
    }

    /* renamed from: g */
    public static int m24839g(int i, long j) {
        return (int) (((((long) i) * 8) * 1000000) / j);
    }

    /* renamed from: n */
    public static /* synthetic */ hy1[] m24840n() {
        return new hy1[]{new C3052pf()};
    }

    /* renamed from: q */
    public static boolean m24841q(iy1 iy1, byte[] bArr) throws IOException {
        iy1.mo85e();
        byte[] bArr2 = new byte[bArr.length];
        iy1.mo94n(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    /* renamed from: a */
    public void mo151a() {
    }

    /* renamed from: b */
    public void mo152b(long j, long j2) {
        this.f16410d = 0;
        this.f16411e = 0;
        this.f16412f = 0;
        if (j != 0) {
            xs5 xs5 = this.f16420n;
            if (xs5 instanceof dq0) {
                this.f16417k = ((dq0) xs5).mo18875b(j);
                return;
            }
        }
        this.f16417k = 0;
    }

    /* renamed from: d */
    public int mo154d(iy1 iy1, mt4 mt4) throws IOException {
        mo24537f();
        if (iy1.getPosition() != 0 || mo24546s(iy1)) {
            mo24543o();
            int t = mo24547t(iy1);
            mo24544p(iy1.getLength(), t);
            return t;
        }
        throw ParserException.createForMalformedContainer("Could not find AMR header.", (Throwable) null);
    }

    /* renamed from: e */
    public boolean mo155e(iy1 iy1) throws IOException {
        return mo24546s(iy1);
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    /* renamed from: f */
    public final void mo24537f() {
        C2725kr.m20989i(this.f16419m);
        w67.m29360j(this.f16418l);
    }

    /* renamed from: h */
    public final xs5 mo24538h(long j, boolean z) {
        return new dq0(j, this.f16414h, m24839g(this.f16415i, 20000), this.f16415i, z);
    }

    /* renamed from: i */
    public final int mo24539i(int i) throws ParserException {
        String str;
        if (!mo24541l(i)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal AMR ");
            if (this.f16409c) {
                str = "WB";
            } else {
                str = "NB";
            }
            sb.append(str);
            sb.append(" frame type ");
            sb.append(i);
            throw ParserException.createForMalformedContainer(sb.toString(), (Throwable) null);
        } else if (this.f16409c) {
            return f16403r[i];
        } else {
            return f16402q[i];
        }
    }

    /* renamed from: j */
    public void mo159j(jy1 jy1) {
        this.f16418l = jy1;
        this.f16419m = jy1.mo7713f(0, 1);
        jy1.mo7722p();
    }

    /* renamed from: k */
    public final boolean mo24540k(int i) {
        if (this.f16409c || (i >= 12 && i <= 14)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final boolean mo24541l(int i) {
        if (i < 0 || i > 15 || (!mo24542m(i) && !mo24540k(i))) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final boolean mo24542m(int i) {
        if (!this.f16409c || (i >= 10 && i <= 13)) {
            return false;
        }
        return true;
    }

    @RequiresNonNull({"trackOutput"})
    /* renamed from: o */
    public final void mo24543o() {
        String str;
        int i;
        if (!this.f16421o) {
            this.f16421o = true;
            boolean z = this.f16409c;
            if (z) {
                str = "audio/amr-wb";
            } else {
                str = "audio/3gpp";
            }
            if (z) {
                i = 16000;
            } else {
                i = 8000;
            }
            this.f16419m.mo7303d(new C0792h.C0794b().mo6670e0(str).mo6662W(f16406u).mo6647H(1).mo6671f0(i).mo6644E());
        }
    }

    @RequiresNonNull({"extractorOutput"})
    /* renamed from: p */
    public final void mo24544p(long j, int i) {
        int i2;
        boolean z;
        if (!this.f16413g) {
            int i3 = this.f16408b;
            if ((i3 & 1) == 0 || j == -1 || !((i2 = this.f16415i) == -1 || i2 == this.f16411e)) {
                xs5.C3642b bVar = new xs5.C3642b(CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
                this.f16420n = bVar;
                this.f16418l.mo7715g(bVar);
                this.f16413g = true;
            } else if (this.f16416j >= 20 || i == -1) {
                if ((i3 & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                xs5 h = mo24538h(j, z);
                this.f16420n = h;
                this.f16418l.mo7715g(h);
                this.f16413g = true;
            }
        }
    }

    /* renamed from: r */
    public final int mo24545r(iy1 iy1) throws IOException {
        iy1.mo85e();
        iy1.mo94n(this.f16407a, 0, 1);
        byte b = this.f16407a[0];
        if ((b & 131) <= 0) {
            return mo24539i((b >> 3) & 15);
        }
        throw ParserException.createForMalformedContainer("Invalid padding bits for frame header " + b, (Throwable) null);
    }

    /* renamed from: s */
    public final boolean mo24546s(iy1 iy1) throws IOException {
        byte[] bArr = f16404s;
        if (m24841q(iy1, bArr)) {
            this.f16409c = false;
            iy1.mo92k(bArr.length);
            return true;
        }
        byte[] bArr2 = f16405t;
        if (!m24841q(iy1, bArr2)) {
            return false;
        }
        this.f16409c = true;
        iy1.mo92k(bArr2.length);
        return true;
    }

    @RequiresNonNull({"trackOutput"})
    /* renamed from: t */
    public final int mo24547t(iy1 iy1) throws IOException {
        if (this.f16412f == 0) {
            try {
                int r = mo24545r(iy1);
                this.f16411e = r;
                this.f16412f = r;
                if (this.f16415i == -1) {
                    this.f16414h = iy1.getPosition();
                    this.f16415i = this.f16411e;
                }
                if (this.f16415i == this.f16411e) {
                    this.f16416j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int e = this.f16419m.mo7304e(iy1, this.f16412f, true);
        if (e == -1) {
            return -1;
        }
        int i = this.f16412f - e;
        this.f16412f = i;
        if (i > 0) {
            return 0;
        }
        this.f16419m.mo7301b(this.f16417k + this.f16410d, 1, this.f16411e, 0, (zs6.C3758a) null);
        this.f16410d += 20000;
        return 0;
    }

    public C3052pf(int i) {
        this.f16408b = (i & 2) != 0 ? i | 1 : i;
        this.f16407a = new byte[1];
        this.f16415i = -1;
    }
}
