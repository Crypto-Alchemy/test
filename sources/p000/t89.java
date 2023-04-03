package p000;

import com.google.android.gms.internal.vision.C4114f0;
import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzii;
import com.google.android.gms.internal.vision.zzjk;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: t89 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class t89 {

    /* renamed from: f */
    public static final t89 f34140f = new t89(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f34141a;

    /* renamed from: b */
    public int[] f34142b;

    /* renamed from: c */
    public Object[] f34143c;

    /* renamed from: d */
    public int f34144d;

    /* renamed from: e */
    public boolean f34145e;

    public t89() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public static t89 m52128a() {
        return f34140f;
    }

    /* renamed from: b */
    public static t89 m52129b(t89 t89, t89 t892) {
        int i = t89.f34141a + t892.f34141a;
        int[] copyOf = Arrays.copyOf(t89.f34142b, i);
        System.arraycopy(t892.f34142b, 0, copyOf, t89.f34141a, t892.f34141a);
        Object[] copyOf2 = Arrays.copyOf(t89.f34143c, i);
        System.arraycopy(t892.f34143c, 0, copyOf2, t89.f34141a, t892.f34141a);
        return new t89(i, copyOf, copyOf2, true);
    }

    /* renamed from: d */
    public static void m52130d(int i, Object obj, sa9 sa9) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            sa9.mo45577k(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            sa9.mo45563K(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            sa9.mo45565M(i2, (zzht) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                sa9.mo45584r(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzjk.zzf());
        } else if (sa9.zza() == qa9.f33039a) {
            sa9.mo45570d(i2);
            ((t89) obj).mo48028h(sa9);
            sa9.mo45574h(i2);
        } else {
            sa9.mo45574h(i2);
            ((t89) obj).mo48028h(sa9);
            sa9.mo45570d(i2);
        }
    }

    /* renamed from: g */
    public static t89 m52131g() {
        return new t89();
    }

    /* renamed from: c */
    public final void mo48024c(int i, Object obj) {
        int i2;
        if (this.f34145e) {
            int i3 = this.f34141a;
            int[] iArr = this.f34142b;
            if (i3 == iArr.length) {
                if (i3 < 4) {
                    i2 = 8;
                } else {
                    i2 = i3 >> 1;
                }
                int i4 = i3 + i2;
                this.f34142b = Arrays.copyOf(iArr, i4);
                this.f34143c = Arrays.copyOf(this.f34143c, i4);
            }
            int[] iArr2 = this.f34142b;
            int i5 = this.f34141a;
            iArr2[i5] = i;
            this.f34143c[i5] = obj;
            this.f34141a = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final void mo48025e(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f34141a; i2++) {
            C4114f0.m34266c(sb, i, String.valueOf(this.f34142b[i2] >>> 3), this.f34143c[i2]);
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof t89)) {
            return false;
        }
        t89 t89 = (t89) obj;
        int i = this.f34141a;
        if (i == t89.f34141a) {
            int[] iArr = this.f34142b;
            int[] iArr2 = t89.f34142b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.f34143c;
                Object[] objArr2 = t89.f34143c;
                int i3 = this.f34141a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (!z2) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo48027f(sa9 sa9) throws IOException {
        if (sa9.zza() == qa9.f33040b) {
            for (int i = this.f34141a - 1; i >= 0; i--) {
                sa9.mo45572f(this.f34142b[i] >>> 3, this.f34143c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f34141a; i2++) {
            sa9.mo45572f(this.f34142b[i2] >>> 3, this.f34143c[i2]);
        }
    }

    /* renamed from: h */
    public final void mo48028h(sa9 sa9) throws IOException {
        if (this.f34141a != 0) {
            if (sa9.zza() == qa9.f33039a) {
                for (int i = 0; i < this.f34141a; i++) {
                    m52130d(this.f34142b[i], this.f34143c[i], sa9);
                }
                return;
            }
            for (int i2 = this.f34141a - 1; i2 >= 0; i2--) {
                m52130d(this.f34142b[i2], this.f34143c[i2], sa9);
            }
        }
    }

    public final int hashCode() {
        int i = this.f34141a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f34142b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f34143c;
        int i7 = this.f34141a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: i */
    public final void mo48030i() {
        this.f34145e = false;
    }

    /* renamed from: j */
    public final int mo48031j() {
        int i = this.f34144d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f34141a; i3++) {
            i2 += zzii.m34399c0(this.f34142b[i3] >>> 3, (zzht) this.f34143c[i3]);
        }
        this.f34144d = i2;
        return i2;
    }

    /* renamed from: k */
    public final int mo48032k() {
        int i;
        int i2 = this.f34144d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f34141a; i4++) {
            int i5 = this.f34142b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = zzii.m34405h0(i6, ((Long) this.f34143c[i4]).longValue());
            } else if (i7 == 1) {
                i = zzii.m34413q0(i6, ((Long) this.f34143c[i4]).longValue());
            } else if (i7 == 2) {
                i = zzii.m34393T(i6, (zzht) this.f34143c[i4]);
            } else if (i7 == 3) {
                i = (zzii.m34404g0(i6) << 1) + ((t89) this.f34143c[i4]).mo48032k();
            } else if (i7 == 5) {
                i = zzii.m34420x0(i6, ((Integer) this.f34143c[i4]).intValue());
            } else {
                throw new IllegalStateException(zzjk.zzf());
            }
            i3 += i;
        }
        this.f34144d = i3;
        return i3;
    }

    public t89(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f34144d = -1;
        this.f34141a = i;
        this.f34142b = iArr;
        this.f34143c = objArr;
        this.f34145e = z;
    }
}
