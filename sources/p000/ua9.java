package p000;

import com.google.android.gms.internal.measurement.zzkn;

/* renamed from: ua9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class ua9 {
    /* renamed from: a */
    public static /* synthetic */ boolean m52735a(byte b) {
        return b >= 0;
    }

    /* renamed from: b */
    public static /* synthetic */ void m52736b(byte b, byte b2, char[] cArr, int i) throws zzkn {
        if (b < -62 || m52739e(b2)) {
            throw zzkn.zzf();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: c */
    public static /* synthetic */ void m52737c(byte b, byte b2, byte b3, char[] cArr, int i) throws zzkn {
        if (!m52739e(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!m52739e(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw zzkn.zzf();
    }

    /* renamed from: d */
    public static /* synthetic */ void m52738d(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzkn {
        if (m52739e(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m52739e(b3) || m52739e(b4)) {
            throw zzkn.zzf();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    /* renamed from: e */
    public static boolean m52739e(byte b) {
        return b > -65;
    }
}
