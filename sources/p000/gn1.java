package p000;

import java.security.SecureRandom;

/* renamed from: gn1 */
public final class gn1 extends C9414ur {

    /* renamed from: d */
    public final byte[] f38045d;

    /* renamed from: e */
    public hn1 f38046e;

    public gn1(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[32];
        this.f38045d = bArr;
        dn1.m56943o(secureRandom, bArr);
    }

    public gn1(byte[] bArr) {
        this(m58154c(bArr), 0);
    }

    public gn1(byte[] bArr, int i) {
        super(true);
        byte[] bArr2 = new byte[32];
        this.f38045d = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, 32);
    }

    /* renamed from: c */
    public static byte[] m58154c(byte[] bArr) {
        if (bArr.length == 32) {
            return bArr;
        }
        throw new IllegalArgumentException("'buf' must have length 32");
    }

    /* renamed from: a */
    public hn1 mo51942a() {
        hn1 hn1;
        synchronized (this.f38045d) {
            if (this.f38046e == null) {
                byte[] bArr = new byte[32];
                dn1.m56944p(this.f38045d, 0, bArr, 0);
                this.f38046e = new hn1(bArr, 0);
            }
            hn1 = this.f38046e;
        }
        return hn1;
    }

    /* renamed from: b */
    public void mo51943b(int i, byte[] bArr, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4) {
        int i5 = i;
        byte[] bArr4 = new byte[32];
        mo51942a().mo52245a(bArr4, 0);
        if (i5 == 0) {
            int i6 = i3;
            if (bArr == null) {
                dn1.m56926K(this.f38045d, 0, bArr4, 0, bArr2, i2, i3, bArr3, i4);
                return;
            }
            throw new IllegalArgumentException("ctx");
        } else if (i5 == 1) {
            int i7 = i3;
            dn1.m56927L(this.f38045d, 0, bArr4, 0, bArr, bArr2, i2, i3, bArr3, i4);
        } else if (i5 != 2) {
            throw new IllegalArgumentException("algorithm");
        } else if (64 == i3) {
            dn1.m56928M(this.f38045d, 0, bArr4, 0, bArr, bArr2, i2, bArr3, i4);
        } else {
            throw new IllegalArgumentException("msgLen");
        }
    }

    public byte[] getEncoded() {
        return C9367tq.m72422f(this.f38045d);
    }
}
