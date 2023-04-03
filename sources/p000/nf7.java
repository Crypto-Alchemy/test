package p000;

/* renamed from: nf7 */
/* compiled from: VorbisBitArray */
public final class nf7 {

    /* renamed from: a */
    public final byte[] f15538a;

    /* renamed from: b */
    public final int f15539b;

    /* renamed from: c */
    public int f15540c;

    /* renamed from: d */
    public int f15541d;

    public nf7(byte[] bArr) {
        this.f15538a = bArr;
        this.f15539b = bArr.length;
    }

    /* renamed from: a */
    public final void mo23676a() {
        boolean z;
        int i;
        int i2 = this.f15540c;
        if (i2 < 0 || (i2 >= (i = this.f15539b) && !(i2 == i && this.f15541d == 0))) {
            z = false;
        } else {
            z = true;
        }
        C2725kr.m20987g(z);
    }

    /* renamed from: b */
    public int mo23677b() {
        return (this.f15540c * 8) + this.f15541d;
    }

    /* renamed from: c */
    public boolean mo23678c() {
        boolean z;
        if ((((this.f15538a[this.f15540c] & 255) >> this.f15541d) & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        mo23680e(1);
        return z;
    }

    /* renamed from: d */
    public int mo23679d(int i) {
        int i2 = this.f15540c;
        int min = Math.min(i, 8 - this.f15541d);
        int i3 = i2 + 1;
        int i4 = ((this.f15538a[i2] & 255) >> this.f15541d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f15538a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & (-1 >>> (32 - i));
        mo23680e(i);
        return i5;
    }

    /* renamed from: e */
    public void mo23680e(int i) {
        int i2 = i / 8;
        int i3 = this.f15540c + i2;
        this.f15540c = i3;
        int i4 = this.f15541d + (i - (i2 * 8));
        this.f15541d = i4;
        if (i4 > 7) {
            this.f15540c = i3 + 1;
            this.f15541d = i4 - 8;
        }
        mo23676a();
    }
}
