package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u001a \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a(\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0002\u001a \u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001aU\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a]\u0010\u0018\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a]\u0010\u001a\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0019\u001a8\u0010!\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0013H\u0000\u001a\u001c\u0010\"\u001a\u00020\t*\u00020\u00132\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0000H\u0002\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, mo44877d2 = {"", "oldSize", "newSize", "Lgg1;", "cb", "Luw2;", "d", "diagonals", "callback", "Lr37;", "b", "e", "oldStart", "oldEnd", "newStart", "newEnd", "Lmc0;", "forward", "backward", "", "snake", "", "h", "(IIIILgg1;[I[I[I)Z", "g", "(IIIILgg1;[I[II[I)Z", "c", "startX", "startY", "endX", "endY", "reverse", "data", "f", "i", "j", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: f24 */
/* compiled from: MyersDiff.kt */
public final class f24 {
    /* renamed from: b */
    public static final void m16469b(int i, int i2, uw2 uw2, gg1 gg1) {
        while (uw2.mo26876b()) {
            int d = uw2.mo26878d();
            int d2 = uw2.mo26878d();
            int d3 = uw2.mo26878d();
            while (i > d3) {
                i--;
                gg1.remove(i);
            }
            while (i2 > d2) {
                i2--;
                gg1.mo20576c(i, i2);
            }
            while (true) {
                int i3 = d - 1;
                if (d > 0) {
                    i--;
                    i2--;
                    gg1.mo20575b(i, i2);
                    d = i3;
                }
            }
        }
        while (i > 0) {
            i--;
            gg1.remove(i);
        }
        while (i2 > 0) {
            i2--;
            gg1.mo20576c(i, i2);
        }
    }

    /* renamed from: c */
    public static final boolean m16470c(int i, int i2, int i3, int i4, gg1 gg1, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i;
        int i11 = i3;
        int[] iArr4 = iArr2;
        int i12 = i5;
        int i13 = (i2 - i10) - (i4 - i11);
        if (i13 % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        int i14 = -i12;
        for (int i15 = i14; i15 <= i12; i15 += 2) {
            if (i15 == i14 || (i15 != i12 && mc0.m22153b(iArr4, i15 + 1) < mc0.m22153b(iArr4, i15 - 1))) {
                i7 = mc0.m22153b(iArr4, i15 + 1);
                i6 = i7;
            } else {
                i7 = mc0.m22153b(iArr4, i15 - 1);
                i6 = i7 - 1;
            }
            int i16 = i4 - ((i2 - i6) - i15);
            if (i12 == 0 || i6 != i7) {
                i8 = i16;
            } else {
                i8 = i16 + 1;
            }
            while (true) {
                if (i6 > i10 && i16 > i11) {
                    if (!gg1.mo20574a(i6 - 1, i16 - 1)) {
                        break;
                    }
                    i6--;
                    i16--;
                } else {
                    gg1 gg12 = gg1;
                }
            }
            gg1 gg122 = gg1;
            mc0.m22155d(iArr4, i15, i6);
            if (!z || (i9 = i13 - i15) < i14 || i9 > i12) {
                int[] iArr5 = iArr;
            } else if (mc0.m22153b(iArr, i9) >= i6) {
                m16473f(i6, i16, i7, i8, true, iArr3);
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static final uw2 m16471d(int i, int i2, gg1 gg1) {
        int i3 = i;
        int i4 = i2;
        int i5 = ((i3 + i4) + 1) / 2;
        uw2 uw2 = new uw2(i5 * 3);
        uw2 uw22 = new uw2(i5 * 4);
        uw22.mo26880f(0, i3, 0, i4);
        int i6 = (i5 * 2) + 1;
        int[] a = mc0.m22152a(new int[i6]);
        int[] a2 = mc0.m22152a(new int[i6]);
        int[] b = z46.m30963b(new int[5]);
        while (uw22.mo26876b()) {
            int d = uw22.mo26878d();
            int d2 = uw22.mo26878d();
            int d3 = uw22.mo26878d();
            int d4 = uw22.mo26878d();
            int i7 = d4;
            int i8 = d3;
            int[] iArr = a;
            int[] iArr2 = a;
            int i9 = d2;
            int[] iArr3 = a2;
            int[] iArr4 = a2;
            int i10 = d;
            if (m16475h(d4, d3, d2, d, gg1, iArr, iArr3, b)) {
                if (z46.m30964c(b) > 0) {
                    z46.m30962a(b, uw2);
                }
                uw22.mo26880f(i7, z46.m30969h(b), i9, z46.m30970i(b));
                uw22.mo26880f(z46.m30965d(b), i8, z46.m30966e(b), i10);
            }
            int i11 = i;
            a = iArr2;
            a2 = iArr4;
        }
        uw2.mo26882h();
        uw2.mo26879e(i, i4, 0);
        return uw2;
    }

    /* renamed from: e */
    public static final void m16472e(int i, int i2, gg1 gg1) {
        vx2.m53591g(gg1, "callback");
        m16469b(i, i2, m16471d(i, i2, gg1), gg1);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, int[]] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m16473f(int r1, int r2, int r3, int r4, boolean r5, int[] r6) {
        /*
            java.lang.String r0 = "data"
            p000.vx2.m53591g(r6, r0)
            r0 = 0
            r6[r0] = r1
            r1 = 1
            r6[r1] = r2
            r1 = 2
            r6[r1] = r3
            r1 = 3
            r6[r1] = r4
            r1 = 4
            r6[r1] = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.f24.m16473f(int, int, int, int, boolean, int[]):void");
    }

    /* renamed from: g */
    public static final boolean m16474g(int i, int i2, int i3, int i4, gg1 gg1, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i2;
        int i11 = i4;
        int[] iArr4 = iArr;
        int i12 = i5;
        int i13 = (i10 - i) - (i11 - i3);
        if (Math.abs(i13) % 2 == 1) {
            z = true;
        } else {
            z = false;
        }
        int i14 = -i12;
        for (int i15 = i14; i15 <= i12; i15 += 2) {
            if (i15 == i14 || (i15 != i12 && mc0.m22153b(iArr4, i15 + 1) > mc0.m22153b(iArr4, i15 - 1))) {
                i7 = mc0.m22153b(iArr4, i15 + 1);
                i6 = i7;
            } else {
                i7 = mc0.m22153b(iArr4, i15 - 1);
                i6 = i7 + 1;
            }
            int i16 = (i3 + (i6 - i)) - i15;
            if (i12 == 0 || i6 != i7) {
                i8 = i16;
            } else {
                i8 = i16 - 1;
            }
            while (true) {
                if (i6 < i10 && i16 < i11) {
                    if (!gg1.mo20574a(i6, i16)) {
                        break;
                    }
                    i6++;
                    i16++;
                } else {
                    gg1 gg12 = gg1;
                }
            }
            gg1 gg122 = gg1;
            mc0.m22155d(iArr4, i15, i6);
            if (!z || (i9 = i13 - i15) < i14 + 1 || i9 > i12 - 1) {
                int[] iArr5 = iArr2;
            } else if (mc0.m22153b(iArr2, i9) <= i6) {
                m16473f(i7, i8, i6, i16, false, iArr3);
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static final boolean m16475h(int i, int i2, int i3, int i4, gg1 gg1, int[] iArr, int[] iArr2, int[] iArr3) {
        int i5 = i;
        int i6 = i2;
        int i7 = i6 - i5;
        int i8 = i4 - i3;
        if (i7 >= 1 && i8 >= 1) {
            int i9 = ((i7 + i8) + 1) / 2;
            mc0.m22155d(iArr, 1, i5);
            mc0.m22155d(iArr2, 1, i6);
            int i10 = 0;
            while (i10 < i9) {
                int i11 = i10;
                if (m16474g(i, i2, i3, i4, gg1, iArr, iArr2, i10, iArr3) || m16470c(i, i2, i3, i4, gg1, iArr, iArr2, i11, iArr3)) {
                    return true;
                }
                i10 = i11 + 1;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static final void m16476i(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }
}
