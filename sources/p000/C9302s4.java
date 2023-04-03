package p000;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: s4 */
public class C9302s4 {

    /* renamed from: a */
    public OutputStream f44524a;

    public C9302s4(OutputStream outputStream) {
        this.f44524a = outputStream;
    }

    /* renamed from: a */
    public static C9302s4 m71856a(OutputStream outputStream) {
        return new C9302s4(outputStream);
    }

    /* renamed from: b */
    public static C9302s4 m71857b(OutputStream outputStream, String str) {
        return str.equals("DER") ? new a01(outputStream) : str.equals("DL") ? new s01(outputStream) : new C9302s4(outputStream);
    }

    /* renamed from: f */
    public static int m71858f(int i) {
        if (i < 128) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 8;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    /* renamed from: g */
    public static int m71859g(boolean z, int i) {
        return (z ? 1 : 0) + m71858f(i) + i;
    }

    /* renamed from: h */
    public static int m71860h(int i) {
        if (i < 31) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 7;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    /* renamed from: c */
    public void mo65806c() throws IOException {
    }

    /* renamed from: d */
    public a01 mo50014d() {
        return new a01(this.f44524a);
    }

    /* renamed from: e */
    public s01 mo65786e() {
        return new s01(this.f44524a);
    }

    /* renamed from: i */
    public final void mo65807i(int i) throws IOException {
        this.f44524a.write(i);
    }

    /* renamed from: j */
    public final void mo65808j(byte[] bArr, int i, int i2) throws IOException {
        this.f44524a.write(bArr, i, i2);
    }

    /* renamed from: k */
    public final void mo65809k(int i) throws IOException {
        if (i < 128) {
            mo65807i(i);
            return;
        }
        int i2 = 5;
        byte[] bArr = new byte[5];
        do {
            i2--;
            bArr[i2] = (byte) i;
            i >>>= 8;
        } while (i != 0);
        int i3 = 5 - i2;
        int i4 = i2 - 1;
        bArr[i4] = (byte) (i3 | 128);
        mo65808j(bArr, i4, i3 + 1);
    }

    /* renamed from: l */
    public void mo50015l(C6843b4[] b4VarArr) throws IOException {
        for (C6843b4 n : b4VarArr) {
            n.mo50158n().mo50767s(this, true);
        }
    }

    /* renamed from: m */
    public final void mo65810m(boolean z, int i, byte b) throws IOException {
        mo65816s(z, i);
        mo65809k(1);
        mo65807i(b);
    }

    /* renamed from: n */
    public final void mo65811n(boolean z, int i, byte b, byte[] bArr, int i2, int i3) throws IOException {
        mo65816s(z, i);
        mo65809k(i3 + 1);
        mo65807i(b);
        mo65808j(bArr, i2, i3);
    }

    /* renamed from: o */
    public final void mo65812o(boolean z, int i, byte[] bArr) throws IOException {
        mo65816s(z, i);
        mo65809k(bArr.length);
        mo65808j(bArr, 0, bArr.length);
    }

    /* renamed from: p */
    public final void mo65813p(boolean z, int i, byte[] bArr, int i2, int i3) throws IOException {
        mo65816s(z, i);
        mo65809k(i3);
        mo65808j(bArr, i2, i3);
    }

    /* renamed from: q */
    public final void mo65814q(boolean z, int i, byte[] bArr, int i2, int i3, byte b) throws IOException {
        mo65816s(z, i);
        mo65809k(i3 + 1);
        mo65808j(bArr, i2, i3);
        mo65807i(b);
    }

    /* renamed from: r */
    public final void mo65815r(boolean z, int i, C6843b4[] b4VarArr) throws IOException {
        mo65816s(z, i);
        mo65807i(128);
        mo50015l(b4VarArr);
        mo65807i(0);
        mo65807i(0);
    }

    /* renamed from: s */
    public final void mo65816s(boolean z, int i) throws IOException {
        if (z) {
            mo65807i(i);
        }
    }

    /* renamed from: t */
    public final void mo65817t(boolean z, int i, int i2) throws IOException {
        if (z) {
            if (i2 < 31) {
                mo65807i(i | i2);
                return;
            }
            byte[] bArr = new byte[6];
            int i3 = 5;
            bArr[5] = (byte) (i2 & 127);
            while (i2 > 127) {
                i2 >>>= 7;
                i3--;
                bArr[i3] = (byte) ((i2 & 127) | 128);
            }
            int i4 = i3 - 1;
            bArr[i4] = (byte) (31 | i);
            mo65808j(bArr, i4, 6 - i4);
        }
    }

    /* renamed from: u */
    public void mo50016u(C9326t4 t4Var, boolean z) throws IOException {
        t4Var.mo50767s(this, z);
    }

    /* renamed from: v */
    public void mo50017v(C9326t4[] t4VarArr) throws IOException {
        for (C9326t4 s : t4VarArr) {
            s.mo50767s(this, true);
        }
    }
}
