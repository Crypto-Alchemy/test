package p000;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: y60 */
/* compiled from: ByteQuadsCanonicalizer */
public final class y60 {

    /* renamed from: a */
    public final y60 f20034a;

    /* renamed from: b */
    public final AtomicReference<C3654a> f20035b;

    /* renamed from: c */
    public final int f20036c;

    /* renamed from: d */
    public final boolean f20037d;

    /* renamed from: e */
    public final boolean f20038e;

    /* renamed from: f */
    public int[] f20039f;

    /* renamed from: g */
    public int f20040g;

    /* renamed from: h */
    public int f20041h;

    /* renamed from: i */
    public int f20042i;

    /* renamed from: j */
    public int f20043j;

    /* renamed from: k */
    public int f20044k;

    /* renamed from: l */
    public String[] f20045l;

    /* renamed from: m */
    public int f20046m;

    /* renamed from: n */
    public int f20047n;

    /* renamed from: o */
    public boolean f20048o;

    public y60(int i, int i2) {
        this.f20034a = null;
        this.f20044k = 0;
        this.f20048o = true;
        this.f20036c = i2;
        this.f20037d = false;
        this.f20038e = true;
        int i3 = 16;
        if (i >= 16) {
            if (((i - 1) & i) != 0) {
                while (i3 < i) {
                    i3 += i3;
                }
            }
            this.f20035b = new AtomicReference<>(C3654a.m30423a(i));
        }
        i = i3;
        this.f20035b = new AtomicReference<>(C3654a.m30423a(i));
    }

    /* renamed from: c */
    public static int m30386c(int i) {
        int i2 = i >> 2;
        if (i2 < 64) {
            return 4;
        }
        if (i2 <= 256) {
            return 5;
        }
        return i2 <= 1024 ? 6 : 7;
    }

    /* renamed from: u */
    public static y60 m30387u() {
        long currentTimeMillis = System.currentTimeMillis();
        return m30388v((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    /* renamed from: v */
    public static y60 m30388v(int i) {
        return new y60(64, i);
    }

    /* renamed from: A */
    public y60 mo27933A(int i) {
        return new y60(this, this.f20036c, this.f20035b.get(), JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(i), JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(i));
    }

    /* renamed from: B */
    public boolean mo27934B() {
        return !this.f20048o;
    }

    /* renamed from: C */
    public final void mo27935C(C3654a aVar) {
        int i = aVar.f20050b;
        C3654a aVar2 = this.f20035b.get();
        if (i != aVar2.f20050b) {
            if (i > 6000) {
                aVar = C3654a.m30423a(64);
            }
            ao0.m10672a(this.f20035b, aVar2, aVar);
        }
    }

    /* renamed from: D */
    public final void mo27936D(boolean z) {
        this.f20044k = 0;
        this.f20046m = mo27954l();
        this.f20047n = this.f20040g << 3;
        if (z) {
            Arrays.fill(this.f20039f, 0);
            Arrays.fill(this.f20045l, (Object) null);
        }
    }

    /* renamed from: E */
    public int mo27937E() {
        int i = this.f20041h;
        int i2 = 0;
        for (int i3 = 3; i3 < i; i3 += 4) {
            if (this.f20039f[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: F */
    public final void mo27938F() {
        this.f20048o = false;
        int[] iArr = this.f20039f;
        String[] strArr = this.f20045l;
        int i = this.f20040g;
        int i2 = this.f20044k;
        int i3 = i + i;
        int i4 = this.f20046m;
        if (i3 > 65536) {
            mo27936D(true);
            return;
        }
        this.f20039f = new int[(iArr.length + (i << 3))];
        this.f20040g = i3;
        int i5 = i3 << 2;
        this.f20041h = i5;
        this.f20042i = i5 + (i5 >> 1);
        this.f20043j = m30386c(i3);
        this.f20045l = new String[(strArr.length << 1)];
        mo27936D(false);
        int[] iArr2 = new int[16];
        int i6 = 0;
        for (int i7 = 0; i7 < i4; i7 += 4) {
            int i8 = iArr[i7 + 3];
            if (i8 != 0) {
                i6++;
                String str = strArr[i7 >> 2];
                if (i8 == 1) {
                    iArr2[0] = iArr[i7];
                    mo27958p(str, iArr2, 1);
                } else if (i8 == 2) {
                    iArr2[0] = iArr[i7];
                    iArr2[1] = iArr[i7 + 1];
                    mo27958p(str, iArr2, 2);
                } else if (i8 != 3) {
                    if (i8 > iArr2.length) {
                        iArr2 = new int[i8];
                    }
                    System.arraycopy(iArr, iArr[i7 + 1], iArr2, 0, i8);
                    mo27958p(str, iArr2, i8);
                } else {
                    iArr2[0] = iArr[i7];
                    iArr2[1] = iArr[i7 + 1];
                    iArr2[2] = iArr[i7 + 2];
                    mo27958p(str, iArr2, 3);
                }
            }
        }
        if (i6 != i2) {
            throw new IllegalStateException("Failed rehash(): old count=" + i2 + ", copyCount=" + i6);
        }
    }

    /* renamed from: G */
    public void mo27939G() {
        if (this.f20034a != null && mo27934B()) {
            this.f20034a.mo27935C(new C3654a(this));
            this.f20048o = true;
        }
    }

    /* renamed from: H */
    public int mo27940H() {
        int i = this.f20042i;
        int i2 = 0;
        for (int i3 = this.f20041h + 3; i3 < i; i3 += 4) {
            if (this.f20039f[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: I */
    public int mo27941I() {
        return (this.f20046m - mo27954l()) >> 2;
    }

    /* renamed from: J */
    public int mo27942J() {
        int i = this.f20042i + 3;
        int i2 = this.f20040g + i;
        int i3 = 0;
        while (i < i2) {
            if (this.f20039f[i] != 0) {
                i3++;
            }
            i += 4;
        }
        return i3;
    }

    /* renamed from: K */
    public int mo27943K() {
        int i = this.f20040g << 3;
        int i2 = 0;
        for (int i3 = 3; i3 < i; i3 += 4) {
            if (this.f20039f[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public final int mo27944a(int[] iArr, int i) {
        int i2 = this.f20047n;
        int i3 = i2 + i;
        int[] iArr2 = this.f20039f;
        if (i3 > iArr2.length) {
            this.f20039f = Arrays.copyOf(this.f20039f, this.f20039f.length + Math.max(i3 - iArr2.length, Math.min(4096, this.f20040g)));
        }
        System.arraycopy(iArr, 0, this.f20039f, i2, i);
        this.f20047n += i;
        return i2;
    }

    /* renamed from: b */
    public final int mo27945b(int i) {
        return (i & (this.f20040g - 1)) << 2;
    }

    /* renamed from: d */
    public final boolean mo27946d() {
        if (this.f20044k <= (this.f20040g >> 1)) {
            return false;
        }
        int l = (this.f20046m - mo27954l()) >> 2;
        int i = this.f20044k;
        if (l > ((i + 1) >> 7) || ((double) i) > ((double) this.f20040g) * 0.8d) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final int mo27947e(int i) {
        int b = mo27945b(i);
        int[] iArr = this.f20039f;
        if (iArr[b + 3] == 0) {
            return b;
        }
        if (mo27946d()) {
            return mo27953k(i);
        }
        int i2 = this.f20041h + ((b >> 3) << 2);
        if (iArr[i2 + 3] == 0) {
            return i2;
        }
        int i3 = this.f20042i;
        int i4 = this.f20043j;
        int i5 = i3 + ((b >> (i4 + 2)) << i4);
        int i6 = (1 << i4) + i5;
        while (i5 < i6) {
            if (iArr[i5 + 3] == 0) {
                return i5;
            }
            i5 += 4;
        }
        int i7 = this.f20046m;
        int i8 = i7 + 4;
        this.f20046m = i8;
        if (i8 < (this.f20040g << 3)) {
            return i7;
        }
        if (this.f20038e) {
            mo27952j();
        }
        return mo27953k(i);
    }

    /* renamed from: f */
    public final String mo27948f(int i, int i2) {
        int i3 = this.f20042i;
        int i4 = this.f20043j;
        int i5 = i3 + ((i >> (i4 + 2)) << i4);
        int[] iArr = this.f20039f;
        int i6 = (1 << i4) + i5;
        while (i5 < i6) {
            int i7 = iArr[i5 + 3];
            if (i2 == iArr[i5] && 1 == i7) {
                return this.f20045l[i5 >> 2];
            }
            if (i7 == 0) {
                return null;
            }
            i5 += 4;
        }
        for (int l = mo27954l(); l < this.f20046m; l += 4) {
            if (i2 == iArr[l] && 1 == iArr[l + 3]) {
                return this.f20045l[l >> 2];
            }
        }
        return null;
    }

    /* renamed from: g */
    public final String mo27949g(int i, int i2, int i3) {
        int i4 = this.f20042i;
        int i5 = this.f20043j;
        int i6 = i4 + ((i >> (i5 + 2)) << i5);
        int[] iArr = this.f20039f;
        int i7 = (1 << i5) + i6;
        while (i6 < i7) {
            int i8 = iArr[i6 + 3];
            if (i2 == iArr[i6] && i3 == iArr[i6 + 1] && 2 == i8) {
                return this.f20045l[i6 >> 2];
            }
            if (i8 == 0) {
                return null;
            }
            i6 += 4;
        }
        for (int l = mo27954l(); l < this.f20046m; l += 4) {
            if (i2 == iArr[l] && i3 == iArr[l + 1] && 2 == iArr[l + 3]) {
                return this.f20045l[l >> 2];
            }
        }
        return null;
    }

    /* renamed from: h */
    public final String mo27950h(int i, int i2, int i3, int i4) {
        int i5 = this.f20042i;
        int i6 = this.f20043j;
        int i7 = i5 + ((i >> (i6 + 2)) << i6);
        int[] iArr = this.f20039f;
        int i8 = (1 << i6) + i7;
        while (i7 < i8) {
            int i9 = iArr[i7 + 3];
            if (i2 == iArr[i7] && i3 == iArr[i7 + 1] && i4 == iArr[i7 + 2] && 3 == i9) {
                return this.f20045l[i7 >> 2];
            }
            if (i9 == 0) {
                return null;
            }
            i7 += 4;
        }
        for (int l = mo27954l(); l < this.f20046m; l += 4) {
            if (i2 == iArr[l] && i3 == iArr[l + 1] && i4 == iArr[l + 2] && 3 == iArr[l + 3]) {
                return this.f20045l[l >> 2];
            }
        }
        return null;
    }

    /* renamed from: i */
    public final String mo27951i(int i, int i2, int[] iArr, int i3) {
        int i4 = this.f20042i;
        int i5 = this.f20043j;
        int i6 = i4 + ((i >> (i5 + 2)) << i5);
        int[] iArr2 = this.f20039f;
        int i7 = (1 << i5) + i6;
        while (i6 < i7) {
            int i8 = iArr2[i6 + 3];
            if (i2 == iArr2[i6] && i3 == i8 && mo27955m(iArr, i3, iArr2[i6 + 1])) {
                return this.f20045l[i6 >> 2];
            }
            if (i8 == 0) {
                return null;
            }
            i6 += 4;
        }
        for (int l = mo27954l(); l < this.f20046m; l += 4) {
            if (i2 == iArr2[l] && i3 == iArr2[l + 3] && mo27955m(iArr, i3, iArr2[l + 1])) {
                return this.f20045l[l >> 2];
            }
        }
        return null;
    }

    /* renamed from: j */
    public void mo27952j() {
        if (this.f20040g > 1024) {
            throw new IllegalStateException("Spill-over slots in symbol table with " + this.f20044k + " entries, hash area of " + this.f20040g + " slots is now full (all " + (this.f20040g >> 3) + " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`");
        }
    }

    /* renamed from: k */
    public final int mo27953k(int i) {
        mo27938F();
        int b = mo27945b(i);
        int[] iArr = this.f20039f;
        if (iArr[b + 3] == 0) {
            return b;
        }
        int i2 = this.f20041h + ((b >> 3) << 2);
        if (iArr[i2 + 3] == 0) {
            return i2;
        }
        int i3 = this.f20042i;
        int i4 = this.f20043j;
        int i5 = i3 + ((b >> (i4 + 2)) << i4);
        int i6 = (1 << i4) + i5;
        while (i5 < i6) {
            if (iArr[i5 + 3] == 0) {
                return i5;
            }
            i5 += 4;
        }
        int i7 = this.f20046m;
        this.f20046m = i7 + 4;
        return i7;
    }

    /* renamed from: l */
    public final int mo27954l() {
        int i = this.f20040g;
        return (i << 3) - i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r6[r7] == r0[r8]) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        r7 = r3 + 1;
        r4 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r6[r3] == r0[r8]) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        r3 = r7 + 1;
        r4 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        if (r6[r7] == r0[r8]) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0043, code lost:
        r7 = r3 + 1;
        r4 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        if (r6[r3] == r0[r8]) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        r8 = r7 + 1;
        r3 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r6[r7] == r0[r4]) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0058, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
        r7 = r8 + 1;
        r4 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0061, code lost:
        if (r6[r8] == r0[r3]) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0063, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0068, code lost:
        if (r6[r7] == r0[r4]) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        r3 = r7 + 1;
        r4 = r8 + 1;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo27955m(int[] r6, int r7, int r8) {
        /*
            r5 = this;
            int[] r0 = r5.f20039f
            r1 = 0
            r2 = 1
            switch(r7) {
                case 4: goto L_0x0042;
                case 5: goto L_0x0034;
                case 6: goto L_0x0026;
                case 7: goto L_0x0018;
                case 8: goto L_0x000c;
                default: goto L_0x0007;
            }
        L_0x0007:
            boolean r6 = r5.mo27956n(r6, r7, r8)
            return r6
        L_0x000c:
            r7 = r6[r1]
            int r3 = r8 + 1
            r8 = r0[r8]
            if (r7 == r8) goto L_0x0015
            return r1
        L_0x0015:
            r7 = r2
            r8 = r3
            goto L_0x0019
        L_0x0018:
            r7 = r1
        L_0x0019:
            int r3 = r7 + 1
            r7 = r6[r7]
            int r4 = r8 + 1
            r8 = r0[r8]
            if (r7 == r8) goto L_0x0024
            return r1
        L_0x0024:
            r8 = r4
            goto L_0x0027
        L_0x0026:
            r3 = r1
        L_0x0027:
            int r7 = r3 + 1
            r3 = r6[r3]
            int r4 = r8 + 1
            r8 = r0[r8]
            if (r3 == r8) goto L_0x0032
            return r1
        L_0x0032:
            r8 = r4
            goto L_0x0035
        L_0x0034:
            r7 = r1
        L_0x0035:
            int r3 = r7 + 1
            r7 = r6[r7]
            int r4 = r8 + 1
            r8 = r0[r8]
            if (r7 == r8) goto L_0x0040
            return r1
        L_0x0040:
            r8 = r4
            goto L_0x0043
        L_0x0042:
            r3 = r1
        L_0x0043:
            int r7 = r3 + 1
            r3 = r6[r3]
            int r4 = r8 + 1
            r8 = r0[r8]
            if (r3 == r8) goto L_0x004e
            return r1
        L_0x004e:
            int r8 = r7 + 1
            r7 = r6[r7]
            int r3 = r4 + 1
            r4 = r0[r4]
            if (r7 == r4) goto L_0x0059
            return r1
        L_0x0059:
            int r7 = r8 + 1
            r8 = r6[r8]
            int r4 = r3 + 1
            r3 = r0[r3]
            if (r8 == r3) goto L_0x0064
            return r1
        L_0x0064:
            r6 = r6[r7]
            r7 = r0[r4]
            if (r6 == r7) goto L_0x006b
            return r1
        L_0x006b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.y60.mo27955m(int[], int, int):boolean");
    }

    /* renamed from: n */
    public final boolean mo27956n(int[] iArr, int i, int i2) {
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2 + 1;
            if (iArr[i3] != this.f20039f[i2]) {
                return false;
            }
            if (i4 >= i) {
                return true;
            }
            i3 = i4;
            i2 = i5;
        }
    }

    /* renamed from: o */
    public final void mo27957o() {
        if (!this.f20048o) {
            return;
        }
        if (this.f20034a != null) {
            int[] iArr = this.f20039f;
            this.f20039f = Arrays.copyOf(iArr, iArr.length);
            String[] strArr = this.f20045l;
            this.f20045l = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.f20048o = false;
        } else if (this.f20044k == 0) {
            throw new IllegalStateException("Cannot add names to Root symbol table");
        } else {
            throw new IllegalStateException("Cannot add names to Placeholder symbol table");
        }
    }

    /* renamed from: p */
    public String mo27958p(String str, int[] iArr, int i) {
        int i2;
        mo27957o();
        if (this.f20037d) {
            str = InternCache.instance.intern(str);
        }
        if (i == 1) {
            i2 = mo27947e(mo27959q(iArr[0]));
            int[] iArr2 = this.f20039f;
            iArr2[i2] = iArr[0];
            iArr2[i2 + 3] = 1;
        } else if (i == 2) {
            i2 = mo27947e(mo27960r(iArr[0], iArr[1]));
            int[] iArr3 = this.f20039f;
            iArr3[i2] = iArr[0];
            iArr3[i2 + 1] = iArr[1];
            iArr3[i2 + 3] = 2;
        } else if (i != 3) {
            int t = mo27962t(iArr, i);
            i2 = mo27947e(t);
            this.f20039f[i2] = t;
            int a = mo27944a(iArr, i);
            int[] iArr4 = this.f20039f;
            iArr4[i2 + 1] = a;
            iArr4[i2 + 3] = i;
        } else {
            int e = mo27947e(mo27961s(iArr[0], iArr[1], iArr[2]));
            int[] iArr5 = this.f20039f;
            iArr5[e] = iArr[0];
            iArr5[e + 1] = iArr[1];
            iArr5[e + 2] = iArr[2];
            iArr5[e + 3] = 3;
            i2 = e;
        }
        this.f20045l[i2 >> 2] = str;
        this.f20044k++;
        return str;
    }

    /* renamed from: q */
    public int mo27959q(int i) {
        int i2 = i ^ this.f20036c;
        int i3 = i2 + (i2 >>> 16);
        int i4 = i3 ^ (i3 << 3);
        return i4 + (i4 >>> 12);
    }

    /* renamed from: r */
    public int mo27960r(int i, int i2) {
        int i3 = i + (i >>> 15);
        int i4 = ((i3 ^ (i3 >>> 9)) + (i2 * 33)) ^ this.f20036c;
        int i5 = i4 + (i4 >>> 16);
        int i6 = i5 ^ (i5 >>> 4);
        return i6 + (i6 << 3);
    }

    /* renamed from: s */
    public int mo27961s(int i, int i2, int i3) {
        int i4 = i ^ this.f20036c;
        int i5 = (((i4 + (i4 >>> 9)) * 31) + i2) * 33;
        int i6 = (i5 + (i5 >>> 15)) ^ i3;
        int i7 = i6 + (i6 >>> 4);
        int i8 = i7 + (i7 >>> 15);
        return i8 ^ (i8 << 9);
    }

    /* renamed from: t */
    public int mo27962t(int[] iArr, int i) {
        if (i >= 4) {
            int i2 = iArr[0] ^ this.f20036c;
            int i3 = i2 + (i2 >>> 9) + iArr[1];
            int i4 = ((i3 + (i3 >>> 15)) * 33) ^ iArr[2];
            int i5 = i4 + (i4 >>> 4);
            for (int i6 = 3; i6 < i; i6++) {
                int i7 = iArr[i6];
                i5 += i7 ^ (i7 >> 21);
            }
            int i8 = i5 * 65599;
            int i9 = i8 + (i8 >>> 19);
            return (i9 << 5) ^ i9;
        }
        throw new IllegalArgumentException();
    }

    public String toString() {
        int E = mo27937E();
        int H = mo27940H();
        int J = mo27942J();
        int I = mo27941I();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", new Object[]{y60.class.getName(), Integer.valueOf(this.f20044k), Integer.valueOf(this.f20040g), Integer.valueOf(E), Integer.valueOf(H), Integer.valueOf(J), Integer.valueOf(I), Integer.valueOf(E + H + J + I), Integer.valueOf(mo27943K())});
    }

    /* renamed from: w */
    public String mo27964w(int i) {
        int b = mo27945b(mo27959q(i));
        int[] iArr = this.f20039f;
        int i2 = iArr[b + 3];
        if (i2 == 1) {
            if (iArr[b] == i) {
                return this.f20045l[b >> 2];
            }
        } else if (i2 == 0) {
            return null;
        }
        int i3 = this.f20041h + ((b >> 3) << 2);
        int i4 = iArr[i3 + 3];
        if (i4 == 1) {
            if (iArr[i3] == i) {
                return this.f20045l[i3 >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        return mo27948f(b, i);
    }

    /* renamed from: x */
    public String mo27965x(int i, int i2) {
        int b = mo27945b(mo27960r(i, i2));
        int[] iArr = this.f20039f;
        int i3 = iArr[b + 3];
        if (i3 == 2) {
            if (i == iArr[b] && i2 == iArr[b + 1]) {
                return this.f20045l[b >> 2];
            }
        } else if (i3 == 0) {
            return null;
        }
        int i4 = this.f20041h + ((b >> 3) << 2);
        int i5 = iArr[i4 + 3];
        if (i5 == 2) {
            if (i == iArr[i4] && i2 == iArr[i4 + 1]) {
                return this.f20045l[i4 >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        return mo27949g(b, i, i2);
    }

    /* renamed from: y */
    public String mo27966y(int i, int i2, int i3) {
        int b = mo27945b(mo27961s(i, i2, i3));
        int[] iArr = this.f20039f;
        int i4 = iArr[b + 3];
        if (i4 == 3) {
            if (i == iArr[b] && iArr[b + 1] == i2 && iArr[b + 2] == i3) {
                return this.f20045l[b >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        int i5 = this.f20041h + ((b >> 3) << 2);
        int i6 = iArr[i5 + 3];
        if (i6 == 3) {
            if (i == iArr[i5] && iArr[i5 + 1] == i2 && iArr[i5 + 2] == i3) {
                return this.f20045l[i5 >> 2];
            }
        } else if (i6 == 0) {
            return null;
        }
        return mo27950h(b, i, i2, i3);
    }

    /* renamed from: z */
    public String mo27967z(int[] iArr, int i) {
        if (i >= 4) {
            int t = mo27962t(iArr, i);
            int b = mo27945b(t);
            int[] iArr2 = this.f20039f;
            int i2 = iArr2[b + 3];
            if (t == iArr2[b] && i2 == i && mo27955m(iArr, i, iArr2[b + 1])) {
                return this.f20045l[b >> 2];
            }
            if (i2 == 0) {
                return null;
            }
            int i3 = this.f20041h + ((b >> 3) << 2);
            int i4 = iArr2[i3 + 3];
            if (t == iArr2[i3] && i4 == i && mo27955m(iArr, i, iArr2[i3 + 1])) {
                return this.f20045l[i3 >> 2];
            }
            return mo27951i(b, t, iArr, i);
        } else if (i == 1) {
            return mo27964w(iArr[0]);
        } else {
            if (i == 2) {
                return mo27965x(iArr[0], iArr[1]);
            }
            if (i != 3) {
                return "";
            }
            return mo27966y(iArr[0], iArr[1], iArr[2]);
        }
    }

    /* renamed from: y60$a */
    /* compiled from: ByteQuadsCanonicalizer */
    public static final class C3654a {

        /* renamed from: a */
        public final int f20049a;

        /* renamed from: b */
        public final int f20050b;

        /* renamed from: c */
        public final int f20051c;

        /* renamed from: d */
        public final int[] f20052d;

        /* renamed from: e */
        public final String[] f20053e;

        /* renamed from: f */
        public final int f20054f;

        /* renamed from: g */
        public final int f20055g;

        public C3654a(int i, int i2, int i3, int[] iArr, String[] strArr, int i4, int i5) {
            this.f20049a = i;
            this.f20050b = i2;
            this.f20051c = i3;
            this.f20052d = iArr;
            this.f20053e = strArr;
            this.f20054f = i4;
            this.f20055g = i5;
        }

        /* renamed from: a */
        public static C3654a m30423a(int i) {
            int i2 = i << 3;
            return new C3654a(i, 0, y60.m30386c(i), new int[i2], new String[(i << 1)], i2 - i, i2);
        }

        public C3654a(y60 y60) {
            this.f20049a = y60.f20040g;
            this.f20050b = y60.f20044k;
            this.f20051c = y60.f20043j;
            this.f20052d = y60.f20039f;
            this.f20053e = y60.f20045l;
            this.f20054f = y60.f20046m;
            this.f20055g = y60.f20047n;
        }
    }

    public y60(y60 y60, int i, C3654a aVar, boolean z, boolean z2) {
        this.f20034a = y60;
        this.f20036c = i;
        this.f20037d = z;
        this.f20038e = z2;
        this.f20035b = null;
        this.f20044k = aVar.f20050b;
        int i2 = aVar.f20049a;
        this.f20040g = i2;
        int i3 = i2 << 2;
        this.f20041h = i3;
        this.f20042i = i3 + (i3 >> 1);
        this.f20043j = aVar.f20051c;
        this.f20039f = aVar.f20052d;
        this.f20045l = aVar.f20053e;
        this.f20046m = aVar.f20054f;
        this.f20047n = aVar.f20055g;
        this.f20048o = true;
    }
}
