package p000;

import com.google.android.gms.internal.vision.zzjk;

/* renamed from: x99 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class x99 {
    /* renamed from: f */
    public static void m54322f(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzjk {
        if (m54331o(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m54331o(b3) || m54331o(b4)) {
            throw zzjk.zzh();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    /* renamed from: g */
    public static void m54323g(byte b, byte b2, byte b3, char[] cArr, int i) throws zzjk {
        if (m54331o(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m54331o(b3)))) {
            throw zzjk.zzh();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* renamed from: h */
    public static void m54324h(byte b, byte b2, char[] cArr, int i) throws zzjk {
        if (b < -62 || m54331o(b2)) {
            throw zzjk.zzh();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: i */
    public static void m54325i(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* renamed from: l */
    public static boolean m54328l(byte b) {
        return b >= 0;
    }

    /* renamed from: m */
    public static boolean m54329m(byte b) {
        return b < -32;
    }

    /* renamed from: n */
    public static boolean m54330n(byte b) {
        return b < -16;
    }

    /* renamed from: o */
    public static boolean m54331o(byte b) {
        return b > -65;
    }
}
