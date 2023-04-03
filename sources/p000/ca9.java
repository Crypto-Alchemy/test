package p000;

import com.google.android.gms.internal.measurement.C4087d;
import com.google.android.gms.internal.measurement.zzjd;
import com.google.android.gms.internal.measurement.zzkn;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: ca9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class ca9 {

    /* renamed from: f */
    public static final ca9 f21636f = new ca9(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f21637a;

    /* renamed from: b */
    public int[] f21638b;

    /* renamed from: c */
    public Object[] f21639c;

    /* renamed from: d */
    public int f21640d;

    /* renamed from: e */
    public boolean f21641e;

    public ca9() {
        this(0, new int[8], new Object[8], true);
    }

    public ca9(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f21640d = -1;
        this.f21637a = i;
        this.f21638b = iArr;
        this.f21639c = objArr;
        this.f21641e = z;
    }

    /* renamed from: a */
    public static ca9 m32878a() {
        return f21636f;
    }

    /* renamed from: b */
    public static ca9 m32879b() {
        return new ca9(0, new int[8], new Object[8], true);
    }

    /* renamed from: c */
    public static ca9 m32880c(ca9 ca9, ca9 ca92) {
        int i = ca9.f21637a + ca92.f21637a;
        int[] copyOf = Arrays.copyOf(ca9.f21638b, i);
        System.arraycopy(ca92.f21638b, 0, copyOf, ca9.f21637a, ca92.f21637a);
        Object[] copyOf2 = Arrays.copyOf(ca9.f21639c, i);
        System.arraycopy(ca92.f21639c, 0, copyOf2, ca9.f21637a, ca92.f21637a);
        return new ca9(i, copyOf, copyOf2, true);
    }

    /* renamed from: d */
    public final void mo29900d() {
        this.f21641e = false;
    }

    /* renamed from: e */
    public final int mo29901e() {
        int i = this.f21640d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f21637a; i3++) {
            int i4 = this.f21638b[i3];
            int A = C4087d.m34149A(8);
            int zzc = ((zzjd) this.f21639c[i3]).zzc();
            i2 += A + A + C4087d.m34149A(16) + C4087d.m34149A(i4 >>> 3) + C4087d.m34149A(24) + C4087d.m34149A(zzc) + zzc;
        }
        this.f21640d = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ca9)) {
            return false;
        }
        ca9 ca9 = (ca9) obj;
        int i = this.f21637a;
        if (i == ca9.f21637a) {
            int[] iArr = this.f21638b;
            int[] iArr2 = ca9.f21638b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f21639c;
                    Object[] objArr2 = ca9.f21639c;
                    int i3 = this.f21637a;
                    int i4 = 0;
                    while (i4 < i3) {
                        if (objArr[i4].equals(objArr2[i4])) {
                            i4++;
                        }
                    }
                    return true;
                } else if (iArr[i2] != iArr2[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final int mo29903f() {
        int i;
        int i2;
        int i3;
        int i4 = this.f21640d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f21637a; i6++) {
            int i7 = this.f21638b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f21639c[i6]).longValue();
                    i = C4087d.m34149A(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int A = C4087d.m34149A(i8 << 3);
                    int zzc = ((zzjd) this.f21639c[i6]).zzc();
                    i5 += A + C4087d.m34149A(zzc) + zzc;
                } else if (i9 == 3) {
                    int y = C4087d.m34158y(i8);
                    i3 = y + y;
                    i2 = ((ca9) this.f21639c[i6]).mo29903f();
                } else if (i9 == 5) {
                    ((Integer) this.f21639c[i6]).intValue();
                    i = C4087d.m34149A(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(zzkn.zzd());
                }
                i5 += i;
            } else {
                long longValue = ((Long) this.f21639c[i6]).longValue();
                i3 = C4087d.m34149A(i8 << 3);
                i2 = C4087d.m34150B(longValue);
            }
            i = i3 + i2;
            i5 += i;
        }
        this.f21640d = i5;
        return i5;
    }

    /* renamed from: g */
    public final void mo29904g(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f21637a; i2++) {
            v79.m53296b(sb, i, String.valueOf(this.f21638b[i2] >>> 3), this.f21639c[i2]);
        }
    }

    /* renamed from: h */
    public final void mo29905h(int i, Object obj) {
        int i2;
        if (this.f21641e) {
            int i3 = this.f21637a;
            int[] iArr = this.f21638b;
            if (i3 == iArr.length) {
                if (i3 < 4) {
                    i2 = 8;
                } else {
                    i2 = i3 >> 1;
                }
                int i4 = i3 + i2;
                this.f21638b = Arrays.copyOf(iArr, i4);
                this.f21639c = Arrays.copyOf(this.f21639c, i4);
            }
            int[] iArr2 = this.f21638b;
            int i5 = this.f21637a;
            iArr2[i5] = i;
            this.f21639c[i5] = obj;
            this.f21637a = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = this.f21637a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f21638b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f21639c;
        int i7 = this.f21637a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: i */
    public final void mo29907i(j29 j29) throws IOException {
        if (this.f21637a != 0) {
            for (int i = 0; i < this.f21637a; i++) {
                int i2 = this.f21638b[i];
                Object obj = this.f21639c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    j29.mo44033n(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    j29.mo44040u(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    j29.mo44044y(i3, (zzjd) obj);
                } else if (i4 == 3) {
                    j29.mo44014E(i3);
                    ((ca9) obj).mo29907i(j29);
                    j29.mo44015F(i3);
                } else if (i4 == 5) {
                    j29.mo44041v(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzkn.zzd());
                }
            }
        }
    }
}
