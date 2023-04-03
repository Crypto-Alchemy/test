package p000;

import android.util.Pair;
import androidx.media3.common.ParserException;
import java.io.IOException;

/* renamed from: mj7 */
/* compiled from: WavHeaderReader */
public final class mj7 {

    /* renamed from: mj7$a */
    /* compiled from: WavHeaderReader */
    public static final class C2839a {

        /* renamed from: a */
        public final int f14993a;

        /* renamed from: b */
        public final long f14994b;

        public C2839a(int i, long j) {
            this.f14993a = i;
            this.f14994b = j;
        }

        /* renamed from: a */
        public static C2839a m22332a(iy1 iy1, gm4 gm4) throws IOException {
            iy1.mo94n(gm4.mo20679d(), 0, 8);
            gm4.mo20674P(0);
            return new C2839a(gm4.mo20689n(), gm4.mo20695t());
        }
    }

    /* renamed from: a */
    public static boolean m22327a(iy1 iy1) throws IOException {
        gm4 gm4 = new gm4(8);
        int i = C2839a.m22332a(iy1, gm4).f14993a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        iy1.mo94n(gm4.mo20679d(), 0, 4);
        gm4.mo20674P(0);
        int n = gm4.mo20689n();
        if (n == 1463899717) {
            return true;
        }
        gk3.m18126c("WavHeaderReader", "Unsupported form type: " + n);
        return false;
    }

    /* renamed from: b */
    public static lj7 m22328b(iy1 iy1) throws IOException {
        boolean z;
        byte[] bArr;
        gm4 gm4 = new gm4(16);
        C2839a d = m22330d(1718449184, iy1, gm4);
        if (d.f14994b >= 16) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        iy1.mo94n(gm4.mo20679d(), 0, 16);
        gm4.mo20674P(0);
        int v = gm4.mo20697v();
        int v2 = gm4.mo20697v();
        int u = gm4.mo20696u();
        int u2 = gm4.mo20696u();
        int v3 = gm4.mo20697v();
        int v4 = gm4.mo20697v();
        int i = ((int) d.f14994b) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            iy1.mo94n(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = w67.f19026f;
        }
        iy1.mo92k((int) (iy1.mo89h() - iy1.getPosition()));
        return new lj7(v, v2, u, u2, v3, v4, bArr);
    }

    /* renamed from: c */
    public static long m22329c(iy1 iy1) throws IOException {
        gm4 gm4 = new gm4(8);
        C2839a a = C2839a.m22332a(iy1, gm4);
        if (a.f14993a != 1685272116) {
            iy1.mo85e();
            return -1;
        }
        iy1.mo90i(8);
        gm4.mo20674P(0);
        iy1.mo94n(gm4.mo20679d(), 0, 8);
        long r = gm4.mo20693r();
        iy1.mo92k(((int) a.f14994b) + 8);
        return r;
    }

    /* renamed from: d */
    public static C2839a m22330d(int i, iy1 iy1, gm4 gm4) throws IOException {
        C2839a a = C2839a.m22332a(iy1, gm4);
        while (a.f14993a != i) {
            gk3.m18132i("WavHeaderReader", "Ignoring unknown WAV chunk: " + a.f14993a);
            long j = a.f14994b + 8;
            if (j <= 2147483647L) {
                iy1.mo92k((int) j);
                a = C2839a.m22332a(iy1, gm4);
            } else {
                throw ParserException.createForUnsupportedContainerFeature("Chunk is too large (~2GB+) to skip; id: " + a.f14993a);
            }
        }
        return a;
    }

    /* renamed from: e */
    public static Pair<Long, Long> m22331e(iy1 iy1) throws IOException {
        iy1.mo85e();
        C2839a d = m22330d(1684108385, iy1, new gm4(8));
        iy1.mo92k(8);
        return Pair.create(Long.valueOf(iy1.getPosition()), Long.valueOf(d.f14994b));
    }
}
