package p000;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Exception;

/* renamed from: y4 */
public class C9626y4 {

    /* renamed from: a */
    public final InputStream f46124a;

    /* renamed from: b */
    public final int f46125b;

    /* renamed from: c */
    public final byte[][] f46126c;

    public C9626y4(InputStream inputStream, int i, byte[][] bArr) {
        this.f46124a = inputStream;
        this.f46125b = i;
        this.f46126c = bArr;
    }

    /* renamed from: a */
    public C6843b4 mo67027a(int i) throws IOException {
        boolean z = false;
        mo67035i(false);
        int j = C7243j4.m59247j(this.f46124a, i);
        int h = C7243j4.m59246h(this.f46124a, this.f46125b, j == 3 || j == 4 || j == 16 || j == 17 || j == 8);
        if (h >= 0) {
            db1 db1 = new db1(this.f46124a, h, this.f46125b);
            if ((i & 224) == 0) {
                return mo67032f(j, db1);
            }
            C9626y4 y4Var = new C9626y4(db1, db1.mo51671a(), this.f46126c);
            int i2 = i & 192;
            if (i2 == 0) {
                return y4Var.mo67030d(j);
            }
            if ((i & 32) != 0) {
                z = true;
            }
            return 64 == i2 ? (n01) y4Var.mo67028b(i2, j, z) : new y01(i2, j, z, y4Var);
        } else if ((i & 32) != 0) {
            C9626y4 y4Var2 = new C9626y4(new qt2(this.f46124a, this.f46125b), this.f46125b, this.f46126c);
            int i3 = i & 192;
            return i3 != 0 ? 64 == i3 ? new C7144gw(j, y4Var2) : new C9286rw(i3, j, y4Var2) : y4Var2.mo67031e(j);
        } else {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
    }

    /* renamed from: b */
    public C9326t4 mo67028b(int i, int i2, boolean z) throws IOException {
        return !z ? C6848b5.m55749M(i, i2, ((db1) this.f46124a).mo51167e()) : C6848b5.m55747J(i, i2, mo67034h());
    }

    /* renamed from: c */
    public C9326t4 mo67029c(int i, int i2) throws IOException {
        return C6848b5.m55748L(i, i2, mo67034h());
    }

    /* renamed from: d */
    public C6843b4 mo67030d(int i) throws IOException {
        if (i == 3) {
            return new C7227iw(this);
        }
        if (i == 4) {
            return new C7850lw(this);
        }
        if (i == 8) {
            return new rz0(this);
        }
        if (i == 16) {
            return new u01(this);
        }
        if (i == 17) {
            return new w01(this);
        }
        throw new ASN1Exception("unknown DL object encountered: 0x" + Integer.toHexString(i));
    }

    /* renamed from: e */
    public C6843b4 mo67031e(int i) throws IOException {
        if (i == 3) {
            return new C7227iw(this);
        }
        if (i == 4) {
            return new C7850lw(this);
        }
        if (i == 8) {
            return new rz0(this);
        }
        if (i == 16) {
            return new C9007nw(this);
        }
        if (i == 17) {
            return new C9196pw(this);
        }
        throw new ASN1Exception("unknown BER object encountered: 0x" + Integer.toHexString(i));
    }

    /* renamed from: f */
    public C6843b4 mo67032f(int i, db1 db1) throws IOException {
        if (i == 3) {
            return new p01(db1);
        }
        if (i == 4) {
            return new zz0(db1);
        }
        if (i == 8) {
            throw new ASN1Exception("externals must use constructed encoding (see X.690 8.18)");
        } else if (i == 16) {
            throw new ASN1Exception("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
        } else if (i != 17) {
            try {
                return C7243j4.m59243d(i, db1, this.f46126c);
            } catch (IllegalArgumentException e) {
                throw new ASN1Exception("corrupted stream detected", e);
            }
        } else {
            throw new ASN1Exception("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
        }
    }

    /* renamed from: g */
    public C6843b4 mo67033g() throws IOException {
        int read = this.f46124a.read();
        if (read < 0) {
            return null;
        }
        return mo67027a(read);
    }

    /* renamed from: h */
    public C6923c4 mo67034h() throws IOException {
        int read = this.f46124a.read();
        if (read < 0) {
            return new C6923c4(0);
        }
        C6923c4 c4Var = new C6923c4();
        do {
            C6843b4 a = mo67027a(read);
            c4Var.mo50805a(a instanceof ct2 ? ((ct2) a).mo50484k() : a.mo50158n());
            read = this.f46124a.read();
        } while (read >= 0);
        return c4Var;
    }

    /* renamed from: i */
    public final void mo67035i(boolean z) {
        InputStream inputStream = this.f46124a;
        if (inputStream instanceof qt2) {
            ((qt2) inputStream).mo65517d(z);
        }
    }
}
