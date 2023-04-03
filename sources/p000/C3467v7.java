package p000;

import androidx.media3.common.C0792h;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.PlaybackException;
import java.nio.ByteBuffer;

/* renamed from: v7 */
/* compiled from: Ac4Util */
public final class C3467v7 {

    /* renamed from: a */
    public static final int[] f18695a = {PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT, PlaybackException.ERROR_CODE_IO_UNSPECIFIED, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: v7$b */
    /* compiled from: Ac4Util */
    public static final class C3469b {

        /* renamed from: a */
        public final int f18696a;

        /* renamed from: b */
        public final int f18697b;

        /* renamed from: c */
        public final int f18698c;

        /* renamed from: d */
        public final int f18699d;

        /* renamed from: e */
        public final int f18700e;

        public C3469b(int i, int i2, int i3, int i4, int i5) {
            this.f18696a = i;
            this.f18698c = i2;
            this.f18697b = i3;
            this.f18699d = i4;
            this.f18700e = i5;
        }
    }

    /* renamed from: a */
    public static void m28675a(int i, gm4 gm4) {
        gm4.mo20670L(7);
        byte[] d = gm4.mo20679d();
        d[0] = -84;
        d[1] = 64;
        d[2] = -1;
        d[3] = -1;
        d[4] = (byte) ((i >> 16) & 255);
        d[5] = (byte) ((i >> 8) & 255);
        d[6] = (byte) (i & 255);
    }

    /* renamed from: b */
    public static C0792h m28676b(gm4 gm4, String str, String str2, DrmInitData drmInitData) {
        int i;
        gm4.mo20675Q(1);
        if (((gm4.mo20662D() & 32) >> 5) == 1) {
            i = 48000;
        } else {
            i = 44100;
        }
        return new C0792h.C0794b().mo6658S(str).mo6670e0("audio/ac4").mo6647H(2).mo6671f0(i).mo6652M(drmInitData).mo6661V(str2).mo6644E();
    }

    /* renamed from: c */
    public static int m28677c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return m28678d(new fm4(bArr)).f18700e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0082, code lost:
        if (r10 != 11) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0087, code lost:
        if (r10 != 11) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008c, code lost:
        if (r10 != 8) goto L_0x0090;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.C3467v7.C3469b m28678d(p000.fm4 r10) {
        /*
            r0 = 16
            int r1 = r10.mo20004h(r0)
            int r0 = r10.mo20004h(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L_0x0018
            r0 = 24
            int r0 = r10.mo20004h(r0)
            r3 = 7
            goto L_0x0019
        L_0x0018:
            r3 = r2
        L_0x0019:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L_0x0021
            int r0 = r0 + 2
        L_0x0021:
            r7 = r0
            r0 = 2
            int r1 = r10.mo20004h(r0)
            r3 = 3
            if (r1 != r3) goto L_0x002f
            int r4 = m28680f(r10, r0)
            int r1 = r1 + r4
        L_0x002f:
            r4 = r1
            r1 = 10
            int r1 = r10.mo20004h(r1)
            boolean r5 = r10.mo20003g()
            if (r5 == 0) goto L_0x0045
            int r5 = r10.mo20004h(r3)
            if (r5 <= 0) goto L_0x0045
            r10.mo20014r(r0)
        L_0x0045:
            boolean r5 = r10.mo20003g()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r8 = 44100(0xac44, float:6.1797E-41)
            if (r5 == 0) goto L_0x0053
            r9 = r6
            goto L_0x0054
        L_0x0053:
            r9 = r8
        L_0x0054:
            int r10 = r10.mo20004h(r2)
            r5 = 0
            if (r9 != r8) goto L_0x0065
            r8 = 13
            if (r10 != r8) goto L_0x0065
            int[] r0 = f18695a
            r10 = r0[r10]
            r8 = r10
            goto L_0x0091
        L_0x0065:
            if (r9 != r6) goto L_0x0090
            int[] r6 = f18695a
            int r8 = r6.length
            if (r10 >= r8) goto L_0x0090
            r5 = r6[r10]
            int r1 = r1 % 5
            r6 = 8
            r8 = 1
            if (r1 == r8) goto L_0x008a
            r8 = 11
            if (r1 == r0) goto L_0x0085
            if (r1 == r3) goto L_0x008a
            if (r1 == r2) goto L_0x007e
            goto L_0x0090
        L_0x007e:
            if (r10 == r3) goto L_0x008e
            if (r10 == r6) goto L_0x008e
            if (r10 != r8) goto L_0x0090
            goto L_0x0089
        L_0x0085:
            if (r10 == r6) goto L_0x008e
            if (r10 != r8) goto L_0x0090
        L_0x0089:
            goto L_0x008e
        L_0x008a:
            if (r10 == r3) goto L_0x008e
            if (r10 != r6) goto L_0x0090
        L_0x008e:
            int r5 = r5 + 1
        L_0x0090:
            r8 = r5
        L_0x0091:
            v7$b r10 = new v7$b
            r5 = 2
            r0 = 0
            r3 = r10
            r6 = r9
            r9 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3467v7.m28678d(fm4):v7$b");
    }

    /* renamed from: e */
    public static int m28679e(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        byte b = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (b == 65535) {
            b = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return b + i2;
    }

    /* renamed from: f */
    public static int m28680f(fm4 fm4, int i) {
        int i2 = 0;
        while (true) {
            int h = i2 + fm4.mo20004h(i);
            if (!fm4.mo20003g()) {
                return h;
            }
            i2 = (h + 1) << i;
        }
    }
}
