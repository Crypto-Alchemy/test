package p000;

import java.io.IOException;

/* renamed from: kw */
public class C7808kw extends C9203q4 {

    /* renamed from: g */
    public final int f40537g;

    /* renamed from: k */
    public final C9203q4[] f40538k;

    public C7808kw(byte[] bArr) {
        this(bArr, 1000);
    }

    public C7808kw(byte[] bArr, int i) {
        this(bArr, (C9203q4[]) null, i);
    }

    public C7808kw(byte[] bArr, C9203q4[] q4VarArr, int i) {
        super(bArr);
        this.f40538k = q4VarArr;
        this.f40537g = i;
    }

    public C7808kw(C9203q4[] q4VarArr) {
        this(q4VarArr, 1000);
    }

    public C7808kw(C9203q4[] q4VarArr, int i) {
        this(m63626N(q4VarArr), q4VarArr, i);
    }

    /* renamed from: N */
    public static byte[] m63626N(C9203q4[] q4VarArr) {
        if (r0 == 0) {
            return C9203q4.f44152e;
        }
        if (r0 == 1) {
            return q4VarArr[0].f44153a;
        }
        int i = 0;
        for (C9203q4 q4Var : q4VarArr) {
            i += q4Var.f44153a.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (C9203q4 q4Var2 : q4VarArr) {
            byte[] bArr2 = q4Var2.f44153a;
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    /* renamed from: A */
    public int mo50761A(boolean z) throws IOException {
        if (!mo51124t()) {
            return yz0.m74683O(z, this.f44153a.length);
        }
        int i = z ? 4 : 3;
        if (this.f40538k != null) {
            int i2 = 0;
            while (true) {
                C9203q4[] q4VarArr = this.f40538k;
                if (i2 >= q4VarArr.length) {
                    return i;
                }
                i += q4VarArr[i2].mo50761A(true);
                i2++;
            }
        } else {
            int length = this.f44153a.length;
            int i3 = this.f40537g;
            int i4 = length / i3;
            int O = i + (yz0.m74683O(true, i3) * i4);
            int length2 = this.f44153a.length - (i4 * this.f40537g);
            return length2 > 0 ? O + yz0.m74683O(true, length2) : O;
        }
    }

    /* renamed from: s */
    public void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        if (!mo51124t()) {
            byte[] bArr = this.f44153a;
            yz0.m74682N(s4Var, z, bArr, 0, bArr.length);
            return;
        }
        s4Var.mo65816s(z, 36);
        s4Var.mo65807i(128);
        C9203q4[] q4VarArr = this.f40538k;
        if (q4VarArr == null) {
            int i = 0;
            while (true) {
                byte[] bArr2 = this.f44153a;
                if (i >= bArr2.length) {
                    break;
                }
                int min = Math.min(bArr2.length - i, this.f40537g);
                yz0.m74682N(s4Var, true, this.f44153a, i, min);
                i += min;
            }
        } else {
            s4Var.mo50017v(q4VarArr);
        }
        s4Var.mo65807i(0);
        s4Var.mo65807i(0);
    }

    /* renamed from: t */
    public boolean mo51124t() {
        return this.f40538k != null || this.f44153a.length > this.f40537g;
    }
}
