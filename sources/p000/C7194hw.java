package p000;

import java.io.IOException;

/* renamed from: hw */
public class C7194hw extends C9584x3 {

    /* renamed from: g */
    public final int f38279g;

    /* renamed from: k */
    public final C9584x3[] f38280k;

    public C7194hw(byte[] bArr, int i) {
        this(bArr, i, 1000);
    }

    public C7194hw(byte[] bArr, int i, int i2) {
        super(bArr, i);
        this.f38280k = null;
        this.f38279g = i2;
    }

    public C7194hw(C9584x3[] x3VarArr) {
        this(x3VarArr, 1000);
    }

    public C7194hw(C9584x3[] x3VarArr, int i) {
        super(m58703Q(x3VarArr), false);
        this.f38280k = x3VarArr;
        this.f38279g = i;
    }

    /* renamed from: Q */
    public static byte[] m58703Q(C9584x3[] x3VarArr) {
        if (r0 == 0) {
            return new byte[]{0};
        } else if (r0 == 1) {
            return x3VarArr[0].f45842a;
        } else {
            int i = r0 - 1;
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                byte[] bArr = x3VarArr[i2].f45842a;
                if (bArr[0] == 0) {
                    i3 += bArr.length - 1;
                    i2++;
                } else {
                    throw new IllegalArgumentException("only the last nested bitstring can have padding");
                }
            }
            byte[] bArr2 = x3VarArr[i].f45842a;
            byte b = bArr2[0];
            byte[] bArr3 = new byte[(i3 + bArr2.length)];
            bArr3[0] = b;
            int i4 = 1;
            for (C9584x3 x3Var : x3VarArr) {
                byte[] bArr4 = x3Var.f45842a;
                int length = bArr4.length - 1;
                System.arraycopy(bArr4, 1, bArr3, i4, length);
                i4 += length;
            }
            return bArr3;
        }
    }

    /* renamed from: A */
    public int mo50761A(boolean z) throws IOException {
        if (!mo51124t()) {
            return o01.m70105S(z, this.f45842a.length);
        }
        int i = z ? 4 : 3;
        if (this.f38280k != null) {
            int i2 = 0;
            while (true) {
                C9584x3[] x3VarArr = this.f38280k;
                if (i2 >= x3VarArr.length) {
                    return i;
                }
                i += x3VarArr[i2].mo50761A(true);
                i2++;
            }
        } else {
            byte[] bArr = this.f45842a;
            if (bArr.length < 2) {
                return i;
            }
            int i3 = this.f38279g;
            int length = (bArr.length - 2) / (i3 - 1);
            return i + (o01.m70105S(true, i3) * length) + o01.m70105S(true, this.f45842a.length - (length * (this.f38279g - 1)));
        }
    }

    /* renamed from: s */
    public void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        if (!mo51124t()) {
            byte[] bArr = this.f45842a;
            o01.m70104R(s4Var, z, bArr, 0, bArr.length);
            return;
        }
        s4Var.mo65816s(z, 35);
        s4Var.mo65807i(128);
        C9584x3[] x3VarArr = this.f38280k;
        if (x3VarArr != null) {
            s4Var.mo50017v(x3VarArr);
        } else {
            byte[] bArr2 = this.f45842a;
            if (bArr2.length >= 2) {
                byte b = bArr2[0];
                int length = bArr2.length;
                int i = length - 1;
                int i2 = this.f38279g - 1;
                while (i > i2) {
                    o01.m70103Q(s4Var, true, (byte) 0, this.f45842a, length - i, i2);
                    i -= i2;
                }
                o01.m70103Q(s4Var, true, b, this.f45842a, length - i, i);
            }
        }
        s4Var.mo65807i(0);
        s4Var.mo65807i(0);
    }

    /* renamed from: t */
    public boolean mo51124t() {
        return this.f38280k != null || this.f45842a.length > this.f38279g;
    }
}
