package p000;

import java.io.IOException;

/* renamed from: v01 */
public class v01 extends C9586x4 {

    /* renamed from: g */
    public int f45199g = -1;

    public v01() {
    }

    public v01(C6923c4 c4Var) {
        super(c4Var, false);
    }

    public v01(boolean z, C6843b4[] b4VarArr) {
        super(z, b4VarArr);
    }

    /* renamed from: A */
    public int mo50761A(boolean z) throws IOException {
        return C9302s4.m71859g(z, mo66382O());
    }

    /* renamed from: F */
    public C9326t4 mo50473F() {
        return this;
    }

    /* renamed from: O */
    public final int mo66382O() throws IOException {
        if (this.f45199g < 0) {
            int i = 0;
            for (C6843b4 n : this.f45844a) {
                i += n.mo50158n().mo50473F().mo50761A(true);
            }
            this.f45199g = i;
        }
        return this.f45199g;
    }

    /* renamed from: s */
    public void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        s4Var.mo65816s(z, 49);
        s01 e = s4Var.mo65786e();
        int length = this.f45844a.length;
        int i = 0;
        if (this.f45199g >= 0 || length > 16) {
            s4Var.mo65809k(mo66382O());
            while (i < length) {
                e.mo50016u(this.f45844a[i].mo50158n(), true);
                i++;
            }
            return;
        }
        C9326t4[] t4VarArr = new C9326t4[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            C9326t4 F = this.f45844a[i3].mo50158n().mo50473F();
            t4VarArr[i3] = F;
            i2 += F.mo50761A(true);
        }
        this.f45199g = i2;
        s4Var.mo65809k(i2);
        while (i < length) {
            e.mo50016u(t4VarArr[i], true);
            i++;
        }
    }
}
