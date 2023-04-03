package p000;

import kotlin.Metadata;
import p000.m40;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a0\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001a\u001e\u0010\u0012\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\bH\u0000\u001a\u0014\u0010\u0015\u001a\u00020\u0013*\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000\" \u0010\u001b\u001a\u00020\u00048\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, mo44877d2 = {"Lct5;", "segment", "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", "c", "Lm40;", "", "newline", "", "d", "Lwi4;", "options", "selectTruncated", "e", "Lm40$c;", "unsafeCursor", "a", "[B", "b", "()[B", "getHEX_DIGIT_BYTES$annotations", "()V", "HEX_DIGIT_BYTES", "okio"}, mo44878k = 2, mo44879mv = {1, 5, 1})
/* renamed from: up7 */
/* compiled from: -Buffer.kt */
public final class up7 {

    /* renamed from: a */
    public static final byte[] f45164a = wp7.m73729a("0123456789abcdef");

    /* renamed from: a */
    public static final m40.C7863c m72968a(m40 m40, m40.C7863c cVar) {
        boolean z;
        vx2.m53591g(m40, "<this>");
        vx2.m53591g(cVar, "unsafeCursor");
        m40.C7863c f = zp7.m75208f(cVar);
        if (f.f40756a == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f.f40756a = m40;
            f.f40757d = true;
            return f;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    /* renamed from: b */
    public static final byte[] m72969b() {
        return f45164a;
    }

    /* renamed from: c */
    public static final boolean m72970c(ct5 ct5, int i, byte[] bArr, int i2, int i3) {
        vx2.m53591g(ct5, "segment");
        vx2.m53591g(bArr, "bytes");
        int i4 = ct5.f37202c;
        byte[] bArr2 = ct5.f37200a;
        while (i2 < i3) {
            if (i == i4) {
                ct5 = ct5.f37205f;
                vx2.m53588d(ct5);
                byte[] bArr3 = ct5.f37200a;
                int i5 = ct5.f37201b;
                bArr2 = bArr3;
                i = i5;
                i4 = ct5.f37202c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* renamed from: d */
    public static final String m72971d(m40 m40, long j) {
        vx2.m53591g(m40, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (m40.mo56066j(j2) == ((byte) 13)) {
                String I = m40.mo56023I(j2);
                m40.skip(2);
                return I;
            }
        }
        String I2 = m40.mo56023I(j);
        m40.skip(1);
        return I2;
    }

    /* renamed from: e */
    public static final int m72972e(m40 m40, wi4 wi4, boolean z) {
        int i;
        int i2;
        boolean z2;
        int i3;
        ct5 ct5;
        int i4;
        m40 m402 = m40;
        vx2.m53591g(m402, "<this>");
        vx2.m53591g(wi4, "options");
        ct5 ct52 = m402.f40752a;
        if (ct52 != null) {
            byte[] bArr = ct52.f37200a;
            int i5 = ct52.f37201b;
            int i6 = ct52.f37202c;
            int[] q = wi4.mo66714q();
            ct5 ct53 = ct52;
            int i7 = -1;
            int i8 = 0;
            loop0:
            while (true) {
                int i9 = i8 + 1;
                int i10 = q[i8];
                int i11 = i9 + 1;
                int i12 = q[i9];
                if (i12 != -1) {
                    i7 = i12;
                }
                if (ct53 == null) {
                    break;
                }
                if (i10 < 0) {
                    int i13 = i11 + (i10 * -1);
                    while (true) {
                        int i14 = i5 + 1;
                        int i15 = i11 + 1;
                        if ((bArr[i5] & 255) != q[i11]) {
                            return i7;
                        }
                        if (i15 == i13) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i14 == i6) {
                            vx2.m53588d(ct53);
                            ct5 ct54 = ct53.f37205f;
                            vx2.m53588d(ct54);
                            i4 = ct54.f37201b;
                            byte[] bArr2 = ct54.f37200a;
                            i3 = ct54.f37202c;
                            if (ct54 != ct52) {
                                byte[] bArr3 = bArr2;
                                ct5 = ct54;
                                bArr = bArr3;
                            } else if (!z2) {
                                break loop0;
                            } else {
                                bArr = bArr2;
                                ct5 = null;
                            }
                        } else {
                            ct5 ct55 = ct53;
                            i3 = i6;
                            i4 = i14;
                            ct5 = ct55;
                        }
                        if (z2) {
                            i2 = q[i15];
                            i = i4;
                            i6 = i3;
                            ct53 = ct5;
                            break;
                        }
                        i5 = i4;
                        i6 = i3;
                        i11 = i15;
                        ct53 = ct5;
                    }
                } else {
                    i = i5 + 1;
                    byte b = bArr[i5] & 255;
                    int i16 = i11 + i10;
                    while (i11 != i16) {
                        if (b == q[i11]) {
                            i2 = q[i11 + i10];
                            if (i == i6) {
                                ct53 = ct53.f37205f;
                                vx2.m53588d(ct53);
                                i = ct53.f37201b;
                                bArr = ct53.f37200a;
                                i6 = ct53.f37202c;
                                if (ct53 == ct52) {
                                    ct53 = null;
                                }
                            }
                        } else {
                            i11++;
                        }
                    }
                    return i7;
                }
                if (i2 >= 0) {
                    return i2;
                }
                i8 = -i2;
                i5 = i;
            }
            if (z) {
                return -2;
            }
            return i7;
        } else if (z) {
            return -2;
        } else {
            return -1;
        }
    }

    /* renamed from: f */
    public static /* synthetic */ int m72973f(m40 m40, wi4 wi4, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m72972e(m40, wi4, z);
    }
}
