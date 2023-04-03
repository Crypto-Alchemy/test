package p000;

import java.util.Arrays;

/* renamed from: eu7 */
public final class eu7 {

    /* renamed from: a */
    public byte[] f28673a = new byte[4096];

    /* renamed from: b */
    public int f28674b;

    /* renamed from: c */
    public long f28675c;

    /* renamed from: d */
    public long f28676d;

    /* renamed from: e */
    public int f28677e;

    /* renamed from: f */
    public int f28678f;

    /* renamed from: g */
    public int f28679g;

    /* renamed from: h */
    public boolean f28680h;

    /* renamed from: i */
    public String f28681i;

    public eu7() {
        mo42427d();
    }

    /* renamed from: a */
    public final int mo42424a(byte[] bArr, int i, int i2) {
        int e = mo42428e(30, bArr, i, i2);
        if (e == -1) {
            return -1;
        }
        if (this.f28675c == -1) {
            long b = cu7.m43230b(this.f28673a, 0);
            this.f28675c = b;
            if (b == 67324752) {
                this.f28680h = false;
                this.f28676d = cu7.m43230b(this.f28673a, 18);
                this.f28679g = cu7.m43231c(this.f28673a, 8);
                this.f28677e = cu7.m43231c(this.f28673a, 26);
                int c = this.f28677e + 30 + cu7.m43231c(this.f28673a, 28);
                this.f28678f = c;
                int length = this.f28673a.length;
                if (length < c) {
                    do {
                        length += length;
                    } while (length < c);
                    this.f28673a = Arrays.copyOf(this.f28673a, length);
                }
            } else {
                this.f28680h = true;
            }
        }
        int e2 = mo42428e(this.f28678f, bArr, i + e, i2 - e);
        if (e2 == -1) {
            return -1;
        }
        int i3 = e + e2;
        if (!this.f28680h && this.f28681i == null) {
            this.f28681i = new String(this.f28673a, 30, this.f28677e);
        }
        return i3;
    }

    /* renamed from: b */
    public final vu7 mo42425b() {
        int i = this.f28674b;
        int i2 = this.f28678f;
        if (i < i2) {
            return vu7.m53552a(this.f28681i, this.f28676d, this.f28679g, true, Arrays.copyOf(this.f28673a, i), this.f28680h);
        }
        vu7 a = vu7.m53552a(this.f28681i, this.f28676d, this.f28679g, false, Arrays.copyOf(this.f28673a, i2), this.f28680h);
        mo42427d();
        return a;
    }

    /* renamed from: c */
    public final int mo42426c() {
        return this.f28678f;
    }

    /* renamed from: d */
    public final void mo42427d() {
        this.f28674b = 0;
        this.f28677e = -1;
        this.f28675c = -1;
        this.f28680h = false;
        this.f28678f = 30;
        this.f28676d = -1;
        this.f28679g = -1;
        this.f28681i = null;
    }

    /* renamed from: e */
    public final int mo42428e(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.f28674b;
        if (i4 >= i) {
            return 0;
        }
        int min = Math.min(i3, i - i4);
        System.arraycopy(bArr, i2, this.f28673a, this.f28674b, min);
        int i5 = this.f28674b + min;
        this.f28674b = i5;
        if (i5 < i) {
            return -1;
        }
        return min;
    }
}
