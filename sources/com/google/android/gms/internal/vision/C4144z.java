package com.google.android.gms.internal.vision;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.vision.z */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class C4144z {
    /* renamed from: a */
    public static int m34323a(int i, byte[] bArr, int i2, int i3, uw8 uw8) throws zzjk {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return m34333k(bArr, i2, uw8);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return m34331i(bArr, i2, uw8) + uw8.f34743a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = m34331i(bArr, i2, uw8);
                    i6 = uw8.f34743a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = m34323a(i6, bArr, i2, i3, uw8);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw zzjk.zzg();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw zzjk.zzd();
            }
        } else {
            throw zzjk.zzd();
        }
    }

    /* renamed from: b */
    public static int m34324b(int i, byte[] bArr, int i2, int i3, h29<?> h29, uw8 uw8) {
        p19 p19 = (p19) h29;
        int i4 = m34331i(bArr, i2, uw8);
        p19.mo46614k(uw8.f34743a);
        while (i4 < i3) {
            int i5 = m34331i(bArr, i4, uw8);
            if (i != uw8.f34743a) {
                break;
            }
            i4 = m34331i(bArr, i5, uw8);
            p19.mo46614k(uw8.f34743a);
        }
        return i4;
    }

    /* renamed from: c */
    public static int m34325c(int i, byte[] bArr, int i2, int i3, t89 t89, uw8 uw8) throws zzjk {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int k = m34333k(bArr, i2, uw8);
                t89.mo48024c(i, Long.valueOf(uw8.f34744b));
                return k;
            } else if (i4 == 1) {
                t89.mo48024c(i, Long.valueOf(m34334l(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int i5 = m34331i(bArr, i2, uw8);
                int i6 = uw8.f34743a;
                if (i6 < 0) {
                    throw zzjk.zzb();
                } else if (i6 <= bArr.length - i5) {
                    if (i6 == 0) {
                        t89.mo48024c(i, zzht.zza);
                    } else {
                        t89.mo48024c(i, zzht.zza(bArr, i5, i6));
                    }
                    return i5 + i6;
                } else {
                    throw zzjk.zza();
                }
            } else if (i4 == 3) {
                t89 g = t89.m52131g();
                int i7 = (i & -8) | 4;
                int i8 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int i9 = m34331i(bArr, i2, uw8);
                    int i10 = uw8.f34743a;
                    i8 = i10;
                    if (i10 == i7) {
                        i2 = i9;
                        break;
                    }
                    int c = m34325c(i8, bArr, i9, i3, g, uw8);
                    i8 = i10;
                    i2 = c;
                }
                if (i2 > i3 || i8 != i7) {
                    throw zzjk.zzg();
                }
                t89.mo48024c(i, g);
                return i2;
            } else if (i4 == 5) {
                t89.mo48024c(i, Integer.valueOf(m34330h(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzjk.zzd();
            }
        } else {
            throw zzjk.zzd();
        }
    }

    /* renamed from: d */
    public static int m34326d(int i, byte[] bArr, int i2, uw8 uw8) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            uw8.f34743a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            uw8.f34743a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            uw8.f34743a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            uw8.f34743a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                uw8.f34743a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* renamed from: e */
    public static int m34327e(g79<?> g79, int i, byte[] bArr, int i2, int i3, h29<?> h29, uw8 uw8) throws IOException {
        int g = m34329g(g79, bArr, i2, i3, uw8);
        h29.add(uw8.f34745c);
        while (g < i3) {
            int i4 = m34331i(bArr, g, uw8);
            if (i != uw8.f34743a) {
                break;
            }
            g = m34329g(g79, bArr, i4, i3, uw8);
            h29.add(uw8.f34745c);
        }
        return g;
    }

    /* renamed from: f */
    public static int m34328f(g79 g79, byte[] bArr, int i, int i2, int i3, uw8 uw8) throws IOException {
        v59 v59 = (v59) g79;
        Object zza = v59.zza();
        int m = v59.mo48678m(zza, bArr, i, i2, i3, uw8);
        v59.mo31205a(zza);
        uw8.f34745c = zza;
        return m;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m34329g(p000.g79 r6, byte[] r7, int r8, int r9, p000.uw8 r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m34326d(r8, r7, r0, r10)
            int r8 = r10.f34743a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.zza()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo31208d(r1, r2, r3, r4, r5)
            r6.mo31205a(r9)
            r10.f34745c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.vision.zzjk r6 = com.google.android.gms.internal.vision.zzjk.zza()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C4144z.m34329g(g79, byte[], int, int, uw8):int");
    }

    /* renamed from: h */
    public static int m34330h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: i */
    public static int m34331i(byte[] bArr, int i, uw8 uw8) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m34326d(b, bArr, i2, uw8);
        }
        uw8.f34743a = b;
        return i2;
    }

    /* renamed from: j */
    public static int m34332j(byte[] bArr, int i, h29<?> h29, uw8 uw8) throws IOException {
        p19 p19 = (p19) h29;
        int i2 = m34331i(bArr, i, uw8);
        int i3 = uw8.f34743a + i2;
        while (i2 < i3) {
            i2 = m34331i(bArr, i2, uw8);
            p19.mo46614k(uw8.f34743a);
        }
        if (i2 == i3) {
            return i2;
        }
        throw zzjk.zza();
    }

    /* renamed from: k */
    public static int m34333k(byte[] bArr, int i, uw8 uw8) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            uw8.f34744b = j;
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
        uw8.f34744b = j2;
        return i3;
    }

    /* renamed from: l */
    public static long m34334l(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: m */
    public static double m34335m(byte[] bArr, int i) {
        return Double.longBitsToDouble(m34334l(bArr, i));
    }

    /* renamed from: n */
    public static int m34336n(byte[] bArr, int i, uw8 uw8) throws zzjk {
        int i2 = m34331i(bArr, i, uw8);
        int i3 = uw8.f34743a;
        if (i3 < 0) {
            throw zzjk.zzb();
        } else if (i3 == 0) {
            uw8.f34745c = "";
            return i2;
        } else {
            uw8.f34745c = new String(bArr, i2, i3, t19.f34083a);
            return i2 + i3;
        }
    }

    /* renamed from: o */
    public static float m34337o(byte[] bArr, int i) {
        return Float.intBitsToFloat(m34330h(bArr, i));
    }

    /* renamed from: p */
    public static int m34338p(byte[] bArr, int i, uw8 uw8) throws zzjk {
        int i2 = m34331i(bArr, i, uw8);
        int i3 = uw8.f34743a;
        if (i3 < 0) {
            throw zzjk.zzb();
        } else if (i3 == 0) {
            uw8.f34745c = "";
            return i2;
        } else {
            uw8.f34745c = C4123i0.m34294k(bArr, i2, i3);
            return i2 + i3;
        }
    }

    /* renamed from: q */
    public static int m34339q(byte[] bArr, int i, uw8 uw8) throws zzjk {
        int i2 = m34331i(bArr, i, uw8);
        int i3 = uw8.f34743a;
        if (i3 < 0) {
            throw zzjk.zzb();
        } else if (i3 > bArr.length - i2) {
            throw zzjk.zza();
        } else if (i3 == 0) {
            uw8.f34745c = zzht.zza;
            return i2;
        } else {
            uw8.f34745c = zzht.zza(bArr, i2, i3);
            return i2 + i3;
        }
    }
}
