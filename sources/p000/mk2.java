package p000;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: mk2 */
public class mk2 implements z01 {

    /* renamed from: e */
    public static final BigInteger f40931e = BigInteger.valueOf(0);

    /* renamed from: a */
    public final lk2 f40932a;

    /* renamed from: b */
    public final byte[] f40933b;

    /* renamed from: c */
    public final byte[] f40934c;

    /* renamed from: d */
    public BigInteger f40935d;

    public mk2(ig1 ig1) {
        lk2 lk2 = new lk2(ig1);
        this.f40932a = lk2;
        this.f40934c = new byte[lk2.mo50313b()];
        this.f40933b = new byte[lk2.mo50313b()];
    }

    /* renamed from: a */
    public void mo56261a(BigInteger bigInteger, SecureRandom secureRandom) {
        throw new IllegalStateException("Operation not supported");
    }

    /* renamed from: b */
    public BigInteger mo56262b() {
        int f = i10.m58766f(this.f40935d);
        byte[] bArr = new byte[f];
        while (true) {
            int i = 0;
            while (i < f) {
                lk2 lk2 = this.f40932a;
                byte[] bArr2 = this.f40934c;
                lk2.update(bArr2, 0, bArr2.length);
                this.f40932a.mo50312a(this.f40934c, 0);
                int min = Math.min(f - i, this.f40934c.length);
                System.arraycopy(this.f40934c, 0, bArr, i, min);
                i += min;
            }
            BigInteger e = mo56265e(bArr);
            if (e.compareTo(f40931e) > 0 && e.compareTo(this.f40935d) < 0) {
                return e;
            }
            lk2 lk22 = this.f40932a;
            byte[] bArr3 = this.f40934c;
            lk22.update(bArr3, 0, bArr3.length);
            this.f40932a.mo55914e((byte) 0);
            this.f40932a.mo50312a(this.f40933b, 0);
            this.f40932a.mo50314c(new va3(this.f40933b));
            lk2 lk23 = this.f40932a;
            byte[] bArr4 = this.f40934c;
            lk23.update(bArr4, 0, bArr4.length);
            this.f40932a.mo50312a(this.f40934c, 0);
        }
    }

    /* renamed from: c */
    public boolean mo56263c() {
        return true;
    }

    /* renamed from: d */
    public void mo56264d(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f40935d = bigInteger;
        C9367tq.m72432p(this.f40934c, (byte) 1);
        C9367tq.m72432p(this.f40933b, (byte) 0);
        int f = i10.m58766f(bigInteger);
        byte[] bArr2 = new byte[f];
        byte[] b = i10.m58762b(bigInteger2);
        System.arraycopy(b, 0, bArr2, f - b.length, b.length);
        byte[] bArr3 = new byte[f];
        BigInteger e = mo56265e(bArr);
        if (e.compareTo(bigInteger) >= 0) {
            e = e.subtract(bigInteger);
        }
        byte[] b2 = i10.m58762b(e);
        System.arraycopy(b2, 0, bArr3, f - b2.length, b2.length);
        this.f40932a.mo50314c(new va3(this.f40933b));
        lk2 lk2 = this.f40932a;
        byte[] bArr4 = this.f40934c;
        lk2.update(bArr4, 0, bArr4.length);
        this.f40932a.mo55914e((byte) 0);
        this.f40932a.update(bArr2, 0, f);
        this.f40932a.update(bArr3, 0, f);
        this.f40932a.mo50312a(this.f40933b, 0);
        this.f40932a.mo50314c(new va3(this.f40933b));
        lk2 lk22 = this.f40932a;
        byte[] bArr5 = this.f40934c;
        lk22.update(bArr5, 0, bArr5.length);
        this.f40932a.mo50312a(this.f40934c, 0);
        lk2 lk23 = this.f40932a;
        byte[] bArr6 = this.f40934c;
        lk23.update(bArr6, 0, bArr6.length);
        this.f40932a.mo55914e((byte) 1);
        this.f40932a.update(bArr2, 0, f);
        this.f40932a.update(bArr3, 0, f);
        this.f40932a.mo50312a(this.f40933b, 0);
        this.f40932a.mo50314c(new va3(this.f40933b));
        lk2 lk24 = this.f40932a;
        byte[] bArr7 = this.f40934c;
        lk24.update(bArr7, 0, bArr7.length);
        this.f40932a.mo50312a(this.f40934c, 0);
    }

    /* renamed from: e */
    public final BigInteger mo56265e(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        return bArr.length * 8 > this.f40935d.bitLength() ? bigInteger.shiftRight((bArr.length * 8) - this.f40935d.bitLength()) : bigInteger;
    }
}
