package p000;

import com.google.android.gms.internal.measurement.C4089f;
import com.google.android.gms.internal.measurement.zzjd;
import com.google.android.gms.internal.measurement.zzkn;
import java.io.IOException;

/* renamed from: e09 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class e09 {
    /* renamed from: a */
    public static int m43760a(byte[] bArr, int i, b09 b09) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m43761b(b, bArr, i2, b09);
        }
        b09.f21104a = b;
        return i2;
    }

    /* renamed from: b */
    public static int m43761b(int i, byte[] bArr, int i2, b09 b09) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            b09.f21104a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            b09.f21104a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            b09.f21104a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            b09.f21104a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                b09.f21104a = i11;
                return i12;
            }
        }
    }

    /* renamed from: c */
    public static int m43762c(byte[] bArr, int i, b09 b09) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j < 0) {
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
            b09.f21105b = j2;
            return i3;
        }
        b09.f21105b = j;
        return i2;
    }

    /* renamed from: d */
    public static int m43763d(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: e */
    public static long m43764e(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: f */
    public static int m43765f(byte[] bArr, int i, b09 b09) throws zzkn {
        int a = m43760a(bArr, i, b09);
        int i2 = b09.f21104a;
        if (i2 < 0) {
            throw zzkn.zzb();
        } else if (i2 == 0) {
            b09.f21106c = "";
            return a;
        } else {
            b09.f21106c = new String(bArr, a, i2, p59.f32581a);
            return a + i2;
        }
    }

    /* renamed from: g */
    public static int m43766g(byte[] bArr, int i, b09 b09) throws zzkn {
        int a = m43760a(bArr, i, b09);
        int i2 = b09.f21104a;
        if (i2 < 0) {
            throw zzkn.zzb();
        } else if (i2 == 0) {
            b09.f21106c = "";
            return a;
        } else {
            b09.f21106c = C4089f.m34186e(bArr, a, i2);
            return a + i2;
        }
    }

    /* renamed from: h */
    public static int m43767h(byte[] bArr, int i, b09 b09) throws zzkn {
        int a = m43760a(bArr, i, b09);
        int i2 = b09.f21104a;
        if (i2 < 0) {
            throw zzkn.zzb();
        } else if (i2 > bArr.length - a) {
            throw zzkn.zza();
        } else if (i2 == 0) {
            b09.f21106c = zzjd.zzb;
            return a;
        } else {
            b09.f21106c = zzjd.zzj(bArr, a, i2);
            return a + i2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m43768i(p000.n89 r6, byte[] r7, int r8, int r9, p000.b09 r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m43761b(r8, r7, r0, r10)
            int r8 = r10.f21104a
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
            r0.mo46041h(r1, r2, r3, r4, r5)
            r6.mo46039f(r9)
            r10.f21106c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.measurement.zzkn r6 = com.google.android.gms.internal.measurement.zzkn.zza()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e09.m43768i(n89, byte[], int, int, b09):int");
    }

    /* renamed from: j */
    public static int m43769j(n89 n89, byte[] bArr, int i, int i2, int i3, b09 b09) throws IOException {
        x79 x79 = (x79) n89;
        Object zza = x79.zza();
        int D = x79.mo49403D(zza, bArr, i, i2, i3, b09);
        x79.mo46039f(zza);
        b09.f21106c = zza;
        return D;
    }

    /* renamed from: k */
    public static int m43770k(int i, byte[] bArr, int i2, int i3, m59<?> m59, b09 b09) {
        u49 u49 = (u49) m59;
        int a = m43760a(bArr, i2, b09);
        u49.mo48313n(b09.f21104a);
        while (a < i3) {
            int a2 = m43760a(bArr, a, b09);
            if (i != b09.f21104a) {
                break;
            }
            a = m43760a(bArr, a2, b09);
            u49.mo48313n(b09.f21104a);
        }
        return a;
    }

    /* renamed from: l */
    public static int m43771l(byte[] bArr, int i, m59<?> m59, b09 b09) throws IOException {
        u49 u49 = (u49) m59;
        int a = m43760a(bArr, i, b09);
        int i2 = b09.f21104a + a;
        while (a < i2) {
            a = m43760a(bArr, a, b09);
            u49.mo48313n(b09.f21104a);
        }
        if (a == i2) {
            return a;
        }
        throw zzkn.zza();
    }

    /* renamed from: m */
    public static int m43772m(n89<?> n89, int i, byte[] bArr, int i2, int i3, m59<?> m59, b09 b09) throws IOException {
        int i4 = m43768i(n89, bArr, i2, i3, b09);
        m59.add(b09.f21106c);
        while (i4 < i3) {
            int a = m43760a(bArr, i4, b09);
            if (i != b09.f21104a) {
                break;
            }
            i4 = m43768i(n89, bArr, a, i3, b09);
            m59.add(b09.f21106c);
        }
        return i4;
    }

    /* renamed from: n */
    public static int m43773n(int i, byte[] bArr, int i2, int i3, ca9 ca9, b09 b09) throws zzkn {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int c = m43762c(bArr, i2, b09);
                ca9.mo29905h(i, Long.valueOf(b09.f21105b));
                return c;
            } else if (i4 == 1) {
                ca9.mo29905h(i, Long.valueOf(m43764e(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int a = m43760a(bArr, i2, b09);
                int i5 = b09.f21104a;
                if (i5 < 0) {
                    throw zzkn.zzb();
                } else if (i5 <= bArr.length - a) {
                    if (i5 == 0) {
                        ca9.mo29905h(i, zzjd.zzb);
                    } else {
                        ca9.mo29905h(i, zzjd.zzj(bArr, a, i5));
                    }
                    return a + i5;
                } else {
                    throw zzkn.zza();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                ca9 b = ca9.m32879b();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int a2 = m43760a(bArr, i2, b09);
                    int i8 = b09.f21104a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = a2;
                        break;
                    }
                    i7 = i8;
                    i2 = m43773n(i8, bArr, a2, i3, b, b09);
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzkn.zze();
                }
                ca9.mo29905h(i, b);
                return i2;
            } else if (i4 == 5) {
                ca9.mo29905h(i, Integer.valueOf(m43763d(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzkn.zzc();
            }
        } else {
            throw zzkn.zzc();
        }
    }
}
