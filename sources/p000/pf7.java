package p000;

import android.util.Base64;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.vorbis.VorbisComment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: pf7 */
/* compiled from: VorbisUtil */
public final class pf7 {

    /* renamed from: pf7$a */
    /* compiled from: VorbisUtil */
    public static final class C3061a {

        /* renamed from: a */
        public final int f16439a;

        /* renamed from: b */
        public final int f16440b;

        /* renamed from: c */
        public final long[] f16441c;

        /* renamed from: d */
        public final int f16442d;

        /* renamed from: e */
        public final boolean f16443e;

        public C3061a(int i, int i2, long[] jArr, int i3, boolean z) {
            this.f16439a = i;
            this.f16440b = i2;
            this.f16441c = jArr;
            this.f16442d = i3;
            this.f16443e = z;
        }
    }

    /* renamed from: pf7$b */
    /* compiled from: VorbisUtil */
    public static final class C3062b {

        /* renamed from: a */
        public final String f16444a;

        /* renamed from: b */
        public final String[] f16445b;

        /* renamed from: c */
        public final int f16446c;

        public C3062b(String str, String[] strArr, int i) {
            this.f16444a = str;
            this.f16445b = strArr;
            this.f16446c = i;
        }
    }

    /* renamed from: pf7$c */
    /* compiled from: VorbisUtil */
    public static final class C3063c {

        /* renamed from: a */
        public final boolean f16447a;

        /* renamed from: b */
        public final int f16448b;

        /* renamed from: c */
        public final int f16449c;

        /* renamed from: d */
        public final int f16450d;

        public C3063c(boolean z, int i, int i2, int i3) {
            this.f16447a = z;
            this.f16448b = i;
            this.f16449c = i2;
            this.f16450d = i3;
        }
    }

    /* renamed from: pf7$d */
    /* compiled from: VorbisUtil */
    public static final class C3064d {

        /* renamed from: a */
        public final int f16451a;

        /* renamed from: b */
        public final int f16452b;

        /* renamed from: c */
        public final int f16453c;

        /* renamed from: d */
        public final int f16454d;

        /* renamed from: e */
        public final int f16455e;

        /* renamed from: f */
        public final int f16456f;

        /* renamed from: g */
        public final int f16457g;

        /* renamed from: h */
        public final int f16458h;

        /* renamed from: i */
        public final boolean f16459i;

        /* renamed from: j */
        public final byte[] f16460j;

        public C3064d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, byte[] bArr) {
            this.f16451a = i;
            this.f16452b = i2;
            this.f16453c = i3;
            this.f16454d = i4;
            this.f16455e = i5;
            this.f16456f = i6;
            this.f16457g = i7;
            this.f16458h = i8;
            this.f16459i = z;
            this.f16460j = bArr;
        }
    }

    /* renamed from: a */
    public static int m24902a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: b */
    public static long m24903b(long j, long j2) {
        return (long) Math.floor(Math.pow((double) j, 1.0d / ((double) j2)));
    }

    /* renamed from: c */
    public static Metadata m24904c(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] M0 = w67.m29319M0(str, "=");
            if (M0.length != 2) {
                gk3.m18132i("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (M0[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.m7622a(new gm4(Base64.decode(M0[1], 0))));
                } catch (RuntimeException e) {
                    gk3.m18133j("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new VorbisComment(M0[0], M0[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata((List<? extends Metadata.Entry>) arrayList);
    }

    /* renamed from: d */
    public static C3061a m24905d(nf7 nf7) throws ParserException {
        if (nf7.mo23679d(24) == 5653314) {
            int d = nf7.mo23679d(16);
            int d2 = nf7.mo23679d(24);
            long[] jArr = new long[d2];
            boolean c = nf7.mo23678c();
            long j = 0;
            if (!c) {
                boolean c2 = nf7.mo23678c();
                for (int i = 0; i < d2; i++) {
                    if (!c2) {
                        jArr[i] = (long) (nf7.mo23679d(5) + 1);
                    } else if (nf7.mo23678c()) {
                        jArr[i] = (long) (nf7.mo23679d(5) + 1);
                    } else {
                        jArr[i] = 0;
                    }
                }
            } else {
                int d3 = nf7.mo23679d(5) + 1;
                int i2 = 0;
                while (i2 < d2) {
                    int d4 = nf7.mo23679d(m24902a(d2 - i2));
                    for (int i3 = 0; i3 < d4 && i2 < d2; i3++) {
                        jArr[i2] = (long) d3;
                        i2++;
                    }
                    d3++;
                }
            }
            int d5 = nf7.mo23679d(4);
            if (d5 <= 2) {
                if (d5 == 1 || d5 == 2) {
                    nf7.mo23680e(32);
                    nf7.mo23680e(32);
                    int d6 = nf7.mo23679d(4) + 1;
                    nf7.mo23680e(1);
                    if (d5 != 1) {
                        j = ((long) d2) * ((long) d);
                    } else if (d != 0) {
                        j = m24903b((long) d2, (long) d);
                    }
                    nf7.mo23680e((int) (j * ((long) d6)));
                }
                return new C3061a(d, d2, jArr, d5, c);
            }
            throw ParserException.createForMalformedContainer("lookup type greater than 2 not decodable: " + d5, (Throwable) null);
        }
        throw ParserException.createForMalformedContainer("expected code book to start with [0x56, 0x43, 0x42] at " + nf7.mo23677b(), (Throwable) null);
    }

    /* renamed from: e */
    public static void m24906e(nf7 nf7) throws ParserException {
        int d = nf7.mo23679d(6) + 1;
        for (int i = 0; i < d; i++) {
            int d2 = nf7.mo23679d(16);
            if (d2 == 0) {
                nf7.mo23680e(8);
                nf7.mo23680e(16);
                nf7.mo23680e(16);
                nf7.mo23680e(6);
                nf7.mo23680e(8);
                int d3 = nf7.mo23679d(4) + 1;
                for (int i2 = 0; i2 < d3; i2++) {
                    nf7.mo23680e(8);
                }
            } else if (d2 == 1) {
                int d4 = nf7.mo23679d(5);
                int i3 = -1;
                int[] iArr = new int[d4];
                for (int i4 = 0; i4 < d4; i4++) {
                    int d5 = nf7.mo23679d(4);
                    iArr[i4] = d5;
                    if (d5 > i3) {
                        i3 = d5;
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = nf7.mo23679d(3) + 1;
                    int d6 = nf7.mo23679d(2);
                    if (d6 > 0) {
                        nf7.mo23680e(8);
                    }
                    for (int i7 = 0; i7 < (1 << d6); i7++) {
                        nf7.mo23680e(8);
                    }
                }
                nf7.mo23680e(2);
                int d7 = nf7.mo23679d(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < d4; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        nf7.mo23680e(d7);
                        i9++;
                    }
                }
            } else {
                throw ParserException.createForMalformedContainer("floor type greater than 1 not decodable: " + d2, (Throwable) null);
            }
        }
    }

    /* renamed from: f */
    public static void m24907f(int i, nf7 nf7) throws ParserException {
        int i2;
        int d = nf7.mo23679d(6) + 1;
        for (int i3 = 0; i3 < d; i3++) {
            int d2 = nf7.mo23679d(16);
            if (d2 != 0) {
                gk3.m18126c("VorbisUtil", "mapping type other than 0 not supported: " + d2);
            } else {
                if (nf7.mo23678c()) {
                    i2 = nf7.mo23679d(4) + 1;
                } else {
                    i2 = 1;
                }
                if (nf7.mo23678c()) {
                    int d3 = nf7.mo23679d(8) + 1;
                    for (int i4 = 0; i4 < d3; i4++) {
                        int i5 = i - 1;
                        nf7.mo23680e(m24902a(i5));
                        nf7.mo23680e(m24902a(i5));
                    }
                }
                if (nf7.mo23679d(2) == 0) {
                    if (i2 > 1) {
                        for (int i6 = 0; i6 < i; i6++) {
                            nf7.mo23680e(4);
                        }
                    }
                    for (int i7 = 0; i7 < i2; i7++) {
                        nf7.mo23680e(8);
                        nf7.mo23680e(8);
                        nf7.mo23680e(8);
                    }
                } else {
                    throw ParserException.createForMalformedContainer("to reserved bits must be zero after mapping coupling steps", (Throwable) null);
                }
            }
        }
    }

    /* renamed from: g */
    public static C3063c[] m24908g(nf7 nf7) {
        int d = nf7.mo23679d(6) + 1;
        C3063c[] cVarArr = new C3063c[d];
        for (int i = 0; i < d; i++) {
            cVarArr[i] = new C3063c(nf7.mo23678c(), nf7.mo23679d(16), nf7.mo23679d(16), nf7.mo23679d(8));
        }
        return cVarArr;
    }

    /* renamed from: h */
    public static void m24909h(nf7 nf7) throws ParserException {
        int i;
        int d = nf7.mo23679d(6) + 1;
        int i2 = 0;
        while (i2 < d) {
            if (nf7.mo23679d(16) <= 2) {
                nf7.mo23680e(24);
                nf7.mo23680e(24);
                nf7.mo23680e(24);
                int d2 = nf7.mo23679d(6) + 1;
                nf7.mo23680e(8);
                int[] iArr = new int[d2];
                for (int i3 = 0; i3 < d2; i3++) {
                    int d3 = nf7.mo23679d(3);
                    if (nf7.mo23678c()) {
                        i = nf7.mo23679d(5);
                    } else {
                        i = 0;
                    }
                    iArr[i3] = (i * 8) + d3;
                }
                for (int i4 = 0; i4 < d2; i4++) {
                    for (int i5 = 0; i5 < 8; i5++) {
                        if ((iArr[i4] & (1 << i5)) != 0) {
                            nf7.mo23680e(8);
                        }
                    }
                }
                i2++;
            } else {
                throw ParserException.createForMalformedContainer("residueType greater than 2 is not decodable", (Throwable) null);
            }
        }
    }

    /* renamed from: i */
    public static C3062b m24910i(gm4 gm4) throws ParserException {
        return m24911j(gm4, true, true);
    }

    /* renamed from: j */
    public static C3062b m24911j(gm4 gm4, boolean z, boolean z2) throws ParserException {
        if (z) {
            m24914m(3, gm4, false);
        }
        String A = gm4.mo20659A((int) gm4.mo20695t());
        int length = 11 + A.length();
        long t = gm4.mo20695t();
        String[] strArr = new String[((int) t)];
        int i = length + 4;
        for (int i2 = 0; ((long) i2) < t; i2++) {
            String A2 = gm4.mo20659A((int) gm4.mo20695t());
            strArr[i2] = A2;
            i = i + 4 + A2.length();
        }
        if (!z2 || (gm4.mo20662D() & 1) != 0) {
            return new C3062b(A, strArr, i + 1);
        }
        throw ParserException.createForMalformedContainer("framing bit expected to be set", (Throwable) null);
    }

    /* renamed from: k */
    public static C3064d m24912k(gm4 gm4) throws ParserException {
        boolean z = true;
        m24914m(1, gm4, false);
        int u = gm4.mo20696u();
        int D = gm4.mo20662D();
        int u2 = gm4.mo20696u();
        int q = gm4.mo20692q();
        if (q <= 0) {
            q = -1;
        }
        int q2 = gm4.mo20692q();
        if (q2 <= 0) {
            q2 = -1;
        }
        int q3 = gm4.mo20692q();
        if (q3 <= 0) {
            q3 = -1;
        }
        int D2 = gm4.mo20662D();
        int pow = (int) Math.pow(2.0d, (double) (D2 & 15));
        int pow2 = (int) Math.pow(2.0d, (double) ((D2 & 240) >> 4));
        if ((gm4.mo20662D() & 1) <= 0) {
            z = false;
        }
        return new C3064d(u, D, u2, q, q2, q3, pow, pow2, z, Arrays.copyOf(gm4.mo20679d(), gm4.mo20681f()));
    }

    /* renamed from: l */
    public static C3063c[] m24913l(gm4 gm4, int i) throws ParserException {
        int i2 = 0;
        m24914m(5, gm4, false);
        int D = gm4.mo20662D() + 1;
        nf7 nf7 = new nf7(gm4.mo20679d());
        nf7.mo23680e(gm4.mo20680e() * 8);
        for (int i3 = 0; i3 < D; i3++) {
            m24905d(nf7);
        }
        int d = nf7.mo23679d(6) + 1;
        while (i2 < d) {
            if (nf7.mo23679d(16) == 0) {
                i2++;
            } else {
                throw ParserException.createForMalformedContainer("placeholder of time domain transforms not zeroed out", (Throwable) null);
            }
        }
        m24906e(nf7);
        m24909h(nf7);
        m24907f(i, nf7);
        C3063c[] g = m24908g(nf7);
        if (nf7.mo23678c()) {
            return g;
        }
        throw ParserException.createForMalformedContainer("framing bit after modes not set as expected", (Throwable) null);
    }

    /* renamed from: m */
    public static boolean m24914m(int i, gm4 gm4, boolean z) throws ParserException {
        if (gm4.mo20676a() < 7) {
            if (z) {
                return false;
            }
            throw ParserException.createForMalformedContainer("too short header: " + gm4.mo20676a(), (Throwable) null);
        } else if (gm4.mo20662D() != i) {
            if (z) {
                return false;
            }
            throw ParserException.createForMalformedContainer("expected header type " + Integer.toHexString(i), (Throwable) null);
        } else if (gm4.mo20662D() == 118 && gm4.mo20662D() == 111 && gm4.mo20662D() == 114 && gm4.mo20662D() == 98 && gm4.mo20662D() == 105 && gm4.mo20662D() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw ParserException.createForMalformedContainer("expected characters 'vorbis'", (Throwable) null);
        }
    }
}
