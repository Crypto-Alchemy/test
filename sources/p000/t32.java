package p000;

import androidx.media3.common.ParserException;
import java.io.IOException;

/* renamed from: t32 */
/* compiled from: FlacFrameReader */
public final class t32 {

    /* renamed from: t32$a */
    /* compiled from: FlacFrameReader */
    public static final class C3323a {

        /* renamed from: a */
        public long f17884a;
    }

    /* renamed from: a */
    public static boolean m27256a(gm4 gm4, x32 x32, int i) {
        int j = m27265j(gm4, i);
        if (j == -1 || j > x32.f19298b) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m27257b(gm4 gm4, int i) {
        if (gm4.mo20662D() == w67.m29380t(gm4.mo20679d(), i, gm4.mo20680e() - 1, 0)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m27258c(gm4 gm4, x32 x32, boolean z, C3323a aVar) {
        try {
            long K = gm4.mo20669K();
            if (!z) {
                K *= (long) x32.f19298b;
            }
            aVar.f17884a = K;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m27259d(gm4 gm4, x32 x32, int i, C3323a aVar) {
        boolean z;
        boolean z2;
        gm4 gm42 = gm4;
        x32 x322 = x32;
        int e = gm4.mo20680e();
        long F = gm4.mo20664F();
        long j = F >>> 16;
        if (j != ((long) i)) {
            return false;
        }
        if ((j & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        int i2 = (int) ((F >> 12) & 15);
        int i3 = (int) ((F >> 8) & 15);
        int i4 = (int) ((F >> 4) & 15);
        int i5 = (int) ((F >> 1) & 7);
        if ((F & 1) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!m27262g(i4, x322) || !m27261f(i5, x322) || z2 || !m27258c(gm42, x322, z, aVar) || !m27256a(gm42, x322, i2) || !m27260e(gm42, x322, i3) || !m27257b(gm42, e)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m27260e(gm4 gm4, x32 x32, int i) {
        int i2 = x32.f19301e;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            if (i == x32.f19302f) {
                return true;
            }
            return false;
        } else if (i == 12) {
            if (gm4.mo20662D() * 1000 == i2) {
                return true;
            }
            return false;
        } else if (i > 14) {
            return false;
        } else {
            int J = gm4.mo20668J();
            if (i == 14) {
                J *= 10;
            }
            if (J == i2) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m27261f(int i, x32 x32) {
        if (i == 0 || i == x32.f19305i) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m27262g(int i, x32 x32) {
        if (i <= 7) {
            if (i == x32.f19303g - 1) {
                return true;
            }
            return false;
        } else if (i > 10 || x32.f19303g != 2) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: h */
    public static boolean m27263h(iy1 iy1, x32 x32, int i, C3323a aVar) throws IOException {
        long h = iy1.mo89h();
        byte[] bArr = new byte[2];
        iy1.mo94n(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            iy1.mo85e();
            iy1.mo90i((int) (h - iy1.getPosition()));
            return false;
        }
        gm4 gm4 = new gm4(16);
        System.arraycopy(bArr, 0, gm4.mo20679d(), 0, 2);
        gm4.mo20673O(ky1.m21101c(iy1, gm4.mo20679d(), 2, 14));
        iy1.mo85e();
        iy1.mo90i((int) (h - iy1.getPosition()));
        return m27259d(gm4, x32, i, aVar);
    }

    /* renamed from: i */
    public static long m27264i(iy1 iy1, x32 x32) throws IOException {
        int i;
        iy1.mo85e();
        boolean z = true;
        iy1.mo90i(1);
        byte[] bArr = new byte[1];
        iy1.mo94n(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z = false;
        }
        iy1.mo90i(2);
        if (z) {
            i = 7;
        } else {
            i = 6;
        }
        gm4 gm4 = new gm4(i);
        gm4.mo20673O(ky1.m21101c(iy1, gm4.mo20679d(), 0, i));
        iy1.mo85e();
        C3323a aVar = new C3323a();
        if (m27258c(gm4, x32, z, aVar)) {
            return aVar.f17884a;
        }
        throw ParserException.createForMalformedContainer((String) null, (Throwable) null);
    }

    /* renamed from: j */
    public static int m27265j(gm4 gm4, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return gm4.mo20662D() + 1;
            case 7:
                return gm4.mo20668J() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }
}
