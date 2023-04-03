package p000;

/* renamed from: vj4 */
public class vj4 extends sj4 {

    /* renamed from: d */
    public km3 f45315d;

    /* renamed from: e */
    public byte[] f45316e;

    public vj4(ig1 ig1) {
        lk2 lk2 = new lk2(ig1);
        this.f45315d = lk2;
        this.f45316e = new byte[lk2.mo50313b()];
    }

    /* renamed from: a */
    public we0 mo65866a(int i) {
        return mo66532e(i);
    }

    /* renamed from: c */
    public final void mo66530c(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i2) {
        if (i != 0) {
            if (bArr != null) {
                this.f45315d.update(bArr, 0, bArr.length);
            }
            this.f45315d.update(bArr2, 0, bArr2.length);
            this.f45315d.mo50312a(this.f45316e, 0);
            byte[] bArr4 = this.f45316e;
            System.arraycopy(bArr4, 0, bArr3, i2, bArr4.length);
            for (int i3 = 1; i3 < i; i3++) {
                km3 km3 = this.f45315d;
                byte[] bArr5 = this.f45316e;
                km3.update(bArr5, 0, bArr5.length);
                this.f45315d.mo50312a(this.f45316e, 0);
                int i4 = 0;
                while (true) {
                    byte[] bArr6 = this.f45316e;
                    if (i4 == bArr6.length) {
                        break;
                    }
                    int i5 = i2 + i4;
                    bArr3[i5] = (byte) (bArr6[i4] ^ bArr3[i5]);
                    i4++;
                }
            }
            return;
        }
        throw new IllegalArgumentException("iteration count must be at least 1.");
    }

    /* renamed from: d */
    public final byte[] mo66531d(int i) {
        int b = this.f45315d.mo50313b();
        int i2 = ((i + b) - 1) / b;
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[(i2 * b)];
        this.f45315d.mo50314c(new va3(this.f44573a));
        int i3 = 0;
        for (int i4 = 1; i4 <= i2; i4++) {
            int i5 = 3;
            while (true) {
                byte b2 = (byte) (bArr[i5] + 1);
                bArr[i5] = b2;
                if (b2 != 0) {
                    break;
                }
                i5--;
            }
            mo66530c(this.f44574b, this.f44575c, bArr, bArr2, i3);
            i3 += b;
        }
        return bArr2;
    }

    /* renamed from: e */
    public we0 mo66532e(int i) {
        int i2 = i / 8;
        return new va3(mo66531d(i2), 0, i2);
    }
}
