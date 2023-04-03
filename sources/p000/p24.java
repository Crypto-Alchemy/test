package p000;

import java.util.Arrays;

/* renamed from: p24 */
/* compiled from: NalUnitTargetBuffer */
public final class p24 {

    /* renamed from: a */
    public final int f16261a;

    /* renamed from: b */
    public boolean f16262b;

    /* renamed from: c */
    public boolean f16263c;

    /* renamed from: d */
    public byte[] f16264d;

    /* renamed from: e */
    public int f16265e;

    public p24(int i, int i2) {
        this.f16261a = i;
        byte[] bArr = new byte[(i2 + 3)];
        this.f16264d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public void mo24321a(byte[] bArr, int i, int i2) {
        if (this.f16262b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f16264d;
            int length = bArr2.length;
            int i4 = this.f16265e;
            if (length < i4 + i3) {
                this.f16264d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f16264d, this.f16265e, i3);
            this.f16265e += i3;
        }
    }

    /* renamed from: b */
    public boolean mo24322b(int i) {
        if (!this.f16262b) {
            return false;
        }
        this.f16265e -= i;
        this.f16262b = false;
        this.f16263c = true;
        return true;
    }

    /* renamed from: c */
    public boolean mo24323c() {
        return this.f16263c;
    }

    /* renamed from: d */
    public void mo24324d() {
        this.f16262b = false;
        this.f16263c = false;
    }

    /* renamed from: e */
    public void mo24325e(int i) {
        boolean z = true;
        C2725kr.m20987g(!this.f16262b);
        if (i != this.f16261a) {
            z = false;
        }
        this.f16262b = z;
        if (z) {
            this.f16265e = 3;
            this.f16263c = false;
        }
    }
}
