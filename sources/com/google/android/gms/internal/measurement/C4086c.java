package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.c */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class C4086c extends C4087d {

    /* renamed from: d */
    public final byte[] f22609d;

    /* renamed from: e */
    public final int f22610e;

    /* renamed from: f */
    public int f22611f;

    public C4086c(byte[] bArr, int i, int i2) {
        super((b29) null);
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.f22609d = bArr;
            this.f22611f = 0;
            this.f22610e = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
    }

    /* renamed from: E */
    public final void mo30883E(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f22609d, this.f22611f, i2);
            this.f22611f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22611f), Integer.valueOf(this.f22610e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: F */
    public final void mo30884F(String str) throws IOException {
        int i = this.f22611f;
        try {
            int A = C4087d.m34149A(str.length() * 3);
            int A2 = C4087d.m34149A(str.length());
            if (A2 == A) {
                int i2 = i + A2;
                this.f22611f = i2;
                int d = C4089f.m34185d(str, this.f22609d, i2, this.f22610e - i2);
                this.f22611f = i;
                mo30896r((d - i) - A2);
                this.f22611f = d;
                return;
            }
            mo30896r(C4089f.m34184c(str));
            byte[] bArr = this.f22609d;
            int i3 = this.f22611f;
            this.f22611f = C4089f.m34185d(str, bArr, i3, this.f22610e - i3);
        } catch (zzmv e) {
            this.f22611f = i;
            mo30903d(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzjj(e2);
        }
    }

    /* renamed from: g */
    public final void mo30885g(int i, int i2) throws IOException {
        mo30896r((i << 3) | i2);
    }

    /* renamed from: h */
    public final void mo30886h(int i, int i2) throws IOException {
        mo30896r(i << 3);
        mo30895q(i2);
    }

    /* renamed from: i */
    public final void mo30887i(int i, int i2) throws IOException {
        mo30896r(i << 3);
        mo30896r(i2);
    }

    /* renamed from: j */
    public final void mo30888j(int i, int i2) throws IOException {
        mo30896r((i << 3) | 5);
        mo30897s(i2);
    }

    /* renamed from: k */
    public final void mo30889k(int i, long j) throws IOException {
        mo30896r(i << 3);
        mo30898t(j);
    }

    /* renamed from: l */
    public final void mo30890l(int i, long j) throws IOException {
        mo30896r((i << 3) | 1);
        mo30899u(j);
    }

    /* renamed from: m */
    public final void mo30891m(int i, boolean z) throws IOException {
        mo30896r(i << 3);
        mo30894p(z ? (byte) 1 : 0);
    }

    /* renamed from: n */
    public final void mo30892n(int i, String str) throws IOException {
        mo30896r((i << 3) | 2);
        mo30884F(str);
    }

    /* renamed from: o */
    public final void mo30893o(int i, zzjd zzjd) throws IOException {
        mo30896r((i << 3) | 2);
        mo30896r(zzjd.zzc());
        zzjd.zzf(this);
    }

    /* renamed from: p */
    public final void mo30894p(byte b) throws IOException {
        try {
            byte[] bArr = this.f22609d;
            int i = this.f22611f;
            this.f22611f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22611f), Integer.valueOf(this.f22610e), 1}), e);
        }
    }

    /* renamed from: q */
    public final void mo30895q(int i) throws IOException {
        if (i >= 0) {
            mo30896r(i);
        } else {
            mo30898t((long) i);
        }
    }

    /* renamed from: r */
    public final void mo30896r(int i) throws IOException {
        if (C4087d.f22613c) {
            int i2 = yz8.f35974a;
        }
        while ((i & -128) != 0) {
            byte[] bArr = this.f22609d;
            int i3 = this.f22611f;
            this.f22611f = i3 + 1;
            bArr[i3] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f22609d;
            int i4 = this.f22611f;
            this.f22611f = i4 + 1;
            bArr2[i4] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22611f), Integer.valueOf(this.f22610e), 1}), e);
        }
    }

    /* renamed from: s */
    public final void mo30897s(int i) throws IOException {
        try {
            byte[] bArr = this.f22609d;
            int i2 = this.f22611f;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f22611f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22611f), Integer.valueOf(this.f22610e), 1}), e);
        }
    }

    /* renamed from: t */
    public final void mo30898t(long j) throws IOException {
        if (!C4087d.f22613c || this.f22610e - this.f22611f < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f22609d;
                int i = this.f22611f;
                this.f22611f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f22609d;
                int i2 = this.f22611f;
                this.f22611f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22611f), Integer.valueOf(this.f22610e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f22609d;
                int i3 = this.f22611f;
                this.f22611f = i3 + 1;
                ta9.m52181u(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f22609d;
            int i4 = this.f22611f;
            this.f22611f = i4 + 1;
            ta9.m52181u(bArr4, (long) i4, (byte) ((int) j));
        }
    }

    /* renamed from: u */
    public final void mo30899u(long j) throws IOException {
        try {
            byte[] bArr = this.f22609d;
            int i = this.f22611f;
            int i2 = i + 1;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f22611f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22611f), Integer.valueOf(this.f22610e), 1}), e);
        }
    }

    /* renamed from: v */
    public final void mo30900v(byte[] bArr, int i, int i2) throws IOException {
        mo30883E(bArr, 0, i2);
    }

    /* renamed from: w */
    public final int mo30901w() {
        return this.f22610e - this.f22611f;
    }
}
