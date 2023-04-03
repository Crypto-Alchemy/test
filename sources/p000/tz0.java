package p000;

import java.io.IOException;

/* renamed from: tz0 */
public class tz0 extends C7117g4 {
    public tz0(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: A */
    public int mo50761A(boolean z) {
        return C9302s4.m71859g(z, mo66150O().length);
    }

    /* renamed from: E */
    public C9326t4 mo50472E() {
        return this;
    }

    /* renamed from: F */
    public C9326t4 mo50473F() {
        return this;
    }

    /* renamed from: O */
    public final byte[] mo66150O() {
        byte[] bArr = this.f37972a;
        if (bArr[bArr.length - 1] != 90) {
            return bArr;
        }
        if (!mo51863L()) {
            byte[] bArr2 = this.f37972a;
            byte[] bArr3 = new byte[(bArr2.length + 4)];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length - 1);
            System.arraycopy(ob6.m70226e("0000Z"), 0, bArr3, this.f37972a.length - 1, 5);
            return bArr3;
        } else if (!mo51864M()) {
            byte[] bArr4 = this.f37972a;
            byte[] bArr5 = new byte[(bArr4.length + 2)];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length - 1);
            System.arraycopy(ob6.m70226e("00Z"), 0, bArr5, this.f37972a.length - 1, 3);
            return bArr5;
        } else if (!mo51862J()) {
            return this.f37972a;
        } else {
            int length = this.f37972a.length - 2;
            while (length > 0 && this.f37972a[length] == 48) {
                length--;
            }
            byte[] bArr6 = this.f37972a;
            if (bArr6[length] == 46) {
                byte[] bArr7 = new byte[(length + 1)];
                System.arraycopy(bArr6, 0, bArr7, 0, length);
                bArr7[length] = 90;
                return bArr7;
            }
            byte[] bArr8 = new byte[(length + 2)];
            int i = length + 1;
            System.arraycopy(bArr6, 0, bArr8, 0, i);
            bArr8[i] = 90;
            return bArr8;
        }
    }

    /* renamed from: s */
    public void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        s4Var.mo65812o(z, 24, mo66150O());
    }
}
