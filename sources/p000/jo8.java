package p000;

import com.google.android.gms.internal.clearcut.C4056e;
import com.google.android.gms.internal.clearcut.C4062f;
import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzbn;
import com.google.android.gms.internal.clearcut.zzco;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: jo8 */
public final class jo8 {

    /* renamed from: f */
    public static final jo8 f30551f = new jo8(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f30552a;

    /* renamed from: b */
    public int[] f30553b;

    /* renamed from: c */
    public Object[] f30554c;

    /* renamed from: d */
    public int f30555d;

    /* renamed from: e */
    public boolean f30556e;

    public jo8() {
        this(0, new int[8], new Object[8], true);
    }

    public jo8(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f30555d = -1;
        this.f30552a = i;
        this.f30553b = iArr;
        this.f30554c = objArr;
        this.f30556e = z;
    }

    /* renamed from: a */
    public static jo8 m46686a(jo8 jo8, jo8 jo82) {
        int i = jo8.f30552a + jo82.f30552a;
        int[] copyOf = Arrays.copyOf(jo8.f30553b, i);
        System.arraycopy(jo82.f30553b, 0, copyOf, jo8.f30552a, jo82.f30552a);
        Object[] copyOf2 = Arrays.copyOf(jo8.f30554c, i);
        System.arraycopy(jo82.f30554c, 0, copyOf2, jo8.f30552a, jo82.f30552a);
        return new jo8(i, copyOf, copyOf2, true);
    }

    /* renamed from: f */
    public static void m46687f(int i, Object obj, dr8 dr8) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            dr8.mo42008N(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            dr8.mo42016e(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            dr8.mo42001G(i2, (zzbb) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                dr8.mo42023n(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzco.zzbn());
        } else if (dr8.mo42002H() == C4056e.C4061e.f22465l) {
            dr8.mo42011Q(i2);
            ((jo8) obj).mo44550g(dr8);
            dr8.mo42000F(i2);
        } else {
            dr8.mo42000F(i2);
            ((jo8) obj).mo44550g(dr8);
            dr8.mo42011Q(i2);
        }
    }

    /* renamed from: h */
    public static jo8 m46688h() {
        return f30551f;
    }

    /* renamed from: i */
    public static jo8 m46689i() {
        return new jo8();
    }

    /* renamed from: b */
    public final void mo44545b(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f30552a; i2++) {
            C4062f.m33885b(sb, i, String.valueOf(this.f30553b[i2] >>> 3), this.f30554c[i2]);
        }
    }

    /* renamed from: c */
    public final void mo44546c(dr8 dr8) throws IOException {
        if (dr8.mo42002H() == C4056e.C4061e.f22466m) {
            for (int i = this.f30552a - 1; i >= 0; i--) {
                dr8.mo42017f(this.f30553b[i] >>> 3, this.f30554c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f30552a; i2++) {
            dr8.mo42017f(this.f30553b[i2] >>> 3, this.f30554c[i2]);
        }
    }

    /* renamed from: d */
    public final int mo44547d() {
        int i;
        int i2 = this.f30555d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f30552a; i4++) {
            int i5 = this.f30553b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = zzbn.m33973d0(i6, ((Long) this.f30554c[i4]).longValue());
            } else if (i7 == 1) {
                i = zzbn.m33980k0(i6, ((Long) this.f30554c[i4]).longValue());
            } else if (i7 == 2) {
                i = zzbn.m33961N(i6, (zzbb) this.f30554c[i4]);
            } else if (i7 == 3) {
                i = (zzbn.m33948B0(i6) << 1) + ((jo8) this.f30554c[i4]).mo44547d();
            } else if (i7 == 5) {
                i = zzbn.m33988t0(i6, ((Integer) this.f30554c[i4]).intValue());
            } else {
                throw new IllegalStateException(zzco.zzbn());
            }
            i3 += i;
        }
        this.f30555d = i3;
        return i3;
    }

    /* renamed from: e */
    public final void mo44548e(int i, Object obj) {
        if (this.f30556e) {
            int i2 = this.f30552a;
            int[] iArr = this.f30553b;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.f30553b = Arrays.copyOf(iArr, i3);
                this.f30554c = Arrays.copyOf(this.f30554c, i3);
            }
            int[] iArr2 = this.f30553b;
            int i4 = this.f30552a;
            iArr2[i4] = i;
            this.f30554c[i4] = obj;
            this.f30552a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof jo8)) {
            return false;
        }
        jo8 jo8 = (jo8) obj;
        int i = this.f30552a;
        if (i == jo8.f30552a) {
            int[] iArr = this.f30553b;
            int[] iArr2 = jo8.f30553b;
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
                Object[] objArr = this.f30554c;
                Object[] objArr2 = jo8.f30554c;
                int i3 = this.f30552a;
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
                return z2;
            }
        }
    }

    /* renamed from: g */
    public final void mo44550g(dr8 dr8) throws IOException {
        if (this.f30552a != 0) {
            if (dr8.mo42002H() == C4056e.C4061e.f22465l) {
                for (int i = 0; i < this.f30552a; i++) {
                    m46687f(this.f30553b[i], this.f30554c[i], dr8);
                }
                return;
            }
            for (int i2 = this.f30552a - 1; i2 >= 0; i2--) {
                m46687f(this.f30553b[i2], this.f30554c[i2], dr8);
            }
        }
    }

    public final int hashCode() {
        int i = this.f30552a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f30553b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f30554c;
        int i7 = this.f30552a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: j */
    public final int mo44552j() {
        int i = this.f30555d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f30552a; i3++) {
            i2 += zzbn.m33968X(this.f30553b[i3] >>> 3, (zzbb) this.f30554c[i3]);
        }
        this.f30555d = i2;
        return i2;
    }

    /* renamed from: k */
    public final void mo44553k() {
        this.f30556e = false;
    }
}
