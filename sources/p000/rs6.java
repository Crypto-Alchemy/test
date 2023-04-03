package p000;

import p000.zs6;

/* renamed from: rs6 */
/* compiled from: TrackEncryptionBox */
public final class rs6 {

    /* renamed from: a */
    public final boolean f17361a;

    /* renamed from: b */
    public final String f17362b;

    /* renamed from: c */
    public final zs6.C3758a f17363c;

    /* renamed from: d */
    public final int f17364d;

    /* renamed from: e */
    public final byte[] f17365e;

    public rs6(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        boolean z2;
        boolean z3 = true;
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C2725kr.m20981a((bArr2 != null ? false : z3) ^ z2);
        this.f17361a = z;
        this.f17362b = str;
        this.f17364d = i;
        this.f17365e = bArr2;
        this.f17363c = new zs6.C3758a(m26413a(str), bArr, i2, i3);
    }

    /* renamed from: a */
    public static int m26413a(String str) {
        if (str == null) {
            return 1;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 2;
            case 2:
            case 3:
                break;
            default:
                gk3.m18132i("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                break;
        }
        return 1;
    }
}
