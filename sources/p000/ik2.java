package p000;

import org.bouncycastle.crypto.DataLengthException;

/* renamed from: ik2 */
public class ik2 {

    /* renamed from: a */
    public lk2 f38398a;

    /* renamed from: b */
    public int f38399b;

    /* renamed from: c */
    public byte[] f38400c;

    /* renamed from: d */
    public byte[] f38401d;

    /* renamed from: e */
    public int f38402e;

    public ik2(ig1 ig1) {
        this.f38398a = new lk2(ig1);
        this.f38399b = ig1.mo50202e();
    }

    /* renamed from: a */
    public final void mo52492a() throws DataLengthException {
        int i = this.f38402e;
        int i2 = this.f38399b;
        int i3 = (i / i2) + 1;
        if (i3 < 256) {
            if (i != 0) {
                this.f38398a.update(this.f38401d, 0, i2);
            }
            lk2 lk2 = this.f38398a;
            byte[] bArr = this.f38400c;
            lk2.update(bArr, 0, bArr.length);
            this.f38398a.mo55914e((byte) i3);
            this.f38398a.mo50312a(this.f38401d, 0);
            return;
        }
        throw new DataLengthException("HKDF cannot generate more than 255 blocks of HashLen size");
    }

    /* renamed from: b */
    public final va3 mo52493b(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            this.f38398a.mo50314c(new va3(new byte[this.f38399b]));
        } else {
            this.f38398a.mo50314c(new va3(bArr));
        }
        this.f38398a.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[this.f38399b];
        this.f38398a.mo50312a(bArr3, 0);
        return new va3(bArr3);
    }

    /* renamed from: c */
    public int mo52494c(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        int i3 = this.f38402e;
        int i4 = i3 + i2;
        int i5 = this.f38399b;
        if (i4 <= i5 * 255) {
            if (i3 % i5 == 0) {
                mo52492a();
            }
            int i6 = this.f38402e;
            int i7 = this.f38399b;
            int i8 = i6 % i7;
            int min = Math.min(i7 - (i6 % i7), i2);
            System.arraycopy(this.f38401d, i8, bArr, i, min);
            this.f38402e += min;
            int i9 = i2 - min;
            while (true) {
                i += min;
                if (i9 <= 0) {
                    return i2;
                }
                mo52492a();
                min = Math.min(this.f38399b, i9);
                System.arraycopy(this.f38401d, 0, bArr, i, min);
                this.f38402e += min;
                i9 -= min;
            }
        } else {
            throw new DataLengthException("HKDF may only be used for 255 * HashLen bytes of output");
        }
    }

    /* renamed from: d */
    public void mo52495d(pc1 pc1) {
        va3 va3;
        lk2 lk2;
        if (pc1 instanceof jk2) {
            jk2 jk2 = (jk2) pc1;
            if (jk2.mo52735d()) {
                lk2 = this.f38398a;
                va3 = new va3(jk2.mo52732a());
            } else {
                lk2 = this.f38398a;
                va3 = mo52493b(jk2.mo52734c(), jk2.mo52732a());
            }
            lk2.mo50314c(va3);
            this.f38400c = jk2.mo52733b();
            this.f38402e = 0;
            this.f38401d = new byte[this.f38399b];
            return;
        }
        throw new IllegalArgumentException("HKDF parameters required for HKDFBytesGenerator");
    }
}
