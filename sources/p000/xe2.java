package p000;

/* renamed from: xe2 */
public abstract class xe2 implements tx1, us3 {

    /* renamed from: a */
    public final byte[] f45880a;

    /* renamed from: b */
    public int f45881b;

    /* renamed from: c */
    public long f45882c;

    public xe2() {
        this.f45880a = new byte[4];
        this.f45881b = 0;
    }

    public xe2(xe2 xe2) {
        this.f45880a = new byte[4];
        mo66859h(xe2);
    }

    /* renamed from: b */
    public void mo51713b(byte b) {
        byte[] bArr = this.f45880a;
        int i = this.f45881b;
        int i2 = i + 1;
        this.f45881b = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            mo50205l(bArr, 0);
            this.f45881b = 0;
        }
        this.f45882c++;
    }

    /* renamed from: g */
    public int mo51714g() {
        return 64;
    }

    /* renamed from: h */
    public void mo66859h(xe2 xe2) {
        byte[] bArr = xe2.f45880a;
        System.arraycopy(bArr, 0, this.f45880a, 0, bArr.length);
        this.f45881b = xe2.f45881b;
        this.f45882c = xe2.f45882c;
    }

    /* renamed from: i */
    public void mo66860i() {
        long j = this.f45882c << 3;
        byte b = Byte.MIN_VALUE;
        while (true) {
            mo51713b(b);
            if (this.f45881b != 0) {
                b = 0;
            } else {
                mo50204k(j);
                mo50203j();
                return;
            }
        }
    }

    /* renamed from: j */
    public abstract void mo50203j();

    /* renamed from: k */
    public abstract void mo50204k(long j);

    /* renamed from: l */
    public abstract void mo50205l(byte[] bArr, int i);

    public void reset() {
        this.f45882c = 0;
        this.f45881b = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.f45880a;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    public void update(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int max = Math.max(0, i2);
        if (this.f45881b != 0) {
            int i4 = 0;
            while (true) {
                if (i4 >= max) {
                    i3 = i4;
                    break;
                }
                byte[] bArr2 = this.f45880a;
                int i5 = this.f45881b;
                int i6 = i5 + 1;
                this.f45881b = i6;
                int i7 = i4 + 1;
                bArr2[i5] = bArr[i4 + i];
                if (i6 == 4) {
                    mo50205l(bArr2, 0);
                    this.f45881b = 0;
                    i3 = i7;
                    break;
                }
                i4 = i7;
            }
        }
        int i8 = ((max - i3) & -4) + i3;
        while (i3 < i8) {
            mo50205l(bArr, i + i3);
            i3 += 4;
        }
        while (i3 < max) {
            byte[] bArr3 = this.f45880a;
            int i9 = this.f45881b;
            this.f45881b = i9 + 1;
            bArr3[i9] = bArr[i3 + i];
            i3++;
        }
        this.f45882c += (long) max;
    }
}
