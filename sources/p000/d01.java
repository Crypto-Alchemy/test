package p000;

import java.io.IOException;

/* renamed from: d01 */
public class d01 extends C9586x4 {

    /* renamed from: g */
    public int f37224g = -1;

    public d01() {
    }

    public d01(boolean z, C6843b4[] b4VarArr) {
        super(m56613O(z), b4VarArr);
    }

    /* renamed from: O */
    public static boolean m56613O(boolean z) {
        if (z) {
            return z;
        }
        throw new IllegalStateException("DERSet elements should always be in sorted order");
    }

    /* renamed from: A */
    public int mo50761A(boolean z) throws IOException {
        return C9302s4.m71859g(z, mo51025Q());
    }

    /* renamed from: E */
    public C9326t4 mo50472E() {
        return this.f45845d ? this : super.mo50472E();
    }

    /* renamed from: F */
    public C9326t4 mo50473F() {
        return this;
    }

    /* renamed from: Q */
    public final int mo51025Q() throws IOException {
        if (this.f37224g < 0) {
            int i = 0;
            for (C6843b4 n : this.f45844a) {
                i += n.mo50158n().mo50472E().mo50761A(true);
            }
            this.f37224g = i;
        }
        return this.f37224g;
    }

    /* renamed from: s */
    public void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        s4Var.mo65816s(z, 49);
        a01 d = s4Var.mo50014d();
        int length = this.f45844a.length;
        int i = 0;
        if (this.f37224g >= 0 || length > 16) {
            s4Var.mo65809k(mo51025Q());
            while (i < length) {
                this.f45844a[i].mo50158n().mo50472E().mo50767s(d, true);
                i++;
            }
            return;
        }
        C9326t4[] t4VarArr = new C9326t4[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            C9326t4 E = this.f45844a[i3].mo50158n().mo50472E();
            t4VarArr[i3] = E;
            i2 += E.mo50761A(true);
        }
        this.f37224g = i2;
        s4Var.mo65809k(i2);
        while (i < length) {
            t4VarArr[i].mo50767s(d, true);
            i++;
        }
    }
}
