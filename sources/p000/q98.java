package p000;

import com.google.android.gms.internal.clearcut.C4064h;
import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzco;
import java.io.IOException;

/* renamed from: q98 */
public final class q98 {
    /* renamed from: a */
    public static int m50471a(int i, byte[] bArr, int i2, int i3, t98 t98) throws zzco {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return m50477g(bArr, i2, t98);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return m50475e(bArr, i2, t98) + t98.f34169a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = m50475e(bArr, i2, t98);
                    i6 = t98.f34169a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = m50471a(i6, bArr, i2, i3, t98);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw zzco.zzbo();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw zzco.zzbm();
            }
        } else {
            throw zzco.zzbm();
        }
    }

    /* renamed from: b */
    public static int m50472b(int i, byte[] bArr, int i2, int i3, hg8<?> hg8, t98 t98) {
        sf8 sf8 = (sf8) hg8;
        int e = m50475e(bArr, i2, t98);
        while (true) {
            sf8.mo47764k(t98.f34169a);
            if (e >= i3) {
                break;
            }
            int e2 = m50475e(bArr, e, t98);
            if (i != t98.f34169a) {
                break;
            }
            e = m50475e(bArr, e2, t98);
        }
        return e;
    }

    /* renamed from: c */
    public static int m50473c(int i, byte[] bArr, int i2, int i3, jo8 jo8, t98 t98) throws IOException {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int g = m50477g(bArr, i2, t98);
                jo8.mo44548e(i, Long.valueOf(t98.f34170b));
                return g;
            } else if (i4 == 1) {
                jo8.mo44548e(i, Long.valueOf(m50481k(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int e = m50475e(bArr, i2, t98);
                int i5 = t98.f34169a;
                jo8.mo44548e(i, i5 == 0 ? zzbb.zzfi : zzbb.zzb(bArr, e, i5));
                return e + i5;
            } else if (i4 == 3) {
                jo8 i6 = jo8.m46689i();
                int i7 = (i & -8) | 4;
                int i8 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int e2 = m50475e(bArr, i2, t98);
                    int i9 = t98.f34169a;
                    i8 = i9;
                    if (i9 == i7) {
                        i2 = e2;
                        break;
                    }
                    int c = m50473c(i8, bArr, e2, i3, i6, t98);
                    i8 = i9;
                    i2 = c;
                }
                if (i2 > i3 || i8 != i7) {
                    throw zzco.zzbo();
                }
                jo8.mo44548e(i, i6);
                return i2;
            } else if (i4 == 5) {
                jo8.mo44548e(i, Integer.valueOf(m50478h(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzco.zzbm();
            }
        } else {
            throw zzco.zzbm();
        }
    }

    /* renamed from: d */
    public static int m50474d(int i, byte[] bArr, int i2, t98 t98) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i4 = b << 7;
        } else {
            int i7 = i5 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i3 = b2 << 14;
            } else {
                i5 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << 21;
                } else {
                    i7 = i5 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i3 = b4 << 28;
                    } else {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                t98.f34169a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            t98.f34169a = i7 | i3;
            return i8;
        }
        t98.f34169a = i5 | i4;
        return i6;
    }

    /* renamed from: e */
    public static int m50475e(byte[] bArr, int i, t98 t98) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m50474d(b, bArr, i2, t98);
        }
        t98.f34169a = b;
        return i2;
    }

    /* renamed from: f */
    public static int m50476f(byte[] bArr, int i, hg8<?> hg8, t98 t98) throws IOException {
        sf8 sf8 = (sf8) hg8;
        int e = m50475e(bArr, i, t98);
        int i2 = t98.f34169a + e;
        while (e < i2) {
            e = m50475e(bArr, e, t98);
            sf8.mo47764k(t98.f34169a);
        }
        if (e == i2) {
            return e;
        }
        throw zzco.zzbl();
    }

    /* renamed from: g */
    public static int m50477g(byte[] bArr, int i, t98 t98) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            t98.f34170b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        t98.f34170b = j2;
        return i3;
    }

    /* renamed from: h */
    public static int m50478h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: i */
    public static int m50479i(byte[] bArr, int i, t98 t98) {
        int e = m50475e(bArr, i, t98);
        int i2 = t98.f34169a;
        if (i2 == 0) {
            t98.f34171c = "";
            return e;
        }
        t98.f34171c = new String(bArr, e, i2, vf8.f34940a);
        return e + i2;
    }

    /* renamed from: j */
    public static int m50480j(byte[] bArr, int i, t98 t98) throws IOException {
        int e = m50475e(bArr, i, t98);
        int i2 = t98.f34169a;
        if (i2 == 0) {
            t98.f34171c = "";
            return e;
        }
        int i3 = e + i2;
        if (C4064h.m33897i(bArr, e, i3)) {
            t98.f34171c = new String(bArr, e, i2, vf8.f34940a);
            return i3;
        }
        throw zzco.zzbp();
    }

    /* renamed from: k */
    public static long m50481k(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: l */
    public static double m50482l(byte[] bArr, int i) {
        return Double.longBitsToDouble(m50481k(bArr, i));
    }

    /* renamed from: m */
    public static int m50483m(byte[] bArr, int i, t98 t98) {
        int e = m50475e(bArr, i, t98);
        int i2 = t98.f34169a;
        if (i2 == 0) {
            t98.f34171c = zzbb.zzfi;
            return e;
        }
        t98.f34171c = zzbb.zzb(bArr, e, i2);
        return e + i2;
    }

    /* renamed from: n */
    public static float m50484n(byte[] bArr, int i) {
        return Float.intBitsToFloat(m50478h(bArr, i));
    }
}
