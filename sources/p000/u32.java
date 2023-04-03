package p000;

import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import p000.vp2;
import p000.x32;

/* renamed from: u32 */
/* compiled from: FlacMetadataReader */
public final class u32 {

    /* renamed from: u32$a */
    /* compiled from: FlacMetadataReader */
    public static final class C3393a {

        /* renamed from: a */
        public x32 f18366a;

        public C3393a(x32 x32) {
            this.f18366a = x32;
        }
    }

    /* renamed from: a */
    public static boolean m28045a(iy1 iy1) throws IOException {
        gm4 gm4 = new gm4(4);
        iy1.mo94n(gm4.mo20679d(), 0, 4);
        if (gm4.mo20664F() == 1716281667) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m28046b(iy1 iy1) throws IOException {
        iy1.mo85e();
        gm4 gm4 = new gm4(2);
        iy1.mo94n(gm4.mo20679d(), 0, 2);
        int J = gm4.mo20668J();
        if ((J >> 2) == 16382) {
            iy1.mo85e();
            return J;
        }
        iy1.mo85e();
        throw ParserException.createForMalformedContainer("First frame does not start with sync code.", (Throwable) null);
    }

    /* renamed from: c */
    public static Metadata m28047c(iy1 iy1, boolean z) throws IOException {
        vp2.C3504a aVar;
        if (z) {
            aVar = null;
        } else {
            aVar = vp2.f18877b;
        }
        Metadata a = new wp2().mo27591a(iy1, aVar);
        if (a == null || a.mo6545d() == 0) {
            return null;
        }
        return a;
    }

    /* renamed from: d */
    public static Metadata m28048d(iy1 iy1, boolean z) throws IOException {
        iy1.mo85e();
        long h = iy1.mo89h();
        Metadata c = m28047c(iy1, z);
        iy1.mo92k((int) (iy1.mo89h() - h));
        return c;
    }

    /* renamed from: e */
    public static boolean m28049e(iy1 iy1, C3393a aVar) throws IOException {
        iy1.mo85e();
        fm4 fm4 = new fm4(new byte[4]);
        iy1.mo94n(fm4.f11939a, 0, 4);
        boolean g = fm4.mo20003g();
        int h = fm4.mo20004h(7);
        int h2 = fm4.mo20004h(24) + 4;
        if (h == 0) {
            aVar.f18366a = m28052h(iy1);
        } else {
            x32 x32 = aVar.f18366a;
            if (x32 == null) {
                throw new IllegalArgumentException();
            } else if (h == 3) {
                aVar.f18366a = x32.mo27663b(m28050f(iy1, h2));
            } else if (h == 4) {
                aVar.f18366a = x32.mo27664c(m28054j(iy1, h2));
            } else if (h == 6) {
                gm4 gm4 = new gm4(h2);
                iy1.readFully(gm4.mo20679d(), 0, h2);
                gm4.mo20675Q(4);
                aVar.f18366a = x32.mo27662a(ImmutableList.m36628of(PictureFrame.m7622a(gm4)));
            } else {
                iy1.mo92k(h2);
            }
        }
        return g;
    }

    /* renamed from: f */
    public static x32.C3567a m28050f(iy1 iy1, int i) throws IOException {
        gm4 gm4 = new gm4(i);
        iy1.readFully(gm4.mo20679d(), 0, i);
        return m28051g(gm4);
    }

    /* renamed from: g */
    public static x32.C3567a m28051g(gm4 gm4) {
        gm4.mo20675Q(1);
        int G = gm4.mo20665G();
        long e = ((long) gm4.mo20680e()) + ((long) G);
        int i = G / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long w = gm4.mo20698w();
            if (w == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = w;
            jArr2[i2] = gm4.mo20698w();
            gm4.mo20675Q(2);
            i2++;
        }
        gm4.mo20675Q((int) (e - ((long) gm4.mo20680e())));
        return new x32.C3567a(jArr, jArr2);
    }

    /* renamed from: h */
    public static x32 m28052h(iy1 iy1) throws IOException {
        byte[] bArr = new byte[38];
        iy1.readFully(bArr, 0, 38);
        return new x32(bArr, 4);
    }

    /* renamed from: i */
    public static void m28053i(iy1 iy1) throws IOException {
        gm4 gm4 = new gm4(4);
        iy1.readFully(gm4.mo20679d(), 0, 4);
        if (gm4.mo20664F() != 1716281667) {
            throw ParserException.createForMalformedContainer("Failed to read FLAC stream marker.", (Throwable) null);
        }
    }

    /* renamed from: j */
    public static List<String> m28054j(iy1 iy1, int i) throws IOException {
        gm4 gm4 = new gm4(i);
        iy1.readFully(gm4.mo20679d(), 0, i);
        gm4.mo20675Q(4);
        return Arrays.asList(pf7.m24911j(gm4, false, false).f16445b);
    }
}
