package p000;

import androidx.media3.common.C0792h;
import androidx.media3.common.DrmInitData;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: zk1 */
/* compiled from: DtsUtil */
public final class zk1 {

    /* renamed from: a */
    public static final int[] f20590a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b */
    public static final int[] f20591b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c */
    public static final int[] f20592c = {64, 112, 128, 192, 224, 256, 384, 448, RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN, 640, 768, 896, RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m31348a(byte[] r7) {
        /*
            r0 = 0
            byte r1 = r7[r0]
            r2 = -2
            r3 = 6
            r4 = 7
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L_0x004a
            r2 = -1
            if (r1 == r2) goto L_0x0032
            r2 = 31
            if (r1 == r2) goto L_0x0021
            r1 = 5
            byte r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            byte r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            byte r7 = r7[r4]
            goto L_0x0058
        L_0x0021:
            byte r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            byte r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            byte r7 = r7[r1]
            goto L_0x0042
        L_0x0032:
            byte r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            byte r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            byte r7 = r7[r1]
        L_0x0042:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L_0x005d
        L_0x004a:
            byte r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            byte r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            byte r7 = r7[r3]
        L_0x0058:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
        L_0x005d:
            if (r0 == 0) goto L_0x0063
            int r7 = r7 * 16
            int r7 = r7 / 14
        L_0x0063:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zk1.m31348a(byte[]):int");
    }

    /* renamed from: b */
    public static fm4 m31349b(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new fm4(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (m31350c(copyOf)) {
            for (int i = 0; i < copyOf.length - 1; i += 2) {
                byte b = copyOf[i];
                int i2 = i + 1;
                copyOf[i] = copyOf[i2];
                copyOf[i2] = b;
            }
        }
        fm4 fm4 = new fm4(copyOf);
        if (copyOf[0] == 31) {
            fm4 fm42 = new fm4(copyOf);
            while (fm42.mo19998b() >= 16) {
                fm42.mo20014r(2);
                fm4.mo20002f(fm42.mo20004h(14), 14);
            }
        }
        fm4.mo20010n(copyOf);
        return fm4;
    }

    /* renamed from: c */
    public static boolean m31350c(byte[] bArr) {
        byte b = bArr[0];
        if (b == -2 || b == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m31351d(int i) {
        return i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368;
    }

    /* renamed from: e */
    public static int m31352e(ByteBuffer byteBuffer) {
        byte b;
        int i;
        byte b2;
        int i2;
        byte b3;
        int position = byteBuffer.position();
        byte b4 = byteBuffer.get(position);
        if (b4 != -2) {
            if (b4 == -1) {
                i = (byteBuffer.get(position + 4) & 7) << 4;
                b3 = byteBuffer.get(position + 7);
            } else if (b4 != 31) {
                i2 = (byteBuffer.get(position + 4) & 1) << 6;
                b2 = byteBuffer.get(position + 5);
            } else {
                i = (byteBuffer.get(position + 5) & 7) << 4;
                b3 = byteBuffer.get(position + 6);
            }
            b = b3 & 60;
            return (((b >> 2) | i) + 1) * 32;
        }
        i2 = (byteBuffer.get(position + 5) & 1) << 6;
        b2 = byteBuffer.get(position + 4);
        b = b2 & 252;
        return (((b >> 2) | i) + 1) * 32;
    }

    /* renamed from: f */
    public static int m31353f(byte[] bArr) {
        byte b;
        int i;
        byte b2;
        int i2;
        byte b3;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i = (bArr[4] & 7) << 4;
                b3 = bArr[7];
            } else if (b4 != 31) {
                i2 = (bArr[4] & 1) << 6;
                b2 = bArr[5];
            } else {
                i = (bArr[5] & 7) << 4;
                b3 = bArr[6];
            }
            b = b3 & 60;
            return (((b >> 2) | i) + 1) * 32;
        }
        i2 = (bArr[5] & 1) << 6;
        b2 = bArr[4];
        b = b2 & 252;
        return (((b >> 2) | i) + 1) * 32;
    }

    /* renamed from: g */
    public static C0792h m31354g(byte[] bArr, String str, String str2, DrmInitData drmInitData) {
        int i;
        int i2;
        fm4 b = m31349b(bArr);
        b.mo20014r(60);
        int i3 = f20590a[b.mo20004h(6)];
        int i4 = f20591b[b.mo20004h(4)];
        int h = b.mo20004h(5);
        int[] iArr = f20592c;
        if (h >= iArr.length) {
            i = -1;
        } else {
            i = (iArr[h] * 1000) / 2;
        }
        b.mo20014r(10);
        if (b.mo20004h(2) > 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        return new C0792h.C0794b().mo6658S(str).mo6670e0("audio/vnd.dts").mo6646G(i).mo6647H(i3 + i2).mo6671f0(i4).mo6652M(drmInitData).mo6661V(str2).mo6644E();
    }
}
