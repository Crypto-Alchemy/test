package p000;

/* renamed from: hs4 */
public class hs4 {

    /* renamed from: a */
    public oe2 f38262a;

    /* renamed from: b */
    public fs4 f38263b;

    /* renamed from: c */
    public fs4[] f38264c;

    /* renamed from: d */
    public fs4[] f38265d;

    public hs4(oe2 oe2, fs4 fs4) {
        this.f38262a = oe2;
        this.f38263b = fs4;
        mo52309b();
        mo52308a();
    }

    /* renamed from: d */
    public static void m58685d(fs4[] fs4Arr, int i, int i2) {
        fs4 fs4 = fs4Arr[i];
        fs4Arr[i] = fs4Arr[i2];
        fs4Arr[i2] = fs4;
    }

    /* renamed from: a */
    public final void mo52308a() {
        int f;
        int g = this.f38263b.mo51784g();
        fs4[] fs4Arr = new fs4[g];
        int i = g - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            fs4Arr[i2] = new fs4(this.f38264c[i2]);
        }
        this.f38265d = new fs4[g];
        while (i >= 0) {
            this.f38265d[i] = new fs4(this.f38262a, i);
            i--;
        }
        for (int i3 = 0; i3 < g; i3++) {
            if (fs4Arr[i3].mo51783f(i3) == 0) {
                int i4 = i3 + 1;
                boolean z = false;
                while (i4 < g) {
                    if (fs4Arr[i4].mo51783f(i3) != 0) {
                        m58685d(fs4Arr, i3, i4);
                        m58685d(this.f38265d, i3, i4);
                        i4 = g;
                        z = true;
                    }
                    i4++;
                }
                if (!z) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int f2 = this.f38262a.mo62891f(fs4Arr[i3].mo51783f(i3));
            fs4Arr[i3].mo51789m(f2);
            this.f38265d[i3].mo51789m(f2);
            for (int i5 = 0; i5 < g; i5++) {
                if (!(i5 == i3 || (f = fs4Arr[i5].mo51783f(i3)) == 0)) {
                    fs4 n = fs4Arr[i3].mo51790n(f);
                    fs4 n2 = this.f38265d[i3].mo51790n(f);
                    fs4Arr[i5].mo51779b(n);
                    this.f38265d[i5].mo51779b(n2);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo52309b() {
        int i;
        int g = this.f38263b.mo51784g();
        this.f38264c = new fs4[g];
        int i2 = 0;
        while (true) {
            i = g >> 1;
            if (i2 >= i) {
                break;
            }
            int i3 = i2 << 1;
            int[] iArr = new int[(i3 + 1)];
            iArr[i3] = 1;
            this.f38264c[i2] = new fs4(this.f38262a, iArr);
            i2++;
        }
        while (i < g) {
            int i4 = i << 1;
            int[] iArr2 = new int[(i4 + 1)];
            iArr2[i4] = 1;
            this.f38264c[i] = new fs4(this.f38262a, iArr2).mo51787k(this.f38263b);
            i++;
        }
    }

    /* renamed from: c */
    public fs4[] mo52310c() {
        return this.f38265d;
    }
}
