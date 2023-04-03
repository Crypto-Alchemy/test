package p000;

import java.io.IOException;

/* renamed from: o56 */
/* compiled from: Sniffer */
public final class o56 {

    /* renamed from: a */
    public static final int[] f15818a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: a */
    public static boolean m23679a(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : f15818a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m23680b(iy1 iy1) throws IOException {
        return m23681c(iy1, true, false);
    }

    /* renamed from: c */
    public static boolean m23681c(iy1 iy1, boolean z, boolean z2) throws IOException {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        iy1 iy12 = iy1;
        long length = iy1.getLength();
        long j = -1;
        int i = (length > -1 ? 1 : (length == -1 ? 0 : -1));
        long j2 = 4096;
        if (i != 0 && length <= 4096) {
            j2 = length;
        }
        int i2 = (int) j2;
        gm4 gm4 = new gm4(64);
        boolean z7 = false;
        int i3 = 0;
        boolean z8 = false;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            gm4.mo20670L(8);
            if (!iy12.mo84c(gm4.mo20679d(), z7 ? 1 : 0, 8, true)) {
                break;
            }
            long F = gm4.mo20664F();
            int n = gm4.mo20689n();
            int i4 = 16;
            if (F == 1) {
                iy12.mo94n(gm4.mo20679d(), 8, 8);
                gm4.mo20673O(16);
                F = gm4.mo20698w();
            } else {
                if (F == 0) {
                    long length2 = iy1.getLength();
                    if (length2 != j) {
                        F = (length2 - iy1.mo89h()) + ((long) 8);
                    }
                }
                i4 = 8;
            }
            long j3 = (long) i4;
            if (F < j3) {
                return z7;
            }
            i3 += i4;
            if (n == 1836019574) {
                i2 += (int) F;
                if (i != 0 && ((long) i2) > length) {
                    i2 = (int) length;
                }
            } else if (n == 1836019558 || n == 1836475768) {
                z4 = z7;
                z3 = true;
                z5 = true;
            } else {
                long j4 = length;
                int i5 = i3;
                if ((((long) i3) + F) - j3 >= ((long) i2)) {
                    z4 = false;
                    z3 = true;
                    break;
                }
                int i6 = (int) (F - j3);
                i3 = i5 + i6;
                if (n != 1718909296) {
                    boolean z9 = z2;
                    z6 = false;
                    if (i6 != 0) {
                        iy12.mo90i(i6);
                    }
                } else if (i6 < 8) {
                    return false;
                } else {
                    gm4.mo20670L(i6);
                    iy12.mo94n(gm4.mo20679d(), 0, i6);
                    int i7 = i6 / 4;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= i7) {
                            boolean z10 = z2;
                            break;
                        }
                        if (i8 == 1) {
                            gm4.mo20675Q(4);
                            boolean z11 = z2;
                        } else if (m23679a(gm4.mo20689n(), z2)) {
                            z8 = true;
                            break;
                        }
                        i8++;
                    }
                    if (!z8) {
                        return false;
                    }
                    z6 = false;
                }
                z7 = z6;
                length = j4;
            }
            j = -1;
        }
        z4 = z7;
        z3 = true;
        z5 = z4;
        if (!z8 || z != z5) {
            return z4;
        }
        return z3;
    }

    /* renamed from: d */
    public static boolean m23682d(iy1 iy1, boolean z) throws IOException {
        return m23681c(iy1, false, z);
    }
}
