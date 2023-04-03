package p000;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: yd0 */
/* compiled from: CharsToNameCanonicalizer */
public final class yd0 {

    /* renamed from: a */
    public final yd0 f20125a;

    /* renamed from: b */
    public final AtomicReference<C3669b> f20126b;

    /* renamed from: c */
    public final int f20127c;

    /* renamed from: d */
    public final int f20128d;

    /* renamed from: e */
    public boolean f20129e;

    /* renamed from: f */
    public String[] f20130f;

    /* renamed from: g */
    public C3668a[] f20131g;

    /* renamed from: h */
    public int f20132h;

    /* renamed from: i */
    public int f20133i;

    /* renamed from: j */
    public int f20134j;

    /* renamed from: k */
    public int f20135k;

    /* renamed from: l */
    public boolean f20136l;

    /* renamed from: m */
    public BitSet f20137m;

    /* renamed from: yd0$a */
    /* compiled from: CharsToNameCanonicalizer */
    public static final class C3668a {

        /* renamed from: a */
        public final String f20138a;

        /* renamed from: b */
        public final C3668a f20139b;

        /* renamed from: c */
        public final int f20140c;

        public C3668a(String str, C3668a aVar) {
            this.f20138a = str;
            this.f20139b = aVar;
            this.f20140c = aVar != null ? 1 + aVar.f20140c : 1;
        }

        /* renamed from: a */
        public String mo28030a(char[] cArr, int i, int i2) {
            if (this.f20138a.length() != i2) {
                return null;
            }
            int i3 = 0;
            while (this.f20138a.charAt(i3) == cArr[i + i3]) {
                i3++;
                if (i3 >= i2) {
                    return this.f20138a;
                }
            }
            return null;
        }
    }

    public yd0(int i) {
        this.f20125a = null;
        this.f20127c = i;
        this.f20129e = true;
        this.f20128d = -1;
        this.f20136l = false;
        this.f20135k = 0;
        this.f20126b = new AtomicReference<>(C3669b.m30531a(64));
    }

    /* renamed from: f */
    public static int m30512f(int i) {
        return i - (i >> 2);
    }

    /* renamed from: j */
    public static yd0 m30513j() {
        long currentTimeMillis = System.currentTimeMillis();
        return m30514k((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    /* renamed from: k */
    public static yd0 m30514k(int i) {
        return new yd0(i);
    }

    /* renamed from: a */
    public final String mo28015a(char[] cArr, int i, int i2, int i3, int i4) {
        if (this.f20136l) {
            mo28022i();
            this.f20136l = false;
        } else if (this.f20132h >= this.f20133i) {
            mo28028q();
            i4 = mo28018d(mo28021h(cArr, i, i2));
        }
        String str = new String(cArr, i, i2);
        if (JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(this.f20128d)) {
            str = InternCache.instance.intern(str);
        }
        this.f20132h++;
        String[] strArr = this.f20130f;
        if (strArr[i4] == null) {
            strArr[i4] = str;
        } else {
            int i5 = i4 >> 1;
            C3668a aVar = new C3668a(str, this.f20131g[i5]);
            int i6 = aVar.f20140c;
            if (i6 > 150) {
                mo28017c(i5, aVar, i4);
            } else {
                this.f20131g[i5] = aVar;
                this.f20135k = Math.max(i6, this.f20135k);
            }
        }
        return str;
    }

    /* renamed from: b */
    public final String mo28016b(char[] cArr, int i, int i2, C3668a aVar) {
        while (aVar != null) {
            String a = aVar.mo28030a(cArr, i, i2);
            if (a != null) {
                return a;
            }
            aVar = aVar.f20139b;
        }
        return null;
    }

    /* renamed from: c */
    public final void mo28017c(int i, C3668a aVar, int i2) {
        BitSet bitSet = this.f20137m;
        if (bitSet == null) {
            BitSet bitSet2 = new BitSet();
            this.f20137m = bitSet2;
            bitSet2.set(i);
        } else if (bitSet.get(i)) {
            if (JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(this.f20128d)) {
                mo28019e(150);
            }
            this.f20129e = false;
        } else {
            this.f20137m.set(i);
        }
        this.f20130f[i2] = aVar.f20138a;
        this.f20131g[i] = null;
        this.f20132h -= aVar.f20140c;
        this.f20135k = -1;
    }

    /* renamed from: d */
    public int mo28018d(int i) {
        int i2 = i + (i >>> 15);
        int i3 = i2 ^ (i2 << 7);
        return (i3 + (i3 >>> 3)) & this.f20134j;
    }

    /* renamed from: e */
    public void mo28019e(int i) {
        throw new IllegalStateException("Longest collision chain in symbol table (of size " + this.f20132h + ") now exceeds maximum, " + i + " -- suspect a DoS attack based on hash collisions");
    }

    /* renamed from: g */
    public int mo28020g(String str) {
        int length = str.length();
        int i = this.f20127c;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i * 33) + str.charAt(i2);
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* renamed from: h */
    public int mo28021h(char[] cArr, int i, int i2) {
        int i3 = this.f20127c;
        int i4 = i2 + i;
        while (i < i4) {
            i3 = (i3 * 33) + cArr[i];
            i++;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    /* renamed from: i */
    public final void mo28022i() {
        String[] strArr = this.f20130f;
        this.f20130f = (String[]) Arrays.copyOf(strArr, strArr.length);
        C3668a[] aVarArr = this.f20131g;
        this.f20131g = (C3668a[]) Arrays.copyOf(aVarArr, aVarArr.length);
    }

    /* renamed from: l */
    public String mo28023l(char[] cArr, int i, int i2, int i3) {
        if (i2 < 1) {
            return "";
        }
        if (!this.f20129e) {
            return new String(cArr, i, i2);
        }
        int d = mo28018d(i3);
        String str = this.f20130f[d];
        if (str != null) {
            if (str.length() == i2) {
                int i4 = 0;
                while (str.charAt(i4) == cArr[i + i4]) {
                    i4++;
                    if (i4 == i2) {
                        return str;
                    }
                }
            }
            C3668a aVar = this.f20131g[d >> 1];
            if (aVar != null) {
                String a = aVar.mo28030a(cArr, i, i2);
                if (a != null) {
                    return a;
                }
                String b = mo28016b(cArr, i, i2, aVar.f20139b);
                if (b != null) {
                    return b;
                }
            }
        }
        return mo28015a(cArr, i, i2, i3, d);
    }

    /* renamed from: m */
    public int mo28024m() {
        return this.f20127c;
    }

    /* renamed from: n */
    public yd0 mo28025n(int i) {
        return new yd0(this, i, this.f20127c, this.f20126b.get());
    }

    /* renamed from: o */
    public boolean mo28026o() {
        return !this.f20136l;
    }

    /* renamed from: p */
    public final void mo28027p(C3669b bVar) {
        int i = bVar.f20141a;
        C3669b bVar2 = this.f20126b.get();
        if (i != bVar2.f20141a) {
            if (i > 12000) {
                bVar = C3669b.m30531a(64);
            }
            ao0.m10672a(this.f20126b, bVar2, bVar);
        }
    }

    /* renamed from: q */
    public final void mo28028q() {
        int i = r1 + r1;
        if (i > 65536) {
            this.f20132h = 0;
            this.f20129e = false;
            this.f20130f = new String[64];
            this.f20131g = new C3668a[32];
            this.f20134j = 63;
            this.f20136l = false;
            return;
        }
        C3668a[] aVarArr = this.f20131g;
        this.f20130f = new String[i];
        this.f20131g = new C3668a[(i >> 1)];
        this.f20134j = i - 1;
        this.f20133i = m30512f(i);
        int i2 = 0;
        int i3 = 0;
        for (String str : this.f20130f) {
            if (str != null) {
                i2++;
                int d = mo28018d(mo28020g(str));
                String[] strArr = this.f20130f;
                if (strArr[d] == null) {
                    strArr[d] = str;
                } else {
                    int i4 = d >> 1;
                    C3668a aVar = new C3668a(str, this.f20131g[i4]);
                    this.f20131g[i4] = aVar;
                    i3 = Math.max(i3, aVar.f20140c);
                }
            }
        }
        int i5 = r1 >> 1;
        for (int i6 = 0; i6 < i5; i6++) {
            for (C3668a aVar2 = aVarArr[i6]; aVar2 != null; aVar2 = aVar2.f20139b) {
                i2++;
                String str2 = aVar2.f20138a;
                int d2 = mo28018d(mo28020g(str2));
                String[] strArr2 = this.f20130f;
                if (strArr2[d2] == null) {
                    strArr2[d2] = str2;
                } else {
                    int i7 = d2 >> 1;
                    C3668a aVar3 = new C3668a(str2, this.f20131g[i7]);
                    this.f20131g[i7] = aVar3;
                    i3 = Math.max(i3, aVar3.f20140c);
                }
            }
        }
        this.f20135k = i3;
        this.f20137m = null;
        if (i2 != this.f20132h) {
            throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", new Object[]{Integer.valueOf(this.f20132h), Integer.valueOf(i2)}));
        }
    }

    /* renamed from: r */
    public void mo28029r() {
        yd0 yd0;
        if (mo28026o() && (yd0 = this.f20125a) != null && this.f20129e) {
            yd0.mo28027p(new C3669b(this));
            this.f20136l = true;
        }
    }

    /* renamed from: yd0$b */
    /* compiled from: CharsToNameCanonicalizer */
    public static final class C3669b {

        /* renamed from: a */
        public final int f20141a;

        /* renamed from: b */
        public final int f20142b;

        /* renamed from: c */
        public final String[] f20143c;

        /* renamed from: d */
        public final C3668a[] f20144d;

        public C3669b(int i, int i2, String[] strArr, C3668a[] aVarArr) {
            this.f20141a = i;
            this.f20142b = i2;
            this.f20143c = strArr;
            this.f20144d = aVarArr;
        }

        /* renamed from: a */
        public static C3669b m30531a(int i) {
            return new C3669b(0, 0, new String[i], new C3668a[(i >> 1)]);
        }

        public C3669b(yd0 yd0) {
            this.f20141a = yd0.f20132h;
            this.f20142b = yd0.f20135k;
            this.f20143c = yd0.f20130f;
            this.f20144d = yd0.f20131g;
        }
    }

    public yd0(yd0 yd0, int i, int i2, C3669b bVar) {
        this.f20125a = yd0;
        this.f20127c = i2;
        this.f20126b = null;
        this.f20128d = i;
        this.f20129e = JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i);
        String[] strArr = bVar.f20143c;
        this.f20130f = strArr;
        this.f20131g = bVar.f20144d;
        this.f20132h = bVar.f20141a;
        this.f20135k = bVar.f20142b;
        int length = strArr.length;
        this.f20133i = m30512f(length);
        this.f20134j = length - 1;
        this.f20136l = true;
    }
}
